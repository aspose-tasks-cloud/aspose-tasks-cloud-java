/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutImportProjectFromFileRequest.java">
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
 * Request model for putImportProjectFromFile operation.
 */
public class PutImportProjectFromFileRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * Uid of the project to import.
     */
    private String projectUid;

    /*
     * The name of the resulting file.
     */
    private String filename;

    /*
     * The type of file to import. The supported values are (PrimaveraSqliteDb, PrimaveraXml).
     */
    private String fileType;

    /*
     * The document folder.
     */
    private String folder;

    /*
     * The document storage.
     */
    private String storage;

    /*
     * The format of the resulting file.
     */
    private String outputFileFormat;
    
    /*
     * Initializes a new instance of the PutImportProjectFromFileRequest class.
     *  
     * @param String name The name of the file.
     * @param String projectUid Uid of the project to import.
     * @param String filename The name of the resulting file.
     * @param String fileType The type of file to import. The supported values are (PrimaveraSqliteDb, PrimaveraXml).
     * @param String folder The document folder.
     * @param String storage The document storage.
     * @param String outputFileFormat The format of the resulting file.
     */
    public PutImportProjectFromFileRequest(String name,  String projectUid,  String filename,  String fileType,  String folder,  String storage,  String outputFileFormat) {
        this.name = name;
        this.projectUid = projectUid;
        this.filename = filename;
        this.fileType = fileType;
        this.folder = folder;
        this.storage = storage;
        this.outputFileFormat = outputFileFormat;
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
     *  Gets Uid of the project to import.
     */
    public String getprojectUid() {
        return projectUid;
    }

    /*
     * Sets Uid of the project to import.
     */
    public void setprojectUid(String value) {
        projectUid = value;
    }

    /*
     *  Gets The name of the resulting file.
     */
    public String getfilename() {
        return filename;
    }

    /*
     * Sets The name of the resulting file.
     */
    public void setfilename(String value) {
        filename = value;
    }

    /*
     *  Gets The type of file to import. The supported values are (PrimaveraSqliteDb, PrimaveraXml).
     */
    public String getfileType() {
        return fileType;
    }

    /*
     * Sets The type of file to import. The supported values are (PrimaveraSqliteDb, PrimaveraXml).
     */
    public void setfileType(String value) {
        fileType = value;
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

    /*
     *  Gets The format of the resulting file.
     */
    public String getoutputFileFormat() {
        return outputFileFormat;
    }

    /*
     * Sets The format of the resulting file.
     */
    public void setoutputFileFormat(String value) {
        outputFileFormat = value;
    }
}
