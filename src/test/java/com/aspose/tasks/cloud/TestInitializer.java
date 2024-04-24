/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestInitializer.java">
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

package com.aspose.tasks.cloud;

import com.aspose.tasks.cloud.api.TasksApi;
import com.aspose.tasks.cloud.model.FilesUploadResult;
import com.aspose.tasks.cloud.model.requests.DeleteFileRequest;
import com.aspose.tasks.cloud.model.requests.UploadFileRequest;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.Files;
import java.util.*;

public final class TestInitializer {
    public static ApiClient apiClient;
    public static TasksApi tasksApi;
    public static String LocalTestFolder = "TestData";
    public static final String CONFIG_PATH = "../testConfig.json";
    public static List<String> uploadedFiles = new ArrayList<String>();

    public static void Initialize() throws FileNotFoundException, ApiException {
        Initialize(CONFIG_PATH);
    }

    public static void Initialize(String credsPath) throws FileNotFoundException, ApiException {
        Map<String, String> creds = GetConfig(credsPath);
        apiClient = new ApiClient(creds.get("AppSid"), creds.get("AppKey"), creds.get("BaseUrl"), creds.get("AuthUrl"));
        tasksApi = new TasksApi(apiClient);
    }

    public static Map<String, String> GetConfig(String credsPath) throws FileNotFoundException {
        Map<String, String> creds = new Gson().fromJson(new JsonReader(new FileReader(credsPath)), Map.class);
        if (creds == null) {
            throw new FileNotFoundException("Please put your credentials into testConfig.json file");
        }

        return creds;
    }

    public static String UploadFile(String fileName) throws ApiException {
        String remoteFullFileName = TestInitializer.CreateUUid() + fileName;
        UploadFileRequest request = new UploadFileRequest(remoteFullFileName,
                new File(TestInitializer.LocalTestFolder + "/" + fileName), null);
        FilesUploadResult result = TestInitializer.tasksApi.uploadFile(request);
        uploadedFiles.add(remoteFullFileName);
        return remoteFullFileName;
    }

    public static void DeleteUploadedFiles() throws ApiException {
        for (String uploadedFile : uploadedFiles) {
            tasksApi.deleteFile(new DeleteFileRequest(uploadedFile, null, null));
        }
    }

    public static String CreateUUid() {
        UUID uid = UUID.randomUUID();
        return uid.toString();
    }
}
