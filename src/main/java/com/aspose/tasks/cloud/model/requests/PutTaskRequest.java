/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutTaskRequest.java">
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
 * Request model for putTask operation.
 */
public class PutTaskRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Task UID
     */
    private Integer taskUid;

    /*
     * TaskDTO
     */
    private Task task;

    /*
     * CalculationModeDTO
     */
    private String mode;

    /*
     * boolean value 
     */
    private Boolean recalculate;

    /*
     * The document strorage
     */
    private String storage;

    /*
     * The document folder
     */
    private String folder;

    /*
     * The name of the file to save changes
     */
    private String fileName;
    
    /*
     * Initializes a new instance of the PutTaskRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer taskUid Task UID
     * @param Task task TaskDTO
     * @param String mode CalculationModeDTO
     * @param Boolean recalculate boolean value 
     * @param String storage The document strorage
     * @param String folder The document folder
     * @param String fileName The name of the file to save changes
     */
    public PutTaskRequest(String name,  Integer taskUid,  Task task,  String mode,  Boolean recalculate,  String storage,  String folder,  String fileName) {
        this.name = name;
        this.taskUid = taskUid;
        this.task = task;
        this.mode = mode;
        this.recalculate = recalculate;
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
     *  Gets Task UID
     */
    public Integer gettaskUid() {
        return taskUid;
    }

    /*
     * Sets Task UID
     */
    public void settaskUid(Integer value) {
        taskUid = value;
    }

    /*
     *  Gets TaskDTO
     */
    public Task gettask() {
        return task;
    }

    /*
     * Sets TaskDTO
     */
    public void settask(Task value) {
        task = value;
    }

    /*
     *  Gets CalculationModeDTO
     */
    public String getmode() {
        return mode;
    }

    /*
     * Sets CalculationModeDTO
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
     *  Gets The document strorage
     */
    public String getstorage() {
        return storage;
    }

    /*
     * Sets The document strorage
     */
    public void setstorage(String value) {
        storage = value;
    }

    /*
     *  Gets The document folder
     */
    public String getfolder() {
        return folder;
    }

    /*
     * Sets The document folder
     */
    public void setfolder(String value) {
        folder = value;
    }

    /*
     *  Gets The name of the file to save changes
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets The name of the file to save changes
     */
    public void setfileName(String value) {
        fileName = value;
    }
}
