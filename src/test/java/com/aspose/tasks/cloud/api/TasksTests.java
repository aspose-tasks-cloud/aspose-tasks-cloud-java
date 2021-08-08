/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TasksTests.java">
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
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

/*
 * Example of how to work with tasks.
 */
public class TasksTests extends TestBase {

    /*
     * Test for get tasks.
     */
    @Test
    public void testGetTasks() throws Exception {
        String localFileName = "Project2016.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTasksRequest request = new GetTasksRequest(remoteFileName, null,null);
        TaskItemsResponse result = TestInitializer.tasksApi.getTasks(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getTasks());
        assertEquals(6, result.getTasks().getTaskItem().size());

        TaskItem firstTask = result.getTasks().getTaskItem().stream().filter(d -> d.getUid() == 5).findAny().get();
        assertEquals("Summary Task 1", firstTask.getName());
        assertEquals(OffsetDateTime.of(2015, 8, 3, 8, 0, 0, 0, ZoneOffset.UTC), firstTask.getStart());
        assertEquals(OffsetDateTime.of(2015, 8, 6, 17, 0, 0, 0, ZoneOffset.UTC), firstTask.getFinish());
        assertEquals("/5", firstTask.getLink().getHref());
    }

    /*
     * Test for get task.
     */
    @Test
    public void testGetTask() throws Exception {
        String localFileName = "Project2016.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskRequest request = new GetTaskRequest(remoteFileName, 5, null,null);
        TaskResponse result = TestInitializer.tasksApi.getTask(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getTask());
        assertEquals(Integer.valueOf(5), result.getTask().getUid());
        assertEquals(Arrays.asList(1, 2, 3, 4), result.getTask().getSubtasksUids());
        assertEquals("Summary Task 1", result.getTask().getName());
        assertEquals(OffsetDateTime.of(2015, 8, 3, 8, 0, 0, 0, ZoneOffset.UTC), result.getTask().getStart());
        assertEquals(OffsetDateTime.of(2015, 8, 6, 17, 0, 0, 0, ZoneOffset.UTC), result.getTask().getFinish());
        assertEquals("1.08:00:00", result.getTask().getRegularWork());
        assertEquals(1920.0, result.getTask().getWorkVariance());
    }

    /*
     * Test for delete task.
     */
    @Test
    public void testDeleteTask() throws Exception {
        String localFileName = "Project2016.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DeleteTaskRequest request1 = new DeleteTaskRequest(remoteFileName, 4, null,null,null);
        AsposeResponse result1 = TestInitializer.tasksApi.deleteTask(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());


        GetTasksRequest request2 = new GetTasksRequest(remoteFileName, null,null);
        TaskItemsResponse result2 = TestInitializer.tasksApi.getTasks(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTasks());
        assertEquals(5, result2.getTasks().getTaskItem().size());

        Optional<TaskItem> firstTask = result2.getTasks().getTaskItem().stream().filter(d -> d.getUid() == 4).findAny();
        assertFalse(firstTask.isPresent());
    }

    /*
     * Test for post tasks.
     */
    @Test
    public void testPostTasks() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        TaskCreationRequest firstTask = new TaskCreationRequest();
        firstTask.setTaskName("SomeFirstTaskName");
        TaskCreationRequest secondTask = new TaskCreationRequest();
        secondTask.setTaskName("SomeSecondTaskNameWithParent");
        secondTask.setParentTaskUid(2);
        PostTasksRequest request1 = new PostTasksRequest(remoteFileName, Arrays.asList(firstTask, secondTask), null,null,null);
        TaskItemsResponse result1 = TestInitializer.tasksApi.postTasks(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(201), result1.getCode());
        assertNotNull(result1.getTasks());
        assertEquals(request1.getrequests().size(), result1.getTasks().getTaskItem().size());

        Integer newSubtaskUid = result1.getTasks().getTaskItem().stream().filter(d -> d.getName().equals(secondTask.getTaskName())).findAny().get().getUid();
        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, secondTask.getParentTaskUid(), null,null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertTrue(result2.getTask().getSubtasksUids().stream().anyMatch(d -> d.equals(newSubtaskUid)));
    }

    /*
     * Test for post task.
     */
    @Test
    public void testPostTask() throws Exception {
        String localFileName = "Project2016.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);


        PostTaskRequest request1 = new PostTaskRequest(remoteFileName, "New task name",4, null, null,null);
        TaskItemResponse result1 = TestInitializer.tasksApi.postTask(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(201), result1.getCode());
        assertNotNull(result1.getTaskItem());

        Integer newtaskUid = result1.getTaskItem().getUid();
        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, newtaskUid, null,null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(request1.gettaskName(), result2.getTask().getName());
    }

    /*
     * Test for get task assignments.
     */
    @Test
    public void testGetTaskAssignments() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskAssignmentsRequest request = new GetTaskAssignmentsRequest(remoteFileName, 1, null, null);
        AssignmentsResponse result = TestInitializer.tasksApi.getTaskAssignments(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getAssignments());
    }

    /*
     * Test for put move task.
     */
    @Test
    public void testPutMoveTask() throws Exception {
        String localFileName = "sample.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskRequest request1 = new GetTaskRequest(remoteFileName, 6, null, null);
        TaskResponse result1 = TestInitializer.tasksApi.getTask(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());
        assertFalse(result1.getTask().getSubtasksUids().stream().anyMatch(d -> d.equals(10)));

        PutMoveTaskRequest request2 = new PutMoveTaskRequest(remoteFileName, 10, 6, null, null, null);
        AsposeResponse result2 = TestInitializer.tasksApi.putMoveTask(request2);
        assertEquals(Integer.valueOf(200), result2.getCode());

        result1 = TestInitializer.tasksApi.getTask(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());
        assertTrue(result1.getTask().getSubtasksUids().stream().anyMatch(d -> d.equals(10)));
    }

    /*
     * Test for put move task to sibling.
     */
    @Test
    public void testPutMoveTaskToSibling() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PutMoveTaskToSiblingRequest request1 = new PutMoveTaskToSiblingRequest(remoteFileName, 40, 41, null, null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.putMoveTaskToSibling(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 38, null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertEquals(Arrays.asList(39, 40, 41), result2.getTask().getSubtasksUids());
    }

    /*
     * Test for put move task to sibling response with code 404 if input uid is not found.
     */
    @Test
    public void testPutMoveTaskToSiblingCode404IfInputUidIsNotFound() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PutMoveTaskToSiblingRequest request1 = new PutMoveTaskToSiblingRequest(remoteFileName, 99999, -1, null, null, null);
        boolean isApiExceptionWasThrown = false;
        try{
            TestInitializer.tasksApi.putMoveTaskToSibling(request1);
        }
        catch (ApiException ex){
            isApiExceptionWasThrown = true;
            assertEquals(404, ex.getCode());
            assertTrue(ex.getResponseBody().contains("Task with 99999 Uid doesn't exist"));
        }
        assertTrue(isApiExceptionWasThrown);
    }
}
