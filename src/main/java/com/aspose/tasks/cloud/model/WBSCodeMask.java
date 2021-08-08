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
import com.aspose.tasks.cloud.model.WBSSequence;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WBSCodeMask
 */

public class WBSCodeMask {
  @SerializedName("Level")
  private Integer level = null;

  @SerializedName("Length")
  private Integer length = null;

  @SerializedName("Sequence")
  private WBSSequence sequence = null;

  @SerializedName("Separator")
  private String separator = null;

  public WBSCodeMask level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Mask level.
   * @return level
  **/
  @ApiModelProperty(required = true, value = "Mask level.")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public WBSCodeMask length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * The number of characters of the code string.
   * @return length
  **/
  @ApiModelProperty(required = true, value = "The number of characters of the code string.")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public WBSCodeMask sequence(WBSSequence sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Specifies  the type of character of the code string.
   * @return sequence
  **/
  @ApiModelProperty(required = true, value = "Specifies  the type of character of the code string.")
  public WBSSequence getSequence() {
    return sequence;
  }

  public void setSequence(WBSSequence sequence) {
    this.sequence = sequence;
  }

  public WBSCodeMask separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * Specifies the separator of the code string. Default value is Period.
   * @return separator
  **/
  @ApiModelProperty(value = "Specifies the separator of the code string. Default value is Period.")
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
    WBSCodeMask wbSCodeMask = (WBSCodeMask) o;
    return Objects.equals(this.level, wbSCodeMask.level) &&
        Objects.equals(this.length, wbSCodeMask.length) &&
        Objects.equals(this.sequence, wbSCodeMask.sequence) &&
        Objects.equals(this.separator, wbSCodeMask.separator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, length, sequence, separator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WBSCodeMask {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

