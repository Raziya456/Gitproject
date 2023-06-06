package Testcase;

import Browser.Browser1;
import Excelpacakage.Test1;
import Page.Page1;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

        @BeforeTest
        public void open() throws Exception {
            Browser1.setDriver();
            Browser1.getUrl();
        }

        @Test(
                priority = 1
        )
        public void Page1() throws InterruptedException {
            Page1.popup();
        }

        @Test(
                priority = 2
        )
        public void Test1() throws Exception {
            Test1.register();
            Test1.username();
            Test1.email();
            Test1.password();
            Test1.regbutton();

        }

        @AfterTest
        public void close() {
            Browser1.closeBrowser();
        }
    }


