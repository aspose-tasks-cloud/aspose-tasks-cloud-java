/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostTaskRecurringInfoRequest.java">
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
 * Request model for postTaskRecurringInfo operation.
 */
public class PostTaskRecurringInfoRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * The Uid of parent task for the created recurring task
     */
    private Integer parentTaskUid;

    /*
     * Name of the task to create.
     */
    private String taskName;

    /*
     * DTO which defines task's recurring info.
     */
    private RecurringInfo recurringInfo;

    /*
     * Name of the project's calendar to use for recurring task's scheduling.
     */
    private String calendarName;

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
     * Initializes a new instance of the PostTaskRecurringInfoRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer parentTaskUid The Uid of parent task for the created recurring task
     * @param String taskName Name of the task to create.
     * @param RecurringInfo recurringInfo DTO which defines task's recurring info.
     * @param String calendarName Name of the project's calendar to use for recurring task's scheduling.
     * @param String fileName File name to save changes to.
     * @param String storage The document storage.
     * @param String folder The document folder.
     */
    public PostTaskRecurringInfoRequest(String name,  Integer parentTaskUid,  String taskName,  RecurringInfo recurringInfo,  String calendarName,  String fileName,  String storage,  String folder) {
        this.name = name;
        this.parentTaskUid = parentTaskUid;
        this.taskName = taskName;
        this.recurringInfo = recurringInfo;
        this.calendarName = calendarName;
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
     *  Gets The Uid of parent task for the created recurring task
     */
    public Integer getparentTaskUid() {
        return parentTaskUid;
    }

    /*
     * Sets The Uid of parent task for the created recurring task
     */
    public void setparentTaskUid(Integer value) {
        parentTaskUid = value;
    }

    /*
     *  Gets Name of the task to create.
     */
    public String gettaskName() {
        return taskName;
    }

    /*
     * Sets Name of the task to create.
     */
    public void settaskName(String value) {
        taskName = value;
    }

    /*
     *  Gets DTO which defines task's recurring info.
     */
    public RecurringInfo getrecurringInfo() {
        return recurringInfo;
    }

    /*
     * Sets DTO which defines task's recurring info.
     */
    public void setrecurringInfo(RecurringInfo value) {
        recurringInfo = value;
    }

    /*
     *  Gets Name of the project's calendar to use for recurring task's scheduling.
     */
    public String getcalendarName() {
        return calendarName;
    }

    /*
     * Sets Name of the project's calendar to use for recurring task's scheduling.
     */
    public void setcalendarName(String value) {
        calendarName = value;
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
