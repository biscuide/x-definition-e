package org.xdef.impl.compile;

import org.xdef.impl.XDefinition;
import org.xdef.sys.ReportWriter;
import org.xdef.sys.SBuffer;
import org.xdef.sys.SPosition;
import org.xdef.XDConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

/** Contains parsed source item.
 * @author Trojan
 */
public final class PNode {
	final List<PAttr> _attrs = new ArrayList<PAttr>(); //attributes
	final List<PNode> _childNodes = new ArrayList<PNode>(); //child nodes
	// namespace prefixes
	final Map<String,Integer> _nsPrefixes = new LinkedHashMap<String,Integer>();
	SBuffer _name; //qualified name of node
	String _localName;  //local name of node
	String _nsURI;  //namespace URI
	byte _xdVersion;  // version of X-definion
	byte _xmlVersion;  // version of xml
	XDefinition _xdef;  //XDefinition associated with this node
	SBuffer _value; //String node assigned to this node
	PNode _parent; //parent PNode
	int _level; //nesting level of this node
	int _nsindex; //namespace index of this node
	boolean _template;  //template switch

	/** Creates a new instance of PNode.
	 * @param name The node name.
	 * @param position The position in the source text.
	 * @param parent The parent node.
	 * @param xdVersion version of XDefinition.
	 * @param xmlVersion version of XDefinition.
	 */
	PNode(final String name,
		final SPosition position,
		final PNode parent,
		final byte xdVersion,
		final byte xmlVersion) {
		_name = new SBuffer(name, position);
		_xdVersion = xdVersion;
		_xmlVersion = xmlVersion;
		if (parent == null) {
			_nsPrefixes.putAll(XPreCompiler.DEFINED_PREFIXES);
			_template = false;
		} else {
			_template = parent._template;
			_nsPrefixes.putAll(parent._nsPrefixes);
		}
		_parent = parent;
		_nsindex = -1;
//       java makes it: _level = 0; _value = null; _def = null;
	}

	/** Get node name (as SBufer).
	 * @return node name (as SBufer).
	 */
	public final SBuffer getName() {return _name;}

	/** Get prefix of name.
	 * @return prefix of node name.
	 */
	public final String getPrefix() {
		String s = _name.getString();
		int ndx = s.indexOf(':');
		return ndx < 0 ? "" : s.substring(0, ndx);
	}

	/** Get namsepace index of the node .
	 * @return node name (as SBufer).
	 */
	public final int getNSIndex() {return _nsindex;}

	/** Get node namespace.
	 * @return node namespace.
	 */
	public final String getNamespace() {return _nsURI;}

	/** Get list of attributes.
	 * @return list of attributes.
	 */
	public final List<PAttr> getAttrs() {return _attrs;}

	/** Get list of child nodes.
	 * @return list of child nodes.
	 */
	public final List<PNode> getChildNodes() {return _childNodes;}

	/** Get text value of PNode.
	 * @return text value of PNode or null.
	 */
	public final SBuffer getValue() {return _value;}

	/** Get version of the X-Definition.
	 * @return version of the X-Definition ("2.0" .. 20, "3.1" .. 31 ).
	 */
	public final byte getXdefVersion() {return _xdVersion;}

	/** Get version of the XML document.
	 * @return version of XML document ("1.0" .. 10, "1.1" .. 11 ).
	 */
	public final byte getXMLVersion() {return _xmlVersion;}

	/** Remove child nodes.
	 * @param list The list of nodes to be removed.
	 */
	final void removeChildNodes(final ArrayList<PNode> list) {
		_childNodes.removeAll(list);
	}

	/** Get attribute of given name with X=definition name space.
	 * If required attribute doesn't exist return null.
	 * @param localName key name of attribute.
	 * @param nsIndex The index of name space (0 == XDEF).
	 * @return the object SParsedData with the attribute value or null.
	 */
	final PAttr getAttrNS(final String localName, final int nsIndex) {
		PAttr xattr = null;
		for (PAttr a : _attrs) {
			if (localName.equals(a._localName) && a._nsindex == nsIndex) {
				xattr = a;
			}
		}
		return xattr;
	}

	/** Expand macros.
	 * @param reporter error reporter.
	 * @param actDefName actual X-definition name.
	 * @param macros map with macros.
	 */
	public void expandMacros(final ReportWriter reporter,
		final String actDefName,
		final Map<String, XScriptMacro> macros) {
		if ("macro".equals(_localName)
			&& (XDConstants.XDEF20_NS_URI.equals(_nsURI)
				|| XDConstants.XDEF31_NS_URI.equals(_nsURI)
				|| (XDConstants.XDEF32_NS_URI.equals(_nsURI)))) {
			return; // it is not a macro definition
		}
		XScriptMacroResolver p = new XScriptMacroResolver(
			actDefName, _xmlVersion, macros, reporter);
		for (PAttr x: _attrs) {
			if (x._value.getString().indexOf("${") >= 0) {
				p.expandMacros(x._value);
			}
		}
		if (_value != null) {
			String s = _value.getString();
			int ndx = s.lastIndexOf("${");
			if (ndx >= 0) {
				p.expandMacros(_value);
			}
		}
		for (PNode x: _childNodes) {
			x.expandMacros(reporter, actDefName, macros);
		}
	}

	@Override
	public String toString() {return "PNode: " + _name.getString();}

/*#if DEBUG*/
	/** Create XML element from this PNode.
	 * @return XML element created from this PNode.
	 */
	public org.w3c.dom.Element toXML() {
		return pnodeToXML(this, null);
	}

	private static org.w3c.dom.Element pnodeToXML(final PNode p,
		final org.w3c.dom.Node node) {
		org.w3c.dom.Document doc;
		org.w3c.dom.Node parent;
		if (node == null) {
			parent = doc = org.xdef.xml.KXmlUtils.newDocument();
		} else {
			doc = node.getOwnerDocument();
			parent = node;
		}
		org.w3c.dom.Element e =
			doc.createElementNS(p.getNamespace(), p.getName().getString());
		parent.appendChild(e);
		for (PAttr a: p.getAttrs()) {
			e.setAttributeNS(
				a.getNamespace(), a.getName(), a.getValue().getString());
		}
		for (PNode child: p.getChildNodes()) {
			pnodeToXML(child, e);
		}
		if (p.getValue() != null) {
			e.appendChild(doc.createTextNode(p.getValue().getString()));
		}
		return e;
	}
/*#end*/

}