/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostDocumentPropertyRequest.java">
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
 * Request model for postDocumentProperty operation.
 */
public class PostDocumentPropertyRequest {

    /*
     * The document name.
     */
    private String name;

    /*
     * The property name.
     */
    private String propertyName;

    /*
     * DocumentProperty with new property value.
     */
    private DocumentProperty property;

    /*
     * The document storage.
     */
    private String storage;

    /*
     * The document folder.
     */
    private String folder;

    /*
     * Name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     */
    private String filename;
    
    /*
     * Initializes a new instance of the PostDocumentPropertyRequest class.
     *  
     * @param String name The document name.
     * @param String propertyName The property name.
     * @param DocumentProperty property DocumentProperty with new property value.
     * @param String storage The document storage.
     * @param String folder The document folder.
     * @param String filename Name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     */
    public PostDocumentPropertyRequest(String name,  String propertyName,  DocumentProperty property,  String storage,  String folder,  String filename) {
        this.name = name;
        this.propertyName = propertyName;
        this.property = property;
        this.storage = storage;
        this.folder = folder;
        this.filename = filename;
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
     *  Gets The property name.
     */
    public String getpropertyName() {
        return propertyName;
    }

    /*
     * Sets The property name.
     */
    public void setpropertyName(String value) {
        propertyName = value;
    }

    /*
     *  Gets DocumentProperty with new property value.
     */
    public DocumentProperty getproperty() {
        return property;
    }

    /*
     * Sets DocumentProperty with new property value.
     */
    public void setproperty(DocumentProperty value) {
        property = value;
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

    /*
     *  Gets Name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     */
    public String getfilename() {
        return filename;
    }

    /*
     * Sets Name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
     */
    public void setfilename(String value) {
        filename = value;
    }
}
