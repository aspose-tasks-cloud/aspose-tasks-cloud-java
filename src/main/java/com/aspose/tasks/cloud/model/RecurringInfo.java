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
import com.aspose.tasks.cloud.model.DayOfWeek;
import com.aspose.tasks.cloud.model.Month;
import com.aspose.tasks.cloud.model.OrdinalNumber;
import com.aspose.tasks.cloud.model.RecurrencePattern;
import com.aspose.tasks.cloud.model.WeekDayType;
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
 * Represents the details of a recurring task in a project.
 */
@ApiModel(description = "Represents the details of a recurring task in a project.")

public class RecurringInfo {
  @SerializedName("RecurrencePattern")
  private RecurrencePattern recurrencePattern = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("Duration")
  private String duration = null;

  @SerializedName("Occurrences")
  private Integer occurrences = null;

  @SerializedName("UseEndDate")
  private Boolean useEndDate = null;

  @SerializedName("DailyRepetitions")
  private Integer dailyRepetitions = null;

  @SerializedName("DailyUseWorkdays")
  private Boolean dailyUseWorkdays = null;

  @SerializedName("WeeklyRepetitions")
  private Integer weeklyRepetitions = null;

  @SerializedName("WeeklyDays")
  private WeekDayType weeklyDays = null;

  @SerializedName("MonthlyUseOrdinalDay")
  private Boolean monthlyUseOrdinalDay = null;

  @SerializedName("MonthlyOrdinalNumber")
  private OrdinalNumber monthlyOrdinalNumber = null;

  @SerializedName("MonthlyOrdinalDay")
  private DayOfWeek monthlyOrdinalDay = null;

  @SerializedName("MonthlyOrdinalRepetitions")
  private Integer monthlyOrdinalRepetitions = null;

  @SerializedName("MonthlyDay")
  private Integer monthlyDay = null;

  @SerializedName("MonthlyRepetitions")
  private Integer monthlyRepetitions = null;

  @SerializedName("YearlyUseOrdinalDay")
  private Boolean yearlyUseOrdinalDay = null;

  @SerializedName("YearlyDate")
  private OffsetDateTime yearlyDate = null;

  @SerializedName("YearlyOrdinalNumber")
  private OrdinalNumber yearlyOrdinalNumber = null;

  @SerializedName("YearlyOrdinalDay")
  private DayOfWeek yearlyOrdinalDay = null;

  @SerializedName("YearlyOrdinalMonth")
  private Month yearlyOrdinalMonth = null;

  public RecurringInfo recurrencePattern(RecurrencePattern recurrencePattern) {
    this.recurrencePattern = recurrencePattern;
    return this;
  }

   /**
   * Represents a recurrence pattern of the recurring task. Can be one of the values of  enum.
   * @return recurrencePattern
  **/
  @ApiModelProperty(required = true, value = "Represents a recurrence pattern of the recurring task. Can be one of the values of  enum.")
  public RecurrencePattern getRecurrencePattern() {
    return recurrencePattern;
  }

  public void setRecurrencePattern(RecurrencePattern recurrencePattern) {
    this.recurrencePattern = recurrencePattern;
  }

