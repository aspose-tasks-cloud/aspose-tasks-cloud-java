package com.aspose.tasks.cloud;

import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class TestBase extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        TestInitializer.DeleteUploadedFiles();
    }

    protected String[] ReadFileAsStrings(File file) throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        String singleString = new String(bytes);
        if(singleString.contains("\r\n"))
            return singleString.split("\r\n");
        return singleString.split("\n");
    }
}
