/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CalendarExceptionsTests.java">
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
import com.aspose.tasks.cloud.model.requests.DeleteCalendarExceptionRequest;
import com.aspose.tasks.cloud.model.requests.GetCalendarExceptionsRequest;
import com.aspose.tasks.cloud.model.requests.PostCalendarExceptionRequest;
import com.aspose.tasks.cloud.model.requests.PutCalendarExceptionRequest;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.CalendarExceptionsResponse;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import java.util.Arrays;
import java.util.Collections;

/*
 * Example of how to work with calendar exceptions.
 */
public class CalendarExceptionsTests extends TestBase {


    /*
     * Test for get calendar exceptions.
     */
    @Test
    public void testGetCalendarExceptions() throws ApiException {
        String localFileName = "Calenar_with_exception.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetCalendarExceptionsRequest request = new GetCalendarExceptionsRequest(remoteFileName, 1, null, null);
        CalendarExceptionsResponse result = TestInitializer.tasksApi.getCalendarExceptions(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getCalendarExceptions());
        assertEquals(1, result.getCalendarExceptions().size());
        CalendarException calendarException = result.getCalendarExceptions().get(0);
        assertTrue(calendarException.isDayWorking());
        assertEquals(Arrays.asList(DayType.MONDAY), calendarException.getDaysOfWeek());
        assertEquals(OffsetDateTime.of(2018, 2, 13, 0, 0, 0, 0, ZoneOffset.UTC), calendarException.getFromDate());
        assertEquals(OffsetDateTime.of(2018, 4, 9, 23, 59, 0, 0, ZoneOffset.UTC), calendarException.getToDate());
        assertEquals(Month.UNDEFINED, calendarException.getMonth());
        assertEquals(MonthItemType.UNDEFINED, calendarException.getMonthItem());
        assertEquals(MonthPosition.UNDEFINED, calendarException.getMonthPosition());
        assertEquals(CalendarExceptionType.WEEKLY, calendarException.getType());
        assertEquals(Integer.valueOf(8), calendarException.getOccurrences());
        assertEquals(Integer.valueOf(1), calendarException.getPeriod());
        assertEquals(2, calendarException.getWorkingTimes().size());
        assertEquals(OffsetDateTime.of(1, 1, 1, 9, 0, 0, 0, ZoneOffset.UTC), calendarException.getWorkingTimes().get(0).getFromTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 12, 34, 0, 0, ZoneOffset.UTC), calendarException.getWorkingTimes().get(0).getToTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 15, 11, 0, 0, ZoneOffset.UTC), calendarException.getWorkingTimes().get(1).getFromTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 17, 30, 0, 0, ZoneOffset.UTC), calendarException.getWorkingTimes().get(1).getToTime());
    }

    /*
     * Test for post calendar exceptions.
     */
    @Test
    public void testPostCalendarExceptions() throws ApiException {
        String localFileName = "New_project_2013.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        CalendarException exception = new CalendarException();
        exception.setName("Non-working day exception");
        exception.setDayWorking(false);
        exception.setFromDate(OffsetDateTime.of(2014, 10, 27, 0, 0, 0, 0, ZoneOffset.UTC));
        exception.setToDate(OffsetDateTime.of(2015, 8, 5, 23, 59, 0, 0, ZoneOffset.UTC));
        exception.setOccurrences(10);
        exception.setType(CalendarExceptionType.MONTHLYBYDAY);
        exception.setEnteredByOccurrences(true);
        exception.setMonthDay(5);
        exception.setPeriod(1);
        exception.setWorkingTimes(Collections.emptyList());
        exception.setDaysOfWeek(Collections.emptyList());
        PostCalendarExceptionRequest request1 = new PostCalendarExceptionRequest(remoteFileName, 1, exception, null, null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.postCalendarException(request1);
        assertNotNull(result1);
        assertEquals(201, (int) result1.getCode());

        GetCalendarExceptionsRequest request2 = new GetCalendarExceptionsRequest(remoteFileName, 1, null, null);
        CalendarExceptionsResponse result2 = TestInitializer.tasksApi.getCalendarExceptions(request2);
        assertNotNull(result2.getCalendarExceptions());
        assertEquals(1, result2.getCalendarExceptions().size());
        assertCalendarExceptionsAreEqual(exception, result2.getCalendarExceptions().get(0));
    }

    /*
     * Test for put calendar exceptions.
     */
    @Test
    public void testPutCalendarExceptions() throws ApiException {
        String localFileName = "Calenar_with_exception.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);


        GetCalendarExceptionsRequest request1 = new GetCalendarExceptionsRequest(remoteFileName, 1, null, null);
        CalendarExceptionsResponse result1 = TestInitializer.tasksApi.getCalendarExceptions(request1);
        assertNotNull(result1.getCalendarExceptions());
        assertEquals(200, (int) result1.getCode());

        WorkingTime workingTime = new WorkingTime();
        workingTime.setFromTime(OffsetDateTime.of(1, 1, 1, 9, 0, 0, 0, ZoneOffset.UTC));
        workingTime.setToTime(OffsetDateTime.of(1, 1, 1, 17, 0, 0, 0, ZoneOffset.UTC));
        CalendarException exception = result1.getCalendarExceptions().get(0);
        exception.setWorkingTimes(Collections.singletonList(workingTime));
        exception.setDaysOfWeek(Arrays.asList(DayType.THURSDAY, DayType.FRIDAY));
        exception.setOccurrences(10);
        exception.setEnteredByOccurrences(true);
        exception.setPeriod(1);
        exception.setName("Non-working day exception");
        exception.setDayWorking(true);
        exception.setFromDate(OffsetDateTime.of(2014, 10, 27, 0, 0, 0, 0, ZoneOffset.UTC));
        exception.setToDate(OffsetDateTime.of(2015, 8, 5, 23, 59, 0, 0, ZoneOffset.UTC));

        PutCalendarExceptionRequest request2 = new PutCalendarExceptionRequest(remoteFileName, 1, exception.getIndex(), exception, null, null, null);
        AsposeResponse result2 = TestInitializer.tasksApi.putCalendarException(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());

        result1 = TestInitializer.tasksApi.getCalendarExceptions(request1);
        assertNotNull(result1.getCalendarExceptions());
        assertEquals(1, result1.getCalendarExceptions().size());
        assertCalendarExceptionsAreEqual(exception, result1.getCalendarExceptions().get(0));
    }

    /*
     * Test for delete calendar exceptions.
     */
    @Test
    public void testDeleteCalendarExceptions() throws ApiException {
        String localFileName = "Calenar_with_exception.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);


        DeleteCalendarExceptionRequest request1 = new DeleteCalendarExceptionRequest(remoteFileName, 1, 1, null, null,null);
        AsposeResponse result1 = TestInitializer.tasksApi.deleteCalendarException(request1);
        assertEquals(200, (int) result1.getCode());

        GetCalendarExceptionsRequest request2 = new GetCalendarExceptionsRequest(remoteFileName, 1,null, null);
        CalendarExceptionsResponse result2 = TestInitializer.tasksApi.getCalendarExceptions(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getCalendarExceptions());
        assertEquals(0, result2.getCalendarExceptions().size());
    }

    private void assertCalendarExceptionsAreEqual(CalendarException expected, CalendarException actual) {

        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.isDayWorking(), actual.isDayWorking());
        assertEquals(expected.isEnteredByOccurrences(), actual.isEnteredByOccurrences());
        assertEquals(expected.getFromDate(), actual.getFromDate());
        assertEquals(expected.getMonthDay(), actual.getMonthDay());
        assertEquals(expected.getOccurrences(), actual.getOccurrences());
        assertEquals(expected.getPeriod(), actual.getPeriod());
        assertEquals(expected.getToDate(), actual.getToDate());
        assertEquals(expected.getType(), actual.getType());
        assertEquals(expected.getWorkingTimes().size(), actual.getWorkingTimes().size());
        for (int i = 0; i < expected.getWorkingTimes().size(); i++) {
            assertEquals(expected.getWorkingTimes().get(i).getFromTime(), actual.getWorkingTimes().get(i).getFromTime());
            assertEquals(expected.getWorkingTimes().get(i).getToTime(), actual.getWorkingTimes().get(i).getToTime());
        }
        assertEquals(actual.getDaysOfWeek().size(), expected.getDaysOfWeek().size());
        for (int i = 0; i < expected.getDaysOfWeek().size(); i++) {
            assertEquals(expected.getDaysOfWeek().get(i), actual.getDaysOfWeek().get(i));
        }
    }
}