  public RecurringInfo startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Specifies the date for the occurrences to begin.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Specifies the date for the occurrences to begin.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public RecurringInfo endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Specifies the date for the occurrences to end.
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "Specifies the date for the occurrences to end.")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public RecurringInfo duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Specifies the duration for one occurrence of the recurring task. the instance of  class.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Specifies the duration for one occurrence of the recurring task. the instance of  class.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public RecurringInfo occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

   /**
   * Specifies a number of occurrences of the recurring task.
   * @return occurrences
  **/
  @ApiModelProperty(required = true, value = "Specifies a number of occurrences of the recurring task.")
  public Integer getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  public RecurringInfo useEndDate(Boolean useEndDate) {
    this.useEndDate = useEndDate;
    return this;
  }

   /**
   * Determines whether to use the end date or a number of occurrences for the recurring task.
   * @return useEndDate
  **/
  @ApiModelProperty(required = true, value = "Determines whether to use the end date or a number of occurrences for the recurring task.")
  public Boolean isUseEndDate() {
    return useEndDate;
  }

  public void setUseEndDate(Boolean useEndDate) {
    this.useEndDate = useEndDate;
  }

  public RecurringInfo dailyRepetitions(Integer dailyRepetitions) {
    this.dailyRepetitions = dailyRepetitions;
    return this;
  }

   /**
   * Specifies an interval between repetitions for the daily recurrence pattern.
   * @return dailyRepetitions
  **/
  @ApiModelProperty(required = true, value = "Specifies an interval between repetitions for the daily recurrence pattern.")
  public Integer getDailyRepetitions() {
    return dailyRepetitions;
  }

  public void setDailyRepetitions(Integer dailyRepetitions) {
    this.dailyRepetitions = dailyRepetitions;
  }

  public RecurringInfo dailyUseWorkdays(Boolean dailyUseWorkdays) {
    this.dailyUseWorkdays = dailyUseWorkdays;
    return this;
  }

   /**
   * Determines whether to use workdays for the daily recurrence pattern.
   * @return dailyUseWorkdays
  **/
  @ApiModelProperty(required = true, value = "Determines whether to use workdays for the daily recurrence pattern.")
  public Boolean isDailyUseWorkdays() {
    return dailyUseWorkdays;
  }

  public void setDailyUseWorkdays(Boolean dailyUseWorkdays) {
    this.dailyUseWorkdays = dailyUseWorkdays;
  }

  public RecurringInfo weeklyRepetitions(Integer weeklyRepetitions) {
    this.weeklyRepetitions = weeklyRepetitions;
    return this;
  }

   /**
   * Specifies an interval between repetitions for the weekly recurrence pattern.
   * @return weeklyRepetitions
  **/
  @ApiModelProperty(required = true, value = "Specifies an interval between repetitions for the weekly recurrence pattern.")
  public Integer getWeeklyRepetitions() {
    return weeklyRepetitions;
  }

  public void setWeeklyRepetitions(Integer weeklyRepetitions) {
    this.weeklyRepetitions = weeklyRepetitions;
  }

  public RecurringInfo weeklyDays(WeekDayType weeklyDays) {
    this.weeklyDays = weeklyDays;
    return this;
  }

   /**
   * Specifies a collection of days used in the weekly recurrence pattern.
   * @return weeklyDays
  **/
  @ApiModelProperty(required = true, value = "Specifies a collection of days used in the weekly recurrence pattern.")
  public WeekDayType getWeeklyDays() {
    return weeklyDays;
  }

  public void setWeeklyDays(WeekDayType weeklyDays) {
    this.weeklyDays = weeklyDays;
  }

  public RecurringInfo monthlyUseOrdinalDay(Boolean monthlyUseOrdinalDay) {
    this.monthlyUseOrdinalDay = monthlyUseOrdinalDay;
    return this;
  }

   /**
   * Determines whether to use ordinal day for the monthly recurrence pattern.
   * @return monthlyUseOrdinalDay
  **/
  @ApiModelProperty(required = true, value = "Determines whether to use ordinal day for the monthly recurrence pattern.")
  public Boolean isMonthlyUseOrdinalDay() {
    return monthlyUseOrdinalDay;
  }

  public void setMonthlyUseOrdinalDay(Boolean monthlyUseOrdinalDay) {
    this.monthlyUseOrdinalDay = monthlyUseOrdinalDay;
  }

  public RecurringInfo monthlyOrdinalNumber(OrdinalNumber monthlyOrdinalNumber) {
    this.monthlyOrdinalNumber = monthlyOrdinalNumber;
    return this;
  }

   /**
   * Specifies an ordinal number of the monthly recurrence pattern. Can be one of the values of  enum.
   * @return monthlyOrdinalNumber
  **/
  @ApiModelProperty(required = true, value = "Specifies an ordinal number of the monthly recurrence pattern. Can be one of the values of  enum.")
  public OrdinalNumber getMonthlyOrdinalNumber() {
    return monthlyOrdinalNumber;
  }

  public void setMonthlyOrdinalNumber(OrdinalNumber monthlyOrdinalNumber) {
    this.monthlyOrdinalNumber = monthlyOrdinalNumber;
  }

  public RecurringInfo monthlyOrdinalDay(DayOfWeek monthlyOrdinalDay) {
    this.monthlyOrdinalDay = monthlyOrdinalDay;
    return this;
  }

   /**
   * Specifies a day of the monthly recurrence pattern when using ordinal day. Can be one of the values of  enum.
   * @return monthlyOrdinalDay
  **/
  @ApiModelProperty(required = true, value = "Specifies a day of the monthly recurrence pattern when using ordinal day. Can be one of the values of  enum.")
  public DayOfWeek getMonthlyOrdinalDay() {
    return monthlyOrdinalDay;
  }

  public void setMonthlyOrdinalDay(DayOfWeek monthlyOrdinalDay) {
    this.monthlyOrdinalDay = monthlyOrdinalDay;
  }

  public RecurringInfo monthlyOrdinalRepetitions(Integer monthlyOrdinalRepetitions) {
    this.monthlyOrdinalRepetitions = monthlyOrdinalRepetitions;
    return this;
  }

   /**
   * Specifies a number of repetitions for the monthly recurrence pattern when using ordinal day.
   * @return monthlyOrdinalRepetitions
  **/
  @ApiModelProperty(required = true, value = "Specifies a number of repetitions for the monthly recurrence pattern when using ordinal day.")
  public Integer getMonthlyOrdinalRepetitions() {
    return monthlyOrdinalRepetitions;
  }

  public void setMonthlyOrdinalRepetitions(Integer monthlyOrdinalRepetitions) {
    this.monthlyOrdinalRepetitions = monthlyOrdinalRepetitions;
  }

  public RecurringInfo monthlyDay(Integer monthlyDay) {
    this.monthlyDay = monthlyDay;
    return this;
  }

   /**
   * Specifies a number of day of the monthly recurrence pattern.
   * @return monthlyDay
  **/
  @ApiModelProperty(required = true, value = "Specifies a number of day of the monthly recurrence pattern.")
  public Integer getMonthlyDay() {
    return monthlyDay;
  }

  public void setMonthlyDay(Integer monthlyDay) {
    this.monthlyDay = monthlyDay;
  }

  public RecurringInfo monthlyRepetitions(Integer monthlyRepetitions) {
    this.monthlyRepetitions = monthlyRepetitions;
    return this;
  }

   /**
   * Specifies a number of repetitions for the monthly recurrence pattern.
   * @return monthlyRepetitions
  **/
  @ApiModelProperty(required = true, value = "Specifies a number of repetitions for the monthly recurrence pattern.")
  public Integer getMonthlyRepetitions() {
    return monthlyRepetitions;
  }

  public void setMonthlyRepetitions(Integer monthlyRepetitions) {
    this.monthlyRepetitions = monthlyRepetitions;
  }

  public RecurringInfo yearlyUseOrdinalDay(Boolean yearlyUseOrdinalDay) {
    this.yearlyUseOrdinalDay = yearlyUseOrdinalDay;
    return this;
  }

   /**
   * Determines whether to use ordinal day for the yearly recurrence pattern.
   * @return yearlyUseOrdinalDay
  **/
  @ApiModelProperty(required = true, value = "Determines whether to use ordinal day for the yearly recurrence pattern.")
  public Boolean isYearlyUseOrdinalDay() {
    return yearlyUseOrdinalDay;
  }

  public void setYearlyUseOrdinalDay(Boolean yearlyUseOrdinalDay) {
    this.yearlyUseOrdinalDay = yearlyUseOrdinalDay;
  }

  public RecurringInfo yearlyDate(OffsetDateTime yearlyDate) {
    this.yearlyDate = yearlyDate;
    return this;
  }

   /**
   * Specifies a date for the yearly recurrence pattern.
   * @return yearlyDate
  **/
  @ApiModelProperty(required = true, value = "Specifies a date for the yearly recurrence pattern.")
  public OffsetDateTime getYearlyDate() {
    return yearlyDate;
  }

  public void setYearlyDate(OffsetDateTime yearlyDate) {
    this.yearlyDate = yearlyDate;
  }

  public RecurringInfo yearlyOrdinalNumber(OrdinalNumber yearlyOrdinalNumber) {
    this.yearlyOrdinalNumber = yearlyOrdinalNumber;
    return this;
  }

   /**
   * Specifies an ordinal number of the yearly recurrence pattern. Can be one of the values of  enum.
   * @return yearlyOrdinalNumber
  **/
  @ApiModelProperty(required = true, value = "Specifies an ordinal number of the yearly recurrence pattern. Can be one of the values of  enum.")
  public OrdinalNumber getYearlyOrdinalNumber() {
    return yearlyOrdinalNumber;
  }

  public void setYearlyOrdinalNumber(OrdinalNumber yearlyOrdinalNumber) {
    this.yearlyOrdinalNumber = yearlyOrdinalNumber;
  }

  public RecurringInfo yearlyOrdinalDay(DayOfWeek yearlyOrdinalDay) {
    this.yearlyOrdinalDay = yearlyOrdinalDay;
    return this;
  }

   /**
   * Specifies a weekday of the yearly recurrence pattern when using ordinal day. Can be one of the values of  enum.
   * @return yearlyOrdinalDay
  **/
  @ApiModelProperty(required = true, value = "Specifies a weekday of the yearly recurrence pattern when using ordinal day. Can be one of the values of  enum.")
  public DayOfWeek getYearlyOrdinalDay() {
    return yearlyOrdinalDay;
  }

  public void setYearlyOrdinalDay(DayOfWeek yearlyOrdinalDay) {
    this.yearlyOrdinalDay = yearlyOrdinalDay;
  }

  public RecurringInfo yearlyOrdinalMonth(Month yearlyOrdinalMonth) {
    this.yearlyOrdinalMonth = yearlyOrdinalMonth;
    return this;
  }

   /**
   * Specifies a month of the yearly recurrence pattern when using ordinal day. Can be one of the values of  enum.
   * @return yearlyOrdinalMonth
  **/
  @ApiModelProperty(required = true, value = "Specifies a month of the yearly recurrence pattern when using ordinal day. Can be one of the values of  enum.")
  public Month getYearlyOrdinalMonth() {
    return yearlyOrdinalMonth;
  }

  public void setYearlyOrdinalMonth(Month yearlyOrdinalMonth) {
    this.yearlyOrdinalMonth = yearlyOrdinalMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringInfo recurringInfo = (RecurringInfo) o;
    return Objects.equals(this.recurrencePattern, recurringInfo.recurrencePattern) &&
        Objects.equals(this.startDate, recurringInfo.startDate) &&
        Objects.equals(this.endDate, recurringInfo.endDate) &&
        Objects.equals(this.duration, recurringInfo.duration) &&
        Objects.equals(this.occurrences, recurringInfo.occurrences) &&
        Objects.equals(this.useEndDate, recurringInfo.useEndDate) &&
        Objects.equals(this.dailyRepetitions, recurringInfo.dailyRepetitions) &&
        Objects.equals(this.dailyUseWorkdays, recurringInfo.dailyUseWorkdays) &&
        Objects.equals(this.weeklyRepetitions, recurringInfo.weeklyRepetitions) &&
        Objects.equals(this.weeklyDays, recurringInfo.weeklyDays) &&
        Objects.equals(this.monthlyUseOrdinalDay, recurringInfo.monthlyUseOrdinalDay) &&
        Objects.equals(this.monthlyOrdinalNumber, recurringInfo.monthlyOrdinalNumber) &&
        Objects.equals(this.monthlyOrdinalDay, recurringInfo.monthlyOrdinalDay) &&
        Objects.equals(this.monthlyOrdinalRepetitions, recurringInfo.monthlyOrdinalRepetitions) &&
        Objects.equals(this.monthlyDay, recurringInfo.monthlyDay) &&
        Objects.equals(this.monthlyRepetitions, recurringInfo.monthlyRepetitions) &&
        Objects.equals(this.yearlyUseOrdinalDay, recurringInfo.yearlyUseOrdinalDay) &&
        Objects.equals(this.yearlyDate, recurringInfo.yearlyDate) &&
        Objects.equals(this.yearlyOrdinalNumber, recurringInfo.yearlyOrdinalNumber) &&
        Objects.equals(this.yearlyOrdinalDay, recurringInfo.yearlyOrdinalDay) &&
        Objects.equals(this.yearlyOrdinalMonth, recurringInfo.yearlyOrdinalMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurrencePattern, startDate, endDate, duration, occurrences, useEndDate, dailyRepetitions, dailyUseWorkdays, weeklyRepetitions, weeklyDays, monthlyUseOrdinalDay, monthlyOrdinalNumber, monthlyOrdinalDay, monthlyOrdinalRepetitions, monthlyDay, monthlyRepetitions, yearlyUseOrdinalDay, yearlyDate, yearlyOrdinalNumber, yearlyOrdinalDay, yearlyOrdinalMonth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringInfo {\n");
    
    sb.append("    recurrencePattern: ").append(toIndentedString(recurrencePattern)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
    sb.append("    dailyRepetitions: ").append(toIndentedString(dailyRepetitions)).append("\n");
    sb.append("    dailyUseWorkdays: ").append(toIndentedString(dailyUseWorkdays)).append("\n");
    sb.append("    weeklyRepetitions: ").append(toIndentedString(weeklyRepetitions)).append("\n");
    sb.append("    weeklyDays: ").append(toIndentedString(weeklyDays)).append("\n");
    sb.append("    monthlyUseOrdinalDay: ").append(toIndentedString(monthlyUseOrdinalDay)).append("\n");
    sb.append("    monthlyOrdinalNumber: ").append(toIndentedString(monthlyOrdinalNumber)).append("\n");
    sb.append("    monthlyOrdinalDay: ").append(toIndentedString(monthlyOrdinalDay)).append("\n");
    sb.append("    monthlyOrdinalRepetitions: ").append(toIndentedString(monthlyOrdinalRepetitions)).append("\n");
    sb.append("    monthlyDay: ").append(toIndentedString(monthlyDay)).append("\n");
    sb.append("    monthlyRepetitions: ").append(toIndentedString(monthlyRepetitions)).append("\n");
    sb.append("    yearlyUseOrdinalDay: ").append(toIndentedString(yearlyUseOrdinalDay)).append("\n");
    sb.append("    yearlyDate: ").append(toIndentedString(yearlyDate)).append("\n");
    sb.append("    yearlyOrdinalNumber: ").append(toIndentedString(yearlyOrdinalNumber)).append("\n");
    sb.append("    yearlyOrdinalDay: ").append(toIndentedString(yearlyOrdinalDay)).append("\n");
    sb.append("    yearlyOrdinalMonth: ").append(toIndentedString(yearlyOrdinalMonth)).append("\n");
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

