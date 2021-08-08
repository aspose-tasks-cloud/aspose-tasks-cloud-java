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
import com.aspose.tasks.cloud.model.MaskType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents four elements of a mask which defines an outline code format.
 */
@ApiModel(description = "Represents four elements of a mask which defines an outline code format.")

public class OutlineMask {
  @SerializedName("Level")
  private Integer level = null;

  @SerializedName("Type")
  private MaskType type = null;

  @SerializedName("Length")
  private Integer length = null;

  @SerializedName("Separator")
  private String separator = null;

  public OutlineMask level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * The level of a mask.
   * @return level
  **/
  @ApiModelProperty(required = true, value = "The level of a mask.")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public OutlineMask type(MaskType type) {
    this.type = type;
    return this;
  }

   /**
   * The type of a mask.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of a mask.")
  public MaskType getType() {
    return type;
  }

  public void setType(MaskType type) {
    this.type = type;
  }

  public OutlineMask length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * The maximum length (in characters) of the outline code values. 0 if length is not defined.
   * @return length
  **/
  @ApiModelProperty(required = true, value = "The maximum length (in characters) of the outline code values. 0 if length is not defined.")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public OutlineMask separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * The separator of code values.
   * @return separator
  **/
  @ApiModelProperty(value = "The separator of code values.")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineMask outlineMask = (OutlineMask) o;
    return Objects.equals(this.level, outlineMask.level) &&
        Objects.equals(this.type, outlineMask.type) &&
        Objects.equals(this.length, outlineMask.length) &&
        Objects.equals(this.separator, outlineMask.separator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, type, length, separator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineMask {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
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

