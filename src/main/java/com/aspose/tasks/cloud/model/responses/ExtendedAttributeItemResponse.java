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
import com.aspose.tasks.cloud.model.ExtendedAttributeItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExtendedAttributeItemResponse
 */

public class ExtendedAttributeItemResponse extends AsposeResponse {
  @SerializedName("ExtendedAttribute")
  private ExtendedAttributeItem extendedAttribute = null;

  public ExtendedAttributeItemResponse extendedAttribute(ExtendedAttributeItem extendedAttribute) {
    this.extendedAttribute = extendedAttribute;
    return this;
  }

   /**
   * Extended attribute definition info.
   * @return extendedAttribute
  **/
  @ApiModelProperty(value = "Extended attribute definition info.")
  public ExtendedAttributeItem getExtendedAttribute() {
    return extendedAttribute;
  }

  public void setExtendedAttribute(ExtendedAttributeItem extendedAttribute) {
    this.extendedAttribute = extendedAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedAttributeItemResponse extendedAttributeItemResponse = (ExtendedAttributeItemResponse) o;
    return Objects.equals(this.extendedAttribute, extendedAttributeItemResponse.extendedAttribute) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedAttribute, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedAttributeItemResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    extendedAttribute: ").append(toIndentedString(extendedAttribute)).append("\n");
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

