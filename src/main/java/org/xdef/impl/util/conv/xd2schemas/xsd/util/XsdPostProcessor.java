package org.xdef.impl.util.conv.xd2schemas.xsd.util;

import org.apache.ws.commons.schema.*;
import org.xdef.impl.XElement;
import org.xdef.impl.XNode;
import org.xdef.impl.util.conv.xd2schemas.xsd.factory.SchemaNodeFactory;
import org.xdef.impl.util.conv.xd2schemas.xsd.factory.XsdElementFactory;
import org.xdef.impl.util.conv.xd2schemas.xsd.model.SchemaNode;
import org.xdef.impl.util.conv.xd2schemas.xsd.model.XsdAdapterCtx;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.Map;

import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.AlgPhase.POSTPROCESSING;
import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.XsdLoggerDefs.*;

public class XsdPostProcessor {

    private final XsdAdapterCtx adapterCtx;

    public XsdPostProcessor(XsdAdapterCtx adapterCtx) {
        this.adapterCtx = adapterCtx;
    }

    public void processRefs() {
        XsdLogger.printP(LOG_INFO, POSTPROCESSING, "*** Updating references ***");

        for (Map.Entry<String, Map<String, SchemaNode>> systemRefEntry : adapterCtx.getNodes().entrySet()) {
            XsdLogger.printP(LOG_INFO, POSTPROCESSING, "Updating references. System=" + systemRefEntry.getKey());

            XmlSchema xmlSchema = adapterCtx.getSchema(systemRefEntry.getKey(), true, POSTPROCESSING);
            XsdElementFactory xsdFactory = new XsdElementFactory(xmlSchema);

            for (Map.Entry<String, SchemaNode> refEntry : systemRefEntry.getValue().entrySet()) {
                final SchemaNode refNode = refEntry.getValue();
                if (refNode.getReference() != null) {
                    if (isTopElementRef(refNode)) {
                        elementTopLevelRef(refNode, xsdFactory);
                    }

                    refType(refNode);
                } else if (isQualifiedTopElementWithUnqualifiedPtr(refNode)) {
                    elementRootDecomposition(refNode);
                }
            }
        }
    }

    private void elementRootDecomposition(final SchemaNode node) {
        XsdLogger.printP(LOG_INFO, POSTPROCESSING, (XNode)node.getXdNode(), "Decomposition of root element with pointers ...");

        final XmlSchemaElement xsdElem = (XmlSchemaElement)node.getXsdNode();
        final XElement xDefEl = node.toXdElem();
        final String localName = xsdElem.getName();
        final String newLocalName = XsdNameUtils.createNewRootElemName(localName, xsdElem.getSchemaType());
        final String elemNsUri = xsdElem.getParent().getNamespaceContext().getNamespaceURI(XsdNamespaceUtils.getNamespacePrefix(xDefEl.getName()));

        // Move element's schema type to top
        XmlSchemaType schemaType = null;
        if (xsdElem.getSchemaType() != null) {
            schemaType = xsdElem.getSchemaType();
            schemaType.setName(newLocalName);
            XD2XsdUtils.addSchemaType(xsdElem.getParent(), schemaType);
            node.setXsdNode(schemaType);

            xsdElem.setSchemaType(null);
            xsdElem.setSchemaTypeName(new QName(elemNsUri, newLocalName));
            SchemaNode newSchemaNode = SchemaNodeFactory.createElementNode(xsdElem, xDefEl);
            newSchemaNode = adapterCtx.addOrUpdateNode(newSchemaNode);
            SchemaNode.createBinding(newSchemaNode, node);
        }

        if (schemaType == null) {
            XsdLogger.printP(LOG_WARN, POSTPROCESSING, (XNode)node.getXdNode(), "Schema type has been expected!");
            return;
        }

        updatePointers(node, newLocalName);
    }

