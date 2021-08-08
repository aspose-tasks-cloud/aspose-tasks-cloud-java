/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TasksExtendedAttributesTests.java">
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
import com.aspose.tasks.cloud.model.responses.ExtendedAttributeItemResponse;
import com.aspose.tasks.cloud.model.responses.TaskResponse;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;
import java.math.BigDecimal;
import java.util.Arrays;

/*
 * Example of how to work with task extended attributes.
 */
public class TasksExtendedAttributesTests extends TestBase {

    /*
     * Test for put extended attribute with put task and lookup value.
     */
    @Test
    public void testPutExtendedAttributeWithPutTaskAndLookupValue() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        Value firstValue = new Value();
        firstValue.setDescription("descr1");
        firstValue.setVal("Internal");
        firstValue.setId(111);
        Value secondValue = new Value();
        secondValue.setDescription("descr2");
        secondValue.setVal("External");
        secondValue.setId(112);
        ExtendedAttributeDefinition newExtendedAttributeDef = new ExtendedAttributeDefinition();
        newExtendedAttributeDef.setCalculationType(CalculationType.LOOKUP);
        newExtendedAttributeDef.setCfType(CustomFieldType.TEXT);
        newExtendedAttributeDef.setFieldName("Text3");
        newExtendedAttributeDef.setElementType(ElementType.TASK);
        newExtendedAttributeDef.setAlias("New Field");
        newExtendedAttributeDef.setValueList(Arrays.asList(firstValue, secondValue));

        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttributeDef, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 27,null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());

        ExtendedAttribute newExtendedAttribute = new ExtendedAttribute();
        newExtendedAttribute.setLookupValueId(112);
        newExtendedAttribute.setFieldId(result1.getExtendedAttribute().getFieldId());
        Task taskToModify = result2.getTask();
        taskToModify.getExtendedAttributes().add(newExtendedAttribute);
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, 27, taskToModify, null, null, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(Integer.valueOf(200), result3.getCode());

        result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(1, result2.getTask().getExtendedAttributes().size());
        assertEquals("188743737", result2.getTask().getExtendedAttributes().get(0).getFieldId());
        assertEquals(Integer.valueOf(112), result2.getTask().getExtendedAttributes().get(0).getLookupValueId());
    }

    /*
     * Test for put extended attribute with put task and date value.
     */
    @Test
    public void testPutExtendedAttributeWithPutTaskAndDateValue() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        ExtendedAttributeDefinition newExtendedAttributeDef = new ExtendedAttributeDefinition();
        newExtendedAttributeDef.setCalculationType(CalculationType.NONE);
        newExtendedAttributeDef.setCfType(CustomFieldType.FINISH);
        newExtendedAttributeDef.setFieldName("Finish4");
        newExtendedAttributeDef.setElementType(ElementType.TASK);
        newExtendedAttributeDef.setAlias("Custom Finish Field");

        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttributeDef, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 27,null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());

        ExtendedAttribute newExtendedAttribute = new ExtendedAttribute();
        newExtendedAttribute.setDateValue(OffsetDateTime.of(2018, 3, 4, 12, 30, 0, 0, ZoneOffset.UTC));
        newExtendedAttribute.setFieldId(result1.getExtendedAttribute().getFieldId());
        Task taskToModify = result2.getTask();
        taskToModify.getExtendedAttributes().add(newExtendedAttribute);
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, 27, taskToModify, null, null, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(Integer.valueOf(200), result3.getCode());

        result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(1, result2.getTask().getExtendedAttributes().size());
        assertEquals(newExtendedAttribute.getFieldId(), result2.getTask().getExtendedAttributes().get(0).getFieldId());
        assertEquals(newExtendedAttribute.getDateValue(), result2.getTask().getExtendedAttributes().get(0).getDateValue());
    }

    /*
     * Test for put extended attribute with put task and duration value.
     */
    @Test
    public void testPutExtendedAttributeWithPutTaskAndDurationValue() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        ExtendedAttributeDefinition newExtendedAttributeDef = new ExtendedAttributeDefinition();
        newExtendedAttributeDef.setCalculationType(CalculationType.NONE);
        newExtendedAttributeDef.setCfType(CustomFieldType.DURATION);
        newExtendedAttributeDef.setFieldName("Duration3");
        newExtendedAttributeDef.setElementType(ElementType.TASK);
        newExtendedAttributeDef.setAlias("Custom Duration Field");

        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttributeDef, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 27,null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());

        Duration duration = new Duration();
        duration.setTimeSpan("04:00:00");
        duration.setTimeUnit(TimeUnitType.MINUTE);
        ExtendedAttribute newExtendedAttribute = new ExtendedAttribute();
        newExtendedAttribute.setDurationValue(duration);
        newExtendedAttribute.setFieldId(result1.getExtendedAttribute().getFieldId());
        Task taskToModify = result2.getTask();
        taskToModify.getExtendedAttributes().add(newExtendedAttribute);
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, 27, taskToModify, null, null, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(Integer.valueOf(200), result3.getCode());

        result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(1, result2.getTask().getExtendedAttributes().size());
        assertEquals(newExtendedAttribute.getFieldId(), result2.getTask().getExtendedAttributes().get(0).getFieldId());
        assertNotNull(result2.getTask().getExtendedAttributes().get(0).getDurationValue());
        assertEquals(duration.getTimeSpan(), result2.getTask().getExtendedAttributes().get(0).getDurationValue().getTimeSpan());
    }

    /*
     * Test for put extended attribute with put task and flag value.
     */
    @Test
    public void testPutExtendedAttributeWithPutTaskAndFlagValue() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        ExtendedAttributeDefinition newExtendedAttributeDef = new ExtendedAttributeDefinition();
        newExtendedAttributeDef.setCalculationType(CalculationType.NONE);
        newExtendedAttributeDef.setCfType(CustomFieldType.FLAG);
        newExtendedAttributeDef.setFieldName("Flag12");
        newExtendedAttributeDef.setElementType(ElementType.TASK);
        newExtendedAttributeDef.setAlias("Custom Flag Field");

        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttributeDef, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 27,null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());

        ExtendedAttribute newExtendedAttribute = new ExtendedAttribute();
        newExtendedAttribute.setFlagValue(true);
        newExtendedAttribute.setFieldId(result1.getExtendedAttribute().getFieldId());
        Task taskToModify = result2.getTask();
        taskToModify.getExtendedAttributes().add(newExtendedAttribute);
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, 27, taskToModify, null, null, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(Integer.valueOf(200), result3.getCode());

        result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(1, result2.getTask().getExtendedAttributes().size());
        assertEquals(newExtendedAttribute.getFieldId(), result2.getTask().getExtendedAttributes().get(0).getFieldId());
        assertTrue(result2.getTask().getExtendedAttributes().get(0).isFlagValue());
    }

    /*
     * Test for put extended attribute with put task and number value.
     */
    @Test
    public void testPutExtendedAttributeWithPutTaskAndNumberValue() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        ExtendedAttributeDefinition newExtendedAttributeDef = new ExtendedAttributeDefinition();
        newExtendedAttributeDef.setCalculationType(CalculationType.NONE);
        newExtendedAttributeDef.setCfType(CustomFieldType.NUMBER);
        newExtendedAttributeDef.setFieldName("Number9");
        newExtendedAttributeDef.setElementType(ElementType.TASK);
        newExtendedAttributeDef.setAlias("Custom Number Field");

        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttributeDef, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 27,null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());

        ExtendedAttribute newExtendedAttribute = new ExtendedAttribute();
        newExtendedAttribute.setNumericValue(BigDecimal.valueOf(99.99));
        newExtendedAttribute.setFieldId(result1.getExtendedAttribute().getFieldId());
        Task taskToModify = result2.getTask();
        taskToModify.getExtendedAttributes().add(newExtendedAttribute);
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, 27, taskToModify, null, null, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(Integer.valueOf(200), result3.getCode());

        result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(1, result2.getTask().getExtendedAttributes().size());
        assertEquals(newExtendedAttribute.getFieldId(), result2.getTask().getExtendedAttributes().get(0).getFieldId());
        assertEquals(newExtendedAttribute.getNumericValue(), result2.getTask().getExtendedAttributes().get(0).getNumericValue());
    }

    /*
     * Test for put extended attribute with put task and cost value.
     */
    @Test
    public void testPutExtendedAttributeWithPutTaskAndCostValue() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        ExtendedAttributeDefinition newExtendedAttributeDef = new ExtendedAttributeDefinition();
        newExtendedAttributeDef.setCalculationType(CalculationType.NONE);
        newExtendedAttributeDef.setCfType(CustomFieldType.COST);
        newExtendedAttributeDef.setFieldName("Cost10");
        newExtendedAttributeDef.setElementType(ElementType.TASK);
        newExtendedAttributeDef.setAlias("Custom Cost Field");

        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttributeDef, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 27,null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());

        ExtendedAttribute newExtendedAttribute = new ExtendedAttribute();
        newExtendedAttribute.setNumericValue(BigDecimal.valueOf(115.99));
        newExtendedAttribute.setFieldId(result1.getExtendedAttribute().getFieldId());
        Task taskToModify = result2.getTask();
        taskToModify.getExtendedAttributes().add(newExtendedAttribute);
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, 27, taskToModify, null, null, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(Integer.valueOf(200), result3.getCode());

        result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(1, result2.getTask().getExtendedAttributes().size());
        assertEquals(newExtendedAttribute.getFieldId(), result2.getTask().getExtendedAttributes().get(0).getFieldId());
        assertEquals(newExtendedAttribute.getNumericValue(), result2.getTask().getExtendedAttributes().get(0).getNumericValue());
    }

    /*
     * Test for put extended attribute with put task and text value.
     */
    @Test
    public void testPutExtendedAttributeWithPutTaskAndTextValue() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        ExtendedAttributeDefinition newExtendedAttributeDef = new ExtendedAttributeDefinition();
        newExtendedAttributeDef.setCalculationType(CalculationType.NONE);
        newExtendedAttributeDef.setCfType(CustomFieldType.TEXT);
        newExtendedAttributeDef.setFieldName("Text1");
        newExtendedAttributeDef.setElementType(ElementType.TASK);
        newExtendedAttributeDef.setAlias("Custom Text Field");

        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttributeDef, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(Integer.valueOf(200), result1.getCode());

        GetTaskRequest request2 = new GetTaskRequest(remoteFileName, 27,null, null);
        TaskResponse result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());

        ExtendedAttribute newExtendedAttribute = new ExtendedAttribute();
        newExtendedAttribute.setTextValue("Test value");
        newExtendedAttribute.setFieldId(result1.getExtendedAttribute().getFieldId());
        Task taskToModify = result2.getTask();
        taskToModify.getExtendedAttributes().add(newExtendedAttribute);
        PutTaskRequest request3 = new PutTaskRequest(remoteFileName, 27, taskToModify, null, null, null, null, null);
        TaskResponse result3 = TestInitializer.tasksApi.putTask(request3);
        assertNotNull(result3);
        assertEquals(Integer.valueOf(200), result3.getCode());

        result2 = TestInitializer.tasksApi.getTask(request2);
        assertNotNull(result2);
        assertEquals(Integer.valueOf(200), result2.getCode());
        assertNotNull(result2.getTask());
        assertEquals(1, result2.getTask().getExtendedAttributes().size());
        assertEquals(newExtendedAttribute.getFieldId(), result2.getTask().getExtendedAttributes().get(0).getFieldId());
        assertEquals(newExtendedAttribute.getTextValue(), result2.getTask().getExtendedAttributes().get(0).getTextValue());
    }
}
