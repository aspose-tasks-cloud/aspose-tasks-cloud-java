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

package com.aspose.tasks.cloud.model.responses;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.PrimaveraTaskProperties;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PrimaveraProperties response.
 */
@ApiModel(description = "PrimaveraProperties response.")

public class PrimaveraTaskPropertiesResponse extends AsposeResponse {
  @SerializedName("PrimaveraProperties")
  private PrimaveraTaskProperties primaveraProperties = null;

  public PrimaveraTaskPropertiesResponse primaveraProperties(PrimaveraTaskProperties primaveraProperties) {
    this.primaveraProperties = primaveraProperties;
    return this;
  }

   /**
   * PrimaveraTaskProperties DTO
   * @return primaveraProperties
  **/
  @ApiModelProperty(value = "PrimaveraTaskProperties DTO")
  public PrimaveraTaskProperties getPrimaveraProperties() {
    return primaveraProperties;
  }

  public void setPrimaveraProperties(PrimaveraTaskProperties primaveraProperties) {
    this.primaveraProperties = primaveraProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaveraTaskPropertiesResponse primaveraTaskPropertiesResponse = (PrimaveraTaskPropertiesResponse) o;
    return Objects.equals(this.primaveraProperties, primaveraTaskPropertiesResponse.primaveraProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaveraProperties, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaveraTaskPropertiesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    primaveraProperties: ").append(toIndentedString(primaveraProperties)).append("\n");
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

