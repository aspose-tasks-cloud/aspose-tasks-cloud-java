/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetProjectListRequest.java">
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
 * Request model for getProjectList operation.
 */
public class GetProjectListRequest {

    /*
     * The URL of PWA (Project Web Access) API of Project Online.
     */
    private String siteUrl;

    /*
     * The user name for the sharepoint site.
     */
    private String userName;

    /*
     * Authorization token (SPOIDCRL) for SharePoint's PWA (Project Web Access). For example, in c# it can be retrieved using SharePointOnlineCredentials class from Microsoft.SharePoint.Client.Runtime assembly
     */
    private String xProjectOnlineToken;

    /*
     * The password for the SharePoint site.
     */
    private String xSharepointPassword;
    
    /*
     * Initializes a new instance of the GetProjectListRequest class.
     *  
     * @param String siteUrl The URL of PWA (Project Web Access) API of Project Online.
     * @param String userName The user name for the sharepoint site.
     * @param String xProjectOnlineToken Authorization token (SPOIDCRL) for SharePoint's PWA (Project Web Access). For example, in c# it can be retrieved using SharePointOnlineCredentials class from Microsoft.SharePoint.Client.Runtime assembly
     * @param String xSharepointPassword The password for the SharePoint site.
     */
    public GetProjectListRequest(String siteUrl,  String userName,  String xProjectOnlineToken,  String xSharepointPassword) {
        this.siteUrl = siteUrl;
        this.userName = userName;
        this.xProjectOnlineToken = xProjectOnlineToken;
        this.xSharepointPassword = xSharepointPassword;
    }

    /*
     *  Gets The URL of PWA (Project Web Access) API of Project Online.
     */
    public String getsiteUrl() {
        return siteUrl;
    }

    /*
     * Sets The URL of PWA (Project Web Access) API of Project Online.
     */
    public void setsiteUrl(String value) {
        siteUrl = value;
    }

    /*
     *  Gets The user name for the sharepoint site.
     */
    public String getuserName() {
        return userName;
    }

    /*
     * Sets The user name for the sharepoint site.
     */
    public void setuserName(String value) {
        userName = value;
    }

    /*
     *  Gets Authorization token (SPOIDCRL) for SharePoint's PWA (Project Web Access). For example, in c# it can be retrieved using SharePointOnlineCredentials class from Microsoft.SharePoint.Client.Runtime assembly
     */
    public String getxProjectOnlineToken() {
        return xProjectOnlineToken;
    }

    /*
     * Sets Authorization token (SPOIDCRL) for SharePoint's PWA (Project Web Access). For example, in c# it can be retrieved using SharePointOnlineCredentials class from Microsoft.SharePoint.Client.Runtime assembly
     */
    public void setxProjectOnlineToken(String value) {
        xProjectOnlineToken = value;
    }

    /*
     *  Gets The password for the SharePoint site.
     */
    public String getxSharepointPassword() {
        return xSharepointPassword;
    }

    /*
     * Sets The password for the SharePoint site.
     */
    public void setxSharepointPassword(String value) {
        xSharepointPassword = value;
    }
}
