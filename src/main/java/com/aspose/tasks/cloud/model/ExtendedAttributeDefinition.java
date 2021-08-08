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
import com.aspose.tasks.cloud.model.CalculationType;
import com.aspose.tasks.cloud.model.CustomFieldType;
import com.aspose.tasks.cloud.model.ElementType;
import com.aspose.tasks.cloud.model.RollupType;
import com.aspose.tasks.cloud.model.Value;
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
 * Extended attribute definition&#39;s brief into.
 */
@ApiModel(description = "Extended attribute definition's brief into.")

public class ExtendedAttributeDefinition {
  @SerializedName("FieldId")
  private String fieldId = null;

  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("CfType")
  private CustomFieldType cfType = null;

  @SerializedName("Guid")
  private String guid = null;

  @SerializedName("ElementType")
  private ElementType elementType = null;

  @SerializedName("MaxMultiValues")
  private Integer maxMultiValues = null;

  @SerializedName("UserDef")
  private Boolean userDef = null;

  @SerializedName("Alias")
  private String alias = null;

  @SerializedName("SecondaryPid")
  private String secondaryPid = null;

  @SerializedName("AutoRollDown")
  private Boolean autoRollDown = null;

  @SerializedName("DefaultGuid")
  private String defaultGuid = null;

  @SerializedName("LookupUid")
  private String lookupUid = null;

  @SerializedName("PhoneticsAlias")
  private String phoneticsAlias = null;

  @SerializedName("RollupType")
  private RollupType rollupType = null;

  @SerializedName("CalculationType")
  private CalculationType calculationType = null;

  @SerializedName("Formula")
  private String formula = null;

  @SerializedName("RestrictValues")
  private Boolean restrictValues = null;

  @SerializedName("ValuelistSortOrder")
  private Integer valuelistSortOrder = null;

  @SerializedName("AppendNewValues")
  private Boolean appendNewValues = null;

  @SerializedName("Default")
  private String _default = null;

  @SerializedName("ValueList")
  private List<Value> valueList = null;

  @SerializedName("SecondaryGuid")
  private String secondaryGuid = null;

  public ExtendedAttributeDefinition fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Corresponds to the Pid of a custom field.
   * @return fieldId
  **/
  @ApiModelProperty(value = "Corresponds to the Pid of a custom field.")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public ExtendedAttributeDefinition fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * The name of a custom field.
   * @return fieldName
  **/
  @ApiModelProperty(value = "The name of a custom field.")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public ExtendedAttributeDefinition cfType(CustomFieldType cfType) {
    this.cfType = cfType;
    return this;
  }

   /**
   * The type of a custom field.
   * @return cfType
  **/
  @ApiModelProperty(required = true, value = "The type of a custom field.")
  public CustomFieldType getCfType() {
    return cfType;
  }

  public void setCfType(CustomFieldType cfType) {
    this.cfType = cfType;
  }

  public ExtendedAttributeDefinition guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * The Guid of a custom field.
   * @return guid
  **/
  @ApiModelProperty(value = "The Guid of a custom field.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public ExtendedAttributeDefinition elementType(ElementType elementType) {
    this.elementType = elementType;
    return this;
  }

   /**
   * Determines whether the extended attribute is associated with a task or a resource
   * @return elementType
  **/
  @ApiModelProperty(required = true, value = "Determines whether the extended attribute is associated with a task or a resource")
  public ElementType getElementType() {
    return elementType;
  }

  public void setElementType(ElementType elementType) {
    this.elementType = elementType;
  }

  public ExtendedAttributeDefinition maxMultiValues(Integer maxMultiValues) {
    this.maxMultiValues = maxMultiValues;
    return this;
  }

   /**
   * The maximum number of values you can set in a picklist.
   * @return maxMultiValues
  **/
  @ApiModelProperty(required = true, value = "The maximum number of values you can set in a picklist.")
  public Integer getMaxMultiValues() {
    return maxMultiValues;
  }

  public void setMaxMultiValues(Integer maxMultiValues) {
    this.maxMultiValues = maxMultiValues;
  }

  public ExtendedAttributeDefinition userDef(Boolean userDef) {
    this.userDef = userDef;
    return this;
  }

   /**
   * Determines whether a custom field is user defined.
   * @return userDef
  **/
  @ApiModelProperty(required = true, value = "Determines whether a custom field is user defined.")
  public Boolean isUserDef() {
    return userDef;
  }

  public void setUserDef(Boolean userDef) {
    this.userDef = userDef;
  }

  public ExtendedAttributeDefinition alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * The alias of a custom field.
   * @return alias
  **/
  @ApiModelProperty(value = "The alias of a custom field.")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ExtendedAttributeDefinition secondaryPid(String secondaryPid) {
    this.secondaryPid = secondaryPid;
    return this;
  }

   /**
   * The secondary Pid of a custom field.
   * @return secondaryPid
  **/
  @ApiModelProperty(value = "The secondary Pid of a custom field.")
  public String getSecondaryPid() {
    return secondaryPid;
  }

