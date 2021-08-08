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
import com.aspose.tasks.cloud.model.WeekDay;
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
import org.threeten.bp.OffsetDateTime;

/**
 * WorkWeek
 */

public class WorkWeek {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("FromDate")
  private OffsetDateTime fromDate = null;

  @SerializedName("ToDate")
  private OffsetDateTime toDate = null;

  @SerializedName("WeekDays")
  private List<WeekDay> weekDays = null;

  public WorkWeek name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Determines the name of a work week.
   * @return name
  **/
  @ApiModelProperty(value = "Determines the name of a work week.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkWeek fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Returns or sets the beginning of a work week.
   * @return fromDate
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the beginning of a work week.")
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }

  public WorkWeek toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Returns or sets the end of a work week.
   * @return toDate
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the end of a work week.")
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }

  public WorkWeek weekDays(List<WeekDay> weekDays) {
    this.weekDays = weekDays;
    return this;
  }

  public WorkWeek addWeekDaysItem(WeekDay weekDaysItem) {
    if (this.weekDays == null) {
      this.weekDays = new ArrayList<WeekDay>();
    }
    this.weekDays.add(weekDaysItem);
    return this;
  }

   /**
   * The collection of week days that define the working time of current working week.
   * @return weekDays
  **/
  @ApiModelProperty(value = "The collection of week days that define the working time of current working week.")
  public List<WeekDay> getWeekDays() {
    return weekDays;
  }

  public void setWeekDays(List<WeekDay> weekDays) {
    this.weekDays = weekDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkWeek workWeek = (WorkWeek) o;
    return Objects.equals(this.name, workWeek.name) &&
        Objects.equals(this.fromDate, workWeek.fromDate) &&
        Objects.equals(this.toDate, workWeek.toDate) &&
        Objects.equals(this.weekDays, workWeek.weekDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fromDate, toDate, weekDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkWeek {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    weekDays: ").append(toIndentedString(weekDays)).append("\n");
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

