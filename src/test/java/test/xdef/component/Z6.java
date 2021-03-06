// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#Doklad".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Z6 implements org.xdef.component.XComponent{
  public String getTypDokladu() {return _TypDokladu;}
  public String getOpravneni() {return _Opravneni;}
  public String getCisloDokladu() {return _CisloDokladu;}
  public org.xdef.sys.SDatetime getDatumVydani() {return _DatumVydani;}
  public java.util.Date dateOfDatumVydani(){return org.xdef.sys.SDatetime.getDate(_DatumVydani);}
  public java.sql.Timestamp timestampOfDatumVydani(){return org.xdef.sys.SDatetime.getTimestamp(_DatumVydani);}
  public java.util.Calendar calendarOfDatumVydani(){return org.xdef.sys.SDatetime.getCalendar(_DatumVydani);}
  public String getMistoVydani() {return _MistoVydani;}
  public String getStatVydani() {return _StatVydani;}
  public void setTypDokladu(String x){_TypDokladu=x;}
  public void setOpravneni(String x){_Opravneni=x;}
  public void setCisloDokladu(String x){_CisloDokladu=x;}
  public void setDatumVydani(org.xdef.sys.SDatetime x){_DatumVydani=x;}
  public void setDatumVydani(java.util.Date x){_DatumVydani=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumVydani(java.sql.Timestamp x){_DatumVydani=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumVydani(java.util.Calendar x){_DatumVydani=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setMistoVydani(String x){_MistoVydani=x;}
  public void setStatVydani(String x){_StatVydani=x;}
  public String xposOfTypDokladu(){return XD_XPos+"/@TypDokladu";}
  public String xposOfOpravneni(){return XD_XPos+"/@Opravneni";}
  public String xposOfCisloDokladu(){return XD_XPos+"/@CisloDokladu";}
  public String xposOfDatumVydani(){return XD_XPos+"/@DatumVydani";}
  public String xposOfMistoVydani(){return XD_XPos+"/@MistoVydani";}
  public String xposOfStatVydani(){return XD_XPos+"/@StatVydani";}
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
    if (getTypDokladu() != null)
      el.setAttribute(XD_Name_TypDokladu, getTypDokladu());
    if (getOpravneni() != null)
      el.setAttribute(XD_Name_Opravneni, getOpravneni());
    if (getCisloDokladu() != null)
      el.setAttribute(XD_Name_CisloDokladu, getCisloDokladu());
    if (getDatumVydani() != null)
      el.setAttribute(XD_Name_DatumVydani, getDatumVydani().formatDate("d.M.yyyy"));
    if (getMistoVydani() != null)
      el.setAttribute(XD_Name_MistoVydani, getMistoVydani());
    if (getStatVydani() != null)
      el.setAttribute(XD_Name_StatVydani, getStatVydani());
    return el;
  }
  @Override
  public Object toJson() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<org.xdef.component.XComponent>();
  }
  public Z6() {}
  public Z6(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Z6(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"866C6AEE9FDA2E44DFDF8425E73B792A".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_TypDokladu="TypDokladu";
  private String _TypDokladu;
  private String XD_Name_Opravneni="Opravneni";
  private String _Opravneni;
  private String XD_Name_CisloDokladu="CisloDokladu";
  private String _CisloDokladu;
  private String XD_Name_DatumVydani="DatumVydani";
  private org.xdef.sys.SDatetime _DatumVydani;
  private String XD_Name_MistoVydani="MistoVydani";
  private String _MistoVydani;
  private String XD_Name_StatVydani="StatVydani";
  private String _StatVydani;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Doklad";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="SouborD1A#Doklad";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@TypDokladu")) {
      XD_Name_TypDokladu = x.getNodeName();
      setTypDokladu(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Opravneni")) {
      XD_Name_Opravneni = x.getNodeName();
      setOpravneni(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@CisloDokladu")) {
      XD_Name_CisloDokladu = x.getNodeName();
      setCisloDokladu(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@DatumVydani")) {
      XD_Name_DatumVydani = x.getNodeName();
      setDatumVydani(parseResult.getParsedValue().datetimeValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@MistoVydani")) {
      XD_Name_MistoVydani = x.getNodeName();
      setMistoVydani(parseResult.getParsedValue().toString());
    } else {
      XD_Name_StatVydani = x.getNodeName();
      setStatVydani(parseResult.getParsedValue().toString());
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