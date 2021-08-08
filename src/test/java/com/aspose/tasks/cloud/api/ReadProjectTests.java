/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReadProjectTests.java">
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
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.ProjectIdsResponse;
import com.aspose.tasks.cloud.model.responses.ProjectListResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;

/*
 * Example of how to read project.
 */
public class ReadProjectTests extends TestBase {

    /*
     * Test for get project ids.
     */
    @Test
    public void testGetProjectIds() throws ApiException {
        String localFileName = "p6_multiproject.xml";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetProjectIdsRequest request = new GetProjectIdsRequest(remoteFileName, null, null);
        ProjectIdsResponse result = TestInitializer.tasksApi.getProjectIds(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
        assertNotNull(result.getProjectIds());
        assertEquals(Arrays.asList("1", "111"), result.getProjectIds());
    }

    /*
     * Test for get task document.
     */
    @Test
    public void testGetTaskDocument() throws ApiException {
        String localFileName = "testXer.xer";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskDocumentRequest request = new GetTaskDocumentRequest(remoteFileName, null, null);
        File result = TestInitializer.tasksApi.getTaskDocument(request);
        assertNotNull(result);
        assertTrue(result.exists());
    }
}
