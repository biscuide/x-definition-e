// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "B#A".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class B implements org.xdef.component.XComponent{
  public Integer getid() {return _id;}
  public Double getnum() {return _num;}
  public org.xdef.sys.SDatetime getdate() {return _date;}
  public java.util.Date dateOfdate(){return org.xdef.sys.SDatetime.getDate(_date);}
  public java.sql.Timestamp timestampOfdate(){return org.xdef.sys.SDatetime.getTimestamp(_date);}
  public java.util.Calendar calendarOfdate(){return org.xdef.sys.SDatetime.getCalendar(_date);}
  public org.xdef.sys.SDatetime gettime() {return _time;}
  public java.util.Date dateOftime(){return org.xdef.sys.SDatetime.getDate(_time);}
  public java.sql.Timestamp timestampOftime(){return org.xdef.sys.SDatetime.getTimestamp(_time);}
  public java.util.Calendar calendarOftime(){return org.xdef.sys.SDatetime.getCalendar(_time);}
  public String getname() {return _name;}
  public void setid(Integer x){_id=x;}
  public void setnum(Double x){_num=x;}
  public void setdate(org.xdef.sys.SDatetime x){_date=x;}
  public void setdate(java.util.Date x){_date=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setdate(java.sql.Timestamp x){_date=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setdate(java.util.Calendar x){_date=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void settime(org.xdef.sys.SDatetime x){_time=x;}
  public void settime(java.util.Date x){_time=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void settime(java.sql.Timestamp x){_time=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void settime(java.util.Calendar x){_time=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setname(String x){_name=x;}
  public String xposOfid(){return XD_XPos+"/@id";}
  public String xposOfnum(){return XD_XPos+"/@num";}
  public String xposOfdate(){return XD_XPos+"/@date";}
  public String xposOftime(){return XD_XPos+"/@time";}
  public String xposOfname(){return XD_XPos+"/@name";}
//<editor-fold defaultstate="collapsed" desc="Implementation of XComponent interface">
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
    if (getid() != null)
      el.setAttribute(XD_Name_id, String.valueOf(getid()));
    if (getnum() != null)
      el.setAttribute(XD_Name_num, String.valueOf(getnum()));
    if (getdate() != null)
      el.setAttribute(XD_Name_date, getdate().formatDate("yyyy-MM-dd"));
    if (gettime() != null)
      el.setAttribute(XD_Name_time, gettime().formatDate("HH:mm:ss"));
    if (getname() != null)
      el.setAttribute(XD_Name_name, getname());
    return el;
  }
  @Override
  public Object toJon() {return org.xdef.json.XmlToJson.toJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<org.xdef.component.XComponent>();}
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
    if (!"60D8175F3557EEF191C01DB33B27C6A7".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_id="id";
  private Integer _id;
  private String XD_Name_num="num";
  private Double _num;
  private String XD_Name_date="date";
  private org.xdef.sys.SDatetime _date;
  private String XD_Name_time="time";
  private org.xdef.sys.SDatetime _time;
  private String XD_Name_name="name";
  private String _name;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "A";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="B#A";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@date")) {
      XD_Name_date = x.getNodeName();
      setdate(parseResult.getParsedValue().datetimeValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@id")) {
      XD_Name_id = x.getNodeName();
      setid(parseResult.getParsedValue().intValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@name")) {
      XD_Name_name = x.getNodeName();
      setname(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@num")) {
      XD_Name_num = x.getNodeName();
      setnum(parseResult.getParsedValue().doubleValue());
    } else {
      XD_Name_time = x.getNodeName();
      settime(parseResult.getParsedValue().datetimeValue());
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