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
import com.aspose.tasks.cloud.model.ItemType;
import com.aspose.tasks.cloud.model.ViewScreen;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a view in Project
 */
@ApiModel(description = "Represents a view in Project")

public class View {
  @SerializedName("ShowInMenu")
  private Boolean showInMenu = null;

  @SerializedName("Type")
  private ItemType type = null;

  @SerializedName("Screen")
  private ViewScreen screen = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Uid")
  private Integer uid = null;

  public View showInMenu(Boolean showInMenu) {
    this.showInMenu = showInMenu;
    return this;
  }

   /**
   * Gets or sets a value indicating whether Microsoft Project shows the single view  name in the View or the Other Views drop-down lists in the Ribbon
   * @return showInMenu
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether Microsoft Project shows the single view  name in the View or the Other Views drop-down lists in the Ribbon")
  public Boolean isShowInMenu() {
    return showInMenu;
  }

  public void setShowInMenu(Boolean showInMenu) {
    this.showInMenu = showInMenu;
  }

  public View type(ItemType type) {
    this.type = type;
    return this;
  }

   /**
   * Gets the type of item in the single view, such as tasks or resources. Read-only.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Gets the type of item in the single view, such as tasks or resources. Read-only.")
  public ItemType getType() {
    return type;
  }

  public void setType(ItemType type) {
    this.type = type;
  }

  public View screen(ViewScreen screen) {
    this.screen = screen;
    return this;
  }

   /**
   * Gets the screen type for the single view. Read-only.
   * @return screen
  **/
  @ApiModelProperty(required = true, value = "Gets the screen type for the single view. Read-only.")
  public ViewScreen getScreen() {
    return screen;
  }

  public void setScreen(ViewScreen screen) {
    this.screen = screen;
  }

  public View name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name of a view object.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name of a view object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public View uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Gets the unique identifier of a view.
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "Gets the unique identifier of a view.")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    View view = (View) o;
    return Objects.equals(this.showInMenu, view.showInMenu) &&
        Objects.equals(this.type, view.type) &&
        Objects.equals(this.screen, view.screen) &&
        Objects.equals(this.name, view.name) &&
        Objects.equals(this.uid, view.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showInMenu, type, screen, name, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    
    sb.append("    showInMenu: ").append(toIndentedString(showInMenu)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    screen: ").append(toIndentedString(screen)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

