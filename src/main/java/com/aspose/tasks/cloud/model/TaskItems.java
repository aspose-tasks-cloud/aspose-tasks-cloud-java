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
import com.aspose.tasks.cloud.model.LinkElement;
import com.aspose.tasks.cloud.model.TaskItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaskItems
 */

public class TaskItems extends LinkElement {
  @SerializedName("TaskItem")
  private List<TaskItem> taskItem = null;

  public TaskItems taskItem(List<TaskItem> taskItem) {
    this.taskItem = taskItem;
    return this;
  }

  public TaskItems addTaskItemItem(TaskItem taskItemItem) {
    if (this.taskItem == null) {
      this.taskItem = new ArrayList<TaskItem>();
    }
    this.taskItem.add(taskItemItem);
    return this;
  }

   /**
   * Get taskItem
   * @return taskItem
  **/
  @ApiModelProperty(value = "")
  public List<TaskItem> getTaskItem() {
    return taskItem;
  }

  public void setTaskItem(List<TaskItem> taskItem) {
    this.taskItem = taskItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskItems taskItems = (TaskItems) o;
    return Objects.equals(this.taskItem, taskItems.taskItem) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskItem, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskItems {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    taskItem: ").append(toIndentedString(taskItem)).append("\n");
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

