/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TaskDocumentFormatTests.java">
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
import com.aspose.tasks.cloud.model.*;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.ResourceItemResponse;
import com.aspose.tasks.cloud.model.responses.ResourceItemsResponse;
import com.aspose.tasks.cloud.model.responses.ResourceResponse;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import java.io.File;
import java.math.BigDecimal;
import java.util.Collections;

/*
 * Example of how to work with task document format.
 */
public class TaskDocumentFormatTests extends TestBase {

    /*
     * Test for get task document with format.
     */
    @Test
    public void testGetTaskDocumentWithFormat() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskDocumentWithFormatRequest request = new GetTaskDocumentWithFormatRequest(remoteFileName, ProjectFileFormat.CSV.getValue(), false, null, null);
        File result = TestInitializer.tasksApi.getTaskDocumentWithFormat(request);

        assertNotNull(result);
        assertTrue(result.exists());
        String[] fileAsStrings = ReadFileAsStrings(result);
        assertEquals("ID;Task_Name;Outline_Level;Duration;Start_Date;Finish_Date;Percent_Comp;Cost;Work", fileAsStrings[0]);
        assertEquals("1;Five to Eight Weeks Before Moving;1;16 days;Thu 01.01.04 08:00;Thu 22.01.04 17:00;0%;$0;0 hrs", fileAsStrings[1]);
    }

    /*
     * Test for get task document with format as zipped html.
     */
    @Test
    public void testGetTaskDocumentWithFormatAsZippedHtml() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskDocumentWithFormatRequest request = new GetTaskDocumentWithFormatRequest(remoteFileName, ProjectFileFormat.HTML.getValue(), true, null, null);
        File result = TestInitializer.tasksApi.getTaskDocumentWithFormat(request);

        assertNotNull(result);
        assertTrue(result.exists());
    }
}