  public void setSecondaryPid(String secondaryPid) {
    this.secondaryPid = secondaryPid;
  }

  public ExtendedAttributeDefinition autoRollDown(Boolean autoRollDown) {
    this.autoRollDown = autoRollDown;
    return this;
  }

   /**
   * Determines whether an automatic rolldown to assignments is enabled.
   * @return autoRollDown
  **/
  @ApiModelProperty(required = true, value = "Determines whether an automatic rolldown to assignments is enabled.")
  public Boolean isAutoRollDown() {
    return autoRollDown;
  }

  public void setAutoRollDown(Boolean autoRollDown) {
    this.autoRollDown = autoRollDown;
  }

  public ExtendedAttributeDefinition defaultGuid(String defaultGuid) {
    this.defaultGuid = defaultGuid;
    return this;
  }

   /**
   * The Guid of the default lookup table entry.
   * @return defaultGuid
  **/
  @ApiModelProperty(value = "The Guid of the default lookup table entry.")
  public String getDefaultGuid() {
    return defaultGuid;
  }

  public void setDefaultGuid(String defaultGuid) {
    this.defaultGuid = defaultGuid;
  }

  public ExtendedAttributeDefinition lookupUid(String lookupUid) {
    this.lookupUid = lookupUid;
    return this;
  }

   /**
   * The Guid of the lookup table associated with a custom field.
   * @return lookupUid
  **/
  @ApiModelProperty(value = "The Guid of the lookup table associated with a custom field.")
  public String getLookupUid() {
    return lookupUid;
  }

  public void setLookupUid(String lookupUid) {
    this.lookupUid = lookupUid;
  }

  public ExtendedAttributeDefinition phoneticsAlias(String phoneticsAlias) {
    this.phoneticsAlias = phoneticsAlias;
    return this;
  }

   /**
   * The phonetic pronunciation of the alias of a custom field.
   * @return phoneticsAlias
  **/
  @ApiModelProperty(value = "The phonetic pronunciation of the alias of a custom field.")
  public String getPhoneticsAlias() {
    return phoneticsAlias;
  }

  public void setPhoneticsAlias(String phoneticsAlias) {
    this.phoneticsAlias = phoneticsAlias;
  }

  public ExtendedAttributeDefinition rollupType(RollupType rollupType) {
    this.rollupType = rollupType;
    return this;
  }

   /**
   * The way rollups are calculated.
   * @return rollupType
  **/
  @ApiModelProperty(required = true, value = "The way rollups are calculated.")
  public RollupType getRollupType() {
    return rollupType;
  }

  public void setRollupType(RollupType rollupType) {
    this.rollupType = rollupType;
  }

