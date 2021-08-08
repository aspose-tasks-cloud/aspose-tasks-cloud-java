/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FolderTests.java">
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
import com.aspose.tasks.cloud.model.FilesList;
import com.aspose.tasks.cloud.model.requests.*;
import com.aspose.tasks.cloud.model.responses.*;
import org.junit.Test;

import java.util.ArrayList;

/*
 * Example of how to work with folders.
 */
public class FolderTests extends TestBase {

    /*
     * Test for create folder.
     */
    @Test
    public void testСreateFolder() throws Exception {
        CreateFolderRequest request = new CreateFolderRequest("TestCreateFolder", null);
        TestInitializer.tasksApi.createFolder(request);
    }

    /*
     * Test for delete folder.
     */
    @Test
    public void testDeleteFolder() throws Exception {
        CreateFolderRequest request1 = new CreateFolderRequest("TestDeleteFolder", null);
        TestInitializer.tasksApi.createFolder(request1);

        DeleteFolderRequest request2 = new DeleteFolderRequest("TestDeleteFolder", null, false);
        TestInitializer.tasksApi.deleteFolder(request2);
    }

    /*
     * Test for get file list of folder.
     */
    @Test
    public void testGetFilesList() throws Exception {
        GetFilesListRequest request = new GetFilesListRequest("\\", null);
        FilesList result = TestInitializer.tasksApi.getFilesList(request);
        assertTrue(result.getValue().size() > 0);
    }

    /*
     * Test for copy folder.
     */
    @Test
    public void testCopyFolder() throws Exception {
        String src = "TestCopyFolderSrc";
        String dest = "TestCopyFolderDest";
        CreateFolderRequest request1 = new CreateFolderRequest(src, null);
        TestInitializer.tasksApi.createFolder(request1);

        CopyFolderRequest request2 = new CopyFolderRequest(src, dest, null, null);
        TestInitializer.tasksApi.copyFolder(request2);

        GetFilesListRequest request3 = new GetFilesListRequest("\\", null);
        FilesList result = TestInitializer.tasksApi.getFilesList(request3);
        assertTrue(result.getValue().stream().anyMatch(v -> v.getPath().equals(String.format("/%s/", dest))));

        TestInitializer.tasksApi.deleteFolder(new DeleteFolderRequest(src, null, false));
        TestInitializer.tasksApi.deleteFolder(new DeleteFolderRequest(dest, null, false));
    }

    /*
     * Test for move folder.
     */
    @Test
    public void testMoveFolder() throws Exception {
        String src = "TestMoveFolderSrc";
        String dest = "TestMoveFolderDest";
        TestInitializer.tasksApi.createFolder(new CreateFolderRequest(src, null));

        TestInitializer.tasksApi.moveFolder(new MoveFolderRequest(src, dest, null, null));

        GetFilesListRequest request3 = new GetFilesListRequest("\\", null);
        FilesList result = TestInitializer.tasksApi.getFilesList(request3);
        assertTrue(result.getValue().stream().anyMatch(v -> v.getPath().equals(String.format("/%s/", dest))));
        assertFalse(result.getValue().stream().anyMatch(v -> v.getPath().equals(String.format("/%s/", src))));

        TestInitializer.tasksApi.deleteFolder(new DeleteFolderRequest(dest, null, false));
    }
}
