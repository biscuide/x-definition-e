// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "Y15#a".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Y15 implements org.xdef.component.XComponent{
  public String get$value() {return _$value;}
  public Y15.b getb() {return _b;}
  public String get$value1() {return _$value1;}
  public void set$value(String x){_$value=x;}
  public void setb(Y15.b x){_b=x;}
  public void set$value1(String x){_$value1=x;}
  public String xposOf$value(){return XD_XPos+"/$text";}
  public String xposOf$value1(){return XD_XPos+"/$text";}
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
    for (org.xdef.component.XComponent x: xGetNodeList())
      el.appendChild(x.toXml(doc));
    return el;
  }
  @Override
  public Object toJson() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    java.util.ArrayList<org.xdef.component.XComponent> a=
      new java.util.ArrayList<org.xdef.component.XComponent>();
    if (get$value() != null)
      org.xdef.component.XComponentUtil.addText(this,
        "Y15#a/$text", a, get$value(), _$$value);
    org.xdef.component.XComponentUtil.addXC(a, getb());
    if (get$value1() != null)
      org.xdef.component.XComponentUtil.addText(this,
        "Y15#a/$text[2]", a, get$value1(), _$$value1);
    return a;
  }
  public Y15() {}
  public Y15(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Y15(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"E1563835F4A847AEB0A9638BFD48A6CB".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private Y15.b _b;
  private String _$value1;
  private char _$$value1= (char) -1;
  public static final String XD_NAME="a";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "a";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="Y15#a";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    if ("Y15#a/$text".equals(x.getXMNode().getXDPosition())){
      _$$value=(char) XD_ndx++;
      set$value(parseResult.getParsedValue().toString());
    } else if ("Y15#a/$text[2]".equals(x.getXMNode().getXDPosition())){
      _$$value1=(char) XD_ndx++;
      set$value1(parseResult.getParsedValue().toString());
    }
  }
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x)
    {return new b(this, x);}
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    setb((b) x); //Y15#a/b
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class b implements org.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 1;}
  @Override
  public org.w3c.dom.Node toXml(org.w3c.dom.Document doc) {
    return doc!=null ? doc.createElementNS(XD_NamespaceURI, XD_NodeName)
      : org.xdef.xml.KXmlUtils.newDocument(
        XD_NamespaceURI, XD_NodeName, null).getDocumentElement();
  }
  @Override
  public Object toJson() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<org.xdef.component.XComponent>();
  }
  public b() {}
  public b(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public b(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"A97B685107D3CE23F53539C6EA3EEED9".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  public static final String XD_NAME="b";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "b";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="Y15#a/b";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
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
}