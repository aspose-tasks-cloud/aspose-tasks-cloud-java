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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Resource&#39;s assignment brief into.
 */
@ApiModel(description = "Resource's assignment brief into.")

public class AssignmentItem {
  @SerializedName("Link")
  private Link link = null;

  @SerializedName("Uid")
  private Integer uid = null;

  @SerializedName("TaskUid")
  private Integer taskUid = null;

  @SerializedName("ResourceUid")
  private Integer resourceUid = null;

  public AssignmentItem link(Link link) {
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

  public AssignmentItem uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * The unique id (Uid) of the resource&#39;s assignment.
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "The unique id (Uid) of the resource's assignment.")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public AssignmentItem taskUid(Integer taskUid) {
    this.taskUid = taskUid;
    return this;
  }

   /**
   * Uid of the task.
   * @return taskUid
  **/
  @ApiModelProperty(required = true, value = "Uid of the task.")
  public Integer getTaskUid() {
    return taskUid;
  }

  public void setTaskUid(Integer taskUid) {
    this.taskUid = taskUid;
  }

  public AssignmentItem resourceUid(Integer resourceUid) {
    this.resourceUid = resourceUid;
    return this;
  }

   /**
   * Uid of the resource.
   * @return resourceUid
  **/
  @ApiModelProperty(required = true, value = "Uid of the resource.")
  public Integer getResourceUid() {
    return resourceUid;
  }

  public void setResourceUid(Integer resourceUid) {
    this.resourceUid = resourceUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentItem assignmentItem = (AssignmentItem) o;
    return Objects.equals(this.link, assignmentItem.link) &&
        Objects.equals(this.uid, assignmentItem.uid) &&
        Objects.equals(this.taskUid, assignmentItem.taskUid) &&
        Objects.equals(this.resourceUid, assignmentItem.resourceUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, uid, taskUid, resourceUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentItem {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    taskUid: ").append(toIndentedString(taskUid)).append("\n");
    sb.append("    resourceUid: ").append(toIndentedString(resourceUid)).append("\n");
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

