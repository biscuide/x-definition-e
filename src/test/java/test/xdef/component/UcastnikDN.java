// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#UcastnikDN".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class UcastnikDN implements org.xdef.component.XComponent{
  public String getOznSegmentu() {return _OznSegmentu;}
  public String getTypUcastnika() {return _TypUcastnika;}
  public Integer getPraxeRizeni() {return _PraxeRizeni;}
  public String getAlkoholDech() {return _AlkoholDech;}
  public String getAlkoholKrev() {return _AlkoholKrev;}
  public String getZraneni() {return _Zraneni;}
  public String getZdravPojistovna() {return _ZdravPojistovna;}
  public Integer getPokutaKc() {return _PokutaKc;}
  public String getPokutaZapl() {return _PokutaZapl;}
  public String getPachatel() {return _Pachatel;}
  public String getPoskozeny() {return _Poskozeny;}
  public Z3 getJinaSkoda() {return _JinaSkoda;}
  public Z4 getOsoba() {return _Osoba;}
  public Z5 getFirma() {return _Firma;}
  public java.util.List<Z6> listOfDoklad() {return _Doklad;}
  public UcastnikDN.PoruseniZakProvoz getPoruseniZakProvoz() {return _PoruseniZakProvoz;}
  public UcastnikDN.PoruseniZakPrest getPoruseniZakPrest() {return _PoruseniZakPrest;}
  public UcastnikDN.PoruseniZakTrest getPoruseniZakTrest() {return _PoruseniZakTrest;}
  public UcastnikDN.PoruseniZakOst getPoruseniZakOst() {return _PoruseniZakOst;}
  public UcastnikDN.Vazba getVazba() {return _Vazba;}
  public void setOznSegmentu(String x){_OznSegmentu=x;}
  public void setTypUcastnika(String x){_TypUcastnika=x;}
  public void setPraxeRizeni(Integer x){_PraxeRizeni=x;}
  public void setAlkoholDech(String x){_AlkoholDech=x;}
  public void setAlkoholKrev(String x){_AlkoholKrev=x;}
  public void setZraneni(String x){_Zraneni=x;}
  public void setZdravPojistovna(String x){_ZdravPojistovna=x;}
  public void setPokutaKc(Integer x){_PokutaKc=x;}
  public void setPokutaZapl(String x){_PokutaZapl=x;}
  public void setPachatel(String x){_Pachatel=x;}
  public void setPoskozeny(String x){_Poskozeny=x;}
  public void setJinaSkoda(Z3 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "JinaSkoda", null, "SouborD1A#UcastnikDN/$mixed/JinaSkoda");
    _JinaSkoda=x;
  }
  public void setOsoba(Z4 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "Osoba", null, "SouborD1A#UcastnikDN/$mixed/Osoba");
    _Osoba=x;
  }
  public void setFirma(Z5 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "Firma", null, "SouborD1A#UcastnikDN/$mixed/Firma");
    _Firma=x;
  }
  public void addDoklad(Z6 x) {
    if (x!=null) {
        if (x.xGetXPos()==null)
          x.xInit(this, "Doklad", null, "SouborD1A#UcastnikDN/$mixed/Doklad");
      _Doklad.add(x);
    }

  }
  public void setPoruseniZakProvoz(UcastnikDN.PoruseniZakProvoz x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakProvoz", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz");
    _PoruseniZakProvoz=x;
  }
  public void setPoruseniZakPrest(UcastnikDN.PoruseniZakPrest x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakPrest", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest");
    _PoruseniZakPrest=x;
  }
  public void setPoruseniZakTrest(UcastnikDN.PoruseniZakTrest x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakTrest", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest");
    _PoruseniZakTrest=x;
  }
  public void setPoruseniZakOst(UcastnikDN.PoruseniZakOst x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakOst", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakOst");
    _PoruseniZakOst=x;
  }
  public void setVazba(UcastnikDN.Vazba x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "Vazba", null, "SouborD1A#UcastnikDN/$mixed/Vazba");
    _Vazba=x;
  }
  public String xposOfOznSegmentu(){return XD_XPos+"/@OznSegmentu";}
  public String xposOfTypUcastnika(){return XD_XPos+"/@TypUcastnika";}
  public String xposOfPraxeRizeni(){return XD_XPos+"/@PraxeRizeni";}
  public String xposOfAlkoholDech(){return XD_XPos+"/@AlkoholDech";}
  public String xposOfAlkoholKrev(){return XD_XPos+"/@AlkoholKrev";}
  public String xposOfZraneni(){return XD_XPos+"/@Zraneni";}
  public String xposOfZdravPojistovna(){return XD_XPos+"/@ZdravPojistovna";}
  public String xposOfPokutaKc(){return XD_XPos+"/@PokutaKc";}
  public String xposOfPokutaZapl(){return XD_XPos+"/@PokutaZapl";}
  public String xposOfPachatel(){return XD_XPos+"/@Pachatel";}
  public String xposOfPoskozeny(){return XD_XPos+"/@Poskozeny";}
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
    if (getTypUcastnika() != null)
      el.setAttribute(XD_Name_TypUcastnika, getTypUcastnika());
    if (getPraxeRizeni() != null)
      el.setAttribute(XD_Name_PraxeRizeni, String.valueOf(getPraxeRizeni()));
    if (getAlkoholDech() != null)
      el.setAttribute(XD_Name_AlkoholDech, getAlkoholDech());
    if (getAlkoholKrev() != null)
      el.setAttribute(XD_Name_AlkoholKrev, getAlkoholKrev());
    if (getZraneni() != null)
      el.setAttribute(XD_Name_Zraneni, getZraneni());
    if (getZdravPojistovna() != null)
      el.setAttribute(XD_Name_ZdravPojistovna, getZdravPojistovna());
    if (getPokutaKc() != null)
      el.setAttribute(XD_Name_PokutaKc, String.valueOf(getPokutaKc()));
    if (getPokutaZapl() != null)
      el.setAttribute(XD_Name_PokutaZapl, getPokutaZapl());
    if (getPachatel() != null)
      el.setAttribute(XD_Name_Pachatel, getPachatel());
    if (getPoskozeny() != null)
      el.setAttribute(XD_Name_Poskozeny, getPoskozeny());
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
    org.xdef.component.XComponentUtil.addXC(a, getJinaSkoda());
    org.xdef.component.XComponentUtil.addXC(a, getOsoba());
    org.xdef.component.XComponentUtil.addXC(a, getFirma());
    org.xdef.component.XComponentUtil.addXC(a, listOfDoklad());
    org.xdef.component.XComponentUtil.addXC(a, getPoruseniZakProvoz());
    org.xdef.component.XComponentUtil.addXC(a, getPoruseniZakPrest());
    org.xdef.component.XComponentUtil.addXC(a, getPoruseniZakTrest());
    org.xdef.component.XComponentUtil.addXC(a, getPoruseniZakOst());
    org.xdef.component.XComponentUtil.addXC(a, getVazba());
    return a;
  }
  public UcastnikDN() {}
  public UcastnikDN(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public UcastnikDN(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"5DC275F71F5B296AF68E6B9E707FED7C".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_OznSegmentu="OznSegmentu";
  private String _OznSegmentu;
  private String XD_Name_TypUcastnika="TypUcastnika";
  private String _TypUcastnika;
  private String XD_Name_PraxeRizeni="PraxeRizeni";
  private Integer _PraxeRizeni;
  private String XD_Name_AlkoholDech="AlkoholDech";
  private String _AlkoholDech;
  private String XD_Name_AlkoholKrev="AlkoholKrev";
  private String _AlkoholKrev;
  private String XD_Name_Zraneni="Zraneni";
  private String _Zraneni;
  private String XD_Name_ZdravPojistovna="ZdravPojistovna";
  private String _ZdravPojistovna;
  private String XD_Name_PokutaKc="PokutaKc";
  private Integer _PokutaKc;
  private String XD_Name_PokutaZapl="PokutaZapl";
  private String _PokutaZapl;
  private String XD_Name_Pachatel="Pachatel";
  private String _Pachatel;
  private String XD_Name_Poskozeny="Poskozeny";
  private String _Poskozeny;
  private Z3 _JinaSkoda;
  private Z4 _Osoba;
  private Z5 _Firma;
  private final java.util.List<Z6> _Doklad = new java.util.ArrayList<Z6>();
  private UcastnikDN.PoruseniZakProvoz _PoruseniZakProvoz;
  private UcastnikDN.PoruseniZakPrest _PoruseniZakPrest;
  private UcastnikDN.PoruseniZakTrest _PoruseniZakTrest;
  private UcastnikDN.PoruseniZakOst _PoruseniZakOst;
  private UcastnikDN.Vazba _Vazba;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "UcastnikDN";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#UcastnikDN";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@OznSegmentu")) {
      XD_Name_OznSegmentu = x.getNodeName();
      setOznSegmentu(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@TypUcastnika")) {
      XD_Name_TypUcastnika = x.getNodeName();
      setTypUcastnika(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PraxeRizeni")) {
      XD_Name_PraxeRizeni = x.getNodeName();
      setPraxeRizeni(parseResult.getParsedValue().intValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@AlkoholDech")) {
      XD_Name_AlkoholDech = x.getNodeName();
      setAlkoholDech(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@AlkoholKrev")) {
      XD_Name_AlkoholKrev = x.getNodeName();
      setAlkoholKrev(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Zraneni")) {
      XD_Name_Zraneni = x.getNodeName();
      setZraneni(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@ZdravPojistovna")) {
      XD_Name_ZdravPojistovna = x.getNodeName();
      setZdravPojistovna(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PokutaKc")) {
      XD_Name_PokutaKc = x.getNodeName();
      setPokutaKc(parseResult.getParsedValue().intValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PokutaZapl")) {
      XD_Name_PokutaZapl = x.getNodeName();
      setPokutaZapl(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Pachatel")) {
      XD_Name_Pachatel = x.getNodeName();
      setPachatel(parseResult.getParsedValue().stringValue());
    } else {
      XD_Name_Poskozeny = x.getNodeName();
      setPoskozeny(parseResult.getParsedValue().stringValue());
    }
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x) {
    String s = x.getXMElement().getXDPosition();
    if ("SouborD1A#UcastnikDN/$mixed/JinaSkoda".equals(s))
      return new test.xdef.component.Z3(this, x);
    if ("SouborD1A#UcastnikDN/$mixed/Osoba".equals(s))
      return new test.xdef.component.Z4(this, x);
    if ("SouborD1A#UcastnikDN/$mixed/Firma".equals(s))
      return new test.xdef.component.Z5(this, x);
    if ("SouborD1A#UcastnikDN/$mixed/Doklad".equals(s))
      return new test.xdef.component.Z6(this, x);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz".equals(s))
      return new PoruseniZakProvoz(this, x);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest".equals(s))
      return new PoruseniZakPrest(this, x);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest".equals(s))
      return new PoruseniZakTrest(this, x);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakOst".equals(s))
      return new PoruseniZakOst(this, x);
    return new Vazba(this, x); // SouborD1A#UcastnikDN/$mixed/Vazba
  }
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    String s = x.xGetModelPosition();
    if ("SouborD1A#UcastnikDN/$mixed/JinaSkoda".equals(s))
      setJinaSkoda((test.xdef.component.Z3)x);
    else if ("SouborD1A#UcastnikDN/$mixed/Osoba".equals(s))
      setOsoba((test.xdef.component.Z4)x);
    else if ("SouborD1A#UcastnikDN/$mixed/Firma".equals(s))
      setFirma((test.xdef.component.Z5)x);
    else if ("SouborD1A#UcastnikDN/$mixed/Doklad".equals(s))
      listOfDoklad().add((test.xdef.component.Z6)x);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz".equals(s))
      setPoruseniZakProvoz((PoruseniZakProvoz)x);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest".equals(s))
      setPoruseniZakPrest((PoruseniZakPrest)x);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest".equals(s))
      setPoruseniZakTrest((PoruseniZakTrest)x);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakOst".equals(s))
      setPoruseniZakOst((PoruseniZakOst)x);
    else
      setVazba((Vazba)x); //SouborD1A#UcastnikDN/$mixed/Vazba
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class PoruseniZakProvoz implements org.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 5;}
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
  public PoruseniZakProvoz() {}
  public PoruseniZakProvoz(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakProvoz(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
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
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakProvoz";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
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
public static class PoruseniZakPrest implements org.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 6;}
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
  public PoruseniZakPrest() {}
  public PoruseniZakPrest(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakPrest(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
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
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakPrest";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
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
public static class PoruseniZakTrest implements org.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 7;}
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
  public PoruseniZakTrest() {}
  public PoruseniZakTrest(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakTrest(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
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
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakTrest";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
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
public static class PoruseniZakOst implements org.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 8;}
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
  public PoruseniZakOst() {}
  public PoruseniZakOst(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakOst(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
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
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakOst";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakOst";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
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
public static class Vazba implements org.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 9;}
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
  public Vazba() {}
  public Vazba(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Vazba(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
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
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Vazba";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/Vazba";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
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