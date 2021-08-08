/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ProjectOnlineTests.java">
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
 * --------------------------------------------------------------------------------
 */

package com.aspose.tasks.cloud.api;

import com.aspose.tasks.cloud.ApiException;
import com.aspose.tasks.cloud.TestBase;
import com.aspose.tasks.cloud.TestInitializer;
import com.aspose.tasks.cloud.model.ImportedProjectType;
import com.aspose.tasks.cloud.model.ProjectDatabaseType;
import com.aspose.tasks.cloud.model.ProjectFileFormat;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.ProjectIdsResponse;
import com.aspose.tasks.cloud.model.responses.ProjectListResponse;
import com.aspose.tasks.cloud.model.responses.TaskItemsResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.util.Collections;

/*
 * Example of how to work with project online.
 */
public class ProjectOnlineTests extends TestBase {

    /*
     * Test for get project list by token credentials.
     */
    @Test
    @Ignore(value = "Ignored because real credentials is required.")
    public void testGetProjectListByTokenCredentials() throws ApiException {
        GetProjectListRequest request = new GetProjectListRequest("http://project_server_instance.local/sites/pwa", null, "SOMESECRETTOKEN", null);
        ProjectListResponse result = TestInitializer.tasksApi.getProjectList(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
        assertNotNull(result.getProjects());
        assertTrue(0 < result.getProjects().getProjectInfo().size());
    }

    /*
     * Test for get project list by login and password credentials.
     */
    @Test
    @Ignore(value = "Ignored because real credentials is required.")
    public void testGetProjectListByLoginAndPasswordCredentials() throws ApiException {
        GetProjectListRequest request = new GetProjectListRequest("http://project_server_instance.local/sites/pwa", "SomeLogin", null, "SomePassword");
        ProjectListResponse result = TestInitializer.tasksApi.getProjectList(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
        assertNotNull(result.getProjects());
        assertTrue(0 < result.getProjects().getProjectInfo().size());
    }

    /*
     * Test for create new project by token credentials.
     */
    @Test
    @Ignore(value = "Ignored because real credentials is required.")
    public void testCreateNewProjectByTokenCredentials() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        CreateNewProjectRequest request = new CreateNewProjectRequest(remoteFileName, "http://project_server_instance.local/sites/pwa", null, null, null, null, "SOMESECRETTOKEN", null);
        AsposeResponse result = TestInitializer.tasksApi.createNewProject(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
    }

    /*
     * Test for create new project by login and password credentials.
     */
    @Test
    @Ignore(value = "Ignored because real credentials is required.")
    public void testCreateNewProjectByLoginAndPasswordCredentials() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        CreateNewProjectRequest request = new CreateNewProjectRequest(remoteFileName,"http://project_server_instance.local/sites/pwa", "SomeLogin",  null, null, null, null, "SomePassword");
        AsposeResponse result = TestInitializer.tasksApi.createNewProject(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
    }

    /*
     * Test for update project by token credentials.
     */
    @Test
    @Ignore(value = "Ignored because real credentials is required.")
    public void testUpdateProjectByTokenCredentials() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        UpdateProjectRequest request = new UpdateProjectRequest(remoteFileName, "http://project_server_instance.local/sites/pwa", null, null, null, null, "SOMESECRETTOKEN", null);
        AsposeResponse result = TestInitializer.tasksApi.updateProject(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
    }

    /*
     * Test for update project by login and password credentials.
     */
    @Test
    @Ignore(value = "Ignored because real credentials is required.")
    public void testUpdateProjectByLoginAndPasswordCredentials() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        UpdateProjectRequest request = new UpdateProjectRequest(remoteFileName,"http://project_server_instance.local/sites/pwa", "SomeLogin",  null, null, null, null, "SomePassword");
        AsposeResponse result = TestInitializer.tasksApi.updateProject(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
    }
}