  public ExtendedAttributeDefinition calculationType(CalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

   /**
   * Determines whether rollups are calculated for a task and group summary rows.
   * @return calculationType
  **/
  @ApiModelProperty(required = true, value = "Determines whether rollups are calculated for a task and group summary rows.")
  public CalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(CalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public ExtendedAttributeDefinition formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * The formula that Microsoft Project uses to populate a custom task field.
   * @return formula
  **/
  @ApiModelProperty(value = "The formula that Microsoft Project uses to populate a custom task field.")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public ExtendedAttributeDefinition restrictValues(Boolean restrictValues) {
    this.restrictValues = restrictValues;
    return this;
  }

   /**
   * Determines whether only values in the list are allowed in a file.
   * @return restrictValues
  **/
  @ApiModelProperty(required = true, value = "Determines whether only values in the list are allowed in a file.")
  public Boolean isRestrictValues() {
    return restrictValues;
  }

  public void setRestrictValues(Boolean restrictValues) {
    this.restrictValues = restrictValues;
  }

  public ExtendedAttributeDefinition valuelistSortOrder(Integer valuelistSortOrder) {
    this.valuelistSortOrder = valuelistSortOrder;
    return this;
  }

   /**
   * The way value lists are sorted. Values are: 0&#x3D;Descending, 1&#x3D;Ascending.
   * @return valuelistSortOrder
  **/
  @ApiModelProperty(required = true, value = "The way value lists are sorted. Values are: 0=Descending, 1=Ascending.")
  public Integer getValuelistSortOrder() {
    return valuelistSortOrder;
  }

  public void setValuelistSortOrder(Integer valuelistSortOrder) {
    this.valuelistSortOrder = valuelistSortOrder;
  }

  public ExtendedAttributeDefinition appendNewValues(Boolean appendNewValues) {
    this.appendNewValues = appendNewValues;
    return this;
  }

   /**
   * Determines whether new values added to a project are automatically added to the list.
   * @return appendNewValues
  **/
  @ApiModelProperty(required = true, value = "Determines whether new values added to a project are automatically added to the list.")
  public Boolean isAppendNewValues() {
    return appendNewValues;
  }

  public void setAppendNewValues(Boolean appendNewValues) {
    this.appendNewValues = appendNewValues;
  }

  public ExtendedAttributeDefinition _default(String _default) {
    this._default = _default;
    return this;
  }

   /**
   * The default value in the list.
   * @return _default
  **/
  @ApiModelProperty(value = "The default value in the list.")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public ExtendedAttributeDefinition valueList(List<Value> valueList) {
    this.valueList = valueList;
    return this;
  }

  public ExtendedAttributeDefinition addValueListItem(Value valueListItem) {
    if (this.valueList == null) {
      this.valueList = new ArrayList<Value>();
    }
    this.valueList.add(valueListItem);
    return this;
  }

   /**
   * Returns list of Extended Attribute Values.
   * @return valueList
  **/
  @ApiModelProperty(value = "Returns list of Extended Attribute Values.")
  public List<Value> getValueList() {
    return valueList;
  }

  public void setValueList(List<Value> valueList) {
    this.valueList = valueList;
  }

  public ExtendedAttributeDefinition secondaryGuid(String secondaryGuid) {
    this.secondaryGuid = secondaryGuid;
    return this;
  }

   /**
   * Secondary guid of extended attribute.
   * @return secondaryGuid
  **/
  @ApiModelProperty(value = "Secondary guid of extended attribute.")
  public String getSecondaryGuid() {
    return secondaryGuid;
  }

  public void setSecondaryGuid(String secondaryGuid) {
    this.secondaryGuid = secondaryGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedAttributeDefinition extendedAttributeDefinition = (ExtendedAttributeDefinition) o;
    return Objects.equals(this.fieldId, extendedAttributeDefinition.fieldId) &&
        Objects.equals(this.fieldName, extendedAttributeDefinition.fieldName) &&
        Objects.equals(this.cfType, extendedAttributeDefinition.cfType) &&
        Objects.equals(this.guid, extendedAttributeDefinition.guid) &&
        Objects.equals(this.elementType, extendedAttributeDefinition.elementType) &&
        Objects.equals(this.maxMultiValues, extendedAttributeDefinition.maxMultiValues) &&
        Objects.equals(this.userDef, extendedAttributeDefinition.userDef) &&
        Objects.equals(this.alias, extendedAttributeDefinition.alias) &&
        Objects.equals(this.secondaryPid, extendedAttributeDefinition.secondaryPid) &&
        Objects.equals(this.autoRollDown, extendedAttributeDefinition.autoRollDown) &&
        Objects.equals(this.defaultGuid, extendedAttributeDefinition.defaultGuid) &&
        Objects.equals(this.lookupUid, extendedAttributeDefinition.lookupUid) &&
        Objects.equals(this.phoneticsAlias, extendedAttributeDefinition.phoneticsAlias) &&
        Objects.equals(this.rollupType, extendedAttributeDefinition.rollupType) &&
        Objects.equals(this.calculationType, extendedAttributeDefinition.calculationType) &&
        Objects.equals(this.formula, extendedAttributeDefinition.formula) &&
        Objects.equals(this.restrictValues, extendedAttributeDefinition.restrictValues) &&
        Objects.equals(this.valuelistSortOrder, extendedAttributeDefinition.valuelistSortOrder) &&
        Objects.equals(this.appendNewValues, extendedAttributeDefinition.appendNewValues) &&
        Objects.equals(this._default, extendedAttributeDefinition._default) &&
        Objects.equals(this.valueList, extendedAttributeDefinition.valueList) &&
        Objects.equals(this.secondaryGuid, extendedAttributeDefinition.secondaryGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, fieldName, cfType, guid, elementType, maxMultiValues, userDef, alias, secondaryPid, autoRollDown, defaultGuid, lookupUid, phoneticsAlias, rollupType, calculationType, formula, restrictValues, valuelistSortOrder, appendNewValues, _default, valueList, secondaryGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedAttributeDefinition {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    cfType: ").append(toIndentedString(cfType)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    maxMultiValues: ").append(toIndentedString(maxMultiValues)).append("\n");
    sb.append("    userDef: ").append(toIndentedString(userDef)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    secondaryPid: ").append(toIndentedString(secondaryPid)).append("\n");
    sb.append("    autoRollDown: ").append(toIndentedString(autoRollDown)).append("\n");
    sb.append("    defaultGuid: ").append(toIndentedString(defaultGuid)).append("\n");
    sb.append("    lookupUid: ").append(toIndentedString(lookupUid)).append("\n");
    sb.append("    phoneticsAlias: ").append(toIndentedString(phoneticsAlias)).append("\n");
    sb.append("    rollupType: ").append(toIndentedString(rollupType)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    restrictValues: ").append(toIndentedString(restrictValues)).append("\n");
    sb.append("    valuelistSortOrder: ").append(toIndentedString(valuelistSortOrder)).append("\n");
    sb.append("    appendNewValues: ").append(toIndentedString(appendNewValues)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    valueList: ").append(toIndentedString(valueList)).append("\n");
    sb.append("    secondaryGuid: ").append(toIndentedString(secondaryGuid)).append("\n");
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

