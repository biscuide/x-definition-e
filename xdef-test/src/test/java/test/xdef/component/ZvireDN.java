// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#ZvireDN".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class ZvireDN implements org.xdef.component.XComponent{
  public String getOznSegmentu() {return _OznSegmentu;}
  public String getNazevZvirete() {return _NazevZvirete;}
  public String getDruhZvirete() {return _DruhZvirete;}
  public Z3 getSkoda() {return _Skoda;}
  public ZvireDN.Vlastnik getVlastnik() {return _Vlastnik;}
  public void setOznSegmentu(String x){_OznSegmentu=x;}
  public void setNazevZvirete(String x){_NazevZvirete=x;}
  public void setDruhZvirete(String x){_DruhZvirete=x;}
  public void setSkoda(Z3 x){
	if (x!=null && x.xGetXPos() == null)
	  x.xInit(this, "Skoda", null, "SouborD1A#ZvireDN/$mixed/Skoda");
	_Skoda=x;
  }
  public void setVlastnik(ZvireDN.Vlastnik x){
	if (x!=null && x.xGetXPos() == null)
	  x.xInit(this, "Vlastnik", null, "SouborD1A#ZvireDN/$mixed/Vlastnik");
	_Vlastnik=x;
  }
  public String xposOfOznSegmentu(){return XD_XPos+"/@OznSegmentu";}
  public String xposOfNazevZvirete(){return XD_XPos+"/@NazevZvirete";}
  public String xposOfDruhZvirete(){return XD_XPos+"/@DruhZvirete";}
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
	if (getNazevZvirete() != null)
	  el.setAttribute(XD_Name_NazevZvirete, getNazevZvirete());
	if (getDruhZvirete() != null)
	  el.setAttribute(XD_Name_DruhZvirete, getDruhZvirete());
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
	org.xdef.component.XComponentUtil.addXC(a, getVlastnik());
	return a;
  }
  public ZvireDN() {}
  public ZvireDN(org.xdef.component.XComponent p,
	String name, String ns, String xPos, String XDPos) {
	XD_NodeName=name; XD_NamespaceURI=ns;
	XD_XPos=xPos;
	XD_Model=XDPos;
	XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public ZvireDN(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
	org.w3c.dom.Element el=x.getElement();
	XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
	XD_XPos=x.getXPos();
	XD_Model=x.getXMElement().getXDPosition();
	XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
	if (!"2116F761E13F9752FD19D24D986FAEC6".equals(
	  x.getXMElement().getDigest())) { //incompatible element model
	  throw new org.xdef.sys.SRuntimeException(
		org.xdef.msg.XDEF.XDEF374);
	}
  }
  private String XD_Name_OznSegmentu="OznSegmentu";
  private String _OznSegmentu;
  private String XD_Name_NazevZvirete="NazevZvirete";
  private String _NazevZvirete;
  private String XD_Name_DruhZvirete="DruhZvirete";
  private String _DruhZvirete;
  private Z3 _Skoda;
  private ZvireDN.Vlastnik _Vlastnik;
  public static final String XD_NAME="ZvireDN";
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "ZvireDN";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#ZvireDN";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
	org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
	org.xdef.XDParseResult parseResult) {
	if (x.getXMNode().getXDPosition().endsWith("/@OznSegmentu")) {
	  XD_Name_OznSegmentu = x.getNodeName();
	  setOznSegmentu(parseResult.getParsedValue().toString());
	} else if (x.getXMNode().getXDPosition().endsWith("/@NazevZvirete")) {
	  XD_Name_NazevZvirete = x.getNodeName();
	  setNazevZvirete(parseResult.getParsedValue().toString());
	} else {
	  XD_Name_DruhZvirete = x.getNodeName();
	  setDruhZvirete(parseResult.getParsedValue().toString());
	}
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(
	org.xdef.proc.XXNode x) {
	String s = x.getXMElement().getXDPosition();
	if ("SouborD1A#ZvireDN/$mixed/Skoda".equals(s))
	  return new test.xdef.component.Z3(this, x);
	return new Vlastnik(this, x); // SouborD1A#ZvireDN/$mixed/Vlastnik
  }
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
	x.xSetNodeIndex(XD_ndx++);
	String s = x.xGetModelPosition();
	if ("SouborD1A#ZvireDN/$mixed/Skoda".equals(s))
	  setSkoda((test.xdef.component.Z3)x);
	else
	  setVlastnik((Vlastnik)x); //SouborD1A#ZvireDN/$mixed/Vlastnik
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
  private String XD_Model="SouborD1A#ZvireDN/$mixed/Vlastnik";
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