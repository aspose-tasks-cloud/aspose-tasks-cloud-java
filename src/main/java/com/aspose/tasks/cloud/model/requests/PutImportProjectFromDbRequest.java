/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutImportProjectFromDbRequest.java">
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
 * Request model for putImportProjectFromDb operation.
 */
public class PutImportProjectFromDbRequest {

    /*
     * The type of source database. The supported values are (Msp, Mpd, Primavera).
     */
    private String databaseType;

    /*
     * The connection string to the source database.
     */
    private String connectionString;

    /*
     * Uid of the project to import.
     */
    private String projectUid;

    /*
     * The name of the resulting file.
     */
    private String filename;

    /*
     * Format of the resulting file.
     */
    private String format;

    /*
     * The document folder.
     */
    private String folder;

    /*
     * The document storage.
     */
    private String storage;

    /*
     * Schema of Microsoft project database (if applicable)
     */
    private String databaseSchema;
    
    /*
     * Initializes a new instance of the PutImportProjectFromDbRequest class.
     *  
     * @param String databaseType The type of source database. The supported values are (Msp, Mpd, Primavera).
     * @param String connectionString The connection string to the source database.
     * @param String projectUid Uid of the project to import.
     * @param String filename The name of the resulting file.
     * @param String format Format of the resulting file.
     * @param String folder The document folder.
     * @param String storage The document storage.
     * @param String databaseSchema Schema of Microsoft project database (if applicable)
     */
    public PutImportProjectFromDbRequest(String databaseType,  String connectionString,  String projectUid,  String filename,  String format,  String folder,  String storage,  String databaseSchema) {
        this.databaseType = databaseType;
        this.connectionString = connectionString;
        this.projectUid = projectUid;
        this.filename = filename;
        this.format = format;
        this.folder = folder;
        this.storage = storage;
        this.databaseSchema = databaseSchema;
    }

    /*
     *  Gets The type of source database. The supported values are (Msp, Mpd, Primavera).
     */
    public String getdatabaseType() {
        return databaseType;
    }

    /*
     * Sets The type of source database. The supported values are (Msp, Mpd, Primavera).
     */
    public void setdatabaseType(String value) {
        databaseType = value;
    }

    /*
     *  Gets The connection string to the source database.
     */
    public String getconnectionString() {
        return connectionString;
    }

    /*
     * Sets The connection string to the source database.
     */
    public void setconnectionString(String value) {
        connectionString = value;
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
     *  Gets Format of the resulting file.
     */
    public String getformat() {
        return format;
    }

    /*
     * Sets Format of the resulting file.
     */
    public void setformat(String value) {
        format = value;
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
     *  Gets Schema of Microsoft project database (if applicable)
     */
    public String getdatabaseSchema() {
        return databaseSchema;
    }

    /*
     * Sets Schema of Microsoft project database (if applicable)
     */
    public void setdatabaseSchema(String value) {
        databaseSchema = value;
    }
}
