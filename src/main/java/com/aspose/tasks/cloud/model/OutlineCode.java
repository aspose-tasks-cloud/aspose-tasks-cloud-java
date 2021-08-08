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
 * Represents a value of an outline code.
 */
@ApiModel(description = "Represents a value of an outline code.")

public class OutlineCode {
  @SerializedName("FieldId")
  private String fieldId = null;

  @SerializedName("ValueId")
  private Integer valueId = null;

  @SerializedName("ValueGuid")
  private String valueGuid = null;

  public OutlineCode fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * The number value of the project Id (Pid) custom field.
   * @return fieldId
  **/
  @ApiModelProperty(value = "The number value of the project Id (Pid) custom field.")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public OutlineCode valueId(Integer valueId) {
    this.valueId = valueId;
    return this;
  }

   /**
   * The Id in the value list associated with the definition in the outline code collection.
   * @return valueId
  **/
  @ApiModelProperty(required = true, value = "The Id in the value list associated with the definition in the outline code collection.")
  public Integer getValueId() {
    return valueId;
  }

  public void setValueId(Integer valueId) {
    this.valueId = valueId;
  }

  public OutlineCode valueGuid(String valueGuid) {
    this.valueGuid = valueGuid;
    return this;
  }

   /**
   * The Guid of the value in the value list. The ValueGuid matches the FieldGuid in the value list.
   * @return valueGuid
  **/
  @ApiModelProperty(value = "The Guid of the value in the value list. The ValueGuid matches the FieldGuid in the value list.")
  public String getValueGuid() {
    return valueGuid;
  }

  public void setValueGuid(String valueGuid) {
    this.valueGuid = valueGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineCode outlineCode = (OutlineCode) o;
    return Objects.equals(this.fieldId, outlineCode.fieldId) &&
        Objects.equals(this.valueId, outlineCode.valueId) &&
        Objects.equals(this.valueGuid, outlineCode.valueGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, valueId, valueGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineCode {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    valueGuid: ").append(toIndentedString(valueGuid)).append("\n");
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

