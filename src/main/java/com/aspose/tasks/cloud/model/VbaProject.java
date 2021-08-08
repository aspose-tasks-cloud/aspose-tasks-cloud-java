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
import com.aspose.tasks.cloud.model.VbaModule;
import com.aspose.tasks.cloud.model.VbaReference;
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
 * Represents VbaProject
 */
@ApiModel(description = "Represents VbaProject")

public class VbaProject {
  @SerializedName("CompilationArguments")
  private String compilationArguments = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("HelpContextId")
  private Integer helpContextId = null;

  @SerializedName("HelpFile")
  private String helpFile = null;

  @SerializedName("Modules")
  private List<VbaModule> modules = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("References")
  private List<VbaReference> references = null;

  public VbaProject compilationArguments(String compilationArguments) {
    this.compilationArguments = compilationArguments;
    return this;
  }

   /**
   * Gets conditional Compilation Arguments
   * @return compilationArguments
  **/
  @ApiModelProperty(value = "Gets conditional Compilation Arguments")
  public String getCompilationArguments() {
    return compilationArguments;
  }

  public void setCompilationArguments(String compilationArguments) {
    this.compilationArguments = compilationArguments;
  }

  public VbaProject description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Gets a project Description
   * @return description
  **/
  @ApiModelProperty(value = "Gets a project Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VbaProject helpContextId(Integer helpContextId) {
    this.helpContextId = helpContextId;
    return this;
  }

   /**
   * Gets a project Help Context Id
   * @return helpContextId
  **/
  @ApiModelProperty(required = true, value = "Gets a project Help Context Id")
  public Integer getHelpContextId() {
    return helpContextId;
  }

  public void setHelpContextId(Integer helpContextId) {
    this.helpContextId = helpContextId;
  }

  public VbaProject helpFile(String helpFile) {
    this.helpFile = helpFile;
    return this;
  }

   /**
   * Gets a help file name
   * @return helpFile
  **/
  @ApiModelProperty(value = "Gets a help file name")
  public String getHelpFile() {
    return helpFile;
  }

  public void setHelpFile(String helpFile) {
    this.helpFile = helpFile;
  }

  public VbaProject modules(List<VbaModule> modules) {
    this.modules = modules;
    return this;
  }

  public VbaProject addModulesItem(VbaModule modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<VbaModule>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * Gets a collection of VbaModuleCollection
   * @return modules
  **/
  @ApiModelProperty(value = "Gets a collection of VbaModuleCollection")
  public List<VbaModule> getModules() {
    return modules;
  }

  public void setModules(List<VbaModule> modules) {
    this.modules = modules;
  }

  public VbaProject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets project name
   * @return name
  **/
  @ApiModelProperty(value = "Gets project name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VbaProject references(List<VbaReference> references) {
    this.references = references;
    return this;
  }

  public VbaProject addReferencesItem(VbaReference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<VbaReference>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * Gets a collection of VbaReferenceCollection
   * @return references
  **/
  @ApiModelProperty(value = "Gets a collection of VbaReferenceCollection")
  public List<VbaReference> getReferences() {
    return references;
  }

  public void setReferences(List<VbaReference> references) {
    this.references = references;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbaProject vbaProject = (VbaProject) o;
    return Objects.equals(this.compilationArguments, vbaProject.compilationArguments) &&
        Objects.equals(this.description, vbaProject.description) &&
        Objects.equals(this.helpContextId, vbaProject.helpContextId) &&
        Objects.equals(this.helpFile, vbaProject.helpFile) &&
        Objects.equals(this.modules, vbaProject.modules) &&
        Objects.equals(this.name, vbaProject.name) &&
        Objects.equals(this.references, vbaProject.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compilationArguments, description, helpContextId, helpFile, modules, name, references);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbaProject {\n");
    
    sb.append("    compilationArguments: ").append(toIndentedString(compilationArguments)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    helpContextId: ").append(toIndentedString(helpContextId)).append("\n");
    sb.append("    helpFile: ").append(toIndentedString(helpFile)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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

