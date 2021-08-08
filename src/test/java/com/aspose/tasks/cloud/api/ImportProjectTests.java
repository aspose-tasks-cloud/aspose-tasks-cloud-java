/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportProjectTests.java">
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
import com.aspose.tasks.cloud.model.*;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.PageCountResponse;
import com.aspose.tasks.cloud.model.responses.ProjectIdsResponse;
import com.aspose.tasks.cloud.model.responses.TaskItemsResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Collections;

/*
 * Example of how to import project.
 */
public class ImportProjectTests extends TestBase {


    /*
     * Test for put import project from file.
     */
    @Test
    public void testPutImportProjectFromFile() throws ApiException {
        String localFileName = "p6_multiproject.xml";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PutImportProjectFromFileRequest request1 = new PutImportProjectFromFileRequest(remoteFileName, "111", "imported_from_primavera.xml", ImportedProjectType.PRIMAVERAXML.getValue(), null, null, ProjectFileFormat.P6XML.getValue());
        AsposeResponse result1 = TestInitializer.tasksApi.putImportProjectFromFile(request1);
        assertNotNull(result1);
        assertEquals(200, result1.getCode().intValue());

        GetTasksRequest request2 = new GetTasksRequest(request1.getfilename(), null, null);
        TestInitializer.uploadedFiles.add(request1.getfilename());
        TaskItemsResponse result2 = TestInitializer.tasksApi.getTasks(request2);
        assertNotNull(result2);
        assertEquals(200, result2.getCode().intValue());
        assertEquals(12, result2.getTasks().getTaskItem().size());
    }

    /*
     * Test for put import project from db.
     */
    @Test
    @Ignore(value = "Ignored because real credentials is required.")
    public void testPutImportProjectFromDb() throws ApiException {
        PutImportProjectFromDbRequest request1 = new PutImportProjectFromDbRequest(ProjectDatabaseType.MSP.getValue(), "Data Source=db.contoso.com;Initial Catalog=ProjectServer;Persist Security Info=True;User ID=sa;Password=pwd;", "E6426C44-D6CB-4B9C-AF16-48910ACE0F54", "imported_from_db.xml", ProjectFileFormat.P6XML.getValue(), null, null, "dbo");
        AsposeResponse result1 = TestInitializer.tasksApi.putImportProjectFromDb(request1);
        assertNotNull(result1);
        assertEquals(200, result1.getCode().intValue());

        GetProjectIdsRequest request2 = new GetProjectIdsRequest(request1.getfilename(), null, null);
        TestInitializer.uploadedFiles.add(request1.getfilename());
        ProjectIdsResponse result2 = TestInitializer.tasksApi.getProjectIds(request2);
        assertNotNull(result2);
        assertEquals(200, result2.getCode().intValue());
        assertEquals(Collections.singletonList("1"), result2.getProjectIds());
    }

    /*
     * Test for put import project from project online by token credentials.
     */
    @Ignore("Ignored because real credentials is required.")
    @Test
    public void testPutImportProjectFromProjectOnlineByTokenCredentials() throws ApiException {
        PutImportProjectFromProjectOnlineRequest request1 = new PutImportProjectFromProjectOnlineRequest("NewProductDev.mpp", "E6426C44-D6CB-4B9C-AF16-48910ACE0F54", "http://project_server_instance.local/sites/pwa", null, ProjectFileFormat.P6XML.getValue(), null, null, "SOMESECRETTOKEN", null);
        AsposeResponse result1 = TestInitializer.tasksApi.putImportProjectFromProjectOnline(request1);
        assertNotNull(result1);
        assertEquals(200, result1.getCode().intValue());

        DownloadFileRequest request2 = new DownloadFileRequest(request1.getname(), null, null);
        File result2 = TestInitializer.tasksApi.downloadFile(request2);
        TestInitializer.uploadedFiles.add(request1.getname());
        assertNotNull(result2);
        assertTrue(result2.exists());
    }

    /*
     * Test for put import project from project online by login and password credentials.
     */
    @Ignore("Ignored because real credentials is required.")
    @Test
    public void testPutImportProjectFromProjectOnlineByLoginAndPasswordCredentials() throws ApiException {
        PutImportProjectFromProjectOnlineRequest request1 = new PutImportProjectFromProjectOnlineRequest("NewProductDev.mpp", "E6426C44-D6CB-4B9C-AF16-48910ACE0F54", "http://project_server_instance.local/sites/pwa", "SomeLogin", ProjectFileFormat.P6XML.getValue(), null, null, null, "SomePassword");
        AsposeResponse result1 = TestInitializer.tasksApi.putImportProjectFromProjectOnline(request1);
        assertNotNull(result1);
        assertEquals(200, result1.getCode().intValue());

        DownloadFileRequest request2 = new DownloadFileRequest(request1.getname(), null, null);
        File result2 = TestInitializer.tasksApi.downloadFile(request2);
        TestInitializer.uploadedFiles.add(request1.getname());
        assertNotNull(result2);
        assertTrue(result2.exists());
    }
}
