/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetTaskTimephasedDataRequest.java">
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
 * Request model for getTaskTimephasedData operation.
 */
public class GetTaskTimephasedDataRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Uid of task to get timephased data for.
     */
    private Integer taskUid;

    /*
     * Type of timephased data to get.
     */
    private String type;

    /*
     * Start date.
     */
    private OffsetDateTime startDate;

    /*
     * End date.
     */
    private OffsetDateTime endDate;

    /*
     * The document folder.
     */
    private String folder;

    /*
     * The document storage.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the GetTaskTimephasedDataRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer taskUid Uid of task to get timephased data for.
     * @param String type Type of timephased data to get.
     * @param OffsetDateTime startDate Start date.
     * @param OffsetDateTime endDate End date.
     * @param String folder The document folder.
     * @param String storage The document storage.
     */
    public GetTaskTimephasedDataRequest(String name,  Integer taskUid,  String type,  OffsetDateTime startDate,  OffsetDateTime endDate,  String folder,  String storage) {
        this.name = name;
        this.taskUid = taskUid;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.folder = folder;
        this.storage = storage;
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
     *  Gets Uid of task to get timephased data for.
     */
    public Integer gettaskUid() {
        return taskUid;
    }

    /*
     * Sets Uid of task to get timephased data for.
     */
    public void settaskUid(Integer value) {
        taskUid = value;
    }

    /*
     *  Gets Type of timephased data to get.
     */
    public String gettype() {
        return type;
    }

    /*
     * Sets Type of timephased data to get.
     */
    public void settype(String value) {
        type = value;
    }

    /*
     *  Gets Start date.
     */
    public OffsetDateTime getstartDate() {
        return startDate;
    }

    /*
     * Sets Start date.
     */
    public void setstartDate(OffsetDateTime value) {
        startDate = value;
    }

    /*
     *  Gets End date.
     */
    public OffsetDateTime getendDate() {
        return endDate;
    }

    /*
     * Sets End date.
     */
    public void setendDate(OffsetDateTime value) {
        endDate = value;
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
}
