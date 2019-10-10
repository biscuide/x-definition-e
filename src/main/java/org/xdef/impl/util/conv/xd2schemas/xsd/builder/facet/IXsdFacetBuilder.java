package org.xdef.impl.util.conv.xd2schemas.xsd.builder.facet;

import org.apache.ws.commons.schema.*;
import org.xdef.XDNamedValue;

import java.util.List;

/**
 * Converts x-defnition XDNamedValue parameters into XSD facet facets
 */
public interface IXsdFacetBuilder {

    /**
     * Creates facets from parameters
     * @param params
     * @return
     */
    List<XmlSchemaFacet> build(final XDNamedValue[] params);

    /**
     * Creates xs:minExclusive facet
     * @param param
     * @return
     */
    XmlSchemaMinExclusiveFacet minExclusive(final XDNamedValue param);

    /**
     * Creates xs:minInclusive facet
     * @param param
     * @return
     */
    XmlSchemaMinInclusiveFacet minInclusive(final XDNamedValue param);

    /**
     * Creates xs:maxExclusive facet
     * @param param
     * @return
     */
    XmlSchemaMaxExclusiveFacet maxExclusive(final XDNamedValue param);

    /**
     * Creates xs:maxInclusive facet
     * @param param
     * @return
     */
    XmlSchemaMaxInclusiveFacet maxInclusive(final XDNamedValue param);

    /**
     * Creates xs:minLength facet
     * @param param
     * @return
     */
    XmlSchemaMinLengthFacet minLength(final XDNamedValue param);

    /**
     * Creates xs:maxLength facet
     * @param param
     * @return
     */
    XmlSchemaMaxLengthFacet maxLength(final XDNamedValue param);

    /**
     * Creates xs:length facet
     * @param param
     * @return
     */
    XmlSchemaLengthFacet length(final XDNamedValue param);

    /**
     * Creates xs:pattern facet
     * @param param
     * @return
     */
    XmlSchemaPatternFacet pattern(final XDNamedValue param);

    /**
     * Creates xs:pattern facet
     * @param value
     * @return
     */
    XmlSchemaPatternFacet pattern(final String value);

    /**
     * Creates xs:enumeration facet
     * @param param
     */
    List<XmlSchemaEnumerationFacet> enumeration(final XDNamedValue param);

    /**
     * Creates xs:fractionDigits facet
     * @param param
     * @return
     */
    XmlSchemaFractionDigitsFacet fractionDigits(final XDNamedValue param);

    /**
     * Creates xs:totalDigits facet
     * @param param
     * @return
     */
    XmlSchemaTotalDigitsFacet totalDigits(final XDNamedValue param);

    /**
     * Creates xs:whiteSpace facet
     * @param param
     * @return
     */
    XmlSchemaWhiteSpaceFacet whitespace(final XDNamedValue param);

    /**
     * Creates custom facets
     * @param params
     * @return
     */
    void customFacets(final List<XmlSchemaFacet> facets, final XDNamedValue[] params);

    void setUseDecimalValue(boolean useDecimalValue);
}
