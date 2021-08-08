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
import com.aspose.tasks.cloud.model.BaselineType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Represents baseline values of a resource or a task.
 */
@ApiModel(description = "Represents baseline values of a resource or a task.")


public class Baseline {
  @SerializedName("BaselineNumber")
  private BaselineType baselineNumber = null;

  @SerializedName("Work")
  private String work = null;

  @SerializedName("Cost")
  private BigDecimal cost = null;

  @SerializedName("Bcws")
  private Double bcws = null;

  @SerializedName("Bcwp")
  private Double bcwp = null;

  public Baseline baselineNumber(BaselineType baselineNumber) {
    this.baselineNumber = baselineNumber;
    return this;
  }

   /**
   * The unique number of a baseline data record.
   * @return baselineNumber
  **/
  @ApiModelProperty(required = true, value = "The unique number of a baseline data record.")
  public BaselineType getBaselineNumber() {
    return baselineNumber;
  }

  public void setBaselineNumber(BaselineType baselineNumber) {
    this.baselineNumber = baselineNumber;
  }

  public Baseline work(String work) {
    this.work = work;
    return this;
  }

   /**
   * The work assigned to a resource when the baseline is saved.
   * @return work
  **/
  @ApiModelProperty(required = true, value = "The work assigned to a resource when the baseline is saved.")
  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public Baseline cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The projected cost of a resource when the baseline is saved.
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "The projected cost of a resource when the baseline is saved.")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public Baseline bcws(Double bcws) {
    this.bcws = bcws;
    return this;
  }

   /**
   * The budget cost of a work scheduled for a resource.
   * @return bcws
  **/
  @ApiModelProperty(required = true, value = "The budget cost of a work scheduled for a resource.")
  public Double getBcws() {
    return bcws;
  }

  public void setBcws(Double bcws) {
    this.bcws = bcws;
  }

  public Baseline bcwp(Double bcwp) {
    this.bcwp = bcwp;
    return this;
  }

   /**
   * The budgeted cost of a work performed by a resource for a project to-date.
   * @return bcwp
  **/
  @ApiModelProperty(required = true, value = "The budgeted cost of a work performed by a resource for a project to-date.")
  public Double getBcwp() {
    return bcwp;
  }

  public void setBcwp(Double bcwp) {
    this.bcwp = bcwp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Baseline baseline = (Baseline) o;
    return Objects.equals(this.baselineNumber, baseline.baselineNumber) &&
        Objects.equals(this.work, baseline.work) &&
        Objects.equals(this.cost, baseline.cost) &&
        Objects.equals(this.bcws, baseline.bcws) &&
        Objects.equals(this.bcwp, baseline.bcwp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineNumber, work, cost, bcws, bcwp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Baseline {\n");
    
    sb.append("    baselineNumber: ").append(toIndentedString(baselineNumber)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    bcws: ").append(toIndentedString(bcws)).append("\n");
    sb.append("    bcwp: ").append(toIndentedString(bcwp)).append("\n");
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

