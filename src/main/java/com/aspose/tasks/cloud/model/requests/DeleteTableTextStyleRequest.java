/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DeleteTableTextStyleRequest.java">
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
 * Request model for deleteTableTextStyle operation.
 */
public class DeleteTableTextStyleRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Uid of the view.
     */
    private Integer viewUid;

    /*
     * Uid of the row.
     */
    private Integer rowUid;

    /*
     * Specifies exact field of the row
     */
    private String field;

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
     * Initializes a new instance of the DeleteTableTextStyleRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer viewUid Uid of the view.
     * @param Integer rowUid Uid of the row.
     * @param String field Specifies exact field of the row
     * @param String fileName File name to save changes to.
     * @param String storage The document storage.
     * @param String folder The document folder.
     */
    public DeleteTableTextStyleRequest(String name,  Integer viewUid,  Integer rowUid,  String field,  String fileName,  String storage,  String folder) {
        this.name = name;
        this.viewUid = viewUid;
        this.rowUid = rowUid;
        this.field = field;
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
     *  Gets Uid of the view.
     */
    public Integer getviewUid() {
        return viewUid;
    }

    /*
     * Sets Uid of the view.
     */
    public void setviewUid(Integer value) {
        viewUid = value;
    }

    /*
     *  Gets Uid of the row.
     */
    public Integer getrowUid() {
        return rowUid;
    }

    /*
     * Sets Uid of the row.
     */
    public void setrowUid(Integer value) {
        rowUid = value;
    }

    /*
     *  Gets Specifies exact field of the row
     */
    public String getfield() {
        return field;
    }

    /*
     * Sets Specifies exact field of the row
     */
    public void setfield(String value) {
        field = value;
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
