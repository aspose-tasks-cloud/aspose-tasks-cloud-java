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
import com.aspose.tasks.cloud.model.ProjectInfo;
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
 * ProjectList
 */

public class ProjectList extends LinkElement {
  @SerializedName("ProjectInfo")
  private List<ProjectInfo> projectInfo = null;

  public ProjectList projectInfo(List<ProjectInfo> projectInfo) {
    this.projectInfo = projectInfo;
    return this;
  }

  public ProjectList addProjectInfoItem(ProjectInfo projectInfoItem) {
    if (this.projectInfo == null) {
      this.projectInfo = new ArrayList<ProjectInfo>();
    }
    this.projectInfo.add(projectInfoItem);
    return this;
  }

   /**
   * Get projectInfo
   * @return projectInfo
  **/
  @ApiModelProperty(value = "")
  public List<ProjectInfo> getProjectInfo() {
    return projectInfo;
  }

  public void setProjectInfo(List<ProjectInfo> projectInfo) {
    this.projectInfo = projectInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectList projectList = (ProjectList) o;
    return Objects.equals(this.projectInfo, projectList.projectInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectInfo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    projectInfo: ").append(toIndentedString(projectInfo)).append("\n");
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

