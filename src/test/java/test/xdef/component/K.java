// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "K#A".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class K implements org.xdef.component.XComponent{
  public java.util.List<K.c> listOfc() {return _c;}
  public Integer get$value() {return _$value;}
  public K.d getd() {return _d;}
  public void addc(K.c x) {if (x!=null) _c.add(x);}
  public void set$value(Integer x){_$value=x;}
  public void setd(K.d x){_d=x;}
  public String xposOf$value(){return XD_XPos+"/$text";}
//<editor-fold defaultstate="collapsed" desc="Implementation of XComponent interface">
  public final static byte xJsonVersion = 0;
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
  public Object toJon() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    java.util.List<org.xdef.component.XComponent> a=
      new java.util.ArrayList<org.xdef.component.XComponent>();
    org.xdef.component.XComponentUtil.addXC(a, listOfc());
    if (get$value() != null)
      org.xdef.component.XComponentUtil.addText(this,
        "K#A/$text", a, get$value().toString(), _$$value);
    org.xdef.component.XComponentUtil.addXC(a, getd());
    return a;
  }
  public K() {}
  public K(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public K(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"528A2D4E3BED70713358006D0195369E".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private final java.util.List<K.c> _c = new java.util.ArrayList<K.c>();
  private Integer _$value;
  private char _$$value= (char) -1;
  private K.d _d;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "A";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="K#A";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().intValue());
  }
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x) {
    String s = x.getXMElement().getXDPosition();
    if ("K#A/c".equals(s))
      return new c(this, x);
    return new d(this, x); // K#A/d
  }
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    String s = x.xGetModelPosition();
    if ("K#A/c".equals(s))
      listOfc().add((c)x);
    else
      setd((d)x); //K#A/d
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class c implements org.xdef.component.XComponent{
  public String getKod() {return _Kod;}
  public String getCislo() {return _Cislo;}
  public org.xdef.sys.SDatetime getRok() {return _Rok;}
  public java.util.Date dateOfRok(){return org.xdef.sys.SDatetime.getDate(_Rok);}
  public java.sql.Timestamp timestampOfRok(){return org.xdef.sys.SDatetime.getTimestamp(_Rok);}
  public java.util.Calendar calendarOfRok(){return org.xdef.sys.SDatetime.getCalendar(_Rok);}
  public void setKod(String x){_Kod=x;}
  public void setCislo(String x){_Cislo=x;}
  public void setRok(org.xdef.sys.SDatetime x){_Rok=x;}
  public void setRok(java.util.Date x){_Rok=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setRok(java.sql.Timestamp x){_Rok=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setRok(java.util.Calendar x){_Rok=x==null?null:new org.xdef.sys.SDatetime(x);}
  public String xposOfKod(){return XD_XPos+"/@Kod";}
  public String xposOfCislo(){return XD_XPos+"/@Cislo";}
  public String xposOfRok(){return XD_XPos+"/@Rok";}
//<editor-fold defaultstate="collapsed" desc="Implementation of XComponent interface">
  public final static byte xJsonVersion = 0;
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
  public int xGetModelIndex() {return 0;}
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
    if (getKod() != null)
      el.setAttribute(XD_Name_Kod, getKod());
    if (getCislo() != null)
      el.setAttribute(XD_Name_Cislo, getCislo());
    if (getRok() != null)
      el.setAttribute(XD_Name_Rok, getRok().formatDate("yy"));
    return el;
  }
  @Override
  public Object toJon() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<org.xdef.component.XComponent>();
  }
  public c() {}
  public c(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public c(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"9E32D5241EE675A9AB950DBF62277C8D".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_Kod="Kod";
  private String _Kod;
  private String XD_Name_Cislo="Cislo";
  private String _Cislo;
  private String XD_Name_Rok="Rok";
  private org.xdef.sys.SDatetime _Rok;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "c";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="K#A/c";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@Kod")) {
      XD_Name_Kod = x.getNodeName();
      setKod(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Cislo")) {
      XD_Name_Cislo = x.getNodeName();
      setCislo(parseResult.getParsedValue().stringValue());
    } else {
      XD_Name_Rok = x.getNodeName();
      setRok(parseResult.getParsedValue().datetimeValue());
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
public static class d implements org.xdef.component.XComponent{
  public org.xdef.sys.SDatetime geta() {return _a;}
  public java.util.Date dateOfa(){return org.xdef.sys.SDatetime.getDate(_a);}
  public java.sql.Timestamp timestampOfa(){return org.xdef.sys.SDatetime.getTimestamp(_a);}
  public java.util.Calendar calendarOfa(){return org.xdef.sys.SDatetime.getCalendar(_a);}
  public void seta(org.xdef.sys.SDatetime x){_a=x;}
  public void seta(java.util.Date x){_a=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void seta(java.sql.Timestamp x){_a=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void seta(java.util.Calendar x){_a=x==null?null:new org.xdef.sys.SDatetime(x);}
  public String xposOfa(){return XD_XPos+"/@a";}
//<editor-fold defaultstate="collapsed" desc="Implementation of XComponent interface">
  public final static byte xJsonVersion = 0;
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
  public int xGetModelIndex() {return 2;}
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
    if (geta() != null)
      el.setAttribute(XD_Name_a, geta().formatDate("d.M.y"));
    return el;
  }
  @Override
  public Object toJon() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<org.xdef.component.XComponent>();
  }
  public d() {}
  public d(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public d(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"9C20E0A641D6622834D49246099A1B7A".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_a="a";
  private org.xdef.sys.SDatetime _a;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "d";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="K#A/d";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    XD_Name_a = x.getNodeName();
    seta(parseResult.getParsedValue().datetimeValue());
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