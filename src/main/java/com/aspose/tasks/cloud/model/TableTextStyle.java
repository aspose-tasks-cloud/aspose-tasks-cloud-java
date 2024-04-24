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
import com.aspose.tasks.cloud.model.BackgroundPattern;
import com.aspose.tasks.cloud.model.Colors;
import com.aspose.tasks.cloud.model.Field;
import com.aspose.tasks.cloud.model.TextItemType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a text style in a view table.
 */
@ApiModel(description = "Represents a text style in a view table.")

public class TableTextStyle {
  @SerializedName("RowUid")
  private Integer rowUid = null;

  @SerializedName("Field")
  private Field field = null;

  @SerializedName("ItemType")
  private TextItemType itemType = null;

  @SerializedName("Color")
  private Colors color = null;

  @SerializedName("BackgroundPattern")
  private BackgroundPattern backgroundPattern = null;

  @SerializedName("BackgroundColor")
  private Colors backgroundColor = null;

  public TableTextStyle rowUid(Integer rowUid) {
    this.rowUid = rowUid;
    return this;
  }

   /**
   * Gets a row unique id. Return -1 if the style is to be applied to all rows of a view.
   * @return rowUid
  **/
  @ApiModelProperty(required = true, value = "Gets a row unique id. Return -1 if the style is to be applied to all rows of a view.")
  public Integer getRowUid() {
    return rowUid;
  }

  public void setRowUid(Integer rowUid) {
    this.rowUid = rowUid;
  }

  public TableTextStyle field(Field field) {
    this.field = field;
    return this;
  }

   /**
   * Gets or sets a field the style is to be applied to.
   * @return field
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a field the style is to be applied to.")
  public Field getField() {
    return field;
  }

  public void setField(Field field) {
    this.field = field;
  }

  public TableTextStyle itemType(TextItemType itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Returns a value of the TextItemType enum.
   * @return itemType
  **/
  @ApiModelProperty(required = true, value = "Returns a value of the TextItemType enum.")
  public TextItemType getItemType() {
    return itemType;
  }

  public void setItemType(TextItemType itemType) {
    this.itemType = itemType;
  }

  public TableTextStyle color(Colors color) {
    this.color = color;
    return this;
  }

   /**
   * Gets or sets color of the text.
   * @return color
  **/
  @ApiModelProperty(required = true, value = "Gets or sets color of the text.")
  public Colors getColor() {
    return color;
  }

  public void setColor(Colors color) {
    this.color = color;
  }

  public TableTextStyle backgroundPattern(BackgroundPattern backgroundPattern) {
    this.backgroundPattern = backgroundPattern;
    return this;
  }

   /**
   * Gets or sets background pattern of the text style.
   * @return backgroundPattern
  **/
  @ApiModelProperty(required = true, value = "Gets or sets background pattern of the text style.")
  public BackgroundPattern getBackgroundPattern() {
    return backgroundPattern;
  }

  public void setBackgroundPattern(BackgroundPattern backgroundPattern) {
    this.backgroundPattern = backgroundPattern;
  }

  public TableTextStyle backgroundColor(Colors backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets background color of the text style.
   * @return backgroundColor
  **/
  @ApiModelProperty(required = true, value = "Gets or sets background color of the text style.")
  public Colors getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Colors backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableTextStyle tableTextStyle = (TableTextStyle) o;
    return Objects.equals(this.rowUid, tableTextStyle.rowUid) &&
        Objects.equals(this.field, tableTextStyle.field) &&
        Objects.equals(this.itemType, tableTextStyle.itemType) &&
        Objects.equals(this.color, tableTextStyle.color) &&
        Objects.equals(this.backgroundPattern, tableTextStyle.backgroundPattern) &&
        Objects.equals(this.backgroundColor, tableTextStyle.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowUid, field, itemType, color, backgroundPattern, backgroundColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableTextStyle {\n");
    
    sb.append("    rowUid: ").append(toIndentedString(rowUid)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    backgroundPattern: ").append(toIndentedString(backgroundPattern)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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

