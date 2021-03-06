/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v117;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'oslc_link' asset type in IGC, displayed as 'Link' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class OslcLink extends MainObject {

    public static final String IGC_TYPE_ID = "oslc_link";

    /**
     * The 'url' property, displayed as 'Url' in the IGC UI.
     */
    protected String url;

    /**
     * The 'link_type' property, displayed as 'Link Type' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Linktype} object.
     */
    protected Reference link_type;

    /**
     * The 'description' property, displayed as 'Description' in the IGC UI.
     */
    protected String description;

    /**
     * The 'of_main_object' property, displayed as 'Of Main Object' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference of_main_object;

    /**
     * The 'of_provider_connection' property, displayed as 'Of Provider Connection' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link InformationAsset} object.
     */
    protected Reference of_provider_connection;


    /** @see #url */ @JsonProperty("url")  public String getTheUrl() { return this.url; }
    /** @see #url */ @JsonProperty("url")  public void setTheUrl(String url) { this.url = url; }

    /** @see #link_type */ @JsonProperty("link_type")  public Reference getLinkType() { return this.link_type; }
    /** @see #link_type */ @JsonProperty("link_type")  public void setLinkType(Reference link_type) { this.link_type = link_type; }

    /** @see #description */ @JsonProperty("description")  public String getDescription() { return this.description; }
    /** @see #description */ @JsonProperty("description")  public void setDescription(String description) { this.description = description; }

    /** @see #of_main_object */ @JsonProperty("of_main_object")  public Reference getOfMainObject() { return this.of_main_object; }
    /** @see #of_main_object */ @JsonProperty("of_main_object")  public void setOfMainObject(Reference of_main_object) { this.of_main_object = of_main_object; }

    /** @see #of_provider_connection */ @JsonProperty("of_provider_connection")  public Reference getOfProviderConnection() { return this.of_provider_connection; }
    /** @see #of_provider_connection */ @JsonProperty("of_provider_connection")  public void setOfProviderConnection(Reference of_provider_connection) { this.of_provider_connection = of_provider_connection; }


    public static final Boolean isOslcLink(Object obj) { return (obj.getClass() == OslcLink.class); }

}
