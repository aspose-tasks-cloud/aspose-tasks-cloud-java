/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutRecalculateProjectWorkAsCompleteRequest.java">
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
 * Request model for putRecalculateProjectWorkAsComplete operation.
 */
public class PutRecalculateProjectWorkAsCompleteRequest {

    /*
     * The filename
     */
    private String name;

    /*
     * DateTime (type from System lib)
     */
    private OffsetDateTime completeThrough;

    /*
     * boolean value
     */
    private Boolean setZeroOrHundredPercentCompleteOnly;

    /*
     * The document storage
     */
    private String storage;

    /*
     * The document folder
     */
    private String folder;

    /*
     * The filename to save the changes
     */
    private String fileName;
    
    /*
     * Initializes a new instance of the PutRecalculateProjectWorkAsCompleteRequest class.
     *  
     * @param String name The filename
     * @param OffsetDateTime completeThrough DateTime (type from System lib)
     * @param Boolean setZeroOrHundredPercentCompleteOnly boolean value
     * @param String storage The document storage
     * @param String folder The document folder
     * @param String fileName The filename to save the changes
     */
    public PutRecalculateProjectWorkAsCompleteRequest(String name,  OffsetDateTime completeThrough,  Boolean setZeroOrHundredPercentCompleteOnly,  String storage,  String folder,  String fileName) {
        this.name = name;
        this.completeThrough = completeThrough;
        this.setZeroOrHundredPercentCompleteOnly = setZeroOrHundredPercentCompleteOnly;
        this.storage = storage;
        this.folder = folder;
        this.fileName = fileName;
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
     *  Gets DateTime (type from System lib)
     */
    public OffsetDateTime getcompleteThrough() {
        return completeThrough;
    }

    /*
     * Sets DateTime (type from System lib)
     */
    public void setcompleteThrough(OffsetDateTime value) {
        completeThrough = value;
    }

    /*
     *  Gets boolean value
     */
    public Boolean getsetZeroOrHundredPercentCompleteOnly() {
        return setZeroOrHundredPercentCompleteOnly;
    }

    /*
     * Sets boolean value
     */
    public void setsetZeroOrHundredPercentCompleteOnly(Boolean value) {
        setZeroOrHundredPercentCompleteOnly = value;
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
}
