/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CopyFolderRequest.java">
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
 * Request model for copyFolder operation.
 */
public class CopyFolderRequest {

    /*
     * Source folder path e.g. '/src'
     */
    private String srcPath;

    /*
     * Destination folder path e.g. '/dst'
     */
    private String destPath;

    /*
     * Source storage name
     */
    private String srcStorageName;

    /*
     * Destination storage name
     */
    private String destStorageName;
    
    /*
     * Initializes a new instance of the CopyFolderRequest class.
     *  
     * @param String srcPath Source folder path e.g. '/src'
     * @param String destPath Destination folder path e.g. '/dst'
     * @param String srcStorageName Source storage name
     * @param String destStorageName Destination storage name
     */
    public CopyFolderRequest(String srcPath,  String destPath,  String srcStorageName,  String destStorageName) {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
    }

    /*
     *  Gets Source folder path e.g. '/src'
     */
    public String getsrcPath() {
        return srcPath;
    }

    /*
     * Sets Source folder path e.g. '/src'
     */
    public void setsrcPath(String value) {
        srcPath = value;
    }

    /*
     *  Gets Destination folder path e.g. '/dst'
     */
    public String getdestPath() {
        return destPath;
    }

    /*
     * Sets Destination folder path e.g. '/dst'
     */
    public void setdestPath(String value) {
        destPath = value;
    }

    /*
     *  Gets Source storage name
     */
    public String getsrcStorageName() {
        return srcStorageName;
    }

    /*
     * Sets Source storage name
     */
    public void setsrcStorageName(String value) {
        srcStorageName = value;
    }

    /*
     *  Gets Destination storage name
     */
    public String getdestStorageName() {
        return destStorageName;
    }

    /*
     * Sets Destination storage name
     */
    public void setdestStorageName(String value) {
        destStorageName = value;
    }
}
