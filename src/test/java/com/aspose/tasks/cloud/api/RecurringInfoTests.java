/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RecurringInfoTests.java">
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
import java.util.Collections;

/*
 * Example of how to work with recurring info.
 */
public class RecurringInfoTests extends TestBase {

    /*
     * Test for get task recurring info.
     */
    @Test
    public void testGetTaskRecurringInfo() throws ApiException {
        String localFileName = "sample.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskRecurringInfoRequest request = new GetTaskRecurringInfoRequest(remoteFileName, 6, null, null);
        RecurringInfoResponse result = TestInitializer.tasksApi.getTaskRecurringInfo(request);

        assertNotNull(result);
        assertEquals(200, result.getCode().intValue());
        assertNotNull(result.getRecurringInfo());
        assertEquals(Integer.valueOf(2), result.getRecurringInfo().getOccurrences());
        assertEquals(RecurrencePattern.MONTHLY, result.getRecurringInfo().getRecurrencePattern());
        assertTrue(result.getRecurringInfo().isUseEndDate());
        assertFalse(result.getRecurringInfo().isMonthlyUseOrdinalDay());
        assertEquals(Integer.valueOf(1), result.getRecurringInfo().getMonthlyDay());
        assertEquals(WeekDayType.NONE, result.getRecurringInfo().getWeeklyDays());
        assertEquals(OrdinalNumber.SECOND, result.getRecurringInfo().getYearlyOrdinalNumber());
    }

    /*
     * Test for put task recurring info.
     */
    @Test
    public void testPutTaskRecurringInfo() throws ApiException {
        String localFileName = "sample.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskRecurringInfoRequest request1 = new GetTaskRecurringInfoRequest(remoteFileName, 6, null, null);
        RecurringInfoResponse result1 = TestInitializer.tasksApi.getTaskRecurringInfo(request1);

        assertNotNull(result1);
        assertEquals(200, result1.getCode().intValue());
        assertNotNull(result1.getRecurringInfo());
        assertEquals(Integer.valueOf(2), result1.getRecurringInfo().getOccurrences());

        RecurringInfo recurringInfo = result1.getRecurringInfo();
        recurringInfo.setOccurrences(10);
        PutTaskRecurringInfoRequest request2 = new PutTaskRecurringInfoRequest(remoteFileName, 6, recurringInfo, null, null, null);
        AsposeResponse result2 = TestInitializer.tasksApi.putTaskRecurringInfo(request2);
        assertEquals(200, result2.getCode().intValue());
        result1 = TestInitializer.tasksApi.getTaskRecurringInfo(request1);
        assertEquals(200, result1.getCode().intValue());
        assertNotNull(result1.getRecurringInfo());
        assertEquals(Integer.valueOf(10), result1.getRecurringInfo().getOccurrences());
    }

    /*
     * Test for post task recurring info.
     */
    @Test
    public void testPostTaskRecurringInfo() throws ApiException {
        String localFileName = "sample.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        RecurringInfo recurringInfo = new RecurringInfo();
        recurringInfo.setRecurrencePattern(RecurrencePattern.WEEKLY);
        recurringInfo.setOccurrences(4);
        recurringInfo.setWeeklyRepetitions(3);
        recurringInfo.setWeeklyDays(WeekDayType.THURSDAY);
        recurringInfo.setStartDate(OffsetDateTime.of(2018, 1, 1, 8, 0, 0,0,ZoneOffset.UTC));
        recurringInfo.setEndDate(OffsetDateTime.of(2018, 12, 31, 0, 0, 0,0,ZoneOffset.UTC));
        recurringInfo.setUseEndDate(true);

        PostTaskRecurringInfoRequest request1 = new PostTaskRecurringInfoRequest(remoteFileName, 0, "New recurring task", recurringInfo, "Standard", null, null, null);
        TaskItemResponse result1 = TestInitializer.tasksApi.postTaskRecurringInfo(request1);
        assertEquals(201, result1.getCode().intValue());
        assertNotNull(result1.getTaskItem());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, result1.getTaskItem().getUid(), null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertEquals(200, result2.getCode().intValue());
        assertEquals(18, result2.getTask().getSubtasksUids().size());

        request2.settaskUid(Collections.max(result2.getTask().getSubtasksUids()));
        result2 = TestInitializer.tasksApi.getTask(request2);
        assertEquals(OffsetDateTime.of(2018, 12, 27, 8, 0, 0,0,ZoneOffset.UTC), result2.getTask().getStart());
    }
}
