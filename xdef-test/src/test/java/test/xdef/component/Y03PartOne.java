// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "Y03#PartOne".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Y03PartOne implements org.xdef.component.XComponent{
  public String getOne() {return _One;}
  public void setOne(String x){_One=x;}
  public String xposOfOne(){return XD_XPos+"/@One";}
//<editor-fold defaultstate="collapsed" desc="Implementation of XComponent interface">
  public final static byte JSON = 0;
  @Override
  public org.w3c.dom.Element toXml()
	{return (org.w3c.dom.Element) toXml((org.w3c.dom.Document) null);}
  @Override
  public String xGetNodeName() {return XD_NodeName;}
  @Override
  public void xInit(org.xdef.component.XComponent p,
	String name, String ns, String xdPos) {
	XD_Parent=p; XD_NodeName=name; XD_NamespaceURI=ns; XD_Model=xdPos;
  }
  @Override
  public String xGetNamespaceURI() {return XD_NamespaceURI;}
  @Override
  public String xGetXPos() {return XD_XPos;}
  @Override
  public void xSetXPos(String xpos){XD_XPos = xpos;}
  @Override
  public int xGetNodeIndex() {return XD_Index;}
  @Override
  public void xSetNodeIndex(int index) {XD_Index = index;}
  @Override
  public org.xdef.component.XComponent xGetParent() {return XD_Parent;}
  @Override
  public Object xGetObject() {return XD_Object;}
  @Override
  public void xSetObject(final Object obj) {XD_Object = obj;}
  @Override
  public String toString() {return "XComponent: "+xGetModelPosition();}
  @Override
  public String xGetModelPosition() {return XD_Model;}
  @Override
  public int xGetModelIndex() {return -1;}
  @Override
  public org.w3c.dom.Node toXml(org.w3c.dom.Document doc) {
	org.w3c.dom.Element el;
	if (doc==null) {
	  doc = org.xdef.xml.KXmlUtils.newDocument(XD_NamespaceURI,
		XD_NodeName, null);
	  el = doc.getDocumentElement();
	} else {
	  el = doc.createElementNS(XD_NamespaceURI, XD_NodeName);
	  if (doc.getDocumentElement()==null) doc.appendChild(el);
	}
	if (getOne() != null)
	  el.setAttribute(XD_Name_One, getOne());
	return el;
  }
  @Override
  public Object toJson() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
	return new java.util.ArrayList<org.xdef.component.XComponent>();
  }
  public Y03PartOne() {}
  public Y03PartOne(org.xdef.component.XComponent p,
	String name, String ns, String xPos, String XDPos) {
	XD_NodeName=name; XD_NamespaceURI=ns;
	XD_XPos=xPos;
	XD_Model=XDPos;
	XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Y03PartOne(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
	org.w3c.dom.Element el=x.getElement();
	XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
	XD_XPos=x.getXPos();
	XD_Model=x.getXMElement().getXDPosition();
	XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
	if (!"75730B0D5CCBCC8C563F6AAC3876A9C9".equals(
	  x.getXMElement().getDigest())) { //incompatible element model
	  throw new org.xdef.sys.SRuntimeException(
		org.xdef.msg.XDEF.XDEF374);
	}
  }
  private String XD_Name_One="One";
  private String _One;
  public static final String XD_NAME="PartOne";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PartOne";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="Y03#PartOne";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
	org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
	org.xdef.XDParseResult parseResult){
	XD_Name_One = x.getNodeName();
	setOne(parseResult.getParsedValue().toString());
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(
	org.xdef.proc.XXNode x)
	{return null;}
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){}
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
}