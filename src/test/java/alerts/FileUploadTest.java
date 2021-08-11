package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/adelinagubareva/Documents/IDEA Projects/tau_project/resources/testFilexlsx.xlsx");

        assertEquals(uploadPage.getUploadedFiles(),"testFilexlsx.xlsx","Uploaded files incorrect");
    }
}
