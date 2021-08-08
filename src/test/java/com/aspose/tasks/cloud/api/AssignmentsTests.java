/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AssignmentsTests.java">
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

/*
 * Example of how to work with assignments.
 */
public class AssignmentsTests extends TestBase {


    /*
     * Test for get assignments.
     */
    @Test
    public void testGetAssignments() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetAssignmentsRequest request = new GetAssignmentsRequest(remoteFileName, null, null);
        AssignmentItemsResponse result = TestInitializer.tasksApi.getAssignments(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getAssignments());
        assertEquals(6, result.getAssignments().getAssignmentItem().size());
        assertEquals(new Integer(34), result.getAssignments().getAssignmentItem().get(0).getTaskUid());
        assertEquals(new Integer(63), result.getAssignments().getAssignmentItem().get(0).getUid());
        assertEquals("/63", result.getAssignments().getAssignmentItem().get(0).getLink().getHref());
    }

    /*
     * Test for get assignment.
     */
    @Test
    public void testGetAssignment() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetAssignmentRequest request = new GetAssignmentRequest(remoteFileName, 63, null, null);
        AssignmentResponse result = TestInitializer.tasksApi.getAssignment(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getAssignment());
        assertEquals("08:00:00", result.getAssignment().getRegularWork());
        assertEquals("08:00:00", result.getAssignment().getRemainingWork());
        assertEquals(OffsetDateTime.of(2012, 7, 9, 8, 0, 0, 0, ZoneOffset.UTC), result.getAssignment().getStart());
    }

    /*
     * Test for get resource assignments.
     */
    @Test
    public void testGetResourceAssignments() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetResourceAssignmentsRequest request = new GetResourceAssignmentsRequest(remoteFileName, 1, null, null);
        AssignmentsResponse result = TestInitializer.tasksApi.getResourceAssignments(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getAssignments());
        assertEquals(6, result.getAssignments().getList().size());
        assertTrue(result.getAssignments().getList().stream().allMatch(e -> e.getResourceUid() == 1));
    }

    /*
     * Test for post assignment.
     */
    @Test
    public void testPostAssignment() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PostAssignmentRequest request1 = new PostAssignmentRequest(remoteFileName, 0, 1, 0.5, null, null, null, null);
        AssignmentItemResponse result1 = TestInitializer.tasksApi.postAssignment(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());
        assertNotNull(result1.getAssignmentItem());

        Integer assignmentUid = result1.getAssignmentItem().getUid();
        GetAssignmentRequest request2 = new GetAssignmentRequest(remoteFileName, assignmentUid, null, null);
        AssignmentResponse result2 = TestInitializer.tasksApi.getAssignment(request2);
        assertNotNull(result2);
        assertNotNull(result2.getAssignment());
        assertEquals(0, result2.getAssignment().getTaskUid().intValue());
        assertEquals(1, result2.getAssignment().getResourceUid().intValue());

        Integer taskUid = result2.getAssignment().getTaskUid();
        GetTaskRequest request3 = new GetTaskRequest(remoteFileName, taskUid, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.getTask(request3);
        assertNotNull(result3);
        assertNotNull(result3.getTask());
        assertEquals(result2.getAssignment().getStart(), result3.getTask().getStart());
        assertEquals(result2.getAssignment().getFinish(), result3.getTask().getFinish());
        assertEquals(result2.getAssignment().getWork(), result3.getTask().getWork());
        assertEquals(result2.getAssignment().getCost().intValue(), result3.getTask().getCost().intValue());
    }

    /*
     * Test for post assignment when using assignment cost instead of units.
     */
    @Test
    public void testPostAssignmentCostInsteadOfUnits() throws ApiException {
        String localFileName = "Cost_Res.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PostAssignmentRequest request1 = new PostAssignmentRequest(remoteFileName, 0, 1, null, BigDecimal.valueOf(2), null, null, null);
        AssignmentItemResponse result1 = TestInitializer.tasksApi.postAssignment(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());
        assertNotNull(result1.getAssignmentItem());

        Integer assignmentUid = result1.getAssignmentItem().getUid();
        GetAssignmentRequest request2 = new GetAssignmentRequest(remoteFileName, assignmentUid, null, null);
        AssignmentResponse result2 = TestInitializer.tasksApi.getAssignment(request2);
        assertNotNull(result2);
        assertNotNull(result2.getAssignment());
        assertEquals(request1.getcost().intValue(), result2.getAssignment().getCost().intValue());
    }

    /*
     * Test for put assignment.
     */
    @Test
    public void testPutAssignment() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetAssignmentRequest request1 = new GetAssignmentRequest(remoteFileName, 63, null, null);
        AssignmentResponse result1 = TestInitializer.tasksApi.getAssignment(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());
        assertNotNull(result1.getAssignment());

        ResourceAssignment assignment = result1.getAssignment();
        assignment.setTaskUid(0);
        PutAssignmentRequest request2 = new PutAssignmentRequest(remoteFileName, 63, assignment, CalculationMode.AUTOMATIC.getValue(), true, null, null, null);
        AssignmentResponse result2 = TestInitializer.tasksApi.putAssignment(request2);
        assertNotNull(result2);
        assertNotNull(result2.getAssignment());

        GetAssignmentsRequest request3 = new GetAssignmentsRequest(remoteFileName, null, null);
        AssignmentItemsResponse result3 = TestInitializer.tasksApi.getAssignments(request3);
        assertNotNull(result3);
        assertFalse(result3.getAssignments().getAssignmentItem().stream().anyMatch(i -> i.getTaskUid() == 34 && i.getResourceUid() == 1));
        assertTrue(result3.getAssignments().getAssignmentItem().stream().anyMatch(i -> i.getTaskUid() == 0 && i.getResourceUid() == 1 && i.getUid() == 63));
    }

    /*
     * Test for put assignment modify TimephasedData and Baselines with assignment.
     */
    @Test
    public void testPutAssignmentModifyTimephasedDataAndBaselines() throws ApiException {
        String localFileName = "sample.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetAssignmentRequest request1 = new GetAssignmentRequest(remoteFileName, 1, null, null);
        AssignmentResponse result1 = TestInitializer.tasksApi.getAssignment(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());
        assertNotNull(result1.getAssignment());

        ResourceAssignment assignment = result1.getAssignment();
        assignment.setCost(BigDecimal.valueOf(100));
        assignment.setStart(OffsetDateTime.of(2001, 9, 10, 0, 0, 0, 0, ZoneOffset.UTC));
        assignment.setFinish(OffsetDateTime.of(2002, 9, 10, 0, 0, 0, 0, ZoneOffset.UTC));
        AssignmentBaseline newBaseline = new AssignmentBaseline();
        newBaseline.setBaselineNumber(BaselineType.BASELINE1);
        newBaseline.setStart(OffsetDateTime.of(2002, 9, 10, 0, 0, 0, 0, ZoneOffset.UTC));
        assignment.setBaselines(Arrays.asList(newBaseline));
        assignment.setActualWork("10:10:10");
        assignment.setActualCost(BigDecimal.valueOf(100));
        assignment.setActualStart(OffsetDateTime.of(2001, 9, 10, 0, 0, 0, 0, ZoneOffset.UTC));
        assignment.setActualFinish(OffsetDateTime.of(2002, 9, 10, 0, 0, 0, 0, ZoneOffset.UTC));
        assignment.setActualOvertimeWork("100:10:10");
        assignment.setWork("80:0:0");
        assignment.setUid(1);
        assignment.setVac(10.0);
        assignment.setWorkContour(WorkContourType.CONTOURED);
        TimephasedData newTimephasedData = new TimephasedData();
        newTimephasedData.setUid(assignment.getUid());
        newTimephasedData.setStart(OffsetDateTime.of(2001, 9, 10, 9, 0, 0, 0, ZoneOffset.UTC));
        newTimephasedData.setFinish(OffsetDateTime.of(2001, 9, 10, 14, 0, 0, 0, ZoneOffset.UTC));
        newTimephasedData.setUnit(TimeUnitType.HOUR);
        newTimephasedData.setValue("4:0:0");
        newTimephasedData.setTimephasedDataType(TimephasedDataType.ASSIGNMENTREMAININGWORK);
        assignment.setTimephasedData(Arrays.asList(newTimephasedData));

        PutAssignmentRequest request2 = new PutAssignmentRequest(remoteFileName, assignment.getUid(), assignment, CalculationMode.NONE.getValue(), false, null, null, null);
        AssignmentResponse result2 = TestInitializer.tasksApi.putAssignment(request2);
        assertNotNull(result2);
        assertNotNull(result2.getAssignment());
        assertEquals(assignment.getUid(), result2.getAssignment().getUid());
        assertEquals(assignment.getVac(), result2.getAssignment().getVac());
        assertFalse("Calculated fields must be overwritten", assignment.getCost() == result2.getAssignment().getCost());
        assertEquals(assignment.getStart(), result2.getAssignment().getStart());
        assertEquals(assignment.getFinish(), result2.getAssignment().getFinish());
        assertEquals("80.00:00:00", result2.getAssignment().getWork());
        assertEquals(assignment.getActualWork(), result2.getAssignment().getActualWork());
        assertEquals(assignment.getActualStart(), result2.getAssignment().getActualStart());
        assertEquals(assignment.getActualFinish(), result2.getAssignment().getActualFinish());
        assertEquals("100.10:10:00", result2.getAssignment().getActualOvertimeWork());
        assertEquals(1, result2.getAssignment().getBaselines().size());
        assertEquals(BaselineType.BASELINE1, result2.getAssignment().getBaselines().get(0).getBaselineNumber());
        assertEquals(assignment.getBaselines().get(0).getStart(), result2.getAssignment().getBaselines().get(0).getStart());
        assertEquals(1, result2.getAssignment().getTimephasedData().size());
        assertEquals(assignment.getUid(), result2.getAssignment().getTimephasedData().get(0).getUid());
        assertEquals("PT4H0M0S", result2.getAssignment().getTimephasedData().get(0).getValue());
        assertEquals(newTimephasedData.getStart(), result2.getAssignment().getTimephasedData().get(0).getStart());
        assertEquals(newTimephasedData.getFinish(), result2.getAssignment().getTimephasedData().get(0).getFinish());
        assertEquals(newTimephasedData.getTimephasedDataType(), result2.getAssignment().getTimephasedData().get(0).getTimephasedDataType());
    }

    /*
     * Test for delete assignment.
     */
    @Test
    public void testDeleteAssignment() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DeleteAssignmentRequest request1 = new DeleteAssignmentRequest(remoteFileName, 63, null, null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.deleteAssignment(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetAssignmentsRequest request2 = new GetAssignmentsRequest(remoteFileName,null, null);
        AssignmentItemsResponse result2 = TestInitializer.tasksApi.getAssignments(request2);
        assertNotNull(result2);
        assertFalse(result2.getAssignments().getAssignmentItem().stream().anyMatch(i -> i.getUid() == 63));
        assertFalse(result2.getAssignments().getAssignmentItem().stream().anyMatch(i -> i.getTaskUid() == 34 && i.getResourceUid() == 1));
    }
}
