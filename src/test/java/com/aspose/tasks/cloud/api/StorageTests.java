/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StorageTests.java">
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
import com.aspose.tasks.cloud.model.DiscUsage;
import com.aspose.tasks.cloud.model.FileVersions;
import com.aspose.tasks.cloud.model.ObjectExist;
import com.aspose.tasks.cloud.model.StorageExist;
import com.aspose.tasks.cloud.model.requests.*;
import org.junit.Test;

/*
 * Example of how to work with storage.
 */
public class StorageTests extends TestBase {

    /*
     * Test for get disc usage.
     */
    @Test
    public void testGetDiscUsage() throws Exception {
        GetDiscUsageRequest request = new GetDiscUsageRequest(null);
        DiscUsage result = TestInitializer.tasksApi.getDiscUsage(request);

        assertNotNull(result.getTotalSize());
        assertNotNull(result.getUsedSize());
    }

    /*
     * Test for get file versions.
     */
    @Test
    public void testGetFileVersions() throws Exception {
        String localFileName = "NewProductDev.mpp";
        String remoteFileName = TestInitializer.UploadFile(localFileName);

        GetFileVersionsRequest request = new GetFileVersionsRequest(remoteFileName, null);
        FileVersions result = TestInitializer.tasksApi.getFileVersions(request);

        assertNotNull(result.getValue());
        assertTrue(result.getValue().stream().anyMatch(i -> i.getName().equals(remoteFileName)));
    }

    /*
     * Test for object exists.
     */
    @Test
    public void testObjectExists() throws Exception {
        String remoteFileName = "SomeNonexistentFileName";

        ObjectExistsRequest request = new ObjectExistsRequest(remoteFileName, null, null);
        ObjectExist result = TestInitializer.tasksApi.objectExists(request);

        assertNotNull(result);
        assertFalse(result.isExists());
    }

    /*
     * Test for storage exists.
     */
    @Test
    public void testStorageExists() throws Exception {
        String remoteFileName = "SomeNonexistentStorageName";

        StorageExistsRequest request = new StorageExistsRequest(remoteFileName);
        StorageExist result = TestInitializer.tasksApi.storageExists(request);

        assertNotNull(result);
        assertFalse(result.isExists());
    }
}
