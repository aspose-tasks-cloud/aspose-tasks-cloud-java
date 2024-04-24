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
import com.aspose.tasks.cloud.model.*;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

/*
 * Example of how to work with Views.
 */

public class ViewsTests extends TestBase {

    /*
     * Test for get views.
     */
    @Test
    public void testGetViews() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetViewsRequest request = new GetViewsRequest(remoteFileName, null, null);
        ViewsResponse result = TestInitializer.tasksApi.getViews(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        View firstView = result.getViews().get(0);
        assertNotNull(firstView);
        assertEquals(true, firstView.isShowInMenu().booleanValue());
        assertEquals(ItemType.TASKITEM, firstView.getType());
        assertEquals(ViewScreen.GANTT, firstView.getScreen());
        assertEquals("&Gantt Chart", firstView.getName());
        assertEquals(1, (int)firstView.getUid());
    }

    /*
     * Test for get all table text styles.
     */
    @Test
    public void testGetAllTableTextStyles() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetAllTableTextStylesRequest request = new GetAllTableTextStylesRequest(remoteFileName, 2, null, null);
        TableTextStylesResponse result = TestInitializer.tasksApi.getAllTableTextStyles(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertEquals(8, result.getItems().size());
    }

    /*
     * Test for get table text style.
     */
    @Test
    public void testGetTableTextStyle() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetTableTextStyleRequest request = new GetTableTextStyleRequest(remoteFileName, 2, 29, null, null, null);
        TableTextStyleResponse result = TestInitializer.tasksApi.getTableTextStyle(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(200), result.getCode());
        assertEquals(29, (int)result.getTableTextStyle().getRowUid());
        assertEquals(Field.UNDEFINED, result.getTableTextStyle().getField());
        assertEquals(TextItemType.ALLOCATED, result.getTableTextStyle().getItemType());
        assertEquals(Colors.TRANSPARENT, result.getTableTextStyle().getColor());
        assertEquals(BackgroundPattern.HOLLOW, result.getTableTextStyle().getBackgroundPattern());
        assertEquals(Colors.TRANSPARENT, result.getTableTextStyle().getBackgroundColor());
    }

    /*
     * Test for create table text style.
     */
    @Test
    public void testCreateTableTextStyle() throws Exception {
        String localFileName = "Home_move_plan.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        TableTextStyle newTableTextStyle = new TableTextStyle();
        newTableTextStyle.setRowUid(3);
        newTableTextStyle.setField(Field.TASKNAME);
        newTableTextStyle.setItemType(TextItemType.ALLOCATED);
        newTableTextStyle.setColor(Colors.RED);
        newTableTextStyle.setBackgroundPattern(BackgroundPattern.HOLLOW);
        newTableTextStyle.setBackgroundColor(Colors.GREENYELLOW);
        CreateTableTextStyleRequest createRequest = new CreateTableTextStyleRequest(remoteFileName, 1, newTableTextStyle, null, null, null);
        AsposeResponse createResult = TestInitializer.tasksApi.createTableTextStyle(createRequest);
        assertNotNull(createResult);
        assertEquals(Integer.valueOf(201), createResult.getCode());


        GetTableTextStyleRequest getRequest = new GetTableTextStyleRequest(remoteFileName, createRequest.getviewUid(), newTableTextStyle.getRowUid(), null, null, null);
        TableTextStyleResponse getResult = TestInitializer.tasksApi.getTableTextStyle(getRequest);
        assertNotNull(getResult);


        assertEquals(newTableTextStyle.getRowUid(), getResult.getTableTextStyle().getRowUid());
        assertEquals(newTableTextStyle.getField(), getResult.getTableTextStyle().getField());
        assertEquals(newTableTextStyle.getItemType(), getResult.getTableTextStyle().getItemType());
        assertEquals(newTableTextStyle.getColor(), getResult.getTableTextStyle().getColor());
        assertEquals(newTableTextStyle.getBackgroundPattern(), getResult.getTableTextStyle().getBackgroundPattern());
        assertEquals(newTableTextStyle.getBackgroundColor(), getResult.getTableTextStyle().getBackgroundColor());
    }

    /*
     * Test for update table text style.
     */
    @Test
    public void testUpdateTableTextStyle() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);


        GetTableTextStyleRequest getRequest = new GetTableTextStyleRequest(remoteFileName, 2, 29, null, null, null);
        TableTextStyleResponse getResult = TestInitializer.tasksApi.getTableTextStyle(getRequest);

        assertEquals(Colors.TRANSPARENT, getResult.getTableTextStyle().getColor());
        assertEquals(Colors.TRANSPARENT, getResult.getTableTextStyle().getBackgroundColor());

        getResult.getTableTextStyle().setColor(Colors.ORANGERED);
        getResult.getTableTextStyle().setBackgroundColor(Colors.DODGERBLUE);

        UpdateTableTextStyleRequest updateRequest = new UpdateTableTextStyleRequest(remoteFileName, getRequest.getviewUid(), getResult.getTableTextStyle(), null, null, null);
        AsposeResponse updateResult = TestInitializer.tasksApi.updateTableTextStyle(updateRequest);
        assertNotNull(updateResult);
        assertEquals(Integer.valueOf(200), updateResult.getCode());

        getResult = TestInitializer.tasksApi.getTableTextStyle(getRequest);
        assertNotNull(getResult);

        assertEquals(Colors.ORANGERED, getResult.getTableTextStyle().getColor());
        assertEquals(Colors.DODGERBLUE, getResult.getTableTextStyle().getBackgroundColor());
    }

    /*
     * Test for delete table text style.
     */
    @Test
    public void testDeleteTableTextStyle() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetAllTableTextStylesRequest getRequest = new GetAllTableTextStylesRequest(remoteFileName, 2, null, null);
        TableTextStylesResponse getResult = TestInitializer.tasksApi.getAllTableTextStyles(getRequest);
        assertNotNull(getResult);

        assertEquals(8, getResult.getItems().size());

        DeleteTableTextStyleRequest deleteRequest = new DeleteTableTextStyleRequest(remoteFileName, 2, 29, null, null, null, null);
        AsposeResponse deleteResult = TestInitializer.tasksApi.deleteTableTextStyle(deleteRequest);
        assertNotNull(deleteResult);
        assertEquals(Integer.valueOf(200), deleteResult.getCode());

        getResult = TestInitializer.tasksApi.getAllTableTextStyles(getRequest);
        assertNotNull(getResult);

        assertEquals(7, getResult.getItems().size());
    }
}
