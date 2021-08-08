/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetPageCountRequest.java">
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
 * Request model for getPageCount operation.
 */
public class GetPageCountRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * PageSize to get page count for.
     */
    private String pageSize;

    /*
     * PresentationFormat to get page count for.
     */
    private String presentationFormat;

    /*
     * Timescale to get page count for.
     */
    private String timescale;

    /*
     * Start date to get page count for.
     */
    private OffsetDateTime startDate;

    /*
     * End date to get page count for.
     */
    private OffsetDateTime endDate;

    /*
     * The document folder
     */
    private String folder;

    /*
     * The document storage.
     */
    private String storage;
    
    /*
     * Initializes a new instance of the GetPageCountRequest class.
     *  
     * @param String name The name of the file.
     * @param String pageSize PageSize to get page count for.
     * @param String presentationFormat PresentationFormat to get page count for.
     * @param String timescale Timescale to get page count for.
     * @param OffsetDateTime startDate Start date to get page count for.
     * @param OffsetDateTime endDate End date to get page count for.
     * @param String folder The document folder
     * @param String storage The document storage.
     */
    public GetPageCountRequest(String name,  String pageSize,  String presentationFormat,  String timescale,  OffsetDateTime startDate,  OffsetDateTime endDate,  String folder,  String storage) {
        this.name = name;
        this.pageSize = pageSize;
        this.presentationFormat = presentationFormat;
        this.timescale = timescale;
        this.startDate = startDate;
        this.endDate = endDate;
        this.folder = folder;
        this.storage = storage;
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
     *  Gets PageSize to get page count for.
     */
    public String getpageSize() {
        return pageSize;
    }

    /*
     * Sets PageSize to get page count for.
     */
    public void setpageSize(String value) {
        pageSize = value;
    }

    /*
     *  Gets PresentationFormat to get page count for.
     */
    public String getpresentationFormat() {
        return presentationFormat;
    }

    /*
     * Sets PresentationFormat to get page count for.
     */
    public void setpresentationFormat(String value) {
        presentationFormat = value;
    }

    /*
     *  Gets Timescale to get page count for.
     */
    public String gettimescale() {
        return timescale;
    }

    /*
     * Sets Timescale to get page count for.
     */
    public void settimescale(String value) {
        timescale = value;
    }

    /*
     *  Gets Start date to get page count for.
     */
    public OffsetDateTime getstartDate() {
        return startDate;
    }

    /*
     * Sets Start date to get page count for.
     */
    public void setstartDate(OffsetDateTime value) {
        startDate = value;
    }

    /*
     *  Gets End date to get page count for.
     */
    public OffsetDateTime getendDate() {
        return endDate;
    }

    /*
     * Sets End date to get page count for.
     */
    public void setendDate(OffsetDateTime value) {
        endDate = value;
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
}
