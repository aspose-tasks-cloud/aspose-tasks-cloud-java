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
import com.aspose.tasks.cloud.model.CalendarExceptionType;
import com.aspose.tasks.cloud.model.DayType;
import com.aspose.tasks.cloud.model.Month;
import com.aspose.tasks.cloud.model.MonthItemType;
import com.aspose.tasks.cloud.model.MonthPosition;
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
 * Represent exceptional time periods in a calendar.
 */
@ApiModel(description = "Represent exceptional time periods in a calendar.")

public class CalendarException {
  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("EnteredByOccurrences")
  private Boolean enteredByOccurrences = null;

  @SerializedName("FromDate")
  private OffsetDateTime fromDate = null;

  @SerializedName("ToDate")
  private OffsetDateTime toDate = null;

  @SerializedName("Occurrences")
  private Integer occurrences = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Type")
  private CalendarExceptionType type = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("DaysOfWeek")
  private List<DayType> daysOfWeek = null;

  @SerializedName("MonthItem")
  private MonthItemType monthItem = null;

  @SerializedName("MonthPosition")
  private MonthPosition monthPosition = null;

  @SerializedName("Month")
  private Month month = null;

  @SerializedName("MonthDay")
  private Integer monthDay = null;

  @SerializedName("DayWorking")
  private Boolean dayWorking = null;

  @SerializedName("WorkingTimes")
  private List<WorkingTime> workingTimes = null;

