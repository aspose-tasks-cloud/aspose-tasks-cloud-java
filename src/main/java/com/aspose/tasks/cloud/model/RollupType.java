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
 * Specifies the rollup type.
 */
@JsonAdapter(RollupType.Adapter.class)
public enum RollupType {
  
  NULL("Null"),
  
  MAXIMUM("Maximum"),
  
  MINIMUM("Minimum"),
  
  COUNT("Count"),
  
  SUM("Sum"),
  
  AVERAGE("Average"),
  
  AVERAGEFIRSTSUBLEVEL("AverageFirstSublevel"),
  
  COUNTFIRSTSUBLEVEL("CountFirstSublevel"),
  
  COUNTNONSUMMARIES("CountNonsummaries");

  private String value;

  RollupType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RollupType fromValue(String text) {
    for (RollupType b : RollupType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RollupType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RollupType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RollupType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RollupType.fromValue(String.valueOf(value));
    }
  }
}

