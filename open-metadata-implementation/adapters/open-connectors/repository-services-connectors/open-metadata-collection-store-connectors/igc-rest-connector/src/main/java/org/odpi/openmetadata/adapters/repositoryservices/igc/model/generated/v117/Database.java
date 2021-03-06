/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v117;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'database' asset type in IGC, displayed as 'Database' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Database extends MainObject {

    public static final String IGC_TYPE_ID = "database";

    /**
     * The 'host' property, displayed as 'Host' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Host} object.
     */
    protected Reference host;

    /**
     * The 'database_schemas' property, displayed as 'Database Schemas' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DatabaseSchema} objects.
     */
    protected ReferenceList database_schemas;

    /**
     * The 'alias_(business_name)' property, displayed as 'Alias (Business Name)' in the IGC UI.
     */
    @JsonProperty("alias_(business_name)") protected String alias__business_name_;

    /**
     * The 'location' property, displayed as 'Location' in the IGC UI.
     */
    protected String location;

    /**
     * The 'dbms' property, displayed as 'DBMS' in the IGC UI.
     */
    protected String dbms;

    /**
     * The 'dbms_server_instance' property, displayed as 'DBMS Server Instance' in the IGC UI.
     */
    protected String dbms_server_instance;

    /**
     * The 'dbms_vendor' property, displayed as 'DBMS Vendor' in the IGC UI.
     */
    protected String dbms_vendor;

    /**
     * The 'dbms_version' property, displayed as 'DBMS Version' in the IGC UI.
     */
    protected String dbms_version;

    /**
     * The 'database_type' property, displayed as 'Database Type' in the IGC UI.
     */
    protected String database_type;

    /**
     * The 'imported_from' property, displayed as 'Imported From' in the IGC UI.
     */
    protected String imported_from;

    /**
     * The 'data_connections' property, displayed as 'Data Connections' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataConnection} objects.
     */
    protected ReferenceList data_connections;

    /**
     * The 'data_connection_mappings' property, displayed as 'Data Connection Mappings' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataConnectionMapping} objects.
     */
    protected ReferenceList data_connection_mappings;

    /**
     * The 'mapped_to_mdm_models' property, displayed as 'Mapped to MDM Models' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MdmModel} objects.
     */
    protected ReferenceList mapped_to_mdm_models;

    /**
     * The 'read_by_(static)' property, displayed as 'Read by (Static)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(static)") protected ReferenceList read_by__static_;

    /**
     * The 'written_by_(static)' property, displayed as 'Written by (Static)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(static)") protected ReferenceList written_by__static_;

    /**
     * The 'read_by_(design)' property, displayed as 'Read by (Design)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(design)") protected ReferenceList read_by__design_;

    /**
     * The 'written_by_(design)' property, displayed as 'Written by (Design)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(design)") protected ReferenceList written_by__design_;

    /**
     * The 'read_by_(operational)' property, displayed as 'Read by (Operational)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(operational)") protected ReferenceList read_by__operational_;

    /**
     * The 'written_by_(operational)' property, displayed as 'Written by (Operational)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(operational)") protected ReferenceList written_by__operational_;

    /**
     * The 'read_by_(user_defined)' property, displayed as 'Read by (User-Defined)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(user_defined)") protected ReferenceList read_by__user_defined_;

    /**
     * The 'written_by_(user_defined)' property, displayed as 'Written by (User-Defined)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(user_defined)") protected ReferenceList written_by__user_defined_;

    /**
     * The 'impacted_by' property, displayed as 'Impacted by' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    protected ReferenceList impacted_by;

    /**
     * The 'impacts_on' property, displayed as 'Impacts on' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    protected ReferenceList impacts_on;

    /**
     * The 'bi_reports' property, displayed as 'BI Reports' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link BiReport} objects.
     */
    protected ReferenceList bi_reports;

    /**
     * The 'bi_models' property, displayed as 'BI Models' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link BiModel} objects.
     */
    protected ReferenceList bi_models;

    /**
     * The 'suggested_term_assignments' property, displayed as 'Suggested Term Assignments' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link TermAssignment} objects.
     */
    protected ReferenceList suggested_term_assignments;

    /**
     * The 'in_collections' property, displayed as 'In Collections' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Collection} objects.
     */
    protected ReferenceList in_collections;


    /** @see #host */ @JsonProperty("host")  public Reference getHost() { return this.host; }
    /** @see #host */ @JsonProperty("host")  public void setHost(Reference host) { this.host = host; }

    /** @see #database_schemas */ @JsonProperty("database_schemas")  public ReferenceList getDatabaseSchemas() { return this.database_schemas; }
    /** @see #database_schemas */ @JsonProperty("database_schemas")  public void setDatabaseSchemas(ReferenceList database_schemas) { this.database_schemas = database_schemas; }

    /** @see #alias__business_name_ */ @JsonProperty("alias_(business_name)")  public String getAliasBusinessName() { return this.alias__business_name_; }
    /** @see #alias__business_name_ */ @JsonProperty("alias_(business_name)")  public void setAliasBusinessName(String alias__business_name_) { this.alias__business_name_ = alias__business_name_; }

    /** @see #location */ @JsonProperty("location")  public String getLocation() { return this.location; }
    /** @see #location */ @JsonProperty("location")  public void setLocation(String location) { this.location = location; }

    /** @see #dbms */ @JsonProperty("dbms")  public String getDbms() { return this.dbms; }
    /** @see #dbms */ @JsonProperty("dbms")  public void setDbms(String dbms) { this.dbms = dbms; }

    /** @see #dbms_server_instance */ @JsonProperty("dbms_server_instance")  public String getDbmsServerInstance() { return this.dbms_server_instance; }
    /** @see #dbms_server_instance */ @JsonProperty("dbms_server_instance")  public void setDbmsServerInstance(String dbms_server_instance) { this.dbms_server_instance = dbms_server_instance; }

    /** @see #dbms_vendor */ @JsonProperty("dbms_vendor")  public String getDbmsVendor() { return this.dbms_vendor; }
    /** @see #dbms_vendor */ @JsonProperty("dbms_vendor")  public void setDbmsVendor(String dbms_vendor) { this.dbms_vendor = dbms_vendor; }

    /** @see #dbms_version */ @JsonProperty("dbms_version")  public String getDbmsVersion() { return this.dbms_version; }
    /** @see #dbms_version */ @JsonProperty("dbms_version")  public void setDbmsVersion(String dbms_version) { this.dbms_version = dbms_version; }

    /** @see #database_type */ @JsonProperty("database_type")  public String getDatabaseType() { return this.database_type; }
    /** @see #database_type */ @JsonProperty("database_type")  public void setDatabaseType(String database_type) { this.database_type = database_type; }

    /** @see #imported_from */ @JsonProperty("imported_from")  public String getImportedFrom() { return this.imported_from; }
    /** @see #imported_from */ @JsonProperty("imported_from")  public void setImportedFrom(String imported_from) { this.imported_from = imported_from; }

    /** @see #data_connections */ @JsonProperty("data_connections")  public ReferenceList getDataConnections() { return this.data_connections; }
    /** @see #data_connections */ @JsonProperty("data_connections")  public void setDataConnections(ReferenceList data_connections) { this.data_connections = data_connections; }

    /** @see #data_connection_mappings */ @JsonProperty("data_connection_mappings")  public ReferenceList getDataConnectionMappings() { return this.data_connection_mappings; }
    /** @see #data_connection_mappings */ @JsonProperty("data_connection_mappings")  public void setDataConnectionMappings(ReferenceList data_connection_mappings) { this.data_connection_mappings = data_connection_mappings; }

    /** @see #mapped_to_mdm_models */ @JsonProperty("mapped_to_mdm_models")  public ReferenceList getMappedToMdmModels() { return this.mapped_to_mdm_models; }
    /** @see #mapped_to_mdm_models */ @JsonProperty("mapped_to_mdm_models")  public void setMappedToMdmModels(ReferenceList mapped_to_mdm_models) { this.mapped_to_mdm_models = mapped_to_mdm_models; }

    /** @see #read_by__static_ */ @JsonProperty("read_by_(static)")  public ReferenceList getReadByStatic() { return this.read_by__static_; }
    /** @see #read_by__static_ */ @JsonProperty("read_by_(static)")  public void setReadByStatic(ReferenceList read_by__static_) { this.read_by__static_ = read_by__static_; }

    /** @see #written_by__static_ */ @JsonProperty("written_by_(static)")  public ReferenceList getWrittenByStatic() { return this.written_by__static_; }
    /** @see #written_by__static_ */ @JsonProperty("written_by_(static)")  public void setWrittenByStatic(ReferenceList written_by__static_) { this.written_by__static_ = written_by__static_; }

    /** @see #read_by__design_ */ @JsonProperty("read_by_(design)")  public ReferenceList getReadByDesign() { return this.read_by__design_; }
    /** @see #read_by__design_ */ @JsonProperty("read_by_(design)")  public void setReadByDesign(ReferenceList read_by__design_) { this.read_by__design_ = read_by__design_; }

    /** @see #written_by__design_ */ @JsonProperty("written_by_(design)")  public ReferenceList getWrittenByDesign() { return this.written_by__design_; }
    /** @see #written_by__design_ */ @JsonProperty("written_by_(design)")  public void setWrittenByDesign(ReferenceList written_by__design_) { this.written_by__design_ = written_by__design_; }

    /** @see #read_by__operational_ */ @JsonProperty("read_by_(operational)")  public ReferenceList getReadByOperational() { return this.read_by__operational_; }
    /** @see #read_by__operational_ */ @JsonProperty("read_by_(operational)")  public void setReadByOperational(ReferenceList read_by__operational_) { this.read_by__operational_ = read_by__operational_; }

    /** @see #written_by__operational_ */ @JsonProperty("written_by_(operational)")  public ReferenceList getWrittenByOperational() { return this.written_by__operational_; }
    /** @see #written_by__operational_ */ @JsonProperty("written_by_(operational)")  public void setWrittenByOperational(ReferenceList written_by__operational_) { this.written_by__operational_ = written_by__operational_; }

    /** @see #read_by__user_defined_ */ @JsonProperty("read_by_(user_defined)")  public ReferenceList getReadByUserDefined() { return this.read_by__user_defined_; }
    /** @see #read_by__user_defined_ */ @JsonProperty("read_by_(user_defined)")  public void setReadByUserDefined(ReferenceList read_by__user_defined_) { this.read_by__user_defined_ = read_by__user_defined_; }

    /** @see #written_by__user_defined_ */ @JsonProperty("written_by_(user_defined)")  public ReferenceList getWrittenByUserDefined() { return this.written_by__user_defined_; }
    /** @see #written_by__user_defined_ */ @JsonProperty("written_by_(user_defined)")  public void setWrittenByUserDefined(ReferenceList written_by__user_defined_) { this.written_by__user_defined_ = written_by__user_defined_; }

    /** @see #impacted_by */ @JsonProperty("impacted_by")  public ReferenceList getImpactedBy() { return this.impacted_by; }
    /** @see #impacted_by */ @JsonProperty("impacted_by")  public void setImpactedBy(ReferenceList impacted_by) { this.impacted_by = impacted_by; }

    /** @see #impacts_on */ @JsonProperty("impacts_on")  public ReferenceList getImpactsOn() { return this.impacts_on; }
    /** @see #impacts_on */ @JsonProperty("impacts_on")  public void setImpactsOn(ReferenceList impacts_on) { this.impacts_on = impacts_on; }

    /** @see #bi_reports */ @JsonProperty("bi_reports")  public ReferenceList getBiReports() { return this.bi_reports; }
    /** @see #bi_reports */ @JsonProperty("bi_reports")  public void setBiReports(ReferenceList bi_reports) { this.bi_reports = bi_reports; }

    /** @see #bi_models */ @JsonProperty("bi_models")  public ReferenceList getBiModels() { return this.bi_models; }
    /** @see #bi_models */ @JsonProperty("bi_models")  public void setBiModels(ReferenceList bi_models) { this.bi_models = bi_models; }

    /** @see #suggested_term_assignments */ @JsonProperty("suggested_term_assignments")  public ReferenceList getSuggestedTermAssignments() { return this.suggested_term_assignments; }
    /** @see #suggested_term_assignments */ @JsonProperty("suggested_term_assignments")  public void setSuggestedTermAssignments(ReferenceList suggested_term_assignments) { this.suggested_term_assignments = suggested_term_assignments; }

    /** @see #in_collections */ @JsonProperty("in_collections")  public ReferenceList getInCollections() { return this.in_collections; }
    /** @see #in_collections */ @JsonProperty("in_collections")  public void setInCollections(ReferenceList in_collections) { this.in_collections = in_collections; }


    public static final Boolean isDatabase(Object obj) { return (obj.getClass() == Database.class); }

}
