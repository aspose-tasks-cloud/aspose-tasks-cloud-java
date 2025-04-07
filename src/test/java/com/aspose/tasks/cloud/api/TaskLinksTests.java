/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TaskLinksTests.java">
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

import com.aspose.tasks.cloud.TestBase;
import com.aspose.tasks.cloud.TestInitializer;
import com.aspose.tasks.cloud.model.ProjectFileFormat;
import com.aspose.tasks.cloud.model.TaskLink;
import com.aspose.tasks.cloud.model.TaskLinkType;
import com.aspose.tasks.cloud.model.TimeUnitType;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.TaskLinkResponse;
import com.aspose.tasks.cloud.model.responses.TaskLinksResponse;
import org.junit.Test;

import java.io.File;

/*
 * Example of how to work with task links.
 */
public class TaskLinksTests extends TestBase {

    /*
     * Test for get task links.
     */
    @Test
    public void testGetTaskLinks() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskLinksRequest request = new GetTaskLinksRequest(remoteFileName, null, null);
        TaskLinksResponse result = TestInitializer.tasksApi.getTaskLinks(request);

        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getTaskLinks());
        assertEquals(24, result.getTaskLinks().size());
    }

    /*
     * Test for post task links.
     */
    @Test
    public void testPostTaskLinks() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        TaskLink taskLink = new TaskLink();
        taskLink.setPredecessorUid(28);
        taskLink.setSuccessorUid(30);
        taskLink.setLinkType(TaskLinkType.STARTTOSTART);
        taskLink.setLag(9600);
        taskLink.setLagFormat(TimeUnitType.DAY);

        PostTaskLinkRequest request1 = new PostTaskLinkRequest(remoteFileName, taskLink, null, null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.postTaskLink(request1);

        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskLinksRequest request2 = new GetTaskLinksRequest(remoteFileName, null, null);
        TaskLinksResponse result2 = TestInitializer.tasksApi.getTaskLinks(request2);

        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTaskLinks());
        assertEquals(25, result2.getTaskLinks().size());
    }

    /*
     * Test for put task links.
     */
    @Test
    public void testPutTaskLinks() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskLinksRequest request1 = new GetTaskLinksRequest(remoteFileName, null, null);
        TaskLinksResponse result1 = TestInitializer.tasksApi.getTaskLinks(request1);

        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());
        assertNotNull(result1.getTaskLinks());

        TaskLink taskLinkToEdit = result1.getTaskLinks().get(0);

        // Modification of PredecessorUid and SuccessorUid fields is not supported.
        taskLinkToEdit.setLinkType(TaskLinkType.STARTTOFINISH);
        taskLinkToEdit.setLag(9600);
        taskLinkToEdit.setLagFormat(TimeUnitType.DAY);

        PutTaskLinkRequest request2 = new PutTaskLinkRequest(remoteFileName, 1, taskLinkToEdit, null, null, null);
        TaskLinkResponse result2 = TestInitializer.tasksApi.putTaskLink(request2);

        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());

        result1 = TestInitializer.tasksApi.getTaskLinks(request1);

        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());
        assertEquals(taskLinkToEdit.getLinkType(), result1.getTaskLinks().get(0).getLinkType());
        assertEquals(taskLinkToEdit.getLag(), result1.getTaskLinks().get(0).getLag());
        assertEquals(taskLinkToEdit.getLagFormat(), result1.getTaskLinks().get(0).getLagFormat());
        assertEquals("16:00:00", result1.getTaskLinks().get(0).getLinkLagTimeSpan());
    }

    /*
     * Test for delete task links.
     */
    @Test
    public void testDeleteTaskLinks() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DeleteTaskLinkRequest request1 = new DeleteTaskLinkRequest(remoteFileName, 1, null, null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.deleteTaskLink(request1);

        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskLinksRequest request2 = new GetTaskLinksRequest(remoteFileName, null, null);
        TaskLinksResponse result2 = TestInitializer.tasksApi.getTaskLinks(request2);

        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTaskLinks());
        assertEquals(23, result2.getTaskLinks().size());
    }
}
