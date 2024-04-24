/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CreateTableTextStyleRequest.java">
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
 * Request model for createTableTextStyle operation.
 */
public class CreateTableTextStyleRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Uid of the view.
     */
    private Integer viewUid;

    /*
     * A DTO of TableTextStyle to create
     */
    private TableTextStyle tableTextStyle;

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
     * Initializes a new instance of the CreateTableTextStyleRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer viewUid Uid of the view.
     * @param TableTextStyle tableTextStyle A DTO of TableTextStyle to create
     * @param String fileName File name to save changes to.
     * @param String storage The document storage.
     * @param String folder The document folder.
     */
    public CreateTableTextStyleRequest(String name,  Integer viewUid,  TableTextStyle tableTextStyle,  String fileName,  String storage,  String folder) {
        this.name = name;
        this.viewUid = viewUid;
        this.tableTextStyle = tableTextStyle;
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
     *  Gets A DTO of TableTextStyle to create
     */
    public TableTextStyle gettableTextStyle() {
        return tableTextStyle;
    }

    /*
     * Sets A DTO of TableTextStyle to create
     */
    public void settableTextStyle(TableTextStyle value) {
        tableTextStyle = value;
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
