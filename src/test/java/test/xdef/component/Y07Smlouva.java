// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "Y07#Smlouva".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Y07Smlouva extends test.xdef.TestXComponents_Y07Operation implements org.xdef.component.XComponent{
  public Integer getIdFlow() {return _IdFlow;}
  public Y07Smlouva.Domain getDomain() {return _Domain;}
  public void setIdFlow(Integer x){_IdFlow=x;}
  public void setDomain(Y07Smlouva.Domain x){_Domain=x;}
  public String xposOfIdFlow(){return XD_XPos+"/@IdFlow";}
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
    if (getIdFlow() != null)
      el.setAttribute(XD_Name_IdFlow, String.valueOf(getIdFlow()));
    for (org.xdef.component.XComponent x: xGetNodeList())
      el.appendChild(x.toXml(doc));
    return el;
  }
  @Override
  public Object toJson() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    java.util.List<org.xdef.component.XComponent> a=
      new java.util.ArrayList<org.xdef.component.XComponent>();
    org.xdef.component.XComponentUtil.addXC(a, getControlId());
    org.xdef.component.XComponentUtil.addXC(a, getDomain());
    return a;
  }
  public Y07Smlouva() {}
  public Y07Smlouva(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Y07Smlouva(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"AB2F81C7FFA7256BADE290FB04F4683C".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_IdFlow="IdFlow";
  private Integer _IdFlow;
  private Y07Smlouva.Domain _Domain;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Smlouva";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="Y07#Smlouva";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    XD_Name_IdFlow = x.getNodeName();
    setIdFlow(parseResult.getParsedValue().intValue());
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x) {
    String s = x.getXMElement().getXDPosition();
    if ("Y07#Nehoda/ControlId".equals(s))
      return new test.xdef.component.Y07ControlId(this, x);
    return new Domain(this, x); // Y07#Smlouva/Domain
  }
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    String s = x.xGetModelPosition();
    if ("Y07#Nehoda/ControlId".equals(s))
      setControlId((test.xdef.component.Y07ControlId)x);
    else
      setDomain((Domain)x); //Y07#Smlouva/Domain
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class Domain implements org.xdef.component.XComponent{
  public String getOne() {return _One;}
  public String getTwo() {return _Two;}
  public void setOne(String x){_One=x;}
  public void setTwo(String x){_Two=x;}
  public String xposOfOne(){return XD_XPos+"/@One";}
  public String xposOfTwo(){return XD_XPos+"/@Two";}
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
    if (getOne() != null)
      el.setAttribute(XD_Name_One, getOne());
    if (getTwo() != null)
      el.setAttribute(XD_Name_Two, getTwo());
    return el;
  }
  @Override
  public Object toJson() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<org.xdef.component.XComponent>();
  }
  public Domain() {}
  public Domain(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Domain(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"E03A37B3616CD189CF239F63D7FA83EA".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_One="One";
  private String _One;
  private String XD_Name_Two="Two";
  private String _Two;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Domain";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="Y07#Smlouva/Domain";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@One")) {
      XD_Name_One = x.getNodeName();
      setOne(parseResult.getParsedValue().toString());
    } else {
      XD_Name_Two = x.getNodeName();
      setTwo(parseResult.getParsedValue().toString());
    }
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