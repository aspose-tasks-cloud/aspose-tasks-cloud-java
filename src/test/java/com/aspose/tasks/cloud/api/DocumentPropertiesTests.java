/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocumentPropertiesTests.java">
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
import com.aspose.tasks.cloud.model.DocumentProperty;
import com.aspose.tasks.cloud.model.requests.GetDocumentPropertiesRequest;
import com.aspose.tasks.cloud.model.requests.GetDocumentPropertyRequest;
import com.aspose.tasks.cloud.model.requests.PostDocumentPropertyRequest;
import com.aspose.tasks.cloud.model.requests.PutDocumentPropertyRequest;
import com.aspose.tasks.cloud.model.responses.DocumentPropertiesResponse;
import com.aspose.tasks.cloud.model.responses.DocumentPropertyResponse;
import org.junit.Test;

/*
 * Example of how to work with document properties.
 */
public class DocumentPropertiesTests extends TestBase {


    /*
     * Test for get document properties.
     */
    @Test
    public void testGetDocumentProperties() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest(remoteFileName, null, null);
        DocumentPropertiesResponse result = TestInitializer.tasksApi.getDocumentProperties(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getProperties());
        assertEquals(63, result.getProperties().getList().size());
        assertEquals("Title", result.getProperties().getList().get(0).getName());
        assertEquals("Home Move", result.getProperties().getList().get(0).getValue());
    }

    /*
     * Test for get document property.
     */
    @Test
    public void testGetDocumentProperty() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetDocumentPropertyRequest request = new GetDocumentPropertyRequest(remoteFileName, "Title", null, null);
        DocumentPropertyResponse result = TestInitializer.tasksApi.getDocumentProperty(request);
        assertNotNull(result);
        assertEquals(200, (int) result.getCode());
        assertNotNull(result.getProperty());
        assertEquals("Title", result.getProperty().getName());
        assertEquals("Home Move", result.getProperty().getValue());
    }

    /*
     * Test for put document property.
     */
    @Test
    public void testPutDocumentProperty() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DocumentProperty property = new DocumentProperty();
        property.setName("Title");
        property.setValue("New title value");
        PutDocumentPropertyRequest request1 = new PutDocumentPropertyRequest(remoteFileName, property.getName(), property, null, null, null);
        DocumentPropertyResponse result1 = TestInitializer.tasksApi.putDocumentProperty(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetDocumentPropertyRequest request2 = new GetDocumentPropertyRequest(remoteFileName, property.getName(), null, null);
        DocumentPropertyResponse result2 = TestInitializer.tasksApi.getDocumentProperty(request2);
        assertEquals(property.getValue(), result2.getProperty().getValue());
    }

    /*
     * Test for put document property - ignore changes of nonexistent property.
     */
    @Test
    public void testPutDocumentPropertyIgnoreNonexistentProperty() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DocumentProperty property = new DocumentProperty();
        property.setName("new property");
        property.setValue("new property value");
        PutDocumentPropertyRequest request1 = new PutDocumentPropertyRequest(remoteFileName, property.getName(), property, null, null, null);
        DocumentPropertyResponse result1 = TestInitializer.tasksApi.putDocumentProperty(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetDocumentPropertyRequest request2 = new GetDocumentPropertyRequest(remoteFileName, property.getName(), null, null);
        DocumentPropertyResponse result2 = TestInitializer.tasksApi.getDocumentProperty(request2);
        assertNull(result2.getProperty());
    }

    /*
     * Test for post document property.
     */
    @Test
    public void testPostDocumentProperty() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DocumentProperty property = new DocumentProperty();
        property.setName("Title");
        property.setValue("New title value");
        PostDocumentPropertyRequest request1 = new PostDocumentPropertyRequest(remoteFileName, property.getName(), property, null, null, null);
        DocumentPropertyResponse result1 = TestInitializer.tasksApi.postDocumentProperty(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetDocumentPropertyRequest request2 = new GetDocumentPropertyRequest(remoteFileName, property.getName(), null, null);
        DocumentPropertyResponse result2 = TestInitializer.tasksApi.getDocumentProperty(request2);
        assertEquals(property.getValue(), result2.getProperty().getValue());
    }

    /*
     * Test for post document property - ignore changes of nonexistent property.
     */
    @Test
    public void testPostDocumentPropertyIgnoreNonexistentProperty() throws ApiException {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DocumentProperty property = new DocumentProperty();
        property.setName("new property");
        property.setValue("new property value");
        PostDocumentPropertyRequest request1 = new PostDocumentPropertyRequest(remoteFileName, property.getName(), property, null, null, null);
        DocumentPropertyResponse result1 = TestInitializer.tasksApi.postDocumentProperty(request1);
        assertNotNull(result1);
        assertEquals(200, (int) result1.getCode());

        GetDocumentPropertyRequest request2 = new GetDocumentPropertyRequest(remoteFileName, property.getName(), null, null);
        DocumentPropertyResponse result2 = TestInitializer.tasksApi.getDocumentProperty(request2);
        assertNull(result2.getProperty());
    }
}