    private void elementTopLevelRef(final SchemaNode node, final XsdElementFactory xsdFactory) {
        XsdLogger.printP(LOG_INFO, POSTPROCESSING, (XNode)node.getXdNode(), "Updating top-level element reference ...");

        elementTopToComplex(node, xsdFactory);

        SchemaNode refNode = node.getReference();

        if (refNode != null) {
            if (isTopElement(refNode)) {
                final String systemId = XsdNamespaceUtils.getReferenceSystemId(refNode.getXdNode().getXDPosition());
                XmlSchema xmlSchema = adapterCtx.getSchema(systemId, true, POSTPROCESSING);
                XsdElementFactory refXsdFactory = new XsdElementFactory(xmlSchema);
                if (refNode.toXsdElem().isRef()) {
                    elementTopLevelRef(refNode, refXsdFactory);
                } else {
                    elementTopToComplex(refNode, refXsdFactory);
                }
            }
        }
    }

    private void elementTopToComplex(final SchemaNode node, final XsdElementFactory xsdFactory) {
        XsdLogger.printP(LOG_INFO, POSTPROCESSING, (XNode)node.getXdNode(), "Converting top-level element to complex-type ...");

        final XmlSchemaElement xsdElem = (XmlSchemaElement)node.getXsdNode();
        final XElement xDefEl = node.toXdElem();
        String newRefLocalName = XsdNameUtils.createRefLocalName(xDefEl.getName());

        // Creating complex content with extension to original reference
        XmlSchemaType schemaType = null;
        if (xsdElem.getRef().getTargetQName() != null) {
            schemaType = xsdFactory.createComplexContentWithExtension(newRefLocalName, xsdElem.getRef().getTargetQName());
        } else if (xsdElem.getSchemaTypeName() != null) {
            schemaType = xsdFactory.createComplextContentWithSimpleExtension(newRefLocalName, xsdElem.getSchemaTypeName(), true);
        }

        if (schemaType == null) {
            XsdLogger.printP(LOG_WARN, POSTPROCESSING, (XNode)node.getXdNode(), "Schema type has been expected!");
            return;
        }

        node.setXsdNode(schemaType);

        // Remove original element from schema
        XD2XsdUtils.removeItem(xsdElem.getParent(), xsdElem);

        updatePointers(node, newRefLocalName);
    }

    private static void updatePointers(final SchemaNode node, final String newLocalName) {
        // Update all pointers to element
        if (node.getPointers() != null) {
            for (SchemaNode ptrNode : node.getPointers()) {
                if (ptrNode.isXsdElem()) {
                    final XmlSchemaElement xsdPtrElem = ptrNode.toXsdElem();
                    final QName ptrQName = xsdPtrElem.getRef().getTargetQName();
                    if (ptrQName != null) {
                        if (xsdPtrElem.getForm() == XmlSchemaForm.UNQUALIFIED) {
                            xsdPtrElem.getRef().setTargetQName(null);
                            final QName newPtrQName = new QName(ptrQName.getNamespaceURI(), newLocalName);
                            final String newPtrElemName = XsdNameUtils.getReferenceName(ptrNode.getXdName());
                            xsdPtrElem.setName(newPtrElemName);
                            xsdPtrElem.setSchemaTypeName(newPtrQName);

                            XsdLogger.printP(LOG_INFO, POSTPROCESSING, (XNode) node.getXdNode(), "Change reference to schema type." +
                                    " Elem=" + ptrNode.getXdName() + ", NewQName=" + newPtrQName + ", OldQName=" + ptrQName);
                        }
                    }
                }
            }
        }
    }

    private static boolean isTopElementRef(final SchemaNode node) {
        return node.isXsdElem() && node.getXsdNode().isTopLevel() && node.isXdElem() && node.toXsdElem().isRef();
    }

    private static boolean isTopElement(final SchemaNode node) {
        return node.isXsdElem() && node.getXsdNode().isTopLevel() && node.isXdElem();
    }

    private static boolean isTopElementWithPtr(final SchemaNode node) {
        return node.isXsdElem() && node.getXsdNode().isTopLevel() && node.isXdElem() && node.hasAnyPointer();
    }

