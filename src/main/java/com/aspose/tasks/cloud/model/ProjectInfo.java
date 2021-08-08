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
 * Brief info about the published project available on Project Online.
 */
@ApiModel(description = "Brief info about the published project available on Project Online.")

public class ProjectInfo {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CreatedDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("IsCheckedOut")
  private Boolean isCheckedOut = null;

  @SerializedName("LastPublishedDate")
  private OffsetDateTime lastPublishedDate = null;

  @SerializedName("LastSavedDate")
  private OffsetDateTime lastSavedDate = null;

  @SerializedName("Description")
  private String description = null;

  public ProjectInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the project.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the project.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the project.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectInfo createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The date and time when the project was created.
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "The date and time when the project was created.")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ProjectInfo isCheckedOut(Boolean isCheckedOut) {
    this.isCheckedOut = isCheckedOut;
    return this;
  }

   /**
   * Value indicating whether the project is checked out.
   * @return isCheckedOut
  **/
  @ApiModelProperty(required = true, value = "Value indicating whether the project is checked out.")
  public Boolean isIsCheckedOut() {
    return isCheckedOut;
  }

  public void setIsCheckedOut(Boolean isCheckedOut) {
    this.isCheckedOut = isCheckedOut;
  }

  public ProjectInfo lastPublishedDate(OffsetDateTime lastPublishedDate) {
    this.lastPublishedDate = lastPublishedDate;
    return this;
  }

   /**
   * The most recent date when the project was published.
   * @return lastPublishedDate
  **/
  @ApiModelProperty(required = true, value = "The most recent date when the project was published.")
  public OffsetDateTime getLastPublishedDate() {
    return lastPublishedDate;
  }

  public void setLastPublishedDate(OffsetDateTime lastPublishedDate) {
    this.lastPublishedDate = lastPublishedDate;
  }

  public ProjectInfo lastSavedDate(OffsetDateTime lastSavedDate) {
    this.lastSavedDate = lastSavedDate;
    return this;
  }

   /**
   * The most recent date when the project was saved.
   * @return lastSavedDate
  **/
  @ApiModelProperty(required = true, value = "The most recent date when the project was saved.")
  public OffsetDateTime getLastSavedDate() {
    return lastSavedDate;
  }

  public void setLastSavedDate(OffsetDateTime lastSavedDate) {
    this.lastSavedDate = lastSavedDate;
  }

  public ProjectInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the project.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the project.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInfo projectInfo = (ProjectInfo) o;
    return Objects.equals(this.id, projectInfo.id) &&
        Objects.equals(this.name, projectInfo.name) &&
        Objects.equals(this.createdDate, projectInfo.createdDate) &&
        Objects.equals(this.isCheckedOut, projectInfo.isCheckedOut) &&
        Objects.equals(this.lastPublishedDate, projectInfo.lastPublishedDate) &&
        Objects.equals(this.lastSavedDate, projectInfo.lastSavedDate) &&
        Objects.equals(this.description, projectInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdDate, isCheckedOut, lastPublishedDate, lastSavedDate, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isCheckedOut: ").append(toIndentedString(isCheckedOut)).append("\n");
    sb.append("    lastPublishedDate: ").append(toIndentedString(lastPublishedDate)).append("\n");
    sb.append("    lastSavedDate: ").append(toIndentedString(lastSavedDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

