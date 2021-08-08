/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TimephasedDataTests.java">
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
import com.aspose.tasks.cloud.model.TaskCreationRequest;
import com.aspose.tasks.cloud.model.TaskItem;
import com.aspose.tasks.cloud.model.TimephasedDataType;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.*;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import java.util.Arrays;
import java.util.Optional;

/*
 * Example of how to work with timephased data.
 */
public class TimephasedDataTests extends TestBase {

    /*
     * Test for get task timephased data.
     */
    @Test
    public void testGetTaskTimephasedData() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTaskTimephasedDataRequest request = new GetTaskTimephasedDataRequest(remoteFileName, 27, TimephasedDataType.TASKWORK.getValue(), null, null, null,null);
        TimephasedDataResponse result = TestInitializer.tasksApi.getTaskTimephasedData(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getItems());
        assertTrue(1 <= result.getItems().size());
        assertTrue(result.getItems().stream().allMatch(i -> i.getUid().equals(27) && i.getTimephasedDataType().equals(TimephasedDataType.TASKWORK)));
    }

    /*
     * Test for get resource timephased data.
     */
    @Test
    public void testGetResourceTimephasedData() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetResourceTimephasedDataRequest request = new GetResourceTimephasedDataRequest(remoteFileName, 1, TimephasedDataType.RESOURCEWORK.getValue(), null, null, null,null);
        TimephasedDataResponse result = TestInitializer.tasksApi.getResourceTimephasedData(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getItems());
        assertTrue(1 <= result.getItems().size());
        assertTrue(result.getItems().stream().allMatch(i -> i.getUid().equals(1) && i.getTimephasedDataType().equals(TimephasedDataType.RESOURCEWORK)));
    }

    /*
     * Test for get assignment timephased data.
     */
    @Test
    public void testGetAssignmentTimephasedData() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetAssignmentTimephasedDataRequest request = new GetAssignmentTimephasedDataRequest(remoteFileName, 66, TimephasedDataType.ASSIGNMENTWORK.getValue(), null, null, null,null);
        TimephasedDataResponse result = TestInitializer.tasksApi.getAssignmentTimephasedData(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getItems());
        assertTrue(1 <= result.getItems().size());
        assertTrue(result.getItems().stream().allMatch(i -> i.getUid().equals(66) && i.getTimephasedDataType().equals(TimephasedDataType.ASSIGNMENTWORK)));
    }
}
