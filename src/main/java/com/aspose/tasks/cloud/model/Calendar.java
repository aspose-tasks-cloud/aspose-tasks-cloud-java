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
import com.aspose.tasks.cloud.model.Calendar;
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

/**
 * Represents a calendar used in a project.
 */
@ApiModel(description = "Represents a calendar used in a project.")

public class Calendar {
  @SerializedName("Guid")
  private String guid = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Uid")
  private Integer uid = null;

  @SerializedName("Days")
  private List<WeekDay> days = null;

  @SerializedName("IsBaseCalendar")
  private Boolean isBaseCalendar = null;

  @SerializedName("BaseCalendar")
  private Calendar baseCalendar = null;

  @SerializedName("IsBaselineCalendar")
  private Boolean isBaselineCalendar = null;

  public Calendar guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Gets calendar&#39;s Guid.
   * @return guid
  **/
  @ApiModelProperty(value = "Gets calendar's Guid.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Calendar name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the calendar.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the calendar.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Calendar uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * The unique identifier of the calendar.
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the calendar.")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public Calendar days(List<WeekDay> days) {
    this.days = days;
    return this;
  }

  public Calendar addDaysItem(WeekDay daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<WeekDay>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * The collection of weekdays that defines the calendar.
   * @return days
  **/
  @ApiModelProperty(value = "The collection of weekdays that defines the calendar.")
  public List<WeekDay> getDays() {
    return days;
  }

  public void setDays(List<WeekDay> days) {
    this.days = days;
  }

  public Calendar isBaseCalendar(Boolean isBaseCalendar) {
    this.isBaseCalendar = isBaseCalendar;
    return this;
  }

   /**
   * Determines whether the calendar is a base calendar.
   * @return isBaseCalendar
  **/
  @ApiModelProperty(required = true, value = "Determines whether the calendar is a base calendar.")
  public Boolean isIsBaseCalendar() {
    return isBaseCalendar;
  }

  public void setIsBaseCalendar(Boolean isBaseCalendar) {
    this.isBaseCalendar = isBaseCalendar;
  }

  public Calendar baseCalendar(Calendar baseCalendar) {
    this.baseCalendar = baseCalendar;
    return this;
  }

   /**
   * The base calendar on which this calendar depends. Only applicable if the calendar is not a base calendar.
   * @return baseCalendar
  **/
  @ApiModelProperty(value = "The base calendar on which this calendar depends. Only applicable if the calendar is not a base calendar.")
  public Calendar getBaseCalendar() {
    return baseCalendar;
  }

  public void setBaseCalendar(Calendar baseCalendar) {
    this.baseCalendar = baseCalendar;
  }

  public Calendar isBaselineCalendar(Boolean isBaselineCalendar) {
    this.isBaselineCalendar = isBaselineCalendar;
    return this;
  }

   /**
   * Specifies whether the calendar is a baseline calendar.
   * @return isBaselineCalendar
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the calendar is a baseline calendar.")
  public Boolean isIsBaselineCalendar() {
    return isBaselineCalendar;
  }

  public void setIsBaselineCalendar(Boolean isBaselineCalendar) {
    this.isBaselineCalendar = isBaselineCalendar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calendar calendar = (Calendar) o;
    return Objects.equals(this.guid, calendar.guid) &&
        Objects.equals(this.name, calendar.name) &&
        Objects.equals(this.uid, calendar.uid) &&
        Objects.equals(this.days, calendar.days) &&
        Objects.equals(this.isBaseCalendar, calendar.isBaseCalendar) &&
        Objects.equals(this.baseCalendar, calendar.baseCalendar) &&
        Objects.equals(this.isBaselineCalendar, calendar.isBaselineCalendar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, name, uid, days, isBaseCalendar, baseCalendar, isBaselineCalendar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calendar {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    isBaseCalendar: ").append(toIndentedString(isBaseCalendar)).append("\n");
    sb.append("    baseCalendar: ").append(toIndentedString(baseCalendar)).append("\n");
    sb.append("    isBaselineCalendar: ").append(toIndentedString(isBaselineCalendar)).append("\n");
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

