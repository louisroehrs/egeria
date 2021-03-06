/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v117;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'xsd_foreign_key' asset type in IGC, displayed as 'XSD Foreign Key' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class XsdForeignKey extends MainObject {

    public static final String IGC_TYPE_ID = "xsd_foreign_key";

    /**
     * The 'xsd_element' property, displayed as 'XSD Element' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference xsd_element;

    /**
     * The 'namespace' property, displayed as 'Namespace' in the IGC UI.
     */
    protected String namespace;

    /**
     * The 'selector' property, displayed as 'Selector' in the IGC UI.
     */
    protected String selector;

    /**
     * The 'xsd_elements_or_attributes' property, displayed as 'XSD Elements or Attributes' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList xsd_elements_or_attributes;

    /**
     * The 'referenced_xsd_keys' property, displayed as 'References XSD Keys' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link XsdUniqueKey} object.
     */
    protected Reference referenced_xsd_keys;


    /** @see #xsd_element */ @JsonProperty("xsd_element")  public Reference getXsdElement() { return this.xsd_element; }
    /** @see #xsd_element */ @JsonProperty("xsd_element")  public void setXsdElement(Reference xsd_element) { this.xsd_element = xsd_element; }

    /** @see #namespace */ @JsonProperty("namespace")  public String getNamespace() { return this.namespace; }
    /** @see #namespace */ @JsonProperty("namespace")  public void setNamespace(String namespace) { this.namespace = namespace; }

    /** @see #selector */ @JsonProperty("selector")  public String getSelector() { return this.selector; }
    /** @see #selector */ @JsonProperty("selector")  public void setSelector(String selector) { this.selector = selector; }

    /** @see #xsd_elements_or_attributes */ @JsonProperty("xsd_elements_or_attributes")  public ReferenceList getXsdElementsOrAttributes() { return this.xsd_elements_or_attributes; }
    /** @see #xsd_elements_or_attributes */ @JsonProperty("xsd_elements_or_attributes")  public void setXsdElementsOrAttributes(ReferenceList xsd_elements_or_attributes) { this.xsd_elements_or_attributes = xsd_elements_or_attributes; }

    /** @see #referenced_xsd_keys */ @JsonProperty("referenced_xsd_keys")  public Reference getReferencedXsdKeys() { return this.referenced_xsd_keys; }
    /** @see #referenced_xsd_keys */ @JsonProperty("referenced_xsd_keys")  public void setReferencedXsdKeys(Reference referenced_xsd_keys) { this.referenced_xsd_keys = referenced_xsd_keys; }


    public static final Boolean isXsdForeignKey(Object obj) { return (obj.getClass() == XsdForeignKey.class); }

}
