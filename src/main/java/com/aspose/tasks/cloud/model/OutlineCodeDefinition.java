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
import com.aspose.tasks.cloud.model.OutlineMask;
import com.aspose.tasks.cloud.model.OutlineValue;
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
 * Represents an outline code definition.
 */
@ApiModel(description = "Represents an outline code definition.")

public class OutlineCodeDefinition {
  @SerializedName("Guid")
  private String guid = null;

  @SerializedName("FieldId")
  private String fieldId = null;

  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("Alias")
  private String alias = null;

  @SerializedName("PhoneticAlias")
  private String phoneticAlias = null;

  @SerializedName("Values")
  private List<OutlineValue> values = null;

  @SerializedName("Enterprise")
  private Boolean enterprise = null;

  @SerializedName("EnterpriseOutlineCodeAlias")
  private Integer enterpriseOutlineCodeAlias = null;

  @SerializedName("ResourceSubstitutionEnabled")
  private Boolean resourceSubstitutionEnabled = null;

  @SerializedName("LeafOnly")
  private Boolean leafOnly = null;

  @SerializedName("AllLevelsRequired")
  private Boolean allLevelsRequired = null;

  @SerializedName("OnlyTableValuesAllowed")
  private Boolean onlyTableValuesAllowed = null;

  @SerializedName("Masks")
  private List<OutlineMask> masks = null;

  @SerializedName("ShowIndent")
  private Boolean showIndent = null;

