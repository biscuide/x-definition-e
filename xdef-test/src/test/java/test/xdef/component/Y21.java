// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "Y21#A".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Y21 implements org.xdef.component.XComponent{
  public test.xdef.component.Y21_enum getb() {return _b;}
  public test.xdef.component.Y21_enum get$value() {return _$value;}
  public java.util.List<Y21.B> listOfB() {return _B;}
  public test.xdef.component.Y21_enum get$value1() {return _$value1;}
  public void setb(test.xdef.component.Y21_enum x){_b=x;}
  public void set$value(test.xdef.component.Y21_enum x){_$value=x;}
  public void addB(Y21.B x) {if (x!=null) _B.add(x);}
  public void set$value1(test.xdef.component.Y21_enum x){_$value1=x;}
  public String xposOfb(){return XD_XPos+"/@b";}
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
    if (getb() != null)
      el.setAttribute(XD_Name_b, getb().name());
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
        "Y21#A/$text", a, get$value().name(), _$$value);
    org.xdef.component.XComponentUtil.addXC(a, listOfB());
    if (get$value1() != null)
      org.xdef.component.XComponentUtil.addText(this,
        "Y21#A/$text[2]", a, get$value1().name(), _$$value1);
    return a;
  }
  public Y21() {}
  public Y21(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Y21(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"C3E64FA1EC37712D22CF2278C0EF1DAC".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_b="b";
  private test.xdef.component.Y21_enum _b;
  private test.xdef.component.Y21_enum _$value;
  private char _$$value= (char) -1;
  private final java.util.List<Y21.B> _B = new java.util.ArrayList<Y21.B>();
  private test.xdef.component.Y21_enum _$value1;
  private char _$$value1= (char) -1;
  public static final String XD_NAME="A";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "A";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="Y21#A";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    if ("Y21#A/$text".equals(x.getXMNode().getXDPosition())){
      _$$value=(char) XD_ndx++;
      set$value(test.xdef.component.Y21_enum.toEnum(parseResult.getParsedValue().toString()));
    } else if ("Y21#A/$text[2]".equals(x.getXMNode().getXDPosition())){
      _$$value1=(char) XD_ndx++;
      set$value1(test.xdef.component.Y21_enum.toEnum(parseResult.getParsedValue().toString()));
    }
  }
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    XD_Name_b = x.getNodeName();
    setb(test.xdef.component.Y21_enum.toEnum(parseResult.getParsedValue().toString()));
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x)
    {return new B(this, x);}
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    listOfB().add((B) x); //Y21#A/B
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class B implements org.xdef.component.XComponent{
  public test.xdef.TestXComponents_Y21enum getc() {return _c;}
  public test.xdef.component.Y21_enum get$value() {return _$value;}
  public void setc(test.xdef.TestXComponents_Y21enum x){_c=x;}
  public void set$value(test.xdef.component.Y21_enum x){_$value=x;}
  public String xposOfc(){return XD_XPos+"/@c";}
  public String xposOf$value(){return XD_XPos+"/$text";}
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
    org.w3c.dom.Element el;
    if (doc==null) {
      doc = org.xdef.xml.KXmlUtils.newDocument(XD_NamespaceURI,
        XD_NodeName, null);
      el = doc.getDocumentElement();
    } else {
      el = doc.createElementNS(XD_NamespaceURI, XD_NodeName);
    }
    if (getc() != null)
      el.setAttribute(XD_Name_c, getc().name());
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
        "Y21#A/B/$text", a, get$value().name(), _$$value);
    return a;
  }
  public B() {}
  public B(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public B(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"C5FC5DA651F4C7CC3D8920A256D8A39E".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_c="c";
  private test.xdef.TestXComponents_Y21enum _c;
  private test.xdef.component.Y21_enum _$value;
  private char _$$value= (char) -1;
  public static final String XD_NAME="B";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "B";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="Y21#A/B";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(test.xdef.component.Y21_enum.toEnum(parseResult.getParsedValue().toString()));
  }
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    XD_Name_c = x.getNodeName();
    setc(test.xdef.TestXComponents_Y21enum.toEnum(parseResult.getParsedValue().toString()));
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
}