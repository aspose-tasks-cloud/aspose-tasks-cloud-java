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

/**
 * TaskCreationRequest
 */

public class TaskCreationRequest {
  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("ParentTaskUid")
  private Integer parentTaskUid = null;

  @SerializedName("BeforeTaskId")
  private Integer beforeTaskId = null;

  public TaskCreationRequest taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * The name for the new task.
   * @return taskName
  **/
  @ApiModelProperty(value = "The name for the new task.")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public TaskCreationRequest parentTaskUid(Integer parentTaskUid) {
    this.parentTaskUid = parentTaskUid;
    return this;
  }

   /**
   * Uid for parent task.
   * @return parentTaskUid
  **/
  @ApiModelProperty(value = "Uid for parent task.")
  public Integer getParentTaskUid() {
    return parentTaskUid;
  }

  public void setParentTaskUid(Integer parentTaskUid) {
    this.parentTaskUid = parentTaskUid;
  }

  public TaskCreationRequest beforeTaskId(Integer beforeTaskId) {
    this.beforeTaskId = beforeTaskId;
    return this;
  }

   /**
   * Id of task before which new task will be inserted.
   * @return beforeTaskId
  **/
  @ApiModelProperty(value = "Id of task before which new task will be inserted.")
  public Integer getBeforeTaskId() {
    return beforeTaskId;
  }

  public void setBeforeTaskId(Integer beforeTaskId) {
    this.beforeTaskId = beforeTaskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCreationRequest taskCreationRequest = (TaskCreationRequest) o;
    return Objects.equals(this.taskName, taskCreationRequest.taskName) &&
        Objects.equals(this.parentTaskUid, taskCreationRequest.parentTaskUid) &&
        Objects.equals(this.beforeTaskId, taskCreationRequest.beforeTaskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, parentTaskUid, beforeTaskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCreationRequest {\n");
    
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    parentTaskUid: ").append(toIndentedString(parentTaskUid)).append("\n");
    sb.append("    beforeTaskId: ").append(toIndentedString(beforeTaskId)).append("\n");
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