  public OutlineCodeDefinition guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * The Guid of an outline code.
   * @return guid
  **/
  @ApiModelProperty(value = "The Guid of an outline code.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public OutlineCodeDefinition fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Corresponds to the field number of an outline code.
   * @return fieldId
  **/
  @ApiModelProperty(value = "Corresponds to the field number of an outline code.")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public OutlineCodeDefinition fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * The name of a custom outline code.
   * @return fieldName
  **/
  @ApiModelProperty(value = "The name of a custom outline code.")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public OutlineCodeDefinition alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * The alias of a custom outline code.
   * @return alias
  **/
  @ApiModelProperty(value = "The alias of a custom outline code.")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public OutlineCodeDefinition phoneticAlias(String phoneticAlias) {
    this.phoneticAlias = phoneticAlias;
    return this;
  }

   /**
   * The phonetic pronunciation of the alias of the custom outline code.
   * @return phoneticAlias
  **/
  @ApiModelProperty(value = "The phonetic pronunciation of the alias of the custom outline code.")
  public String getPhoneticAlias() {
    return phoneticAlias;
  }

  public void setPhoneticAlias(String phoneticAlias) {
    this.phoneticAlias = phoneticAlias;
  }

  public OutlineCodeDefinition values(List<OutlineValue> values) {
    this.values = values;
    return this;
  }

  public OutlineCodeDefinition addValuesItem(OutlineValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<OutlineValue>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Returns List&amp;lt;OutlineValue&amp;gt; Values. The values of the table associated with this outline code.
   * @return values
  **/
  @ApiModelProperty(value = "Returns List&lt;OutlineValue&gt; Values. The values of the table associated with this outline code.")
  public List<OutlineValue> getValues() {
    return values;
  }

  public void setValues(List<OutlineValue> values) {
    this.values = values;
  }

  public OutlineCodeDefinition enterprise(Boolean enterprise) {
    this.enterprise = enterprise;
    return this;
  }

   /**
   * Determines whether a custom outline code is an enterprise custom outline code.
   * @return enterprise
  **/
  @ApiModelProperty(required = true, value = "Determines whether a custom outline code is an enterprise custom outline code.")
  public Boolean isEnterprise() {
    return enterprise;
  }

  public void setEnterprise(Boolean enterprise) {
    this.enterprise = enterprise;
  }

  public OutlineCodeDefinition enterpriseOutlineCodeAlias(Integer enterpriseOutlineCodeAlias) {
    this.enterpriseOutlineCodeAlias = enterpriseOutlineCodeAlias;
    return this;
  }

   /**
   * The reference to another custom field for which this outline code definition is an alias.
   * @return enterpriseOutlineCodeAlias
  **/
  @ApiModelProperty(required = true, value = "The reference to another custom field for which this outline code definition is an alias.")
  public Integer getEnterpriseOutlineCodeAlias() {
    return enterpriseOutlineCodeAlias;
  }

  public void setEnterpriseOutlineCodeAlias(Integer enterpriseOutlineCodeAlias) {
    this.enterpriseOutlineCodeAlias = enterpriseOutlineCodeAlias;
  }

  public OutlineCodeDefinition resourceSubstitutionEnabled(Boolean resourceSubstitutionEnabled) {
    this.resourceSubstitutionEnabled = resourceSubstitutionEnabled;
    return this;
  }

   /**
   * Determines whether the custom outline code can be used by the Resource Substitution Wizard in Microsoft Project.
   * @return resourceSubstitutionEnabled
  **/
  @ApiModelProperty(required = true, value = "Determines whether the custom outline code can be used by the Resource Substitution Wizard in Microsoft Project.")
  public Boolean isResourceSubstitutionEnabled() {
    return resourceSubstitutionEnabled;
  }

  public void setResourceSubstitutionEnabled(Boolean resourceSubstitutionEnabled) {
    this.resourceSubstitutionEnabled = resourceSubstitutionEnabled;
  }

  public OutlineCodeDefinition leafOnly(Boolean leafOnly) {
    this.leafOnly = leafOnly;
    return this;
  }

   /**
   * Determines whether the values specified in this outline code field must be leaf values.
   * @return leafOnly
  **/
  @ApiModelProperty(required = true, value = "Determines whether the values specified in this outline code field must be leaf values.")
  public Boolean isLeafOnly() {
    return leafOnly;
  }

  public void setLeafOnly(Boolean leafOnly) {
    this.leafOnly = leafOnly;
  }

  public OutlineCodeDefinition allLevelsRequired(Boolean allLevelsRequired) {
    this.allLevelsRequired = allLevelsRequired;
    return this;
  }

   /**
   * Determines whether the new codes must have all levels. Not available for Enterprise Codes.
   * @return allLevelsRequired
  **/
  @ApiModelProperty(required = true, value = "Determines whether the new codes must have all levels. Not available for Enterprise Codes.")
  public Boolean isAllLevelsRequired() {
    return allLevelsRequired;
  }

  public void setAllLevelsRequired(Boolean allLevelsRequired) {
    this.allLevelsRequired = allLevelsRequired;
  }

  public OutlineCodeDefinition onlyTableValuesAllowed(Boolean onlyTableValuesAllowed) {
    this.onlyTableValuesAllowed = onlyTableValuesAllowed;
    return this;
  }

   /**
   * Determines whether the values specified must come from values table.
   * @return onlyTableValuesAllowed
  **/
  @ApiModelProperty(required = true, value = "Determines whether the values specified must come from values table.")
  public Boolean isOnlyTableValuesAllowed() {
    return onlyTableValuesAllowed;
  }

  public void setOnlyTableValuesAllowed(Boolean onlyTableValuesAllowed) {
    this.onlyTableValuesAllowed = onlyTableValuesAllowed;
  }

  public OutlineCodeDefinition masks(List<OutlineMask> masks) {
    this.masks = masks;
    return this;
  }

  public OutlineCodeDefinition addMasksItem(OutlineMask masksItem) {
    if (this.masks == null) {
      this.masks = new ArrayList<OutlineMask>();
    }
    this.masks.add(masksItem);
    return this;
  }

   /**
   * Returns List&amp;lt;OutlineMask&amp;gt; Masks. The table of entries that define the outline code mask.
   * @return masks
  **/
  @ApiModelProperty(value = "Returns List&lt;OutlineMask&gt; Masks. The table of entries that define the outline code mask.")
  public List<OutlineMask> getMasks() {
    return masks;
  }

  public void setMasks(List<OutlineMask> masks) {
    this.masks = masks;
  }

  public OutlineCodeDefinition showIndent(Boolean showIndent) {
    this.showIndent = showIndent;
    return this;
  }

   /**
   * Determines whether the indents of this outline code must be shown.
   * @return showIndent
  **/
  @ApiModelProperty(required = true, value = "Determines whether the indents of this outline code must be shown.")
  public Boolean isShowIndent() {
    return showIndent;
  }

  public void setShowIndent(Boolean showIndent) {
    this.showIndent = showIndent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineCodeDefinition outlineCodeDefinition = (OutlineCodeDefinition) o;
    return Objects.equals(this.guid, outlineCodeDefinition.guid) &&
        Objects.equals(this.fieldId, outlineCodeDefinition.fieldId) &&
        Objects.equals(this.fieldName, outlineCodeDefinition.fieldName) &&
        Objects.equals(this.alias, outlineCodeDefinition.alias) &&
        Objects.equals(this.phoneticAlias, outlineCodeDefinition.phoneticAlias) &&
        Objects.equals(this.values, outlineCodeDefinition.values) &&
        Objects.equals(this.enterprise, outlineCodeDefinition.enterprise) &&
        Objects.equals(this.enterpriseOutlineCodeAlias, outlineCodeDefinition.enterpriseOutlineCodeAlias) &&
        Objects.equals(this.resourceSubstitutionEnabled, outlineCodeDefinition.resourceSubstitutionEnabled) &&
        Objects.equals(this.leafOnly, outlineCodeDefinition.leafOnly) &&
        Objects.equals(this.allLevelsRequired, outlineCodeDefinition.allLevelsRequired) &&
        Objects.equals(this.onlyTableValuesAllowed, outlineCodeDefinition.onlyTableValuesAllowed) &&
        Objects.equals(this.masks, outlineCodeDefinition.masks) &&
        Objects.equals(this.showIndent, outlineCodeDefinition.showIndent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, fieldId, fieldName, alias, phoneticAlias, values, enterprise, enterpriseOutlineCodeAlias, resourceSubstitutionEnabled, leafOnly, allLevelsRequired, onlyTableValuesAllowed, masks, showIndent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineCodeDefinition {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    phoneticAlias: ").append(toIndentedString(phoneticAlias)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    enterpriseOutlineCodeAlias: ").append(toIndentedString(enterpriseOutlineCodeAlias)).append("\n");
    sb.append("    resourceSubstitutionEnabled: ").append(toIndentedString(resourceSubstitutionEnabled)).append("\n");
    sb.append("    leafOnly: ").append(toIndentedString(leafOnly)).append("\n");
    sb.append("    allLevelsRequired: ").append(toIndentedString(allLevelsRequired)).append("\n");
    sb.append("    onlyTableValuesAllowed: ").append(toIndentedString(onlyTableValuesAllowed)).append("\n");
    sb.append("    masks: ").append(toIndentedString(masks)).append("\n");
    sb.append("    showIndent: ").append(toIndentedString(showIndent)).append("\n");
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

