/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.model.generated.v115;

import org.odpi.openmetadata.adapters.repositoryservices.igc.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'lineage_report_template' asset type in IGC, displayed as 'Lineage Report Template' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class LineageReportTemplate extends MainObject {

    public static final String IGC_TYPE_ID = "lineage_report_template";

    /**
     * The 'uses_lineage_filter' property, displayed as 'Uses Lineage Filter' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Lineagefilter} objects.
     */
    protected ReferenceList uses_lineage_filter;

    /**
     * The 'asset_display_properties' property, displayed as 'Asset Type Properties' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link InformationAsset} object.
     */
    protected Reference asset_display_properties;


    /** @see #uses_lineage_filter */ @JsonProperty("uses_lineage_filter")  public ReferenceList getUsesLineageFilter() { return this.uses_lineage_filter; }
    /** @see #uses_lineage_filter */ @JsonProperty("uses_lineage_filter")  public void setUsesLineageFilter(ReferenceList uses_lineage_filter) { this.uses_lineage_filter = uses_lineage_filter; }

    /** @see #asset_display_properties */ @JsonProperty("asset_display_properties")  public Reference getAssetDisplayProperties() { return this.asset_display_properties; }
    /** @see #asset_display_properties */ @JsonProperty("asset_display_properties")  public void setAssetDisplayProperties(Reference asset_display_properties) { this.asset_display_properties = asset_display_properties; }


    public static final Boolean isLineageReportTemplate(Object obj) { return (obj.getClass() == LineageReportTemplate.class); }

}
