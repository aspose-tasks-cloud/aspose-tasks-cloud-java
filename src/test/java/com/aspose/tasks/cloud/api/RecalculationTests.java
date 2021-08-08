/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RecalculationTests.java">
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
import com.aspose.tasks.cloud.model.responses.*;
import org.junit.Test;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.OffsetDateTime;
import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;

/*
 * Example of how to recalculate project.
 */
public class RecalculationTests extends TestBase {

    /*
     * Test for put recalculate project.
     */
    @Test
    public void testPutRecalculateProject() throws ApiException {
        String localFileName = "sample.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PostTaskRequest request1 = new PostTaskRequest(remoteFileName, "NewTaskName", null, null, null, null);
        TaskItemResponse result1 = TestInitializer.tasksApi.postTask(request1);
        assertNotNull(result1);
        assertEquals(201, result1.getCode().intValue());

        Integer taskUid = result1.getTaskItem().getUid();
        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, taskUid, null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertNotNull(result2.getTask());

        Task task = result2.getTask();
        task.setName("New task Name");
        task.setActualStart(OffsetDateTime.of(2000, 10, 20,0,0,0,0, ZoneOffset.UTC));
        task.setActualFinish(OffsetDateTime.of(2000, 10, 9,0,0,0,0, ZoneOffset.UTC));
        task.setCost(BigDecimal.valueOf(100));
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, taskUid, task, null, false, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(200, result3.getCode().intValue());

        PutRecalculateProjectRequest request4 = new PutRecalculateProjectRequest(remoteFileName, CalculationMode.NONE.getValue(), true, null, null, null);
        ProjectRecalculateResponse result4 = TestInitializer.tasksApi.putRecalculateProject(request4);
        assertNotNull(result4);
        assertEquals(200, result4.getCode().intValue());
        assertEquals(ProjectValidationState.VALID, result4.getResult().getValidationState());
    }

    /*
     * Test for put recalculate project resource fields.
     */
    @Test
    public void testPutRecalculateProjectResourceFields() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PutRecalculateProjectResourceFieldsRequest request = new PutRecalculateProjectResourceFieldsRequest(remoteFileName, null, null, null);
        AsposeResponse result = TestInitializer.tasksApi.putRecalculateProjectResourceFields(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
    }

    /*
     * Test for put recalculate project uncomplete work to start after.
     */
    @Test
    public void testPutRecalculateProjectUncompleteWorkToStartAfter() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PutRecalculateProjectUncompleteWorkToStartAfterRequest request = new PutRecalculateProjectUncompleteWorkToStartAfterRequest(remoteFileName, java.time.OffsetDateTime.of(2010, 10, 10, 0, 0,0,0, java.time.ZoneOffset.UTC), null, null, null);
        AsposeResponse result = TestInitializer.tasksApi.putRecalculateProjectUncompleteWorkToStartAfter(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
    }

    /*
     * Test for put recalculate project work as complete.
     */
    @Test
    public void testPutRecalculateProjectWorkAsComplete() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PutRecalculateProjectWorkAsCompleteRequest request = new PutRecalculateProjectWorkAsCompleteRequest(remoteFileName, java.time.OffsetDateTime.of(2010, 10, 10, 0, 0,0,0, java.time.ZoneOffset.UTC), null, null, null, null);
        AsposeResponse result = TestInitializer.tasksApi.putRecalculateProjectWorkAsComplete(request);
        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
    }
}
