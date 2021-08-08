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
import com.aspose.tasks.cloud.model.OutlineValueType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents an outline value.
 */
@ApiModel(description = "Represents an outline value.")

public class OutlineValue {
  @SerializedName("ValueId")
  private Integer valueId = null;

  @SerializedName("FieldGuid")
  private String fieldGuid = null;

  @SerializedName("Type")
  private OutlineValueType type = null;

  @SerializedName("ParentValueId")
  private Integer parentValueId = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IsCollapsed")
  private Boolean isCollapsed = null;

  public OutlineValue valueId(Integer valueId) {
    this.valueId = valueId;
    return this;
  }

   /**
   * The unique Id of an outline code value within a project.
   * @return valueId
  **/
  @ApiModelProperty(required = true, value = "The unique Id of an outline code value within a project.")
  public Integer getValueId() {
    return valueId;
  }

  public void setValueId(Integer valueId) {
    this.valueId = valueId;
  }

  public OutlineValue fieldGuid(String fieldGuid) {
    this.fieldGuid = fieldGuid;
    return this;
  }

   /**
   * The Guid of an outline code value.
   * @return fieldGuid
  **/
  @ApiModelProperty(value = "The Guid of an outline code value.")
  public String getFieldGuid() {
    return fieldGuid;
  }

  public void setFieldGuid(String fieldGuid) {
    this.fieldGuid = fieldGuid;
  }

  public OutlineValue type(OutlineValueType type) {
    this.type = type;
    return this;
  }

   /**
   * The outline code type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The outline code type.")
  public OutlineValueType getType() {
    return type;
  }

  public void setType(OutlineValueType type) {
    this.type = type;
  }

  public OutlineValue parentValueId(Integer parentValueId) {
    this.parentValueId = parentValueId;
    return this;
  }

   /**
   * The Id of a parent node of an outline code.
   * @return parentValueId
  **/
  @ApiModelProperty(required = true, value = "The Id of a parent node of an outline code.")
  public Integer getParentValueId() {
    return parentValueId;
  }

  public void setParentValueId(Integer parentValueId) {
    this.parentValueId = parentValueId;
  }

  public OutlineValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The actual value.
   * @return value
  **/
  @ApiModelProperty(value = "The actual value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OutlineValue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of an outline value.
   * @return description
  **/
  @ApiModelProperty(value = "The description of an outline value.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OutlineValue isCollapsed(Boolean isCollapsed) {
    this.isCollapsed = isCollapsed;
    return this;
  }

   /**
   * Determines whether outline value is collapsed or not.
   * @return isCollapsed
  **/
  @ApiModelProperty(required = true, value = "Determines whether outline value is collapsed or not.")
  public Boolean isIsCollapsed() {
    return isCollapsed;
  }

  public void setIsCollapsed(Boolean isCollapsed) {
    this.isCollapsed = isCollapsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineValue outlineValue = (OutlineValue) o;
    return Objects.equals(this.valueId, outlineValue.valueId) &&
        Objects.equals(this.fieldGuid, outlineValue.fieldGuid) &&
        Objects.equals(this.type, outlineValue.type) &&
        Objects.equals(this.parentValueId, outlineValue.parentValueId) &&
        Objects.equals(this.value, outlineValue.value) &&
        Objects.equals(this.description, outlineValue.description) &&
        Objects.equals(this.isCollapsed, outlineValue.isCollapsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueId, fieldGuid, type, parentValueId, value, description, isCollapsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineValue {\n");
    
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    fieldGuid: ").append(toIndentedString(fieldGuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parentValueId: ").append(toIndentedString(parentValueId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isCollapsed: ").append(toIndentedString(isCollapsed)).append("\n");
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

