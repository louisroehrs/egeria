/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v115;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'job_run' asset type in IGC, displayed as 'Job Run' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobRun extends MainObject {

    public static final String IGC_TYPE_ID = "job_run";

    /**
     * The 'translated_summary' property, displayed as 'Name' in the IGC UI.
     */
    protected String translated_summary;

    /**
     * The 'job' property, displayed as 'Job' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Dsjob} object.
     */
    protected Reference job;

    /**
     * The 'invocation_id' property, displayed as 'Invocation ID' in the IGC UI.
     */
    protected String invocation_id;

    /**
     * The 'wave_number' property, displayed as 'Wave Number' in the IGC UI.
     */
    protected String wave_number;

    /**
     * The 'omd_file_name' property, displayed as 'OMD File Name' in the IGC UI.
     */
    protected String omd_file_name;

    /**
     * The 'starting_date' property, displayed as 'Starting Date' in the IGC UI.
     */
    protected Date starting_date;

    /**
     * The 'ending_date' property, displayed as 'Ending Date' in the IGC UI.
     */
    protected Date ending_date;

    /**
     * The 'translated_status_code' property, displayed as 'Status' in the IGC UI.
     */
    protected String translated_status_code;

    /**
     * The 'parameters' property, displayed as 'Parameters' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link JobParameter} objects.
     */
    protected ReferenceList parameters;


    /** @see #translated_summary */ @JsonProperty("translated_summary")  public String getTranslatedSummary() { return this.translated_summary; }
    /** @see #translated_summary */ @JsonProperty("translated_summary")  public void setTranslatedSummary(String translated_summary) { this.translated_summary = translated_summary; }

    /** @see #job */ @JsonProperty("job")  public Reference getJob() { return this.job; }
    /** @see #job */ @JsonProperty("job")  public void setJob(Reference job) { this.job = job; }

    /** @see #invocation_id */ @JsonProperty("invocation_id")  public String getInvocationId() { return this.invocation_id; }
    /** @see #invocation_id */ @JsonProperty("invocation_id")  public void setInvocationId(String invocation_id) { this.invocation_id = invocation_id; }

    /** @see #wave_number */ @JsonProperty("wave_number")  public String getWaveNumber() { return this.wave_number; }
    /** @see #wave_number */ @JsonProperty("wave_number")  public void setWaveNumber(String wave_number) { this.wave_number = wave_number; }

    /** @see #omd_file_name */ @JsonProperty("omd_file_name")  public String getOmdFileName() { return this.omd_file_name; }
    /** @see #omd_file_name */ @JsonProperty("omd_file_name")  public void setOmdFileName(String omd_file_name) { this.omd_file_name = omd_file_name; }

    /** @see #starting_date */ @JsonProperty("starting_date")  public Date getStartingDate() { return this.starting_date; }
    /** @see #starting_date */ @JsonProperty("starting_date")  public void setStartingDate(Date starting_date) { this.starting_date = starting_date; }

    /** @see #ending_date */ @JsonProperty("ending_date")  public Date getEndingDate() { return this.ending_date; }
    /** @see #ending_date */ @JsonProperty("ending_date")  public void setEndingDate(Date ending_date) { this.ending_date = ending_date; }

    /** @see #translated_status_code */ @JsonProperty("translated_status_code")  public String getTranslatedStatusCode() { return this.translated_status_code; }
    /** @see #translated_status_code */ @JsonProperty("translated_status_code")  public void setTranslatedStatusCode(String translated_status_code) { this.translated_status_code = translated_status_code; }

    /** @see #parameters */ @JsonProperty("parameters")  public ReferenceList getParameters() { return this.parameters; }
    /** @see #parameters */ @JsonProperty("parameters")  public void setParameters(ReferenceList parameters) { this.parameters = parameters; }


    public static final Boolean isJobRun(Object obj) { return (obj.getClass() == JobRun.class); }

}
