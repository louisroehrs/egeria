/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v115;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'data_rule_set_definition' asset type in IGC, displayed as 'Data Rule Set Definition' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DataRuleSetDefinition extends MainObject {

    public static final String IGC_TYPE_ID = "data_rule_set_definition";

    /**
     * The 'project' property, displayed as 'Project' in the IGC UI.
     */
    protected String project;

    /**
     * The 'status' property, displayed as 'Status' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>CANDIDATE (displayed in the UI as 'CANDIDATE')</li>
     *     <li>ACCEPTED (displayed in the UI as 'ACCEPTED')</li>
     *     <li>STANDARD (displayed in the UI as 'STANDARD')</li>
     *     <li>DEPRECATED (displayed in the UI as 'DEPRECATED')</li>
     *     <li>DRAFT (displayed in the UI as 'DRAFT')</li>
     *     <li>IN_PROCESS (displayed in the UI as 'IN_PROCESS')</li>
     *     <li>REJECTED (displayed in the UI as 'REJECTED')</li>
     *     <li>ERROR (displayed in the UI as 'ERROR')</li>
     * </ul>
     */
    protected String status;

    /**
     * The 'published' property, displayed as 'Published' in the IGC UI.
     */
    protected Boolean published;

    /**
     * The 'publication_date' property, displayed as 'Publication Date' in the IGC UI.
     */
    protected Date publication_date;

    /**
     * The 'contact' property, displayed as 'Contact' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Steward} objects.
     */
    protected ReferenceList contact;

    /**
     * The 'data_policies' property, displayed as 'Data Policies' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataPolicy} objects.
     */
    protected ReferenceList data_policies;

    /**
     * The 'in_collections' property, displayed as 'In Collections' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Collection} objects.
     */
    protected ReferenceList in_collections;

    /**
     * The 'non_published_data_rule_set_definitions' property, displayed as 'Non Published Data Rule Set Definitions' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link NonPublishedDataRuleSet} object.
     */
    protected Reference non_published_data_rule_set_definitions;

    /**
     * The 'published_data_rule_set_definitions' property, displayed as 'Published Data Rule Set Definitions' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link PublishedDataRuleSet} object.
     */
    protected Reference published_data_rule_set_definitions;


    /** @see #project */ @JsonProperty("project")  public String getProject() { return this.project; }
    /** @see #project */ @JsonProperty("project")  public void setProject(String project) { this.project = project; }

    /** @see #status */ @JsonProperty("status")  public String getStatus() { return this.status; }
    /** @see #status */ @JsonProperty("status")  public void setStatus(String status) { this.status = status; }

    /** @see #published */ @JsonProperty("published")  public Boolean getPublished() { return this.published; }
    /** @see #published */ @JsonProperty("published")  public void setPublished(Boolean published) { this.published = published; }

    /** @see #publication_date */ @JsonProperty("publication_date")  public Date getPublicationDate() { return this.publication_date; }
    /** @see #publication_date */ @JsonProperty("publication_date")  public void setPublicationDate(Date publication_date) { this.publication_date = publication_date; }

    /** @see #contact */ @JsonProperty("contact")  public ReferenceList getContact() { return this.contact; }
    /** @see #contact */ @JsonProperty("contact")  public void setContact(ReferenceList contact) { this.contact = contact; }

    /** @see #data_policies */ @JsonProperty("data_policies")  public ReferenceList getDataPolicies() { return this.data_policies; }
    /** @see #data_policies */ @JsonProperty("data_policies")  public void setDataPolicies(ReferenceList data_policies) { this.data_policies = data_policies; }

    /** @see #in_collections */ @JsonProperty("in_collections")  public ReferenceList getInCollections() { return this.in_collections; }
    /** @see #in_collections */ @JsonProperty("in_collections")  public void setInCollections(ReferenceList in_collections) { this.in_collections = in_collections; }

    /** @see #non_published_data_rule_set_definitions */ @JsonProperty("non_published_data_rule_set_definitions")  public Reference getNonPublishedDataRuleSetDefinitions() { return this.non_published_data_rule_set_definitions; }
    /** @see #non_published_data_rule_set_definitions */ @JsonProperty("non_published_data_rule_set_definitions")  public void setNonPublishedDataRuleSetDefinitions(Reference non_published_data_rule_set_definitions) { this.non_published_data_rule_set_definitions = non_published_data_rule_set_definitions; }

    /** @see #published_data_rule_set_definitions */ @JsonProperty("published_data_rule_set_definitions")  public Reference getPublishedDataRuleSetDefinitions() { return this.published_data_rule_set_definitions; }
    /** @see #published_data_rule_set_definitions */ @JsonProperty("published_data_rule_set_definitions")  public void setPublishedDataRuleSetDefinitions(Reference published_data_rule_set_definitions) { this.published_data_rule_set_definitions = published_data_rule_set_definitions; }


    public static final Boolean isDataRuleSetDefinition(Object obj) { return (obj.getClass() == DataRuleSetDefinition.class); }

}
