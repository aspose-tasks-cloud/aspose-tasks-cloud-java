/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutRecalculateProjectRequest.java">
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
 * Request model for putRecalculateProject operation.
 */
public class PutRecalculateProjectRequest {

    /*
     * The filename
     */
    private String name;

    /*
     * Project's calculation mode
     */
    private String mode;

    /*
     * If true the validation of recalculation will be performed. What data is validated:     At the moment only basic validation of task and task link date ranges is implemented.     Task's date ranges (e.g. ActualStart - ActualFinish, EarlyStart - EarlyFinish, etc.) as well as Task Links dates will be checked against the date criteria that start date is less or equal than finish date.
     */
    private Boolean validate;

    /*
     * The filename to save the changes
     */
    private String fileName;

    /*
     * The document storage
     */
    private String storage;

    /*
     * The document folder
     */
    private String folder;
    
    /*
     * Initializes a new instance of the PutRecalculateProjectRequest class.
     *  
     * @param String name The filename
     * @param String mode Project's calculation mode
     * @param Boolean validate If true the validation of recalculation will be performed. What data is validated:     At the moment only basic validation of task and task link date ranges is implemented.     Task's date ranges (e.g. ActualStart - ActualFinish, EarlyStart - EarlyFinish, etc.) as well as Task Links dates will be checked against the date criteria that start date is less or equal than finish date.
     * @param String fileName The filename to save the changes
     * @param String storage The document storage
     * @param String folder The document folder
     */
    public PutRecalculateProjectRequest(String name,  String mode,  Boolean validate,  String fileName,  String storage,  String folder) {
        this.name = name;
        this.mode = mode;
        this.validate = validate;
        this.fileName = fileName;
        this.storage = storage;
        this.folder = folder;
    }

    /*
     *  Gets The filename
     */
    public String getname() {
        return name;
    }

    /*
     * Sets The filename
     */
    public void setname(String value) {
        name = value;
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
     *  Gets If true the validation of recalculation will be performed. What data is validated:     At the moment only basic validation of task and task link date ranges is implemented.     Task's date ranges (e.g. ActualStart - ActualFinish, EarlyStart - EarlyFinish, etc.) as well as Task Links dates will be checked against the date criteria that start date is less or equal than finish date.
     */
    public Boolean getvalidate() {
        return validate;
    }

    /*
     * Sets If true the validation of recalculation will be performed. What data is validated:     At the moment only basic validation of task and task link date ranges is implemented.     Task's date ranges (e.g. ActualStart - ActualFinish, EarlyStart - EarlyFinish, etc.) as well as Task Links dates will be checked against the date criteria that start date is less or equal than finish date.
     */
    public void setvalidate(Boolean value) {
        validate = value;
    }

    /*
     *  Gets The filename to save the changes
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets The filename to save the changes
     */
    public void setfileName(String value) {
        fileName = value;
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
}