  public CalendarException index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Index of the current item in the collection of calendar&#39;s exceptions.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the current item in the collection of calendar's exceptions.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CalendarException enteredByOccurrences(Boolean enteredByOccurrences) {
    this.enteredByOccurrences = enteredByOccurrences;
    return this;
  }

   /**
   * Determines whether the range of recurrence is defined by entering a number of occurrences. False specifies that the range of recurrence is defined by entering a finish date.
   * @return enteredByOccurrences
  **/
  @ApiModelProperty(required = true, value = "Determines whether the range of recurrence is defined by entering a number of occurrences. False specifies that the range of recurrence is defined by entering a finish date.")
  public Boolean isEnteredByOccurrences() {
    return enteredByOccurrences;
  }

  public void setEnteredByOccurrences(Boolean enteredByOccurrences) {
    this.enteredByOccurrences = enteredByOccurrences;
  }

  public CalendarException fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * The beginning of the exception time.
   * @return fromDate
  **/
  @ApiModelProperty(required = true, value = "The beginning of the exception time.")
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }

  public CalendarException toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * The end of the exception time.
   * @return toDate
  **/
  @ApiModelProperty(required = true, value = "The end of the exception time.")
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }

  public CalendarException occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

   /**
   * The number of occurrences for which the calendar exception is valid.
   * @return occurrences
  **/
  @ApiModelProperty(required = true, value = "The number of occurrences for which the calendar exception is valid.")
  public Integer getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  public CalendarException name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the exception.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the exception.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CalendarException type(CalendarExceptionType type) {
    this.type = type;
    return this;
  }

   /**
   * The exception type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The exception type.")
  public CalendarExceptionType getType() {
    return type;
  }

  public void setType(CalendarExceptionType type) {
    this.type = type;
  }

  public CalendarException period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * The period of recurrence for the exception.
   * @return period
  **/
  @ApiModelProperty(required = true, value = "The period of recurrence for the exception.")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public CalendarException daysOfWeek(List<DayType> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public CalendarException addDaysOfWeekItem(DayType daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<DayType>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * The days of the week on which the exception is valid.
   * @return daysOfWeek
  **/
  @ApiModelProperty(value = "The days of the week on which the exception is valid.")
  public List<DayType> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<DayType> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public CalendarException monthItem(MonthItemType monthItem) {
    this.monthItem = monthItem;
    return this;
  }

   /**
   * The month item for which an exception recurrence is scheduled.
   * @return monthItem
  **/
  @ApiModelProperty(required = true, value = "The month item for which an exception recurrence is scheduled.")
  public MonthItemType getMonthItem() {
    return monthItem;
  }

  public void setMonthItem(MonthItemType monthItem) {
    this.monthItem = monthItem;
  }

  public CalendarException monthPosition(MonthPosition monthPosition) {
    this.monthPosition = monthPosition;
    return this;
  }

   /**
   * The position of a month item within a month.
   * @return monthPosition
  **/
  @ApiModelProperty(required = true, value = "The position of a month item within a month.")
  public MonthPosition getMonthPosition() {
    return monthPosition;
  }

  public void setMonthPosition(MonthPosition monthPosition) {
    this.monthPosition = monthPosition;
  }

  public CalendarException month(Month month) {
    this.month = month;
    return this;
  }

   /**
   * The month for which an exception recurrence is scheduled.
   * @return month
  **/
  @ApiModelProperty(required = true, value = "The month for which an exception recurrence is scheduled.")
  public Month getMonth() {
    return month;
  }

  public void setMonth(Month month) {
    this.month = month;
  }

  public CalendarException monthDay(Integer monthDay) {
    this.monthDay = monthDay;
    return this;
  }

   /**
   * The day of a month on which an exception recurrence is scheduled.
   * @return monthDay
  **/
  @ApiModelProperty(required = true, value = "The day of a month on which an exception recurrence is scheduled.")
  public Integer getMonthDay() {
    return monthDay;
  }

  public void setMonthDay(Integer monthDay) {
    this.monthDay = monthDay;
  }

  public CalendarException dayWorking(Boolean dayWorking) {
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

  public CalendarException workingTimes(List<WorkingTime> workingTimes) {
    this.workingTimes = workingTimes;
    return this;
  }

  public CalendarException addWorkingTimesItem(WorkingTime workingTimesItem) {
    if (this.workingTimes == null) {
      this.workingTimes = new ArrayList<WorkingTime>();
    }
    this.workingTimes.add(workingTimesItem);
    return this;
  }

   /**
   * The collection of working times that defines the time worked on the weekday.  At least one working time must present, and there can&#39;t be more than five.
   * @return workingTimes
  **/
  @ApiModelProperty(value = "The collection of working times that defines the time worked on the weekday.  At least one working time must present, and there can't be more than five.")
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
    CalendarException calendarException = (CalendarException) o;
    return Objects.equals(this.index, calendarException.index) &&
        Objects.equals(this.enteredByOccurrences, calendarException.enteredByOccurrences) &&
        Objects.equals(this.fromDate, calendarException.fromDate) &&
        Objects.equals(this.toDate, calendarException.toDate) &&
        Objects.equals(this.occurrences, calendarException.occurrences) &&
        Objects.equals(this.name, calendarException.name) &&
        Objects.equals(this.type, calendarException.type) &&
        Objects.equals(this.period, calendarException.period) &&
        Objects.equals(this.daysOfWeek, calendarException.daysOfWeek) &&
        Objects.equals(this.monthItem, calendarException.monthItem) &&
        Objects.equals(this.monthPosition, calendarException.monthPosition) &&
        Objects.equals(this.month, calendarException.month) &&
        Objects.equals(this.monthDay, calendarException.monthDay) &&
        Objects.equals(this.dayWorking, calendarException.dayWorking) &&
        Objects.equals(this.workingTimes, calendarException.workingTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, enteredByOccurrences, fromDate, toDate, occurrences, name, type, period, daysOfWeek, monthItem, monthPosition, month, monthDay, dayWorking, workingTimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarException {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    enteredByOccurrences: ").append(toIndentedString(enteredByOccurrences)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    monthItem: ").append(toIndentedString(monthItem)).append("\n");
    sb.append("    monthPosition: ").append(toIndentedString(monthPosition)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    monthDay: ").append(toIndentedString(monthDay)).append("\n");
    sb.append("    dayWorking: ").append(toIndentedString(dayWorking)).append("\n");
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

