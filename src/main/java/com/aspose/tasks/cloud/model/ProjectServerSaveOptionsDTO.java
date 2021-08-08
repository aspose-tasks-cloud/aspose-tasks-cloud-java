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
 * Allows to specify additional options when project is saved to Project Server or Project Online.
 */
@ApiModel(description = "Allows to specify additional options when project is saved to Project Server or Project Online.")

public class ProjectServerSaveOptionsDTO {
  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ProjectGuid")
  private String projectGuid = null;

  @SerializedName("Timeout")
  private String timeout = null;

  @SerializedName("PollingInterval")
  private String pollingInterval = null;

  public ProjectServerSaveOptionsDTO projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Gets or sets name of a project which is displayed in Project Server \\ Project     Online projects list. Should be unique within Project Server \\ Project Online     instance. Is the value is omitted, the value of Prj.Name property will be used     instead.
   * @return projectName
  **/
  @ApiModelProperty(value = "Gets or sets name of a project which is displayed in Project Server \\ Project     Online projects list. Should be unique within Project Server \\ Project Online     instance. Is the value is omitted, the value of Prj.Name property will be used     instead.")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ProjectServerSaveOptionsDTO projectGuid(String projectGuid) {
    this.projectGuid = projectGuid;
    return this;
  }

   /**
   * Gets or sets unique identifier of a project. Should be unique within Project     Server \\ Project Online instance.
   * @return projectGuid
  **/
  @ApiModelProperty(value = "Gets or sets unique identifier of a project. Should be unique within Project     Server \\ Project Online instance.")
  public String getProjectGuid() {
    return projectGuid;
  }

  public void setProjectGuid(String projectGuid) {
    this.projectGuid = projectGuid;
  }

  public ProjectServerSaveOptionsDTO timeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Gets or sets timeout used when waiting for processing of save project request     by a Project Server&#39;s queue processing service. The default value for this property     is 1 minute. The processing time may be longer for large projects or in case when Project     Server instance is too busy responding to other requests.
   * @return timeout
  **/
  @ApiModelProperty(required = true, value = "Gets or sets timeout used when waiting for processing of save project request     by a Project Server's queue processing service. The default value for this property     is 1 minute. The processing time may be longer for large projects or in case when Project     Server instance is too busy responding to other requests.")
  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }

  public ProjectServerSaveOptionsDTO pollingInterval(String pollingInterval) {
    this.pollingInterval = pollingInterval;
    return this;
  }

   /**
   * Gets or sets interval between queue job status requests. The default value is     2 seconds.
   * @return pollingInterval
  **/
  @ApiModelProperty(required = true, value = "Gets or sets interval between queue job status requests. The default value is     2 seconds.")
  public String getPollingInterval() {
    return pollingInterval;
  }

  public void setPollingInterval(String pollingInterval) {
    this.pollingInterval = pollingInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectServerSaveOptionsDTO projectServerSaveOptionsDTO = (ProjectServerSaveOptionsDTO) o;
    return Objects.equals(this.projectName, projectServerSaveOptionsDTO.projectName) &&
        Objects.equals(this.projectGuid, projectServerSaveOptionsDTO.projectGuid) &&
        Objects.equals(this.timeout, projectServerSaveOptionsDTO.timeout) &&
        Objects.equals(this.pollingInterval, projectServerSaveOptionsDTO.pollingInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName, projectGuid, timeout, pollingInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectServerSaveOptionsDTO {\n");
    
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectGuid: ").append(toIndentedString(projectGuid)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
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

