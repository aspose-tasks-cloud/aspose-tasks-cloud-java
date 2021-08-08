/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OutlineCodesTests.java">
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
import com.aspose.tasks.cloud.model.requests.DeleteOutlineCodeByIndexRequest;
import com.aspose.tasks.cloud.model.requests.GetOutlineCodeByIndexRequest;
import com.aspose.tasks.cloud.model.requests.GetOutlineCodesRequest;
import com.aspose.tasks.cloud.model.requests.GetPageCountRequest;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.OutlineCodeItemsResponse;
import com.aspose.tasks.cloud.model.responses.OutlineCodeResponse;
import com.aspose.tasks.cloud.model.responses.PageCountResponse;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/*
 * Example of how to work with outline codes.
 */
public class OutlineCodesTests extends TestBase {


    /*
     * Test for get outline codes.
     */
    @Test
    public void testGetOutlineCodes() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetOutlineCodesRequest request = new GetOutlineCodesRequest(remoteFileName, null, null);
        OutlineCodeItemsResponse result = TestInitializer.tasksApi.getOutlineCodes(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getOutlineCodes());
        assertEquals(2, result.getOutlineCodes().getList().size());
    }

    /*
     * Test for get outline code by index.
     */
    @Test
    public void testGetOutlineCodeByIndex() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetOutlineCodeByIndexRequest request = new GetOutlineCodeByIndexRequest(remoteFileName, 1, null, null);
        OutlineCodeResponse result = TestInitializer.tasksApi.getOutlineCodeByIndex(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getOutlineCode());
        assertEquals("F45D601B-70C5-E311-A5BA-D43D7E937F92", result.getOutlineCode().getGuid());
    }

    /*
     * Test for delete outline code by index.
     */
    @Test
    public void testDeleteOutlineCodeByIndex() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DeleteOutlineCodeByIndexRequest request1 = new DeleteOutlineCodeByIndexRequest(remoteFileName, 1, null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.deleteOutlineCodeByIndex(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetOutlineCodesRequest request2 = new GetOutlineCodesRequest(remoteFileName, null, null);
        OutlineCodeItemsResponse result2 = TestInitializer.tasksApi.getOutlineCodes(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getOutlineCodes());
        assertEquals(1, result2.getOutlineCodes().getList().size());
        assertEquals(1, result2.getOutlineCodes().getList().get(0).getIndex().intValue());
    }
}
