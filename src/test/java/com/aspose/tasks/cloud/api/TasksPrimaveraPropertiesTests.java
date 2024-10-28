/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TasksPrimaveraPropertiesTests.java">
 *   Copyright (c) 2022 Aspose.Tasks Cloud
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
import com.aspose.tasks.cloud.model.responses.ExtendedAttributeItemResponse;
import com.aspose.tasks.cloud.model.responses.PrimaveraTaskPropertiesResponse;
import com.aspose.tasks.cloud.model.responses.TaskItemsResponse;
import com.aspose.tasks.cloud.model.responses.TaskResponse;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import java.math.BigDecimal;
import java.util.Arrays;

/*
 * Example of how to work with task primavera properties.
 */
public class TasksPrimaveraPropertiesTests extends TestBase {

    /*
     * Test for for get task primavera properties.
     */
    @Test
    public void testGetPrimaveraTaskProperties() throws Exception {
        String localFileName = "p6_multiproject.xml";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetPrimaveraTaskPropertiesRequest request = new GetPrimaveraTaskPropertiesRequest(remoteFileName, 1, null, null);
        PrimaveraTaskPropertiesResponse result = TestInitializer.tasksApi.getPrimaveraTaskProperties(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertNotNull(result.getPrimaveraProperties());
        assertEquals(Integer.valueOf(0), result.getPrimaveraProperties().getSequenceNumber());
        assertEquals("A1040", result.getPrimaveraProperties().getActivityId());
        assertEquals(Integer.valueOf(0), result.getPrimaveraProperties().getSequenceNumber());
        assertEquals(OffsetDateTime.of(2000, 10, 12, 8, 0, 0, 0, ZoneOffset.UTC), result.getPrimaveraProperties().getRemainingEarlyStart());
        assertEquals(OffsetDateTime.of(2000, 10, 12, 17, 0, 0, 0, ZoneOffset.UTC), result.getPrimaveraProperties().getRemainingEarlyFinish());
        assertEquals(OffsetDateTime.of(2000, 10, 12, 8, 0, 0, 0, ZoneOffset.UTC), result.getPrimaveraProperties().getRemainingLateStart());
        assertEquals(OffsetDateTime.of(2000, 10, 12, 17, 0, 0, 0, ZoneOffset.UTC), result.getPrimaveraProperties().getRemainingLateFinish());
        assertEquals("Fixed Units", result.getPrimaveraProperties().getRawDurationType());
        assertEquals("Task Dependent", result.getPrimaveraProperties().getRawActivityType());
        assertEquals("Units", result.getPrimaveraProperties().getRawCompletePercentType());
        assertEquals("Not Started", result.getPrimaveraProperties().getRawStatus());
        assertEquals(PrimaveraDurationType.FIXEDUNITS, result.getPrimaveraProperties().getDurationType());
        assertEquals(PrimaveraActivityType.TASKDEPENDENT, result.getPrimaveraProperties().getActivityType());
        assertEquals(PrimaveraPercentCompleteType.UNITS, result.getPrimaveraProperties().getPercentCompleteType());
    }
}
