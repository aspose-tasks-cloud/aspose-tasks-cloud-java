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
import com.aspose.tasks.cloud.model.CustomFieldType;
import com.aspose.tasks.cloud.model.Duration;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents extended attribute.
 */
@ApiModel(description = "Represents extended attribute.")

public class ExtendedAttribute {
  @SerializedName("FieldId")
  private String fieldId = null;

  @SerializedName("AttributeType")
  private CustomFieldType attributeType = null;

  @SerializedName("ValueGuid")
  private String valueGuid = null;

  @SerializedName("LookupValueId")
  private Integer lookupValueId = null;

  @SerializedName("DurationValue")
  private Duration durationValue = null;

  @SerializedName("NumericValue")
  private BigDecimal numericValue = null;

  @SerializedName("DateValue")
  private OffsetDateTime dateValue = null;

  @SerializedName("FlagValue")
  private Boolean flagValue = null;

  @SerializedName("TextValue")
  private String textValue = null;

  @SerializedName("IsErrorValue")
  private Boolean isErrorValue = null;

  public ExtendedAttribute fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Gets or sets the id of a field.
   * @return fieldId
  **/
  @ApiModelProperty(value = "Gets or sets the id of a field.")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public ExtendedAttribute attributeType(CustomFieldType attributeType) {
    this.attributeType = attributeType;
    return this;
  }

   /**
   * Gets the type of a custom field.
   * @return attributeType
  **/
  @ApiModelProperty(required = true, value = "Gets the type of a custom field.")
  public CustomFieldType getAttributeType() {
    return attributeType;
  }

  public void setAttributeType(CustomFieldType attributeType) {
    this.attributeType = attributeType;
  }

  public ExtendedAttribute valueGuid(String valueGuid) {
    this.valueGuid = valueGuid;
    return this;
  }

   /**
   * Gets or sets the guid of a value.
   * @return valueGuid
  **/
  @ApiModelProperty(value = "Gets or sets the guid of a value.")
  public String getValueGuid() {
    return valueGuid;
  }

  public void setValueGuid(String valueGuid) {
    this.valueGuid = valueGuid;
  }

  public ExtendedAttribute lookupValueId(Integer lookupValueId) {
    this.lookupValueId = lookupValueId;
    return this;
  }

   /**
   * Gets or sets Id of the lookup value (if value is lookup value)
   * @return lookupValueId
  **/
  @ApiModelProperty(value = "Gets or sets Id of the lookup value (if value is lookup value)")
  public Integer getLookupValueId() {
    return lookupValueId;
  }

  public void setLookupValueId(Integer lookupValueId) {
    this.lookupValueId = lookupValueId;
  }

  public ExtendedAttribute durationValue(Duration durationValue) {
    this.durationValue = durationValue;
    return this;
  }

   /**
   * Gets or sets value for attributes with &#39;Duration&#39; type.
   * @return durationValue
  **/
  @ApiModelProperty(value = "Gets or sets value for attributes with 'Duration' type.")
  public Duration getDurationValue() {
    return durationValue;
  }

  public void setDurationValue(Duration durationValue) {
    this.durationValue = durationValue;
  }

  public ExtendedAttribute numericValue(BigDecimal numericValue) {
    this.numericValue = numericValue;
    return this;
  }

   /**
   * Gets or sets a value for attributes with numeric types (Cost, Number).
   * @return numericValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value for attributes with numeric types (Cost, Number).")
  public BigDecimal getNumericValue() {
    return numericValue;
  }

  public void setNumericValue(BigDecimal numericValue) {
    this.numericValue = numericValue;
  }

  public ExtendedAttribute dateValue(OffsetDateTime dateValue) {
    this.dateValue = dateValue;
    return this;
  }

   /**
   * Gets or sets a value for attributes with date types (Date, Start, Finish).
   * @return dateValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value for attributes with date types (Date, Start, Finish).")
  public OffsetDateTime getDateValue() {
    return dateValue;
  }

  public void setDateValue(OffsetDateTime dateValue) {
    this.dateValue = dateValue;
  }

  public ExtendedAttribute flagValue(Boolean flagValue) {
    this.flagValue = flagValue;
    return this;
  }

   /**
   * Gets or sets a value indicating whether a flag is set for an attribute with &#39;Flag&#39; type.
   * @return flagValue
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether a flag is set for an attribute with 'Flag' type.")
  public Boolean isFlagValue() {
    return flagValue;
  }

  public void setFlagValue(Boolean flagValue) {
    this.flagValue = flagValue;
  }

  public ExtendedAttribute textValue(String textValue) {
    this.textValue = textValue;
    return this;
  }

   /**
   * Gets or sets a value for attributes with &#39;Text&#39; type.
   * @return textValue
  **/
  @ApiModelProperty(value = "Gets or sets a value for attributes with 'Text' type.")
  public String getTextValue() {
    return textValue;
  }

  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }

  public ExtendedAttribute isErrorValue(Boolean isErrorValue) {
    this.isErrorValue = isErrorValue;
    return this;
  }

   /**
   * Gets whether calculation of extended attribute&#39;s value resulted in an error.             
   * @return isErrorValue
  **/
  @ApiModelProperty(required = true, value = "Gets whether calculation of extended attribute's value resulted in an error.             ")
  public Boolean isIsErrorValue() {
    return isErrorValue;
  }

  public void setIsErrorValue(Boolean isErrorValue) {
    this.isErrorValue = isErrorValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedAttribute extendedAttribute = (ExtendedAttribute) o;
    return Objects.equals(this.fieldId, extendedAttribute.fieldId) &&
        Objects.equals(this.attributeType, extendedAttribute.attributeType) &&
        Objects.equals(this.valueGuid, extendedAttribute.valueGuid) &&
        Objects.equals(this.lookupValueId, extendedAttribute.lookupValueId) &&
        Objects.equals(this.durationValue, extendedAttribute.durationValue) &&
        Objects.equals(this.numericValue, extendedAttribute.numericValue) &&
        Objects.equals(this.dateValue, extendedAttribute.dateValue) &&
        Objects.equals(this.flagValue, extendedAttribute.flagValue) &&
        Objects.equals(this.textValue, extendedAttribute.textValue) &&
        Objects.equals(this.isErrorValue, extendedAttribute.isErrorValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, attributeType, valueGuid, lookupValueId, durationValue, numericValue, dateValue, flagValue, textValue, isErrorValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedAttribute {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    valueGuid: ").append(toIndentedString(valueGuid)).append("\n");
    sb.append("    lookupValueId: ").append(toIndentedString(lookupValueId)).append("\n");
    sb.append("    durationValue: ").append(toIndentedString(durationValue)).append("\n");
    sb.append("    numericValue: ").append(toIndentedString(numericValue)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    flagValue: ").append(toIndentedString(flagValue)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    isErrorValue: ").append(toIndentedString(isErrorValue)).append("\n");
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

