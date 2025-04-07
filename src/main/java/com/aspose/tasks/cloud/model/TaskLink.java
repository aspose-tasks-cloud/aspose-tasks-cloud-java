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
import com.aspose.tasks.cloud.model.Link;
import com.aspose.tasks.cloud.model.TaskLinkType;
import com.aspose.tasks.cloud.model.TimeUnitType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TaskLink
 */

public class TaskLink {
  @SerializedName("Link")
  private Link link = null;

  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("PredecessorUid")
  private Integer predecessorUid = null;

  @SerializedName("SuccessorUid")
  private Integer successorUid = null;

  @SerializedName("LinkType")
  private TaskLinkType linkType = null;

  @SerializedName("Lag")
  private Integer lag = null;

  @SerializedName("LagFormat")
  private TimeUnitType lagFormat = null;

  @SerializedName("LinkLagTimeSpan")
  private String linkLagTimeSpan = null;

  public TaskLink link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public TaskLink index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public TaskLink predecessorUid(Integer predecessorUid) {
    this.predecessorUid = predecessorUid;
    return this;
  }

   /**
   * Get predecessorUid
   * @return predecessorUid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPredecessorUid() {
    return predecessorUid;
  }

  public void setPredecessorUid(Integer predecessorUid) {
    this.predecessorUid = predecessorUid;
  }

  public TaskLink successorUid(Integer successorUid) {
    this.successorUid = successorUid;
    return this;
  }

   /**
   * Get successorUid
   * @return successorUid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSuccessorUid() {
    return successorUid;
  }

  public void setSuccessorUid(Integer successorUid) {
    this.successorUid = successorUid;
  }

  public TaskLink linkType(TaskLinkType linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @ApiModelProperty(required = true, value = "")
  public TaskLinkType getLinkType() {
    return linkType;
  }

  public void setLinkType(TaskLinkType linkType) {
    this.linkType = linkType;
  }

  public TaskLink lag(Integer lag) {
    this.lag = lag;
    return this;
  }

   /**
   * Get lag
   * @return lag
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLag() {
    return lag;
  }

  public void setLag(Integer lag) {
    this.lag = lag;
  }

  public TaskLink lagFormat(TimeUnitType lagFormat) {
    this.lagFormat = lagFormat;
    return this;
  }

   /**
   * Get lagFormat
   * @return lagFormat
  **/
  @ApiModelProperty(required = true, value = "")
  public TimeUnitType getLagFormat() {
    return lagFormat;
  }

  public void setLagFormat(TimeUnitType lagFormat) {
    this.lagFormat = lagFormat;
  }

  public TaskLink linkLagTimeSpan(String linkLagTimeSpan) {
    this.linkLagTimeSpan = linkLagTimeSpan;
    return this;
  }

   /**
   * Gets or sets lag duration, depending on LagFormat.
   * @return linkLagTimeSpan
  **/
  @ApiModelProperty(required = true, value = "Gets or sets lag duration, depending on LagFormat.")
  public String getLinkLagTimeSpan() {
    return linkLagTimeSpan;
  }

  public void setLinkLagTimeSpan(String linkLagTimeSpan) {
    this.linkLagTimeSpan = linkLagTimeSpan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskLink taskLink = (TaskLink) o;
    return Objects.equals(this.link, taskLink.link) &&
        Objects.equals(this.index, taskLink.index) &&
        Objects.equals(this.predecessorUid, taskLink.predecessorUid) &&
        Objects.equals(this.successorUid, taskLink.successorUid) &&
        Objects.equals(this.linkType, taskLink.linkType) &&
        Objects.equals(this.lag, taskLink.lag) &&
        Objects.equals(this.lagFormat, taskLink.lagFormat) &&
        Objects.equals(this.linkLagTimeSpan, taskLink.linkLagTimeSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, index, predecessorUid, successorUid, linkType, lag, lagFormat, linkLagTimeSpan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskLink {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    predecessorUid: ").append(toIndentedString(predecessorUid)).append("\n");
    sb.append("    successorUid: ").append(toIndentedString(successorUid)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
    sb.append("    lagFormat: ").append(toIndentedString(lagFormat)).append("\n");
    sb.append("    linkLagTimeSpan: ").append(toIndentedString(linkLagTimeSpan)).append("\n");
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

