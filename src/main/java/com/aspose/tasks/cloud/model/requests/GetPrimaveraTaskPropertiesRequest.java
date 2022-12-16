/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetPrimaveraTaskPropertiesRequest.java">
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
 * Request model for getPrimaveraTaskProperties operation.
 */
public class GetPrimaveraTaskPropertiesRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Uid of task to get primavera properties for.
     */
    private Integer taskUid;

    /*
     * The document folder.
     */
    private String folder;

    /*
     * The document storage.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the GetPrimaveraTaskPropertiesRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer taskUid Uid of task to get primavera properties for.
     * @param String folder The document folder.
     * @param String storage The document storage.
     */
    public GetPrimaveraTaskPropertiesRequest(String name,  Integer taskUid,  String folder,  String storage) {
        this.name = name;
        this.taskUid = taskUid;
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
     *  Gets Uid of task to get primavera properties for.
     */
    public Integer gettaskUid() {
        return taskUid;
    }

    /*
     * Sets Uid of task to get primavera properties for.
     */
    public void settaskUid(Integer value) {
        taskUid = value;
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
