/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReportTests.java">
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

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

/*
 * Example of how to work with reports.
 */
public class ReportTests extends TestBase {

    /*
     * Test for get report pdf.
     */
    @Test
    public void testGetReportPdf() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetReportPdfRequest request = new GetReportPdfRequest(remoteFileName, ReportType.MILESTONES.getValue(), null, null);
        File result = TestInitializer.tasksApi.getReportPdf(request);

        assertNotNull(result);
        assertTrue(result.exists());
        String[] fileAsStrings = ReadFileAsStrings(result);
        assertEquals("%PDF-1.5", fileAsStrings[0]);
    }

    /*
     * Test for get critical path.
     */
    @Test
    public void testGetCriticalPath() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetCriticalPathRequest request = new GetCriticalPathRequest(remoteFileName, null, null);
        TaskItemsResponse result = TestInitializer.tasksApi.getCriticalPath(request);

        assertNotNull(result);
        assertNotNull(result.getTasks().getTaskItem());
        assertEquals(76, result.getTasks().getTaskItem().size());
    }

    /*
     * Test for get risk analysis report.
     */
    @Test
    public void testGetRiskAnalysisReport() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetRiskAnalysisReportRequest request = new GetRiskAnalysisReportRequest(remoteFileName, 1, ProbabilityDistributionType.NORMAL.getValue(), 80, 130, ConfidenceLevel.CL85.getValue(),200, null, null, null);
        File result = TestInitializer.tasksApi.getRiskAnalysisReport(request);

        assertNotNull(result);
        assertTrue(result.exists());
        String[] fileAsStrings = ReadFileAsStrings(result);
        assertEquals("%PDF-1.5", fileAsStrings[0]);
    }
}
