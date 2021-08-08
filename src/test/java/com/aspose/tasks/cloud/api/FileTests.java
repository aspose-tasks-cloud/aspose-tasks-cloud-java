/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FileTests.java">
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
import com.aspose.tasks.cloud.model.FilesUploadResult;
import com.aspose.tasks.cloud.model.requests.*;
import org.junit.Test;

import java.io.File;

/*
 * Example of how to work with files.
 */
public class FileTests extends TestBase {

    /*
     * Test for uploading file.
     */
    @Test
    public void testUploadFile() throws ApiException {
        String fileName = "Plan_with_resource.mpp";

        UploadFileRequest request = new UploadFileRequest(
                fileName,
                new File(TestInitializer.LocalTestFolder + "/" + fileName),
                null
        );

        FilesUploadResult result = TestInitializer.tasksApi.uploadFile(request);
        assertNotNull(result);
        assertNotNull(result.getUploaded());
        assertEquals(1, result.getUploaded().size());
        assertEquals(fileName, result.getUploaded().get(0));
        TestInitializer.uploadedFiles.add(request.getpath());
    }

    /*
     * Test for copy file.
     */
    @Test
    public void testCopyFile() throws ApiException
    {
        String localFileName = "Plan_with_resource.mpp";

        String remoteFileName = TestInitializer.UploadFile(localFileName);
        String remoteFileNameDest = remoteFileName + ".newCopy";

        CopyFileRequest request = new CopyFileRequest(remoteFileName,remoteFileNameDest,
                null,null,null);

        TestInitializer.tasksApi.copyFile(request);
        TestInitializer.uploadedFiles.add(remoteFileNameDest);
    }

    /*
     * Test for move file.
     */
    @Test
    public void testMoveFile() throws ApiException
    {
        String localFileName = "Plan_with_resource.mpp";

        String remoteFileName = TestInitializer.UploadFile(localFileName);
        String remoteFileNameDest = remoteFileName + ".newCopy";

        MoveFileRequest request = new MoveFileRequest(remoteFileName,remoteFileNameDest,
            null,null,null);

        TestInitializer.tasksApi.moveFile(request);
        TestInitializer.uploadedFiles.add(remoteFileNameDest);
    }

    /*
     * Test for delete file.
     */
    @Test
    public void testDeleteFile() throws ApiException {
        String localFileName = "Plan_with_resource.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);
        DeleteFileRequest request = new DeleteFileRequest(remoteFileName, null, null);
        TestInitializer.tasksApi.deleteFile(request);
    }

    /*
     * Test for download file.
     */
    @Test
    public void testDownloadFile() throws ApiException
    {
        String localFileName = "Plan_with_resource.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        DownloadFileRequest request = new DownloadFileRequest(remoteFileName,null,null);

        File result = TestInitializer.tasksApi.downloadFile(request);
        TestInitializer.uploadedFiles.add(remoteFileName);
        assertNotNull(result);
        assertTrue(result.exists());
    }
}
