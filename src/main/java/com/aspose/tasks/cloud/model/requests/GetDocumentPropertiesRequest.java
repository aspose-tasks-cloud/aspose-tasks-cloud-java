/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentPropertiesRequest.java">
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
 * Request model for getDocumentProperties operation.
 */
public class GetDocumentPropertiesRequest {

    /*
     * The document name.
     */
    private String name;

    /*
     * The document storage.
     */
    private String storage;

    /*
     * The document folder.
     */
    private String folder;
    
    /*
     * Initializes a new instance of the GetDocumentPropertiesRequest class.
     *  
     * @param String name The document name.
     * @param String storage The document storage.
     * @param String folder The document folder.
     */
    public GetDocumentPropertiesRequest(String name,  String storage,  String folder) {
        this.name = name;
        this.storage = storage;
        this.folder = folder;
    }

    /*
     *  Gets The document name.
     */
    public String getname() {
        return name;
    }

    /*
     * Sets The document name.
     */
    public void setname(String value) {
        name = value;
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
