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
import com.aspose.tasks.cloud.model.ProjectValidationState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specifies the  result of recalculation of the project;
 */
@ApiModel(description = "Specifies the  result of recalculation of the project;")

public class ProjectRecalculationResult {
  @SerializedName("ValidationState")
  private ProjectValidationState validationState = null;

  @SerializedName("ValidationErrorMessage")
  private String validationErrorMessage = null;

  @SerializedName("FailedTaskUid")
  private Integer failedTaskUid = null;

  public ProjectRecalculationResult validationState(ProjectValidationState validationState) {
    this.validationState = validationState;
    return this;
  }

   /**
   * Get validationState
   * @return validationState
  **/
  @ApiModelProperty(required = true, value = "")
  public ProjectValidationState getValidationState() {
    return validationState;
  }

  public void setValidationState(ProjectValidationState validationState) {
    this.validationState = validationState;
  }

  public ProjectRecalculationResult validationErrorMessage(String validationErrorMessage) {
    this.validationErrorMessage = validationErrorMessage;
    return this;
  }

   /**
   * Get validationErrorMessage
   * @return validationErrorMessage
  **/
  @ApiModelProperty(value = "")
  public String getValidationErrorMessage() {
    return validationErrorMessage;
  }

  public void setValidationErrorMessage(String validationErrorMessage) {
    this.validationErrorMessage = validationErrorMessage;
  }

  public ProjectRecalculationResult failedTaskUid(Integer failedTaskUid) {
    this.failedTaskUid = failedTaskUid;
    return this;
  }

   /**
   * Gets the task uid which caused the validation error.
   * @return failedTaskUid
  **/
  @ApiModelProperty(value = "Gets the task uid which caused the validation error.")
  public Integer getFailedTaskUid() {
    return failedTaskUid;
  }

  public void setFailedTaskUid(Integer failedTaskUid) {
    this.failedTaskUid = failedTaskUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRecalculationResult projectRecalculationResult = (ProjectRecalculationResult) o;
    return Objects.equals(this.validationState, projectRecalculationResult.validationState) &&
        Objects.equals(this.validationErrorMessage, projectRecalculationResult.validationErrorMessage) &&
        Objects.equals(this.failedTaskUid, projectRecalculationResult.failedTaskUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationState, validationErrorMessage, failedTaskUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRecalculationResult {\n");
    
    sb.append("    validationState: ").append(toIndentedString(validationState)).append("\n");
    sb.append("    validationErrorMessage: ").append(toIndentedString(validationErrorMessage)).append("\n");
    sb.append("    failedTaskUid: ").append(toIndentedString(failedTaskUid)).append("\n");
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

