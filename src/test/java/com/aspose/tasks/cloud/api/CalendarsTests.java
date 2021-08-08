/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CalendarsTests.java">
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
import com.aspose.tasks.cloud.model.Calendar;
import com.aspose.tasks.cloud.model.DayType;
import com.aspose.tasks.cloud.model.WeekDay;
import com.aspose.tasks.cloud.model.WorkingTime;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.CalendarItemResponse;
import com.aspose.tasks.cloud.model.responses.CalendarItemsResponse;
import com.aspose.tasks.cloud.model.responses.CalendarResponse;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import java.util.Arrays;
import java.util.Collections;

/*
 * Example of how to work with сalendars.
 */
public class CalendarsTests extends TestBase {


    /*
     * Test for get сalendars.
     */
    @Test
    public void testGetCalendars() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetCalendarsRequest request = new GetCalendarsRequest(remoteFileName, null, null);
        CalendarItemsResponse result = TestInitializer.tasksApi.getCalendars(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getCalendars());
        assertEquals(1, result.getCalendars().getList().size());
        assertEquals("Standard", result.getCalendars().getList().get(0).getName());
        assertEquals(1, result.getCalendars().getList().get(0).getUid().intValue());
    }

    /*
     * Test for get сalendar.
     */
    @Test
    public void testGetCalendar() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetCalendarRequest request = new GetCalendarRequest(remoteFileName, 1, null, null);
        CalendarResponse result = TestInitializer.tasksApi.getCalendar(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getCalendar());
        assertEquals("Standard", result.getCalendar().getName());
        assertTrue(result.getCalendar().isIsBaseCalendar());
        assertFalse(result.getCalendar().isIsBaselineCalendar());
        assertEquals(7, result.getCalendar().getDays().size());
    }

    /*
     * Test for post сalendar.
     */
    @Test
    public void testPostCalendar() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        WorkingTime firstWorkingTime = new WorkingTime();
        firstWorkingTime.setFromTime(OffsetDateTime.of(1, 1, 1, 8, 0, 0, 0, ZoneOffset.UTC));
        firstWorkingTime.setToTime(OffsetDateTime.of(1, 1, 1, 13, 0, 0, 0, ZoneOffset.UTC));
        WorkingTime secondWorkingTime = new WorkingTime();
        secondWorkingTime.setFromTime(OffsetDateTime.of(1, 1, 1, 14, 0, 0, 0, ZoneOffset.UTC));
        secondWorkingTime.setToTime(OffsetDateTime.of(1, 1, 1, 17, 0, 0, 0, ZoneOffset.UTC));
        WeekDay firstDay = new WeekDay();
        firstDay.setDayWorking(false);
        firstDay.setDayType(DayType.SUNDAY);
        WeekDay secondDay = new WeekDay();
        secondDay.setDayWorking(true);
        secondDay.setDayType(DayType.MONDAY);
        secondDay.setFromDate(OffsetDateTime.of(1, 1, 1, 8, 0, 0, 0, ZoneOffset.UTC));
        secondDay.setToDate(OffsetDateTime.of(1, 1, 1, 17, 0, 0, 0, ZoneOffset.UTC));
        secondDay.setWorkingTimes(Arrays.asList(firstWorkingTime, secondWorkingTime));
        Calendar calendar = new Calendar();
        calendar.setName("My new calendar");
        calendar.setDays(Arrays.asList(firstDay, secondDay));
        calendar.setIsBaseCalendar(false);
        calendar.setIsBaselineCalendar(false);

        PostCalendarRequest request1 = new PostCalendarRequest(remoteFileName, calendar, null, null, null);
        CalendarItemResponse result1 = TestInitializer.tasksApi.postCalendar(request1);
        assertNotNull(result1);
        assertEquals(201, (int) result1.getCode());
        assertNotNull(result1.getCalendarItem());

        Integer createdCalendarUid = result1.getCalendarItem().getUid();
        GetCalendarRequest request2 = new GetCalendarRequest(remoteFileName, createdCalendarUid, null, null);
        CalendarResponse result2 = TestInitializer.tasksApi.getCalendar(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getCalendar());
        assertEquals(calendar.getName(), result2.getCalendar().getName());
        assertEquals(7, result2.getCalendar().getDays().size());
        WeekDay monday = result2.getCalendar().getDays().stream().filter(d -> d.getDayType() == DayType.MONDAY).findAny().get();
        assertEquals(2, monday.getWorkingTimes().size());
        assertEquals(firstWorkingTime.getFromTime(), monday.getWorkingTimes().get(0).getFromTime());
        assertEquals(firstWorkingTime.getToTime(), monday.getWorkingTimes().get(0).getToTime());
        assertEquals(secondWorkingTime.getFromTime(), monday.getWorkingTimes().get(1).getFromTime());
        assertEquals(secondWorkingTime.getToTime(), monday.getWorkingTimes().get(1).getToTime());
    }

    /*
     * Test for post сalendar with code 400 if workingTimes is empty for any working day.
     */
    @Test
    public void testPostCalendarWithCode400() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        WeekDay firstDay = new WeekDay();
        firstDay.setDayWorking(false);
        firstDay.setDayType(DayType.SUNDAY);
        WeekDay secondDay = new WeekDay();
        secondDay.setDayWorking(true);
        secondDay.setDayType(DayType.MONDAY);
        secondDay.setFromDate(OffsetDateTime.of(1, 1, 1, 8, 0, 0, 0, ZoneOffset.UTC));
        secondDay.setToDate(OffsetDateTime.of(1, 1, 1, 17, 0, 0, 0, ZoneOffset.UTC));
        secondDay.setWorkingTimes(Collections.EMPTY_LIST);
        Calendar calendar = new Calendar();
        calendar.setName("My new calendar");
        calendar.setDays(Arrays.asList(firstDay, secondDay));
        calendar.setIsBaseCalendar(false);
        calendar.setIsBaselineCalendar(false);
        PostCalendarRequest request1 = new PostCalendarRequest(remoteFileName, calendar, null, null, null);
        boolean isApiExceptionWasThrown = false;
        try {
            TestInitializer.tasksApi.postCalendar(request1);
        } catch (ApiException ex) {
            isApiExceptionWasThrown = true;
            assertEquals(400, ex.getCode());
            assertTrue(ex.getResponseBody().contains("Calendar should have at least one working time defined"));
        }
        assertTrue(isApiExceptionWasThrown);
    }

    /*
     * Test for put сalendar.
     */
    @Test
    public void testPutCalendar() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        WorkingTime firstWorkingTime = new WorkingTime();
        firstWorkingTime.setFromTime(OffsetDateTime.of(1, 1, 1, 8, 0, 0, 0, ZoneOffset.UTC));
        firstWorkingTime.setToTime(OffsetDateTime.of(1, 1, 1, 13, 0, 0, 0, ZoneOffset.UTC));
        WorkingTime secondWorkingTime = new WorkingTime();
        secondWorkingTime.setFromTime(OffsetDateTime.of(1, 1, 1, 14, 0, 0, 0, ZoneOffset.UTC));
        secondWorkingTime.setToTime(OffsetDateTime.of(1, 1, 1, 17, 0, 0, 0, ZoneOffset.UTC));
        WeekDay firstDay = new WeekDay();
        firstDay.setDayWorking(false);
        firstDay.setDayType(DayType.SUNDAY);
        WeekDay secondDay = new WeekDay();
        secondDay.setDayWorking(true);
        secondDay.setDayType(DayType.MONDAY);
        secondDay.setFromDate(OffsetDateTime.of(1, 1, 1, 8, 0, 0, 0, ZoneOffset.UTC));
        secondDay.setToDate(OffsetDateTime.of(1, 1, 1, 17, 0, 0, 0, ZoneOffset.UTC));
        secondDay.setWorkingTimes(Arrays.asList(firstWorkingTime, secondWorkingTime));
        Calendar calendar = new Calendar();
        calendar.setUid(1);
        calendar.setName("Modified calendar");
        calendar.setDays(Arrays.asList(firstDay, secondDay));
        calendar.setIsBaseCalendar(false);
        calendar.setIsBaselineCalendar(false);

        PutCalendarRequest request1 = new PutCalendarRequest(remoteFileName, calendar.getUid(), calendar, null,null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.putCalendar(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetCalendarRequest request2 = new GetCalendarRequest(remoteFileName, calendar.getUid(), null, null);
        CalendarResponse result2 = TestInitializer.tasksApi.getCalendar(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getCalendar());
        assertEquals(calendar.getName(), result2.getCalendar().getName());
        assertEquals(7, result2.getCalendar().getDays().size());
        WeekDay monday = result2.getCalendar().getDays().stream().filter(d -> d.getDayType() == DayType.MONDAY).findAny().get();
        assertEquals(2, monday.getWorkingTimes().size());
        assertEquals(firstWorkingTime.getFromTime(), monday.getWorkingTimes().get(0).getFromTime());
        assertEquals(firstWorkingTime.getToTime(), monday.getWorkingTimes().get(0).getToTime());
        assertEquals(secondWorkingTime.getFromTime(), monday.getWorkingTimes().get(1).getFromTime());
        assertEquals(secondWorkingTime.getToTime(), monday.getWorkingTimes().get(1).getToTime());
    }

    /*
     * Test for delete сalendar.
     */
    @Test
    public void testDeleteCalendar() throws ApiException {
        String localFileName = "CalendarWorkWeeks.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DeleteCalendarRequest request1 = new DeleteCalendarRequest(remoteFileName, 3, null,null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.deleteCalendar(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetCalendarsRequest request2 = new GetCalendarsRequest(remoteFileName, null, null);
        CalendarItemsResponse result2 = TestInitializer.tasksApi.getCalendars(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getCalendars());
        assertEquals(1, result2.getCalendars().getList().size());
        assertNotSame(request1.getcalendarUid(), result2.getCalendars().getList().get(0).getUid());
    }
}
