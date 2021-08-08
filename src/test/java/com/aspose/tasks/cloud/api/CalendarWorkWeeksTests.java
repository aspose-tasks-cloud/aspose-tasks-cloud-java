/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CalendarWorkWeeksTests.java">
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
import com.aspose.tasks.cloud.model.DayType;
import com.aspose.tasks.cloud.model.WorkWeek;
import com.aspose.tasks.cloud.model.requests.GetCalendarWorkWeeksRequest;
import com.aspose.tasks.cloud.model.requests.GetCalendarsRequest;
import com.aspose.tasks.cloud.model.responses.CalendarItemsResponse;
import com.aspose.tasks.cloud.model.responses.CalendarWorkWeeksResponse;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

/*
 * Example of how to work with сalendar workweeks.
 */
public class CalendarWorkWeeksTests extends TestBase {


    /*
     * Test for get сalendar workweeks.
     */
    @Test
    public void testGetCalendarWorkWeeks() throws ApiException {
        String localFileName = "CalendarWorkWeeks.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetCalendarsRequest request1 = new GetCalendarsRequest(remoteFileName, null, null);
        CalendarItemsResponse result1 = TestInitializer.tasksApi.getCalendars(request1);
        assertNotNull(result1);
        assertNotNull(result1.getCalendars());

        Integer calendarUid = result1.getCalendars().getList().stream().filter(c -> c.getName().equals("Test work weeks")).findAny().get().getUid();
        GetCalendarWorkWeeksRequest request2 = new GetCalendarWorkWeeksRequest(remoteFileName, calendarUid,null, null);
        CalendarWorkWeeksResponse result2 = TestInitializer.tasksApi.getCalendarWorkWeeks(request2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getCalendarWorkWeeks());
        assertEquals(1, result2.getCalendarWorkWeeks().size());
        WorkWeek workWeek = result2.getCalendarWorkWeeks().get(0);
        assertEquals("Work week 1", workWeek.getName());
        assertEquals(OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), workWeek.getFromDate());
        assertEquals(OffsetDateTime.of(2018, 1, 7, 23, 59, 0, 0, ZoneOffset.UTC), workWeek.getToDate());
        assertEquals(4, workWeek.getWeekDays().size());

        assertTrue(workWeek.getWeekDays().get(0).isDayWorking());
        assertEquals(DayType.MONDAY, workWeek.getWeekDays().get(0).getDayType());
        assertEquals(1, workWeek.getWeekDays().get(0).getWorkingTimes().size());
        assertEquals(OffsetDateTime.of(1, 1, 1, 11, 30, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(0).getWorkingTimes().get(0).getFromTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 12, 30, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(0).getWorkingTimes().get(0).getToTime());

        assertFalse(workWeek.getWeekDays().get(1).isDayWorking());
        assertEquals(DayType.TUESDAY, workWeek.getWeekDays().get(1).getDayType());
        assertEquals(0, workWeek.getWeekDays().get(1).getWorkingTimes().size());

        assertTrue(workWeek.getWeekDays().get(2).isDayWorking());
        assertEquals(DayType.WEDNESDAY, workWeek.getWeekDays().get(2).getDayType());
        assertEquals(2, workWeek.getWeekDays().get(2).getWorkingTimes().size());
        assertEquals(OffsetDateTime.of(1, 1, 1, 9, 30, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(2).getWorkingTimes().get(0).getFromTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 13, 23, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(2).getWorkingTimes().get(0).getToTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 14, 45, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(2).getWorkingTimes().get(1).getFromTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 18, 45, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(2).getWorkingTimes().get(1).getToTime());

        assertTrue(workWeek.getWeekDays().get(3).isDayWorking());
        assertEquals(DayType.SATURDAY, workWeek.getWeekDays().get(3).getDayType());
        assertEquals(1, workWeek.getWeekDays().get(3).getWorkingTimes().size());
        assertEquals(OffsetDateTime.of(1, 1, 1, 9, 0, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(3).getWorkingTimes().get(0).getFromTime());
        assertEquals(OffsetDateTime.of(1, 1, 1, 10, 0, 0, 0, ZoneOffset.UTC), workWeek.getWeekDays().get(3).getWorkingTimes().get(0).getToTime());
    }
}
