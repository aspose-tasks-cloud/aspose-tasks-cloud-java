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
import com.aspose.tasks.cloud.model.VbaModuleAttribute;
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
 * Represents a vba module 
 */
@ApiModel(description = "Represents a vba module ")

public class VbaModule {
  @SerializedName("Attributes")
  private List<VbaModuleAttribute> attributes = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("SourceCode")
  private String sourceCode = null;

  public VbaModule attributes(List<VbaModuleAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public VbaModule addAttributesItem(VbaModuleAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<VbaModuleAttribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Gets a collection of  VbaModuleAttributeCollection
   * @return attributes
  **/
  @ApiModelProperty(value = "Gets a collection of  VbaModuleAttributeCollection")
  public List<VbaModuleAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<VbaModuleAttribute> attributes) {
    this.attributes = attributes;
  }

  public VbaModule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets the name of the module.
   * @return name
  **/
  @ApiModelProperty(value = "Gets the name of the module.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VbaModule sourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

   /**
   * Gets a source code of the module
   * @return sourceCode
  **/
  @ApiModelProperty(value = "Gets a source code of the module")
  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbaModule vbaModule = (VbaModule) o;
    return Objects.equals(this.attributes, vbaModule.attributes) &&
        Objects.equals(this.name, vbaModule.name) &&
        Objects.equals(this.sourceCode, vbaModule.sourceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, name, sourceCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbaModule {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
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