    private static boolean isQualifiedTopElementWithUnqualifiedPtr(final SchemaNode node) {
        if (isTopElementWithPtr(node)) {
            final XmlSchemaForm nodeSchema = node.toXsdElem().getForm();
            for (SchemaNode ptr : node.getPointers()) {
                if (ptr.isXsdElem()) {
                    final XmlSchemaForm ptrSchema = ptr.toXsdElem().getForm();
                    final boolean ptrHasNs = XsdNamespaceUtils.containsNsPrefix(ptr.getXdName());
                    if (!ptrHasNs && XmlSchemaForm.UNQUALIFIED.equals(ptrSchema) && XmlSchemaForm.QUALIFIED.equals(nodeSchema)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static void refType(final SchemaNode node) {
        if (node.getReference() != null) {
            if (node.getReference().isXsdElem() && node.isXsdElem() && node.toXsdElem().getRef().getTargetQName() == null) {
                // Reference element to element
                XmlSchemaElement xsdElem = node.toXsdElem();
                if (xsdElem.getName() == null) {
                    xsdElem.getRef().setTargetQName(xsdElem.getSchemaTypeName());
                    xsdElem.setSchemaTypeName(null);
                } else {
                    XsdLogger.printP(LOG_WARN, POSTPROCESSING, (XNode) node.getXdNode(), "Element cannot use QName, because already has a name!");
                }
            } else if (node.getReference().isXsdComplexType() && node.isXsdElem() && node.toXsdElem().getTargetQName() != null) {
                // Reference element to complex type
                XmlSchemaElement xsdElem = node.toXsdElem();
                xsdElem.setSchemaTypeName(xsdElem.getTargetQName());
                xsdElem.getRef().setTargetQName(null);
                xsdElem.setName(node.getXdName());
            }
        }
    }

    public static void elementComplexContent(final XElement defEl, final XmlSchemaComplexType complexType) {
        XsdLogger.printP(LOG_DEBUG, POSTPROCESSING, defEl, "Updating complex content of element");

        // if xs:all contains only unbounded elements, then we can use unbounded xs:choise
        {
            boolean allElementsUnbounded = true;
            boolean anyElementUnbounded = false;

            if (complexType.getParticle() instanceof XmlSchemaAll) {

                for (XNode xNode : defEl._childNodes) {
                    if (xNode.getKind() == XNode.XMELEMENT) {
                        if (!xNode.isMaxUnlimited() && !xNode.isUnbounded()) {
                            allElementsUnbounded = false;
                        } else if (xNode.maxOccurs() > 1) {
                            anyElementUnbounded = true;
                        }
                    }
                }

                if (allElementsUnbounded) {
                    XsdLogger.printP(LOG_DEBUG, POSTPROCESSING, defEl, "Complex content contains xs:all with only unbounded elements. Update to unbounded xs:choise.");

                    XmlSchemaChoice group = new XmlSchemaChoice();
                    group.setMaxOccurs(Long.MAX_VALUE);

                    // Copy elements
                    for (XmlSchemaAllMember member : ((XmlSchemaAll)complexType.getParticle()).getItems()) {
                        group.getItems().add((XmlSchemaChoiceMember) member);
                    }

                    complexType.setParticle(group);
                } else if (anyElementUnbounded) {
                    // TODO: XD->XSD Solve?
                    XsdLogger.printP(LOG_ERROR, POSTPROCESSING, defEl, "xs:all contains element which has maxOccurs higher than 1");
                }
            }
        }

        // element contains simple content and particle -> XSD does not support restrictions for text if element contains elements
        // We have to use mixed attribute for root element and remove simple content
        {
            if (complexType.getParticle() != null && complexType.getContentModel() != null && complexType.getContentModel() instanceof XmlSchemaSimpleContent) {
                XsdLogger.printP(LOG_WARN, POSTPROCESSING, defEl, "!Lossy transformation! Remove simple content from element due to existence of complex content. Use mixed attr.");

                // Copy attributes from simple content
                XmlSchemaContent content = complexType.getContentModel().getContent();
                if (content instanceof XmlSchemaSimpleContentExtension) {
                    List attrs = ((XmlSchemaSimpleContentExtension) content).getAttributes();
                    if (attrs != null && !attrs.isEmpty()) {
                        complexType.getAttributes().addAll(attrs);
                    }
                }

                // TODO: remove by reference handler
                //XD2XsdUtils.removeItem(schema, complexType.getContentModel());
                complexType.setContentModel(null);
                complexType.setMixed(true);
                complexType.setAnnotation(XsdElementFactory.createAnnotation("Text content has been originally restricted by x-definition"));
            }
        }
    }
}