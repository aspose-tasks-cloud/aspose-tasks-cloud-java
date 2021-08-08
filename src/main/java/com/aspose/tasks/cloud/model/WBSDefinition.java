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
import com.aspose.tasks.cloud.model.WBSCodeMask;
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
 * WBSDefinition
 */

public class WBSDefinition {
  @SerializedName("CodePrefix")
  private String codePrefix = null;

  @SerializedName("GenerateWBSCode")
  private Boolean generateWBSCode = null;

  @SerializedName("VerifyUniqueness")
  private Boolean verifyUniqueness = null;

  @SerializedName("CodeMaskCollection")
  private List<WBSCodeMask> codeMaskCollection = null;

  public WBSDefinition codePrefix(String codePrefix) {
    this.codePrefix = codePrefix;
    return this;
  }

   /**
   * Project Code Prefix.
   * @return codePrefix
  **/
  @ApiModelProperty(value = "Project Code Prefix.")
  public String getCodePrefix() {
    return codePrefix;
  }

  public void setCodePrefix(String codePrefix) {
    this.codePrefix = codePrefix;
  }

  public WBSDefinition generateWBSCode(Boolean generateWBSCode) {
    this.generateWBSCode = generateWBSCode;
    return this;
  }

   /**
   * Determines whether to generate WBS code for new task.
   * @return generateWBSCode
  **/
  @ApiModelProperty(required = true, value = "Determines whether to generate WBS code for new task.")
  public Boolean isGenerateWBSCode() {
    return generateWBSCode;
  }

  public void setGenerateWBSCode(Boolean generateWBSCode) {
    this.generateWBSCode = generateWBSCode;
  }

  public WBSDefinition verifyUniqueness(Boolean verifyUniqueness) {
    this.verifyUniqueness = verifyUniqueness;
    return this;
  }

   /**
   * Determines whether to verify uniqueness of new WBS codes.
   * @return verifyUniqueness
  **/
  @ApiModelProperty(required = true, value = "Determines whether to verify uniqueness of new WBS codes.")
  public Boolean isVerifyUniqueness() {
    return verifyUniqueness;
  }

  public void setVerifyUniqueness(Boolean verifyUniqueness) {
    this.verifyUniqueness = verifyUniqueness;
  }

  public WBSDefinition codeMaskCollection(List<WBSCodeMask> codeMaskCollection) {
    this.codeMaskCollection = codeMaskCollection;
    return this;
  }

  public WBSDefinition addCodeMaskCollectionItem(WBSCodeMask codeMaskCollectionItem) {
    if (this.codeMaskCollection == null) {
      this.codeMaskCollection = new ArrayList<WBSCodeMask>();
    }
    this.codeMaskCollection.add(codeMaskCollectionItem);
    return this;
  }

   /**
   * Collection of WBSCodeMask objects.
   * @return codeMaskCollection
  **/
  @ApiModelProperty(value = "Collection of WBSCodeMask objects.")
  public List<WBSCodeMask> getCodeMaskCollection() {
    return codeMaskCollection;
  }

  public void setCodeMaskCollection(List<WBSCodeMask> codeMaskCollection) {
    this.codeMaskCollection = codeMaskCollection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WBSDefinition wbSDefinition = (WBSDefinition) o;
    return Objects.equals(this.codePrefix, wbSDefinition.codePrefix) &&
        Objects.equals(this.generateWBSCode, wbSDefinition.generateWBSCode) &&
        Objects.equals(this.verifyUniqueness, wbSDefinition.verifyUniqueness) &&
        Objects.equals(this.codeMaskCollection, wbSDefinition.codeMaskCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codePrefix, generateWBSCode, verifyUniqueness, codeMaskCollection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WBSDefinition {\n");
    
    sb.append("    codePrefix: ").append(toIndentedString(codePrefix)).append("\n");
    sb.append("    generateWBSCode: ").append(toIndentedString(generateWBSCode)).append("\n");
    sb.append("    verifyUniqueness: ").append(toIndentedString(verifyUniqueness)).append("\n");
    sb.append("    codeMaskCollection: ").append(toIndentedString(codeMaskCollection)).append("\n");
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

