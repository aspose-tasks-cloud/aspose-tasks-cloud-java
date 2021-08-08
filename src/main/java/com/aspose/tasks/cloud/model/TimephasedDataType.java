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
 * 
 */
@JsonAdapter(TimephasedDataType.Adapter.class)
public enum TimephasedDataType {
  
  ASSIGNMENTREMAININGWORK("AssignmentRemainingWork"),
  
  ASSIGNMENTACTUALWORK("AssignmentActualWork"),
  
  ASSIGNMENTACTUALOVERTIMEWORK("AssignmentActualOvertimeWork"),
  
  ASSIGNMENTBASELINEWORK("AssignmentBaselineWork"),
  
  ASSIGNMENTBASELINECOST("AssignmentBaselineCost"),
  
  ASSIGNMENTACTUALCOST("AssignmentActualCost"),
  
  RESOURCEBASELINEWORK("ResourceBaselineWork"),
  
  RESOURCEBASELINECOST("ResourceBaselineCost"),
  
  TASKBASELINEWORK("TaskBaselineWork"),
  
  TASKBASELINECOST("TaskBaselineCost"),
  
  TASKPERCENTCOMPLETE("TaskPercentComplete"),
  
  ASSIGNMENTBASELINE1WORK("AssignmentBaseline1Work"),
  
  ASSIGNMENTBASELINE1COST("AssignmentBaseline1Cost"),
  
  TASKBASELINE1WORK("TaskBaseline1Work"),
  
  TASKBASELINE1COST("TaskBaseline1Cost"),
  
  RESOURCEBASELINE1WORK("ResourceBaseline1Work"),
  
  RESOURCEBASELINE1COST("ResourceBaseline1Cost"),
  
  ASSIGNMENTBASELINE2WORK("AssignmentBaseline2Work"),
  
  ASSIGNMENTBASELINE2COST("AssignmentBaseline2Cost"),
  
  TASKBASELINE2WORK("TaskBaseline2Work"),
  
  TASKBASELINE2COST("TaskBaseline2Cost"),
  
  RESOURCEBASELINE2WORK("ResourceBaseline2Work"),
  
  RESOURCEBASELINE2COST("ResourceBaseline2Cost"),
  
  ASSIGNMENTBASELINE3WORK("AssignmentBaseline3Work"),
  
  ASSIGNMENTBASELINE3COST("AssignmentBaseline3Cost"),
  
  TASKBASELINE3WORK("TaskBaseline3Work"),
  
  TASKBASELINE3COST("TaskBaseline3Cost"),
  
  RESOURCEBASELINE3WORK("ResourceBaseline3Work"),
  
  RESOURCEBASELINE3COST("ResourceBaseline3Cost"),
  
  ASSIGNMENTBASELINE4WORK("AssignmentBaseline4Work"),
  
  ASSIGNMENTBASELINE4COST("AssignmentBaseline4Cost"),
  
  TASKBASELINE4WORK("TaskBaseline4Work"),
  
  TASKBASELINE4COST("TaskBaseline4Cost"),
  
  RESOURCEBASELINE4WORK("ResourceBaseline4Work"),
  
  RESOURCEBASELINE4COST("ResourceBaseline4Cost"),
  
  ASSIGNMENTBASELINE5WORK("AssignmentBaseline5Work"),
  
  ASSIGNMENTBASELINE5COST("AssignmentBaseline5Cost"),
  
  TASKBASELINE5WORK("TaskBaseline5Work"),
  
  TASKBASELINE5COST("TaskBaseline5Cost"),
  
  RESOURCEBASELINE5WORK("ResourceBaseline5Work"),
  
  RESOURCEBASELINE5COST("ResourceBaseline5Cost"),
  
  ASSIGNMENTBASELINE6WORK("AssignmentBaseline6Work"),
  
  ASSIGNMENTBASELINE6COST("AssignmentBaseline6Cost"),
  
  TASKBASELINE6WORK("TaskBaseline6Work"),
  
  TASKBASELINE6COST("TaskBaseline6Cost"),
  
  RESOURCEBASELINE6WORK("ResourceBaseline6Work"),
  
  RESOURCEBASELINE6COST("ResourceBaseline6Cost"),
  
  ASSIGNMENTBASELINE7WORK("AssignmentBaseline7Work"),
  
  ASSIGNMENTBASELINE7COST("AssignmentBaseline7Cost"),
  
  TASKBASELINE7WORK("TaskBaseline7Work"),
  
  TASKBASELINE7COST("TaskBaseline7Cost"),
  
  RESOURCEBASELINE7WORK("ResourceBaseline7Work"),
  
  RESOURCEBASELINE7COST("ResourceBaseline7Cost"),
  
  ASSIGNMENTBASELINE8WORK("AssignmentBaseline8Work"),
  
  ASSIGNMENTBASELINE8COST("AssignmentBaseline8Cost"),
  
  TASKBASELINE8WORK("TaskBaseline8Work"),
  
  TASKBASELINE8COST("TaskBaseline8Cost"),
  
  RESOURCEBASELINE8WORK("ResourceBaseline8Work"),
  
  RESOURCEBASELINE8COST("ResourceBaseline8Cost"),
  
  ASSIGNMENTBASELINE9WORK("AssignmentBaseline9Work"),
  
  ASSIGNMENTBASELINE9COST("AssignmentBaseline9Cost"),
  
  TASKBASELINE9WORK("TaskBaseline9Work"),
  
  TASKBASELINE9COST("TaskBaseline9Cost"),
  
  RESOURCEBASELINE9WORK("ResourceBaseline9Work"),
  
  RESOURCEBASELINE9COST("ResourceBaseline9Cost"),
  
  ASSIGNMENTBASELINE10WORK("AssignmentBaseline10Work"),
  
  ASSIGNMENTBASELINE10COST("AssignmentBaseline10Cost"),
  
  TASKBASELINE10WORK("TaskBaseline10Work"),
  
  TASKBASELINE10COST("TaskBaseline10Cost"),
  
  RESOURCEBASELINE10WORK("ResourceBaseline10Work"),
  
  RESOURCEBASELINE10COST("ResourceBaseline10Cost"),
  
  PHYSICALPERCENTCOMPLETE("PhysicalPercentComplete"),
  
  TASKWORK("TaskWork"),
  
  TASKCOST("TaskCost"),
  
  RESOURCEWORK("ResourceWork"),
  
  RESOURCECOST("ResourceCost"),
  
  ASSIGNMENTWORK("AssignmentWork"),
  
  ASSIGNMENTCOST("AssignmentCost"),
  
  UNDEFINED("Undefined");

  private String value;

  TimephasedDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimephasedDataType fromValue(String text) {
    for (TimephasedDataType b : TimephasedDataType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TimephasedDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TimephasedDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimephasedDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TimephasedDataType.fromValue(String.valueOf(value));
    }
  }
}

