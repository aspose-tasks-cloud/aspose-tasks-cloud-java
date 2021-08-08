/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutAssignmentRequest.java">
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
 * Request model for putAssignment operation.
 */
public class PutAssignmentRequest {

    /*
     * The file name
     */
    private String name;

    /*
     * Assignment UID
     */
    private Integer assignmentUid;

    /*
     * Assignment DTO
     */
    private ResourceAssignment assignment;

    /*
     * Project's calculation mode
     */
    private String mode;

    /*
     * boolean value
     */
    private Boolean recalculate;

    /*
     * The document storage
     */
    private String storage;

    /*
     * The document storage
     */
    private String folder;

    /*
     * The filename to save Changes
     */
    private String fileName;
    
    /*
     * Initializes a new instance of the PutAssignmentRequest class.
     *  
     * @param String name The file name
     * @param Integer assignmentUid Assignment UID
     * @param ResourceAssignment assignment Assignment DTO
     * @param String mode Project's calculation mode
     * @param Boolean recalculate boolean value
     * @param String storage The document storage
     * @param String folder The document storage
     * @param String fileName The filename to save Changes
     */
    public PutAssignmentRequest(String name,  Integer assignmentUid,  ResourceAssignment assignment,  String mode,  Boolean recalculate,  String storage,  String folder,  String fileName) {
        this.name = name;
        this.assignmentUid = assignmentUid;
        this.assignment = assignment;
        this.mode = mode;
        this.recalculate = recalculate;
        this.storage = storage;
        this.folder = folder;
        this.fileName = fileName;
    }

    /*
     *  Gets The file name
     */
    public String getname() {
        return name;
    }

    /*
     * Sets The file name
     */
    public void setname(String value) {
        name = value;
    }

    /*
     *  Gets Assignment UID
     */
    public Integer getassignmentUid() {
        return assignmentUid;
    }

    /*
     * Sets Assignment UID
     */
    public void setassignmentUid(Integer value) {
        assignmentUid = value;
    }

    /*
     *  Gets Assignment DTO
     */
    public ResourceAssignment getassignment() {
        return assignment;
    }

    /*
     * Sets Assignment DTO
     */
    public void setassignment(ResourceAssignment value) {
        assignment = value;
    }

    /*
     *  Gets Project's calculation mode
     */
    public String getmode() {
        return mode;
    }

    /*
     * Sets Project's calculation mode
     */
    public void setmode(String value) {
        mode = value;
    }

    /*
     *  Gets boolean value
     */
    public Boolean getrecalculate() {
        return recalculate;
    }

    /*
     * Sets boolean value
     */
    public void setrecalculate(Boolean value) {
        recalculate = value;
    }

    /*
     *  Gets The document storage
     */
    public String getstorage() {
        return storage;
    }

    /*
     * Sets The document storage
     */
    public void setstorage(String value) {
        storage = value;
    }

    /*
     *  Gets The document storage
     */
    public String getfolder() {
        return folder;
    }

    /*
     * Sets The document storage
     */
    public void setfolder(String value) {
        folder = value;
    }

    /*
     *  Gets The filename to save Changes
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets The filename to save Changes
     */
    public void setfileName(String value) {
        fileName = value;
    }
}
