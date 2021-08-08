/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutTaskLinkRequest.java">
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
 * Request model for putTaskLink operation.
 */
public class PutTaskLinkRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Index of the task link object. See TaskLink.Index property.
     */
    private Integer index;

    /*
     * The representation of the modified TaskLink object.
     */
    private TaskLink taskLink;

    /*
     * The document storage.
     */
    private String storage;

    /*
     * The document folder.
     */
    private String folder;

    /*
     * The name of the project document to save changes to.  If this parameter is omitted then the changes will be saved to the source project document.
     */
    private String fileName;
    
    /*
     * Initializes a new instance of the PutTaskLinkRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer index Index of the task link object. See TaskLink.Index property.
     * @param TaskLink taskLink The representation of the modified TaskLink object.
     * @param String storage The document storage.
     * @param String folder The document folder.
     * @param String fileName The name of the project document to save changes to.  If this parameter is omitted then the changes will be saved to the source project document.
     */
    public PutTaskLinkRequest(String name,  Integer index,  TaskLink taskLink,  String storage,  String folder,  String fileName) {
        this.name = name;
        this.index = index;
        this.taskLink = taskLink;
        this.storage = storage;
        this.folder = folder;
        this.fileName = fileName;
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
     *  Gets Index of the task link object. See TaskLink.Index property.
     */
    public Integer getindex() {
        return index;
    }

    /*
     * Sets Index of the task link object. See TaskLink.Index property.
     */
    public void setindex(Integer value) {
        index = value;
    }

    /*
     *  Gets The representation of the modified TaskLink object.
     */
    public TaskLink gettaskLink() {
        return taskLink;
    }

    /*
     * Sets The representation of the modified TaskLink object.
     */
    public void settaskLink(TaskLink value) {
        taskLink = value;
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

    /*
     *  Gets The name of the project document to save changes to.  If this parameter is omitted then the changes will be saved to the source project document.
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets The name of the project document to save changes to.  If this parameter is omitted then the changes will be saved to the source project document.
     */
    public void setfileName(String value) {
        fileName = value;
    }
}
