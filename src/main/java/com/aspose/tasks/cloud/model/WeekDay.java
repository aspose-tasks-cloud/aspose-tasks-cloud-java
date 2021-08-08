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
import com.aspose.tasks.cloud.model.DayType;
import com.aspose.tasks.cloud.model.WorkingTime;
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
 * WeekDay
 */

public class WeekDay {
  @SerializedName("DayType")
  private DayType dayType = null;

  @SerializedName("DayWorking")
  private Boolean dayWorking = null;

  @SerializedName("FromDate")
  private OffsetDateTime fromDate = null;

  @SerializedName("ToDate")
  private OffsetDateTime toDate = null;

  @SerializedName("WorkingTimes")
  private List<WorkingTime> workingTimes = null;

  public WeekDay dayType(DayType dayType) {
    this.dayType = dayType;
    return this;
  }

   /**
   * Returns or sets the type of a day.
   * @return dayType
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the type of a day.")
  public DayType getDayType() {
    return dayType;
  }

  public void setDayType(DayType dayType) {
    this.dayType = dayType;
  }

  public WeekDay dayWorking(Boolean dayWorking) {
    this.dayWorking = dayWorking;
    return this;
  }

   /**
   * Determines whether the specified date or day type is working.
   * @return dayWorking
  **/
  @ApiModelProperty(required = true, value = "Determines whether the specified date or day type is working.")
  public Boolean isDayWorking() {
    return dayWorking;
  }

  public void setDayWorking(Boolean dayWorking) {
    this.dayWorking = dayWorking;
  }

  public WeekDay fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Returns or sets the beginning of an exception time.
   * @return fromDate
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the beginning of an exception time.")
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }

  public WeekDay toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Returns or sets the end of an exception time.
   * @return toDate
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the end of an exception time.")
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }

  public WeekDay workingTimes(List<WorkingTime> workingTimes) {
    this.workingTimes = workingTimes;
    return this;
  }

  public WeekDay addWorkingTimesItem(WorkingTime workingTimesItem) {
    if (this.workingTimes == null) {
      this.workingTimes = new ArrayList<WorkingTime>();
    }
    this.workingTimes.add(workingTimesItem);
    return this;
  }

   /**
   * The collection of working times that define the time worked on the weekday.
   * @return workingTimes
  **/
  @ApiModelProperty(value = "The collection of working times that define the time worked on the weekday.")
  public List<WorkingTime> getWorkingTimes() {
    return workingTimes;
  }

  public void setWorkingTimes(List<WorkingTime> workingTimes) {
    this.workingTimes = workingTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekDay weekDay = (WeekDay) o;
    return Objects.equals(this.dayType, weekDay.dayType) &&
        Objects.equals(this.dayWorking, weekDay.dayWorking) &&
        Objects.equals(this.fromDate, weekDay.fromDate) &&
        Objects.equals(this.toDate, weekDay.toDate) &&
        Objects.equals(this.workingTimes, weekDay.workingTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayType, dayWorking, fromDate, toDate, workingTimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekDay {\n");
    
    sb.append("    dayType: ").append(toIndentedString(dayType)).append("\n");
    sb.append("    dayWorking: ").append(toIndentedString(dayWorking)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    workingTimes: ").append(toIndentedString(workingTimes)).append("\n");
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

