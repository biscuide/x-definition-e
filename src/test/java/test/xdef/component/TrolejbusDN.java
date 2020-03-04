// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#TrolejbusDN".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class TrolejbusDN implements org.xdef.component.XComponent{
  public String getOznSegmentu() {return _OznSegmentu;}
  public String getLinka() {return _Linka;}
  public Integer getLinkaPoradi() {return _LinkaPoradi;}
  public String getEvidCislo() {return _EvidCislo;}
  public String getTypVozidla() {return _TypVozidla;}
  public String getTypBrzd() {return _TypBrzd;}
  public String getStavBrzd() {return _StavBrzd;}
  public String getKodPojistitele() {return _KodPojistitele;}
  public String getNazevPojistitele() {return _NazevPojistitele;}
  public String getCisloDokladuPojisteni() {return _CisloDokladuPojisteni;}
  public String getPojisteniText() {return _PojisteniText;}
  public String getDruhVozidla() {return _DruhVozidla;}
  public Z3 getSkoda() {return _Skoda;}
  public Z3 getJinaSkoda() {return _JinaSkoda;}
  public TrolejbusDN.Vlastnik getVlastnik() {return _Vlastnik;}
  public void setOznSegmentu(String x){_OznSegmentu=x;}
  public void setLinka(String x){_Linka=x;}
  public void setLinkaPoradi(Integer x){_LinkaPoradi=x;}
  public void setEvidCislo(String x){_EvidCislo=x;}
  public void setTypVozidla(String x){_TypVozidla=x;}
  public void setTypBrzd(String x){_TypBrzd=x;}
  public void setStavBrzd(String x){_StavBrzd=x;}
  public void setKodPojistitele(String x){_KodPojistitele=x;}
  public void setNazevPojistitele(String x){_NazevPojistitele=x;}
  public void setCisloDokladuPojisteni(String x){_CisloDokladuPojisteni=x;}
  public void setPojisteniText(String x){_PojisteniText=x;}
  public void setDruhVozidla(String x){_DruhVozidla=x;}
  public void setSkoda(Z3 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "Skoda", null, "SouborD1A#TrolejbusDN/$mixed/Skoda");
    _Skoda=x;
  }
  public void setJinaSkoda(Z3 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "JinaSkoda", null, "SouborD1A#TrolejbusDN/$mixed/JinaSkoda");
    _JinaSkoda=x;
  }
  public void setVlastnik(TrolejbusDN.Vlastnik x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "Vlastnik", null, "SouborD1A#TrolejbusDN/$mixed/Vlastnik");
    _Vlastnik=x;
  }
  public String xposOfOznSegmentu(){return XD_XPos+"/@OznSegmentu";}
  public String xposOfLinka(){return XD_XPos+"/@Linka";}
  public String xposOfLinkaPoradi(){return XD_XPos+"/@LinkaPoradi";}
  public String xposOfEvidCislo(){return XD_XPos+"/@EvidCislo";}
  public String xposOfTypVozidla(){return XD_XPos+"/@TypVozidla";}
  public String xposOfTypBrzd(){return XD_XPos+"/@TypBrzd";}
  public String xposOfStavBrzd(){return XD_XPos+"/@StavBrzd";}
  public String xposOfKodPojistitele(){return XD_XPos+"/@KodPojistitele";}
  public String xposOfNazevPojistitele(){return XD_XPos+"/@NazevPojistitele";}
  public String xposOfCisloDokladuPojisteni(){return XD_XPos+"/@CisloDokladuPojisteni";}
  public String xposOfPojisteniText(){return XD_XPos+"/@PojisteniText";}
  public String xposOfDruhVozidla(){return XD_XPos+"/@DruhVozidla";}
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
    if (getOznSegmentu() != null)
      el.setAttribute(XD_Name_OznSegmentu, getOznSegmentu());
    if (getLinka() != null)
      el.setAttribute(XD_Name_Linka, getLinka());
    if (getLinkaPoradi() != null)
      el.setAttribute(XD_Name_LinkaPoradi, getLinkaPoradi().toString());
    if (getEvidCislo() != null)
      el.setAttribute(XD_Name_EvidCislo, getEvidCislo());
    if (getTypVozidla() != null)
      el.setAttribute(XD_Name_TypVozidla, getTypVozidla());
    if (getTypBrzd() != null)
      el.setAttribute(XD_Name_TypBrzd, getTypBrzd());
    if (getStavBrzd() != null)
      el.setAttribute(XD_Name_StavBrzd, getStavBrzd());
    if (getKodPojistitele() != null)
      el.setAttribute(XD_Name_KodPojistitele, getKodPojistitele());
    if (getNazevPojistitele() != null)
      el.setAttribute(XD_Name_NazevPojistitele, getNazevPojistitele());
    if (getCisloDokladuPojisteni() != null)
      el.setAttribute(XD_Name_CisloDokladuPojisteni, getCisloDokladuPojisteni());
    if (getPojisteniText() != null)
      el.setAttribute(XD_Name_PojisteniText, getPojisteniText());
    if (getDruhVozidla() != null)
      el.setAttribute(XD_Name_DruhVozidla, getDruhVozidla());
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
    org.xdef.component.XComponentUtil.addXC(a, getSkoda());
    org.xdef.component.XComponentUtil.addXC(a, getJinaSkoda());
    org.xdef.component.XComponentUtil.addXC(a, getVlastnik());
    return a;
  }
  public TrolejbusDN() {}
  public TrolejbusDN(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public TrolejbusDN(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"D4BF570CA602EC4C5D205CD463EB5A01".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_OznSegmentu="OznSegmentu";
  private String _OznSegmentu;
  private String XD_Name_Linka="Linka";
  private String _Linka;
  private String XD_Name_LinkaPoradi="LinkaPoradi";
  private Integer _LinkaPoradi;
  private String XD_Name_EvidCislo="EvidCislo";
  private String _EvidCislo;
  private String XD_Name_TypVozidla="TypVozidla";
  private String _TypVozidla;
  private String XD_Name_TypBrzd="TypBrzd";
  private String _TypBrzd;
  private String XD_Name_StavBrzd="StavBrzd";
  private String _StavBrzd;
  private String XD_Name_KodPojistitele="KodPojistitele";
  private String _KodPojistitele;
  private String XD_Name_NazevPojistitele="NazevPojistitele";
  private String _NazevPojistitele;
  private String XD_Name_CisloDokladuPojisteni="CisloDokladuPojisteni";
  private String _CisloDokladuPojisteni;
  private String XD_Name_PojisteniText="PojisteniText";
  private String _PojisteniText;
  private String XD_Name_DruhVozidla="DruhVozidla";
  private String _DruhVozidla;
  private Z3 _Skoda;
  private Z3 _JinaSkoda;
  private TrolejbusDN.Vlastnik _Vlastnik;
  public static final String XD_NAME="TrolejbusDN";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "TrolejbusDN";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#TrolejbusDN";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@OznSegmentu")) {
      XD_Name_OznSegmentu = x.getNodeName();
      setOznSegmentu(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Linka")) {
      XD_Name_Linka = x.getNodeName();
      setLinka(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@LinkaPoradi")) {
      XD_Name_LinkaPoradi = x.getNodeName();
      setLinkaPoradi(parseResult.getParsedValue().intValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@EvidCislo")) {
      XD_Name_EvidCislo = x.getNodeName();
      setEvidCislo(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@TypVozidla")) {
      XD_Name_TypVozidla = x.getNodeName();
      setTypVozidla(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@TypBrzd")) {
      XD_Name_TypBrzd = x.getNodeName();
      setTypBrzd(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@StavBrzd")) {
      XD_Name_StavBrzd = x.getNodeName();
      setStavBrzd(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@KodPojistitele")) {
      XD_Name_KodPojistitele = x.getNodeName();
      setKodPojistitele(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@NazevPojistitele")) {
      XD_Name_NazevPojistitele = x.getNodeName();
      setNazevPojistitele(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@CisloDokladuPojisteni")) {
      XD_Name_CisloDokladuPojisteni = x.getNodeName();
      setCisloDokladuPojisteni(parseResult.getParsedValue().toString());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PojisteniText")) {
      XD_Name_PojisteniText = x.getNodeName();
      setPojisteniText(parseResult.getParsedValue().toString());
    } else {
      XD_Name_DruhVozidla = x.getNodeName();
      setDruhVozidla(parseResult.getParsedValue().toString());
    }
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x) {
    String s = x.getXMElement().getXDPosition();
    if ("SouborD1A#TrolejbusDN/$mixed/Skoda".equals(s))
      return new test.xdef.component.Z3(this, x);
    if ("SouborD1A#TrolejbusDN/$mixed/JinaSkoda".equals(s))
      return new test.xdef.component.Z3(this, x);
    return new Vlastnik(this, x); // SouborD1A#TrolejbusDN/$mixed/Vlastnik
  }
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    String s = x.xGetModelPosition();
    if ("SouborD1A#TrolejbusDN/$mixed/Skoda".equals(s))
      setSkoda((test.xdef.component.Z3)x);
    else if ("SouborD1A#TrolejbusDN/$mixed/JinaSkoda".equals(s))
      setJinaSkoda((test.xdef.component.Z3)x);
    else
      setVlastnik((Vlastnik)x); //SouborD1A#TrolejbusDN/$mixed/Vlastnik
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class Vlastnik implements org.xdef.component.XComponent{
  public String get$value() {return _$value;}
  public void set$value(String x){_$value=x;}
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
  public int xGetModelIndex() {return 3;}
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
        "SouborD1A#text/$text", a, get$value(), _$$value);
    return a;
  }
  public Vlastnik() {}
  public Vlastnik(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Vlastnik(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"0BBC8E2A504A9E2D3C354DD465C51838".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  public static final String XD_NAME="Vlastnik";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Vlastnik";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#TrolejbusDN/$mixed/Vlastnik";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().toString());
  }
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