/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v117;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'xsd_element_reference' asset type in IGC, displayed as 'XSD Element Reference' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class XsdElementReference extends MainObject {

    public static final String IGC_TYPE_ID = "xsd_element_reference";

    /**
     * The 'min_occurs' property, displayed as 'Minimum Occurrence' in the IGC UI.
     */
    protected Number min_occurs;

    /**
     * The 'max_occurs' property, displayed as 'Maximum Occurrence' in the IGC UI.
     */
    protected Number max_occurs;

    /**
     * The 'xsd_element' property, displayed as 'XSD Element' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference xsd_element;

    /**
     * The 'xsd_complex_type' property, displayed as 'XSD Complex Type' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link XsdComplexType} object.
     */
    protected Reference xsd_complex_type;

    /**
     * The 'xsd_element_group' property, displayed as 'XSD Element Group' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link XsdElementGroup} object.
     */
    protected Reference xsd_element_group;

    /**
     * The 'referenced_xsd_element' property, displayed as 'XSD Element' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference referenced_xsd_element;


    /** @see #min_occurs */ @JsonProperty("min_occurs")  public Number getMinOccurs() { return this.min_occurs; }
    /** @see #min_occurs */ @JsonProperty("min_occurs")  public void setMinOccurs(Number min_occurs) { this.min_occurs = min_occurs; }

    /** @see #max_occurs */ @JsonProperty("max_occurs")  public Number getMaxOccurs() { return this.max_occurs; }
    /** @see #max_occurs */ @JsonProperty("max_occurs")  public void setMaxOccurs(Number max_occurs) { this.max_occurs = max_occurs; }

    /** @see #xsd_element */ @JsonProperty("xsd_element")  public Reference getXsdElement() { return this.xsd_element; }
    /** @see #xsd_element */ @JsonProperty("xsd_element")  public void setXsdElement(Reference xsd_element) { this.xsd_element = xsd_element; }

    /** @see #xsd_complex_type */ @JsonProperty("xsd_complex_type")  public Reference getXsdComplexType() { return this.xsd_complex_type; }
    /** @see #xsd_complex_type */ @JsonProperty("xsd_complex_type")  public void setXsdComplexType(Reference xsd_complex_type) { this.xsd_complex_type = xsd_complex_type; }

    /** @see #xsd_element_group */ @JsonProperty("xsd_element_group")  public Reference getXsdElementGroup() { return this.xsd_element_group; }
    /** @see #xsd_element_group */ @JsonProperty("xsd_element_group")  public void setXsdElementGroup(Reference xsd_element_group) { this.xsd_element_group = xsd_element_group; }

    /** @see #referenced_xsd_element */ @JsonProperty("referenced_xsd_element")  public Reference getReferencedXsdElement() { return this.referenced_xsd_element; }
    /** @see #referenced_xsd_element */ @JsonProperty("referenced_xsd_element")  public void setReferencedXsdElement(Reference referenced_xsd_element) { this.referenced_xsd_element = referenced_xsd_element; }


    public static final Boolean isXsdElementReference(Object obj) { return (obj.getClass() == XsdElementReference.class); }

}
