/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v115;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'amazon_s3_data_file_folder' asset type in IGC, displayed as 'Amazon S3 Data File Folder' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AmazonS3DataFileFolder extends MainObject {

    public static final String IGC_TYPE_ID = "amazon_s3_data_file_folder";

    /**
     * The 'parent_folder' property, displayed as 'Data File Folder' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference parent_folder;

    /**
     * The 'amazon_s3_bucket' property, displayed as 'Amazon S3 Bucket' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link AmazonS3Bucket} object.
     */
    protected Reference amazon_s3_bucket;

    /**
     * The 'amazon_s3_data_file_folder' property, displayed as 'Amazon S3 Data File Folder' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link AmazonS3DataFileFolder} object.
     */
    protected Reference amazon_s3_data_file_folder;

    /**
     * The 'contains_amazon_s3_data_file_folders' property, displayed as 'Contains Amazon S3 Data File Folders' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList contains_amazon_s3_data_file_folders;

    /**
     * The 'contains_amazon_s3_data_files' property, displayed as 'Contains Amazon S3 Data Files' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link AmazonS3DataFile} objects.
     */
    protected ReferenceList contains_amazon_s3_data_files;

    /**
     * The 'uses_data_file_definitions' property, displayed as 'Uses Data File Definitions' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataFileDefinition} objects.
     */
    protected ReferenceList uses_data_file_definitions;

    /**
     * The 'location' property, displayed as 'Location' in the IGC UI.
     */
    protected String location;

    /**
     * The 'source_creation_date' property, displayed as 'Source Creation Date' in the IGC UI.
     */
    protected Date source_creation_date;

    /**
     * The 'source_modification_date' property, displayed as 'Source Modification Date' in the IGC UI.
     */
    protected Date source_modification_date;

    /**
     * The 'data_connection' property, displayed as 'Data Connection' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataConnection} objects.
     */
    protected ReferenceList data_connection;

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
     * The 'same_as_data_sources' property, displayed as 'Same as Data Sources' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList same_as_data_sources;

    /**
     * The 'include_for_business_lineage' property, displayed as 'Include for Business Lineage' in the IGC UI.
     */
    protected Boolean include_for_business_lineage;

    /**
     * The 'in_collections' property, displayed as 'In Collections' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Collection} objects.
     */
    protected ReferenceList in_collections;


    /** @see #parent_folder */ @JsonProperty("parent_folder")  public Reference getParentFolder() { return this.parent_folder; }
    /** @see #parent_folder */ @JsonProperty("parent_folder")  public void setParentFolder(Reference parent_folder) { this.parent_folder = parent_folder; }

    /** @see #amazon_s3_bucket */ @JsonProperty("amazon_s3_bucket")  public Reference getAmazonS3Bucket() { return this.amazon_s3_bucket; }
    /** @see #amazon_s3_bucket */ @JsonProperty("amazon_s3_bucket")  public void setAmazonS3Bucket(Reference amazon_s3_bucket) { this.amazon_s3_bucket = amazon_s3_bucket; }

    /** @see #amazon_s3_data_file_folder */ @JsonProperty("amazon_s3_data_file_folder")  public Reference getAmazonS3DataFileFolder() { return this.amazon_s3_data_file_folder; }
    /** @see #amazon_s3_data_file_folder */ @JsonProperty("amazon_s3_data_file_folder")  public void setAmazonS3DataFileFolder(Reference amazon_s3_data_file_folder) { this.amazon_s3_data_file_folder = amazon_s3_data_file_folder; }

    /** @see #contains_amazon_s3_data_file_folders */ @JsonProperty("contains_amazon_s3_data_file_folders")  public ReferenceList getContainsAmazonS3DataFileFolders() { return this.contains_amazon_s3_data_file_folders; }
    /** @see #contains_amazon_s3_data_file_folders */ @JsonProperty("contains_amazon_s3_data_file_folders")  public void setContainsAmazonS3DataFileFolders(ReferenceList contains_amazon_s3_data_file_folders) { this.contains_amazon_s3_data_file_folders = contains_amazon_s3_data_file_folders; }

    /** @see #contains_amazon_s3_data_files */ @JsonProperty("contains_amazon_s3_data_files")  public ReferenceList getContainsAmazonS3DataFiles() { return this.contains_amazon_s3_data_files; }
    /** @see #contains_amazon_s3_data_files */ @JsonProperty("contains_amazon_s3_data_files")  public void setContainsAmazonS3DataFiles(ReferenceList contains_amazon_s3_data_files) { this.contains_amazon_s3_data_files = contains_amazon_s3_data_files; }

    /** @see #uses_data_file_definitions */ @JsonProperty("uses_data_file_definitions")  public ReferenceList getUsesDataFileDefinitions() { return this.uses_data_file_definitions; }
    /** @see #uses_data_file_definitions */ @JsonProperty("uses_data_file_definitions")  public void setUsesDataFileDefinitions(ReferenceList uses_data_file_definitions) { this.uses_data_file_definitions = uses_data_file_definitions; }

    /** @see #location */ @JsonProperty("location")  public String getLocation() { return this.location; }
    /** @see #location */ @JsonProperty("location")  public void setLocation(String location) { this.location = location; }

    /** @see #source_creation_date */ @JsonProperty("source_creation_date")  public Date getSourceCreationDate() { return this.source_creation_date; }
    /** @see #source_creation_date */ @JsonProperty("source_creation_date")  public void setSourceCreationDate(Date source_creation_date) { this.source_creation_date = source_creation_date; }

    /** @see #source_modification_date */ @JsonProperty("source_modification_date")  public Date getSourceModificationDate() { return this.source_modification_date; }
    /** @see #source_modification_date */ @JsonProperty("source_modification_date")  public void setSourceModificationDate(Date source_modification_date) { this.source_modification_date = source_modification_date; }

    /** @see #data_connection */ @JsonProperty("data_connection")  public ReferenceList getDataConnection() { return this.data_connection; }
    /** @see #data_connection */ @JsonProperty("data_connection")  public void setDataConnection(ReferenceList data_connection) { this.data_connection = data_connection; }

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

    /** @see #same_as_data_sources */ @JsonProperty("same_as_data_sources")  public ReferenceList getSameAsDataSources() { return this.same_as_data_sources; }
    /** @see #same_as_data_sources */ @JsonProperty("same_as_data_sources")  public void setSameAsDataSources(ReferenceList same_as_data_sources) { this.same_as_data_sources = same_as_data_sources; }

    /** @see #include_for_business_lineage */ @JsonProperty("include_for_business_lineage")  public Boolean getIncludeForBusinessLineage() { return this.include_for_business_lineage; }
    /** @see #include_for_business_lineage */ @JsonProperty("include_for_business_lineage")  public void setIncludeForBusinessLineage(Boolean include_for_business_lineage) { this.include_for_business_lineage = include_for_business_lineage; }

    /** @see #in_collections */ @JsonProperty("in_collections")  public ReferenceList getInCollections() { return this.in_collections; }
    /** @see #in_collections */ @JsonProperty("in_collections")  public void setInCollections(ReferenceList in_collections) { this.in_collections = in_collections; }


    public static final Boolean isAmazonS3DataFileFolder(Object obj) { return (obj.getClass() == AmazonS3DataFileFolder.class); }

}
