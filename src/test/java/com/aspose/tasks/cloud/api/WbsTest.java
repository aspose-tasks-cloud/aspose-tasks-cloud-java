/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WbsTest.java">
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
import com.aspose.tasks.cloud.model.VbaModule;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.*;
import org.junit.Test;

import java.util.ArrayList;

/*
 * Example of how to work with WBS.
 */
public class WbsTest extends TestBase {

    /*
     * Test for get wbs definition.
     */
    @Test
    public void testGetWbsDefinition() throws Exception {
        String localFileName = "WBSDefinition.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetWbsDefinitionRequest request = new GetWbsDefinitionRequest(remoteFileName, null, null);
        WBSDefinitionResponse result = TestInitializer.tasksApi.getWbsDefinition(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertTrue(result.getWbsDefinition().isGenerateWBSCode());
        assertTrue(result.getWbsDefinition().isVerifyUniqueness());
    }

    /*
     * Test for put renumber wbs code.
     */
    @Test
    public void testPutRenumberWbsCode() throws Exception {
        String localFileName = "WBSDefinition.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        PutRenumberWbsCodeRequest request = new PutRenumberWbsCodeRequest(remoteFileName, new ArrayList<Integer>(), null, null,null);
        AsposeResponse result = TestInitializer.tasksApi.putRenumberWbsCode(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
    }
}
