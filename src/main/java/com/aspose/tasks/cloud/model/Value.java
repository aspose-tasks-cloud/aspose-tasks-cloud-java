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
 * Represents a lookup value of an extended attribute.
 */
@ApiModel(description = "Represents a lookup value of an extended attribute.")

public class Value {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Val")
  private String val = null;

  @SerializedName("DateTimeValue")
  private OffsetDateTime dateTimeValue = null;

  @SerializedName("DurationValue")
  private Integer durationValue = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Phonetic")
  private String phonetic = null;

  public Value id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique Id of a value across a project.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique Id of a value across a project.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Value val(String val) {
    this.val = val;
    return this;
  }

   /**
   * The actual value.
   * @return val
  **/
  @ApiModelProperty(value = "The actual value.")
  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }

  public Value dateTimeValue(OffsetDateTime dateTimeValue) {
    this.dateTimeValue = dateTimeValue;
    return this;
  }

   /**
   * The value in case of datetime type
   * @return dateTimeValue
  **/
  @ApiModelProperty(value = "The value in case of datetime type")
  public OffsetDateTime getDateTimeValue() {
    return dateTimeValue;
  }

  public void setDateTimeValue(OffsetDateTime dateTimeValue) {
    this.dateTimeValue = dateTimeValue;
  }

  public Value durationValue(Integer durationValue) {
    this.durationValue = durationValue;
    return this;
  }

   /**
   * The value in case of duration type
   * @return durationValue
  **/
  @ApiModelProperty(value = "The value in case of duration type")
  public Integer getDurationValue() {
    return durationValue;
  }

  public void setDurationValue(Integer durationValue) {
    this.durationValue = durationValue;
  }

  public Value description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of a value.
   * @return description
  **/
  @ApiModelProperty(value = "The description of a value.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Value phonetic(String phonetic) {
    this.phonetic = phonetic;
    return this;
  }

   /**
   * The phonetic information about custom field name.
   * @return phonetic
  **/
  @ApiModelProperty(value = "The phonetic information about custom field name.")
  public String getPhonetic() {
    return phonetic;
  }

  public void setPhonetic(String phonetic) {
    this.phonetic = phonetic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Value value = (Value) o;
    return Objects.equals(this.id, value.id) &&
        Objects.equals(this.val, value.val) &&
        Objects.equals(this.dateTimeValue, value.dateTimeValue) &&
        Objects.equals(this.durationValue, value.durationValue) &&
        Objects.equals(this.description, value.description) &&
        Objects.equals(this.phonetic, value.phonetic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, val, dateTimeValue, durationValue, description, phonetic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
    sb.append("    dateTimeValue: ").append(toIndentedString(dateTimeValue)).append("\n");
    sb.append("    durationValue: ").append(toIndentedString(durationValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    phonetic: ").append(toIndentedString(phonetic)).append("\n");
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

