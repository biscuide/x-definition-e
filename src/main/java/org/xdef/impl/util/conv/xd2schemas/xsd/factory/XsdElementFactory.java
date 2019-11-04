package org.xdef.impl.util.conv.xd2schemas.xsd.factory;

import org.apache.ws.commons.schema.*;
import org.apache.ws.commons.schema.constants.Constants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xdef.XDParser;
import org.xdef.XDValue;
import org.xdef.impl.XData;
import org.xdef.impl.XElement;
import org.xdef.impl.XNode;
import org.xdef.impl.util.conv.xd2schemas.xsd.util.*;
import org.xdef.model.XMOccurrence;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.security.InvalidParameterException;
import java.util.List;

import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.XD2XsdDefinitions.XSD_NAMESPACE_PREFIX_EMPTY;
import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.XsdLoggerDefs.*;

public class XsdElementFactory {

    private final XmlSchema schema;

    public XsdElementFactory(XmlSchema schema) {
        this.schema = schema;
    }

    /**
     * Creates xsd element
     * Example: <element>
     */
    public XmlSchemaElement createEmptyElement(final XElement xElement, boolean topLevel) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, "Empty element. Top=" + topLevel);
        XmlSchemaElement elem = new XmlSchemaElement(schema, topLevel);

        if (topLevel == false) {
            elem.setMinOccurs(xElement.getOccurence().minOccurs());
            elem.setMaxOccurs((xElement.isUnbounded() || xElement.isMaxUnlimited()) ? Long.MAX_VALUE : xElement.getOccurence().maxOccurs());
        }

        if (xElement._nillable == 'T') {
            elem.setNillable(true);
        }

        return elem;
    }

    /**
     * Creates attribute
     */
    public XmlSchemaAttribute createEmptyAttribute(final XData xData, boolean topLevel) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, "Attribute element. Top=" + topLevel);
        XmlSchemaAttribute attr = new XmlSchemaAttribute(schema, topLevel);

        if (topLevel == false) {
            if (xData.isOptional() || xData.getOccurence().isOptional()) {
                attr.setUse(XmlSchemaUse.OPTIONAL);
            } else if (xData.isRequired() || xData.getOccurence().isRequired()) {
                attr.setUse(XmlSchemaUse.REQUIRED);
            }
        }

        return attr;
    }

    /**
     * Creates complexType element
     * Output: <complexType>
     */
    public XmlSchemaComplexType createEmptyComplexType(boolean topLevel) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, "Empty complex-type. Top=" + topLevel);
        return new XmlSchemaComplexType(schema, topLevel);
    }

    /**
     * Creates simpleType element
     * Output: <simpleType>
     */
    public XmlSchemaSimpleType createEmptySimpleType(boolean topLevel) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, "Empty simple-type. Top=" + topLevel);
        return new XmlSchemaSimpleType(schema, topLevel);
    }

    public void creatSimpleTypeTop(final XData xData, final String name) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, xData, "Reference simple-type. Name=" + name);
        XmlSchemaSimpleType itemType = createEmptySimpleType(true);
        itemType.setName(name);
        itemType.setContent(createSimpleTypeContent(xData, name));
    }

    public XmlSchemaSimpleType creatSimpleType(final XData xData, final String nodeName) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, xData, "Simple-type");
        XmlSchemaSimpleType itemType = createEmptySimpleType(false);
        itemType.setName(XsdNameUtils.newLocalScopeRefTypeName(xData));
        itemType.setContent(createSimpleTypeContent(xData, nodeName));
        return itemType;
    }

    public XmlSchemaSimpleContent createSimpleContent(final XData xData) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, xData, "Simple-content");

        XmlSchemaSimpleContent content = new XmlSchemaSimpleContent();

        QName qName;
        if (xData.getRefTypeName() != null) {
            final String refTypeName = XsdNameUtils.newLocalScopeRefTypeName(xData);
            final String nsPrefix = XsdNamespaceUtils.getReferenceNamespacePrefix(refTypeName);
            final String nsUri = schema.getNamespaceContext().getNamespaceURI(nsPrefix);
            qName = new QName(nsUri, refTypeName);
            XsdLogger.printG(LOG_DEBUG, XSD_ELEM_FACTORY, xData, "Simple-content using reference. nsUri=" + nsUri + ", localName=" + refTypeName);
        } else {
            qName = XD2XsdParserMapping.getDefaultSimpleParserQName(xData);
        }

        if (qName == null) {
            final String refParserName = XsdNameUtils.createRefNameFromParser(xData);
            if (refParserName != null) {
                qName = new QName(XSD_NAMESPACE_PREFIX_EMPTY, refParserName);
                XsdLogger.printG(LOG_DEBUG, XSD_ELEM_FACTORY, xData, "Simple-content using parser. Parser=" + refParserName);
            }
        } else {
            XsdLogger.printG(LOG_DEBUG, XSD_ELEM_FACTORY, xData, "Simple-content using simple parser. Parser=" + qName.getLocalPart());
        }

        if (qName != null) {
            XmlSchemaSimpleContentExtension contentExtension = new XmlSchemaSimpleContentExtension();
            contentExtension.setBaseTypeName(qName);
            content.setContent(contentExtension);
            XsdLogger.printG(LOG_INFO, XSD_ELEM_FACTORY, xData, "Simple-content extending type. QName=" + qName);
            return content;
        }

        return null;
    }

    /**
     * Creates element based on groupType
     * Possible outputs: xs:sequence, xs:choice, xs:all
     * @param groupType
     * @return
     */
    public XmlSchemaGroupParticle createGroupParticle(short groupType, final XMOccurrence occurrence) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, "Particle=" + XD2XsdUtils.particleXKindToString(groupType));

        XmlSchemaGroupParticle particle;
        switch (groupType) {
            case XNode.XMSEQUENCE: {
                particle = new XmlSchemaSequence();
                break;
            }
            case XNode.XMMIXED: {
                particle = new XmlSchemaAll();
                break;
            }
            case XNode.XMCHOICE: {
                particle = new XmlSchemaChoice();
                break;
            }
            default: {
                XsdLogger.printG(LOG_ERROR, XSD_ELEM_FACTORY, "Unknown group particle!. Particle=" + XD2XsdUtils.particleXKindToString(groupType));
                throw new InvalidParameterException("Unknown groupType");
            }
        }

        particle.setMinOccurs(occurrence.minOccurs());
        particle.setMaxOccurs((occurrence.isUnbounded() || occurrence.isMaxUnlimited()) ? Long.MAX_VALUE : occurrence.maxOccurs());

        return particle;
    }

    public void createSchemaImport(final XmlSchema schema, final String nsUri, final String location) {
        XmlSchemaImport schemaImport = new XmlSchemaImport(schema);
        schemaImport.setNamespace(nsUri);
        schemaImport.setSchemaLocation(location);
    }

    public void createSchemaInclude(final XmlSchema schema, final String location) {
        XmlSchemaInclude schemaImport = new XmlSchemaInclude(schema);
        schemaImport.setSchemaLocation(location);
    }

    public static XmlSchemaAnnotation createAnnotation(final String annotationValue) {
        XmlSchemaAnnotation annotation = new XmlSchemaAnnotation();
        annotation.getItems().add(createAnnotationItem(annotationValue));
        return annotation;
    }

    public static XmlSchemaAnnotation createAnnotation(final List<String> annotationValues) {
        XmlSchemaAnnotation annotation = new XmlSchemaAnnotation();
        for (String value : annotationValues) {
            annotation.getItems().add(createAnnotationItem(value));
        }
        return annotation;
    }

    public XmlSchemaComplexType createComplexTypeWithComplexExtension(final String name, final QName qName) {
        XmlSchemaComplexType complexType = createEmptyComplexType(true);
        XmlSchemaComplexContent complexContent = new XmlSchemaComplexContent();
        XmlSchemaComplexContentExtension complexContentExtension = new XmlSchemaComplexContentExtension();
        complexContentExtension.setBaseTypeName(qName);
        complexContent.setContent(complexContentExtension);
        complexType.setContentModel(complexContent);
        complexType.setName(name);
        return complexType;
    }

    public XmlSchemaComplexType createComplextTypeWithSimpleExtension(final String name, final QName qName, boolean topLevel) {
        XmlSchemaComplexType complexType = createEmptyComplexType(topLevel);
        XmlSchemaSimpleContent simpleContent = new XmlSchemaSimpleContent();
        XmlSchemaSimpleContentExtension simpleContentExtension = new XmlSchemaSimpleContentExtension();
        simpleContentExtension.setBaseTypeName(qName);
        simpleContent.setContent(simpleContentExtension);
        complexType.setContentModel(simpleContent);
        complexType.setName(name);
        return complexType;
    }

    private XmlSchemaSimpleTypeContent createSimpleTypeContent(final XData xData, final String nodeName) {
        XsdLogger.printG(LOG_TRACE, XSD_ELEM_FACTORY, xData, "Simple-type content");

        XDValue parseMethod = xData.getParseMethod();
        XsdSimpleContentFactory simpleContentFactory = new XsdSimpleContentFactory(this, xData);

        if (parseMethod instanceof XDParser) {
            XDParser parser = ((XDParser)parseMethod);
            simpleContentFactory.setParameters(parser.getNamedParams().getXDNamedItems());
            return simpleContentFactory.createSimpleContent(nodeName);
        }

        return simpleContentFactory.createDefaultRestriction(Constants.XSD_STRING);
    }

    private static XmlSchemaDocumentation createAnnotationItem(final String annotation) {
        if (annotation == null || annotation.isEmpty()) {
            return null;
        }

        XmlSchemaDocumentation annotationItem = new XmlSchemaDocumentation();

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("documentation");
            doc.appendChild(rootElement);
            rootElement.appendChild(doc.createTextNode(annotation));
            annotationItem.setMarkup(rootElement.getChildNodes());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return annotationItem;
    }
}
