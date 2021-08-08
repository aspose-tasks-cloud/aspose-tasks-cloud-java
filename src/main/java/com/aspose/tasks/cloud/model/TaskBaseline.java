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
import com.aspose.tasks.cloud.model.Baseline;
import com.aspose.tasks.cloud.model.BaselineType;
import com.aspose.tasks.cloud.model.TimeUnitType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents baseline values of a task.
 */
@ApiModel(description = "Represents baseline values of a task.")

public class TaskBaseline extends Baseline {
  @SerializedName("Start")
  private OffsetDateTime start = null;

  @SerializedName("Finish")
  private OffsetDateTime finish = null;

  @SerializedName("Duration")
  private String duration = null;

  @SerializedName("FixedCost")
  private Double fixedCost = null;

  @SerializedName("DurationFormat")
  private TimeUnitType durationFormat = null;

  @SerializedName("EstimatedDuration")
  private Boolean estimatedDuration = null;

  public TaskBaseline start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The scheduled start date of the task when the baseline was saved.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "The scheduled start date of the task when the baseline was saved.")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public TaskBaseline finish(OffsetDateTime finish) {
    this.finish = finish;
    return this;
  }

   /**
   * The scheduled finish date of the task when the baseline was saved.
   * @return finish
  **/
  @ApiModelProperty(required = true, value = "The scheduled finish date of the task when the baseline was saved.")
  public OffsetDateTime getFinish() {
    return finish;
  }

  public void setFinish(OffsetDateTime finish) {
    this.finish = finish;
  }

  public TaskBaseline duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The scheduled duration of the task when the baseline was saved.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The scheduled duration of the task when the baseline was saved.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public TaskBaseline fixedCost(Double fixedCost) {
    this.fixedCost = fixedCost;
    return this;
  }

   /**
   * The fixed cost of the task when the baseline was saved.
   * @return fixedCost
  **/
  @ApiModelProperty(required = true, value = "The fixed cost of the task when the baseline was saved.")
  public Double getFixedCost() {
    return fixedCost;
  }

  public void setFixedCost(Double fixedCost) {
    this.fixedCost = fixedCost;
  }

  public TaskBaseline durationFormat(TimeUnitType durationFormat) {
    this.durationFormat = durationFormat;
    return this;
  }

   /**
   * The format for expressing the duration of the task baseline.
   * @return durationFormat
  **/
  @ApiModelProperty(required = true, value = "The format for expressing the duration of the task baseline.")
  public TimeUnitType getDurationFormat() {
    return durationFormat;
  }

  public void setDurationFormat(TimeUnitType durationFormat) {
    this.durationFormat = durationFormat;
  }

  public TaskBaseline estimatedDuration(Boolean estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

   /**
   * Indicates whether the baseline duration of the task was estimated.
   * @return estimatedDuration
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the baseline duration of the task was estimated.")
  public Boolean isEstimatedDuration() {
    return estimatedDuration;
  }

  public void setEstimatedDuration(Boolean estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskBaseline taskBaseline = (TaskBaseline) o;
    return Objects.equals(this.start, taskBaseline.start) &&
        Objects.equals(this.finish, taskBaseline.finish) &&
        Objects.equals(this.duration, taskBaseline.duration) &&
        Objects.equals(this.fixedCost, taskBaseline.fixedCost) &&
        Objects.equals(this.durationFormat, taskBaseline.durationFormat) &&
        Objects.equals(this.estimatedDuration, taskBaseline.estimatedDuration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, finish, duration, fixedCost, durationFormat, estimatedDuration, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskBaseline {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fixedCost: ").append(toIndentedString(fixedCost)).append("\n");
    sb.append("    durationFormat: ").append(toIndentedString(durationFormat)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
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

