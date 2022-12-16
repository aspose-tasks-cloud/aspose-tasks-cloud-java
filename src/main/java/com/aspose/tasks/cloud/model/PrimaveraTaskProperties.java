/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2021 Aspose.Tasks Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.tasks.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents Primavera-specific properties for a task read from Primavera format (XER of P6XML).
 */
@ApiModel(description = "Represents Primavera-specific properties for a task read from Primavera format (XER of P6XML).")

public class PrimaveraTaskProperties {
  @SerializedName("SequenceNumber")
  private Integer sequenceNumber = null;

  @SerializedName("ActivityId")
  private String activityId = null;

  @SerializedName("RemainingEarlyFinish")
  private OffsetDateTime remainingEarlyFinish = null;

  @SerializedName("RemainingEarlyStart")
  private OffsetDateTime remainingEarlyStart = null;

  @SerializedName("RemainingLateStart")
  private OffsetDateTime remainingLateStart = null;

  @SerializedName("RemainingLateFinish")
  private OffsetDateTime remainingLateFinish = null;

  @SerializedName("RawDurationType")
  private String rawDurationType = null;

  @SerializedName("RawActivityType")
  private String rawActivityType = null;

  @SerializedName("RawCompletePercentType")
  private String rawCompletePercentType = null;

  @SerializedName("RawStatus")
  private String rawStatus = null;

  public PrimaveraTaskProperties sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * The sequence number of the WBS item (summary tasks). It is used to sort summary tasks in Primavera.
   * @return sequenceNumber
  **/
  @ApiModelProperty(required = true, value = "The sequence number of the WBS item (summary tasks). It is used to sort summary tasks in Primavera.")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public PrimaveraTaskProperties activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Activity id field - a task&#39;s unique identifier used by Primavera.
   * @return activityId
  **/
  @ApiModelProperty(value = "Activity id field - a task's unique identifier used by Primavera.")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public PrimaveraTaskProperties remainingEarlyFinish(OffsetDateTime remainingEarlyFinish) {
    this.remainingEarlyFinish = remainingEarlyFinish;
    return this;
  }

   /**
   * Remaining early finish date - the date when the remaining work for the activity is scheduled to be finished.
   * @return remainingEarlyFinish
  **/
  @ApiModelProperty(required = true, value = "Remaining early finish date - the date when the remaining work for the activity is scheduled to be finished.")
  public OffsetDateTime getRemainingEarlyFinish() {
    return remainingEarlyFinish;
  }

  public void setRemainingEarlyFinish(OffsetDateTime remainingEarlyFinish) {
    this.remainingEarlyFinish = remainingEarlyFinish;
  }

  public PrimaveraTaskProperties remainingEarlyStart(OffsetDateTime remainingEarlyStart) {
    this.remainingEarlyStart = remainingEarlyStart;
    return this;
  }

   /**
   * Remaining early start date - the date when the remaining work for the activity is scheduled to begin.
   * @return remainingEarlyStart
  **/
  @ApiModelProperty(required = true, value = "Remaining early start date - the date when the remaining work for the activity is scheduled to begin.")
  public OffsetDateTime getRemainingEarlyStart() {
    return remainingEarlyStart;
  }

  public void setRemainingEarlyStart(OffsetDateTime remainingEarlyStart) {
    this.remainingEarlyStart = remainingEarlyStart;
  }

  public PrimaveraTaskProperties remainingLateStart(OffsetDateTime remainingLateStart) {
    this.remainingLateStart = remainingLateStart;
    return this;
  }

   /**
   * Remaining late start date.
   * @return remainingLateStart
  **/
  @ApiModelProperty(required = true, value = "Remaining late start date.")
  public OffsetDateTime getRemainingLateStart() {
    return remainingLateStart;
  }

  public void setRemainingLateStart(OffsetDateTime remainingLateStart) {
    this.remainingLateStart = remainingLateStart;
  }

  public PrimaveraTaskProperties remainingLateFinish(OffsetDateTime remainingLateFinish) {
    this.remainingLateFinish = remainingLateFinish;
    return this;
  }

   /**
   * Remaining late finish date.
   * @return remainingLateFinish
  **/
  @ApiModelProperty(required = true, value = "Remaining late finish date.")
  public OffsetDateTime getRemainingLateFinish() {
    return remainingLateFinish;
  }

  public void setRemainingLateFinish(OffsetDateTime remainingLateFinish) {
    this.remainingLateFinish = remainingLateFinish;
  }

