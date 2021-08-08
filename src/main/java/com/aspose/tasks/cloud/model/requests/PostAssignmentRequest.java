/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostAssignmentRequest.java">
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.tasks.cloud.model.requests;
import com.aspose.tasks.cloud.model.*;
import java.time.OffsetDateTime;
import java.math.BigDecimal;
import java.io.File;
import java.util.List;

/*
 * Request model for postAssignment operation.
 */
public class PostAssignmentRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * The unique id of the task to be assigned.
     */
    private Integer taskUid;

    /*
     * The unique id of the resource to be assigned.
     */
    private Integer resourceUid;

    /*
     * The units for the new assignment. If not specified, 'cost' value is used.
     */
    private Double units;

    /*
     * The cost for a new assignment. If not specified, default value is used.
     */
    private BigDecimal cost;

    /*
     * The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     */
    private String fileName;

    /*
     * The document storage.
     */
    private String storage;

    /*
     * The document folder.
     */
    private String folder;
    
    /*
     * Initializes a new instance of the PostAssignmentRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer taskUid The unique id of the task to be assigned.
     * @param Integer resourceUid The unique id of the resource to be assigned.
     * @param Double units The units for the new assignment. If not specified, 'cost' value is used.
     * @param BigDecimal cost The cost for a new assignment. If not specified, default value is used.
     * @param String fileName The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     * @param String storage The document storage.
     * @param String folder The document folder.
     */
    public PostAssignmentRequest(String name,  Integer taskUid,  Integer resourceUid,  Double units,  BigDecimal cost,  String fileName,  String storage,  String folder) {
        this.name = name;
        this.taskUid = taskUid;
        this.resourceUid = resourceUid;
        this.units = units;
        this.cost = cost;
        this.fileName = fileName;
        this.storage = storage;
        this.folder = folder;
    }

    /*
     *  Gets The name of the file.
     */
    public String getname() {
        return name;
    }

    /*
     * Sets The name of the file.
     */
    public void setname(String value) {
        name = value;
    }

    /*
     *  Gets The unique id of the task to be assigned.
     */
    public Integer gettaskUid() {
        return taskUid;
    }

    /*
     * Sets The unique id of the task to be assigned.
     */
    public void settaskUid(Integer value) {
        taskUid = value;
    }

    /*
     *  Gets The unique id of the resource to be assigned.
     */
    public Integer getresourceUid() {
        return resourceUid;
    }

    /*
     * Sets The unique id of the resource to be assigned.
     */
    public void setresourceUid(Integer value) {
        resourceUid = value;
    }

    /*
     *  Gets The units for the new assignment. If not specified, 'cost' value is used.
     */
    public Double getunits() {
        return units;
    }

    /*
     * Sets The units for the new assignment. If not specified, 'cost' value is used.
     */
    public void setunits(Double value) {
        units = value;
    }

    /*
     *  Gets The cost for a new assignment. If not specified, default value is used.
     */
    public BigDecimal getcost() {
        return cost;
    }

    /*
     * Sets The cost for a new assignment. If not specified, default value is used.
     */
    public void setcost(BigDecimal value) {
        cost = value;
    }

    /*
     *  Gets The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     */
    public void setfileName(String value) {
        fileName = value;
    }

    /*
     *  Gets The document storage.
     */
    public String getstorage() {
        return storage;
    }

    /*
     * Sets The document storage.
     */
    public void setstorage(String value) {
        storage = value;
    }

    /*
     *  Gets The document folder.
     */
    public String getfolder() {
        return folder;
    }

    /*
     * Sets The document folder.
     */
    public void setfolder(String value) {
        folder = value;
    }
}
