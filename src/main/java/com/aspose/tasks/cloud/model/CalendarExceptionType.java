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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies the calendar exception type.
 */
@JsonAdapter(CalendarExceptionType.Adapter.class)
public enum CalendarExceptionType {
  
  DAILY("Daily"),
  
  YEARLYBYDAY("YearlyByDay"),
  
  YEARLYBYPOSITION("YearlyByPosition"),
  
  MONTHLYBYDAY("MonthlyByDay"),
  
  MONTHLYBYPOSITION("MonthlyByPosition"),
  
  WEEKLY("Weekly"),
  
  BYDAYCOUNT("ByDayCount"),
  
  BYWEEKDAYCOUNT("ByWeekDayCount"),
  
  NOEXCEPTIONTYPE("NoExceptionType");

  private String value;

  CalendarExceptionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CalendarExceptionType fromValue(String text) {
    for (CalendarExceptionType b : CalendarExceptionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CalendarExceptionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CalendarExceptionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CalendarExceptionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CalendarExceptionType.fromValue(String.valueOf(value));
    }
  }
}