  public PrimaveraTaskProperties rawDurationType(String rawDurationType) {
    this.rawDurationType = rawDurationType;
    return this;
  }

   /**
   * Raw text representation (as in source file) of &#39;Duration Type&#39; field of the activity.
   * @return rawDurationType
  **/
  @ApiModelProperty(value = "Raw text representation (as in source file) of 'Duration Type' field of the activity.")
  public String getRawDurationType() {
    return rawDurationType;
  }

  public void setRawDurationType(String rawDurationType) {
    this.rawDurationType = rawDurationType;
  }

  public PrimaveraTaskProperties rawActivityType(String rawActivityType) {
    this.rawActivityType = rawActivityType;
    return this;
  }

   /**
   * Raw text representation (as in source file) of &#39;Activity Type&#39; field of the activity.
   * @return rawActivityType
  **/
  @ApiModelProperty(value = "Raw text representation (as in source file) of 'Activity Type' field of the activity.")
  public String getRawActivityType() {
    return rawActivityType;
  }

  public void setRawActivityType(String rawActivityType) {
    this.rawActivityType = rawActivityType;
  }

  public PrimaveraTaskProperties rawCompletePercentType(String rawCompletePercentType) {
    this.rawCompletePercentType = rawCompletePercentType;
    return this;
  }

   /**
   * Raw text representation (as in source file) of &#39;% Complete Type&#39; field of the activity.
   * @return rawCompletePercentType
  **/
  @ApiModelProperty(value = "Raw text representation (as in source file) of '% Complete Type' field of the activity.")
  public String getRawCompletePercentType() {
    return rawCompletePercentType;
  }

  public void setRawCompletePercentType(String rawCompletePercentType) {
    this.rawCompletePercentType = rawCompletePercentType;
  }

  public PrimaveraTaskProperties rawStatus(String rawStatus) {
    this.rawStatus = rawStatus;
    return this;
  }

   /**
   * Raw text representation (as in source file) of &#39;Status&#39; field of the activity.
   * @return rawStatus
  **/
  @ApiModelProperty(value = "Raw text representation (as in source file) of 'Status' field of the activity.")
  public String getRawStatus() {
    return rawStatus;
  }

  public void setRawStatus(String rawStatus) {
    this.rawStatus = rawStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaveraTaskProperties primaveraTaskProperties = (PrimaveraTaskProperties) o;
    return Objects.equals(this.sequenceNumber, primaveraTaskProperties.sequenceNumber) &&
        Objects.equals(this.activityId, primaveraTaskProperties.activityId) &&
        Objects.equals(this.remainingEarlyFinish, primaveraTaskProperties.remainingEarlyFinish) &&
        Objects.equals(this.remainingEarlyStart, primaveraTaskProperties.remainingEarlyStart) &&
        Objects.equals(this.remainingLateStart, primaveraTaskProperties.remainingLateStart) &&
        Objects.equals(this.remainingLateFinish, primaveraTaskProperties.remainingLateFinish) &&
        Objects.equals(this.rawDurationType, primaveraTaskProperties.rawDurationType) &&
        Objects.equals(this.rawActivityType, primaveraTaskProperties.rawActivityType) &&
        Objects.equals(this.rawCompletePercentType, primaveraTaskProperties.rawCompletePercentType) &&
        Objects.equals(this.rawStatus, primaveraTaskProperties.rawStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNumber, activityId, remainingEarlyFinish, remainingEarlyStart, remainingLateStart, remainingLateFinish, rawDurationType, rawActivityType, rawCompletePercentType, rawStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaveraTaskProperties {\n");
    
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    remainingEarlyFinish: ").append(toIndentedString(remainingEarlyFinish)).append("\n");
    sb.append("    remainingEarlyStart: ").append(toIndentedString(remainingEarlyStart)).append("\n");
    sb.append("    remainingLateStart: ").append(toIndentedString(remainingLateStart)).append("\n");
    sb.append("    remainingLateFinish: ").append(toIndentedString(remainingLateFinish)).append("\n");
    sb.append("    rawDurationType: ").append(toIndentedString(rawDurationType)).append("\n");
    sb.append("    rawActivityType: ").append(toIndentedString(rawActivityType)).append("\n");
    sb.append("    rawCompletePercentType: ").append(toIndentedString(rawCompletePercentType)).append("\n");
    sb.append("    rawStatus: ").append(toIndentedString(rawStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

