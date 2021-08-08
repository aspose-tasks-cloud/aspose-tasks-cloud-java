/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutTaskRecurringInfoRequest.java">
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
 * Request model for putTaskRecurringInfo operation.
 */
public class PutTaskRecurringInfoRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Task Uid.
     */
    private Integer taskUid;

    /*
     * A modified DTO of task's recurring info.
     */
    private RecurringInfo recurringInfo;

    /*
     * File name to save changes to.
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
     * Initializes a new instance of the PutTaskRecurringInfoRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer taskUid Task Uid.
     * @param RecurringInfo recurringInfo A modified DTO of task's recurring info.
     * @param String fileName File name to save changes to.
     * @param String storage The document storage.
     * @param String folder The document folder.
     */
    public PutTaskRecurringInfoRequest(String name,  Integer taskUid,  RecurringInfo recurringInfo,  String fileName,  String storage,  String folder) {
        this.name = name;
        this.taskUid = taskUid;
        this.recurringInfo = recurringInfo;
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
     *  Gets Task Uid.
     */
    public Integer gettaskUid() {
        return taskUid;
    }

    /*
     * Sets Task Uid.
     */
    public void settaskUid(Integer value) {
        taskUid = value;
    }

    /*
     *  Gets A modified DTO of task's recurring info.
     */
    public RecurringInfo getrecurringInfo() {
        return recurringInfo;
    }

    /*
     * Sets A modified DTO of task's recurring info.
     */
    public void setrecurringInfo(RecurringInfo value) {
        recurringInfo = value;
    }

    /*
     *  Gets File name to save changes to.
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets File name to save changes to.
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
