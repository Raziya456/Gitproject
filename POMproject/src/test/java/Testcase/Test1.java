package Testcase;

import Browser.Browser1;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeTest
    public void open() throws Exception
    {
        Browser1.setDriver();
        Browser1.getUrl();
    }
    @Test
    public void Page1() throws Exception
    {
        //capture.screenShot("Title");
        //Assert.assertEquals(driver.getTitle(), "Google");
    }
    @AfterTest
    public void close()
    {
        Browser1.closeBrowser();
    }
}

