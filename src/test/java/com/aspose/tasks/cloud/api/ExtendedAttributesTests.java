/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExtendedAttributesTests.java">
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
import com.aspose.tasks.cloud.model.requests.DeleteExtendedAttributeByIndexRequest;
import com.aspose.tasks.cloud.model.requests.GetExtendedAttributeByIndexRequest;
import com.aspose.tasks.cloud.model.requests.GetExtendedAttributesRequest;
import com.aspose.tasks.cloud.model.requests.PutExtendedAttributeRequest;
import com.aspose.tasks.cloud.model.responses.AsposeResponse;
import com.aspose.tasks.cloud.model.responses.ExtendedAttributeItemResponse;
import com.aspose.tasks.cloud.model.responses.ExtendedAttributeItemsResponse;
import com.aspose.tasks.cloud.model.responses.ExtendedAttributeResponse;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Example of how to work with extended attributes.
 */
public class ExtendedAttributesTests extends TestBase {


    /*
     * Test for get extended attributes.
     */
    @Test
    public void testGetExtendedAttributes() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetExtendedAttributesRequest request = new GetExtendedAttributesRequest(remoteFileName, null, null);
        ExtendedAttributeItemsResponse result = TestInitializer.tasksApi.getExtendedAttributes(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getExtendedAttributes());
        assertEquals(2, result.getExtendedAttributes().getList().size());
    }

    /*
     * Test for get extended attribute by index.
     */
    @Test
    public void testGetExtendedAttributeByIndex() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetExtendedAttributeByIndexRequest request = new GetExtendedAttributeByIndexRequest(remoteFileName, 1,null, null);
        ExtendedAttributeResponse result = TestInitializer.tasksApi.getExtendedAttributeByIndex(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getExtendedAttribute());
        assertEquals("Text1", result.getExtendedAttribute().getFieldName());
        assertEquals(CalculationType.LOOKUP, result.getExtendedAttribute().getCalculationType());
        assertEquals(1, result.getExtendedAttribute().getValueList().size());
        assertEquals("descr", result.getExtendedAttribute().getValueList().get(0).getDescription());
        assertEquals(1, result.getExtendedAttribute().getValueList().get(0).getId().intValue());
    }

    /*
     * Test for put extended attribute.
     */
    @Test
    public void testPutExtendedAttribute() throws ApiException {
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
        ExtendedAttributeDefinition newExtendedAttribute = new ExtendedAttributeDefinition();
        newExtendedAttribute.setCalculationType(CalculationType.LOOKUP);
        newExtendedAttribute.setCfType(CustomFieldType.TEXT);
        newExtendedAttribute.setFieldName("Text3");
        newExtendedAttribute.setElementType(ElementType.TASK);
        newExtendedAttribute.setAlias("New Field");
        newExtendedAttribute.setValueList(Arrays.asList(firstValue, secondValue));
        PutExtendedAttributeRequest request1 = new PutExtendedAttributeRequest(newExtendedAttribute, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result1 = TestInitializer.tasksApi.putExtendedAttribute(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());
        assertNotNull(result1.getExtendedAttribute());
        assertEquals(newExtendedAttribute.getFieldName(), result1.getExtendedAttribute().getFieldName());
        assertEquals(newExtendedAttribute.getAlias(), result1.getExtendedAttribute().getAlias());
        assertEquals("188743737", result1.getExtendedAttribute().getFieldId());

        Integer addedAttributeIndex = result1.getExtendedAttribute().getIndex();
        GetExtendedAttributeByIndexRequest request2 = new GetExtendedAttributeByIndexRequest(remoteFileName, addedAttributeIndex,null, null);
        ExtendedAttributeResponse result2 = TestInitializer.tasksApi.getExtendedAttributeByIndex(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getExtendedAttribute());
        assertEquals(result1.getExtendedAttribute().getFieldId(), result2.getExtendedAttribute().getFieldId());
        assertEquals(newExtendedAttribute.getFieldName(), result2.getExtendedAttribute().getFieldName());
        assertEquals(newExtendedAttribute.getCfType(), result2.getExtendedAttribute().getCfType());
        assertEquals(newExtendedAttribute.getAlias(), result2.getExtendedAttribute().getAlias());
        List<Value> valueList = result2.getExtendedAttribute().getValueList();
        assertEquals(2, valueList.size());
        assertEquals(firstValue.getId(), valueList.get(0).getId());
        assertEquals(firstValue.getVal(), valueList.get(0).getVal());
        assertEquals(firstValue.getDescription(), valueList.get(0).getDescription());
        assertEquals(secondValue.getId(), valueList.get(1).getId());
        assertEquals(secondValue.getVal(), valueList.get(1).getVal());
        assertEquals(secondValue.getDescription(), valueList.get(1).getDescription());
    }

    /*
     * Test for put extended attribute as edit existing attribute.
     */
    @Test
    public void testPutExtendedAttributeEditExistingAttribute() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetExtendedAttributeByIndexRequest request1 = new GetExtendedAttributeByIndexRequest(remoteFileName, 1,null, null);
        ExtendedAttributeResponse result1 = TestInitializer.tasksApi.getExtendedAttributeByIndex(request1);
        assertNotNull(result1.getExtendedAttribute());

        ExtendedAttributeDefinition extendedAttributeToEdit = result1.getExtendedAttribute();
        extendedAttributeToEdit.setCalculationType(CalculationType.NONE);
        extendedAttributeToEdit.setCfType(CustomFieldType.TEXT);
        extendedAttributeToEdit.setFieldName("Text1");
        extendedAttributeToEdit.setElementType(ElementType.TASK);
        extendedAttributeToEdit.setAlias("Edited field");
        extendedAttributeToEdit.setValueList(Collections.emptyList());
        PutExtendedAttributeRequest request2 = new PutExtendedAttributeRequest(extendedAttributeToEdit, remoteFileName, null,null, null);
        ExtendedAttributeItemResponse result2 = TestInitializer.tasksApi.putExtendedAttribute(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getExtendedAttribute());
        assertEquals(extendedAttributeToEdit.getFieldName(), result2.getExtendedAttribute().getFieldName());
        assertEquals(extendedAttributeToEdit.getAlias(), result2.getExtendedAttribute().getAlias());
        assertEquals(extendedAttributeToEdit.getFieldId(), result2.getExtendedAttribute().getFieldId());

        Integer attributeIndex = result2.getExtendedAttribute().getIndex();
        GetExtendedAttributeByIndexRequest request3 = new GetExtendedAttributeByIndexRequest(remoteFileName, attributeIndex,null, null);
        ExtendedAttributeResponse result3 = TestInitializer.tasksApi.getExtendedAttributeByIndex(request3);
        assertNotNull(result3);
        assertEquals(200, (int) result3.getCode());
        assertNotNull(result3.getExtendedAttribute());
        assertEquals(extendedAttributeToEdit.getFieldId(), result3.getExtendedAttribute().getFieldId());
        assertEquals(extendedAttributeToEdit.getFieldName(), result3.getExtendedAttribute().getFieldName());
        assertEquals(extendedAttributeToEdit.getCfType(), result3.getExtendedAttribute().getCfType());
        assertEquals(extendedAttributeToEdit.getAlias(), result3.getExtendedAttribute().getAlias());
        assertEquals(0, result3.getExtendedAttribute().getValueList().size());
    }

    /*
     * Test for delete extended attribute by index.
     */
    @Test
    public void testDeleteExtendedAttributeByIndex() throws ApiException {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DeleteExtendedAttributeByIndexRequest request1 = new DeleteExtendedAttributeByIndexRequest(remoteFileName, 1,null, null);
        AsposeResponse result1 = TestInitializer.tasksApi.deleteExtendedAttributeByIndex(request1);
        assertEquals(200, (int) result1.getCode());

        GetExtendedAttributesRequest request2 = new GetExtendedAttributesRequest(remoteFileName, null, null);
        ExtendedAttributeItemsResponse result2 = TestInitializer.tasksApi.getExtendedAttributes(request2);
        assertNotNull(result2);
        assertEquals(200, (int) result2.getCode());
        assertNotNull(result2.getExtendedAttributes());
        assertEquals(1, result2.getExtendedAttributes().getList().size());
    }
}
