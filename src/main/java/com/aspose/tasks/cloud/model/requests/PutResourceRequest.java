/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutResourceRequest.java">
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
 * Request model for putResource operation.
 */
public class PutResourceRequest {

    /*
     * The file name
     */
    private String name;

    /*
     * The Uid of a resource
     */
    private Integer resourceUid;

    /*
     * The representation of the modified resource
     */
    private Resource resource;

    /*
     * The calculation mode of a project
     */
    private String mode;

    /*
     * Specifies whether the project's recalculation should be performed
     */
    private Boolean recalculate;

    /*
     * The document storage
     */
    private String storage;

    /*
     * The document storage
     */
    private String folder;

    /*
     * The filename to save Changes
     */
    private String fileName;
    
    /*
     * Initializes a new instance of the PutResourceRequest class.
     *  
     * @param String name The file name
     * @param Integer resourceUid The Uid of a resource
     * @param Resource resource The representation of the modified resource
     * @param String mode The calculation mode of a project
     * @param Boolean recalculate Specifies whether the project's recalculation should be performed
     * @param String storage The document storage
     * @param String folder The document storage
     * @param String fileName The filename to save Changes
     */
    public PutResourceRequest(String name,  Integer resourceUid,  Resource resource,  String mode,  Boolean recalculate,  String storage,  String folder,  String fileName) {
        this.name = name;
        this.resourceUid = resourceUid;
        this.resource = resource;
        this.mode = mode;
        this.recalculate = recalculate;
        this.storage = storage;
        this.folder = folder;
        this.fileName = fileName;
    }

    /*
     *  Gets The file name
     */
    public String getname() {
        return name;
    }

    /*
     * Sets The file name
     */
    public void setname(String value) {
        name = value;
    }

    /*
     *  Gets The Uid of a resource
     */
    public Integer getresourceUid() {
        return resourceUid;
    }

    /*
     * Sets The Uid of a resource
     */
    public void setresourceUid(Integer value) {
        resourceUid = value;
    }

    /*
     *  Gets The representation of the modified resource
     */
    public Resource getresource() {
        return resource;
    }

    /*
     * Sets The representation of the modified resource
     */
    public void setresource(Resource value) {
        resource = value;
    }

    /*
     *  Gets The calculation mode of a project
     */
    public String getmode() {
        return mode;
    }

    /*
     * Sets The calculation mode of a project
     */
    public void setmode(String value) {
        mode = value;
    }

    /*
     *  Gets Specifies whether the project's recalculation should be performed
     */
    public Boolean getrecalculate() {
        return recalculate;
    }

    /*
     * Sets Specifies whether the project's recalculation should be performed
     */
    public void setrecalculate(Boolean value) {
        recalculate = value;
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
     *  Gets The document storage
     */
    public String getfolder() {
        return folder;
    }

    /*
     * Sets The document storage
     */
    public void setfolder(String value) {
        folder = value;
    }

    /*
     *  Gets The filename to save Changes
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets The filename to save Changes
     */
    public void setfileName(String value) {
        fileName = value;
    }
}
