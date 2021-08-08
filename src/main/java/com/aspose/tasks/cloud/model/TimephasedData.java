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
import com.aspose.tasks.cloud.model.TimeUnitType;
import com.aspose.tasks.cloud.model.TimephasedDataType;
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
 * Represents a time phased data.
 */
@ApiModel(description = "Represents a time phased data.")

public class TimephasedData {
  @SerializedName("Uid")
  private Integer uid = null;

  @SerializedName("Start")
  private OffsetDateTime start = null;

  @SerializedName("Finish")
  private OffsetDateTime finish = null;

  @SerializedName("Unit")
  private TimeUnitType unit = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("TimephasedDataType")
  private TimephasedDataType timephasedDataType = null;

  public TimephasedData uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * The unique identifier of a timephased data
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of a timephased data")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public TimephasedData start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The start date of a timephased data period.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "The start date of a timephased data period.")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public TimephasedData finish(OffsetDateTime finish) {
    this.finish = finish;
    return this;
  }

   /**
   * The finish date of a timephased data period.
   * @return finish
  **/
  @ApiModelProperty(required = true, value = "The finish date of a timephased data period.")
  public OffsetDateTime getFinish() {
    return finish;
  }

  public void setFinish(OffsetDateTime finish) {
    this.finish = finish;
  }

  public TimephasedData unit(TimeUnitType unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The time unit of a timephased data period.
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "The time unit of a timephased data period.")
  public TimeUnitType getUnit() {
    return unit;
  }

  public void setUnit(TimeUnitType unit) {
    this.unit = unit;
  }

  public TimephasedData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value per unit of time for a timephased data period.
   * @return value
  **/
  @ApiModelProperty(value = "The value per unit of time for a timephased data period.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TimephasedData timephasedDataType(TimephasedDataType timephasedDataType) {
    this.timephasedDataType = timephasedDataType;
    return this;
  }

   /**
   * The type of a timephased data.
   * @return timephasedDataType
  **/
  @ApiModelProperty(required = true, value = "The type of a timephased data.")
  public TimephasedDataType getTimephasedDataType() {
    return timephasedDataType;
  }

  public void setTimephasedDataType(TimephasedDataType timephasedDataType) {
    this.timephasedDataType = timephasedDataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimephasedData timephasedData = (TimephasedData) o;
    return Objects.equals(this.uid, timephasedData.uid) &&
        Objects.equals(this.start, timephasedData.start) &&
        Objects.equals(this.finish, timephasedData.finish) &&
        Objects.equals(this.unit, timephasedData.unit) &&
        Objects.equals(this.value, timephasedData.value) &&
        Objects.equals(this.timephasedDataType, timephasedData.timephasedDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, start, finish, unit, value, timephasedDataType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimephasedData {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    timephasedDataType: ").append(toIndentedString(timephasedDataType)).append("\n");
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

