/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetPageCountTests.java">
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
import com.aspose.tasks.cloud.model.PresentationFormat;
import com.aspose.tasks.cloud.model.Timescale;
import com.aspose.tasks.cloud.model.requests.GetExtendedAttributesRequest;
import com.aspose.tasks.cloud.model.requests.GetPageCountRequest;
import com.aspose.tasks.cloud.model.responses.ExtendedAttributeItemsResponse;
import com.aspose.tasks.cloud.model.responses.PageCountResponse;
import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/*
 * Example of how to work with page count.
 */
public class GetPageCountTests extends TestBase {


    /*
     * Test for get page count.
     */
    @Test
    public void testGetPageCount() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetPageCountRequest request = new GetPageCountRequest(remoteFileName, null, PresentationFormat.TASKUSAGE.getValue(), Timescale.MONTHS.getValue(), null, null, null, null);
        PageCountResponse result = TestInitializer.tasksApi.getPageCount(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertEquals(4, result.getPageCount().intValue());
    }

    /*
     * Test for get page count with specified date interval.
     */
    @Test
    public void testGetPageCountWithSpecifiedDateInterval() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetPageCountRequest request = new GetPageCountRequest(remoteFileName, null, PresentationFormat.TASKUSAGE.getValue(), Timescale.MONTHS.getValue(), OffsetDateTime.of(2004, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), OffsetDateTime.of(2004, 1, 28, 0, 0, 0, 0, ZoneOffset.UTC), null, null);
        PageCountResponse result = TestInitializer.tasksApi.getPageCount(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertEquals(4, result.getPageCount().intValue());
    }
}
