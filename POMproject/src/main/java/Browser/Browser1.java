package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Browser1 {   //superclass
    public static WebDriver driver;
    public static Action act;
    public static WebDriverWait wait;

    public static WebDriver setDriver() {
        try {
            String browserChoice = Browser1.fileProperties("browser");//chrome

            if (browserChoice.equals("chrome")) {
                driver = setChromeDriver();
            } else if (browserChoice.equals("firefox")) {
                driver = setFirefoxDriver();
            } else if (browserChoice == "Edge") {
                driver = setEdgeDriver();
            } else
            {
                System.out.println("Invalid data...");
            }
            act = (Action) new Actions(driver);
        }catch (Exception e)
        {
            System.out.println("Browser Input");
            System.out.println(e);
        }
        return driver;
    }

    /*
     *  ChromeDriver Setup Method
     */
    public static WebDriver setChromeDriver() {
        try {
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();

        }catch(Exception e)
        {
            System.out.println("Chrome");
            System.out.println(e);
        }
        return driver;
    }




    public static WebDriver setFirefoxDriver() {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver =new ChromeDriver();

            
        }catch(Exception e)
        {
            System.out.println("Firefox");
            System.out.println(e);
        }
        return driver;
    }


    public static WebDriver setEdgeDriver() {
        try {
           WebDriverManager.chromedriver().setup();
           WebDriver driver =new ChromeDriver();
            driver = new EdgeDriver();
        }catch(Exception e)
        {
            System.out.println("Edge");
            System.out.println(e);
        }
        return driver;
    }


    public static String fileProperties(String propertiesData)//browser
    {
        String returnData = null;
        try {
            String filelocation = System.getProperty("user.dir") + "\\src\\main\\resources\\pom.properties";
            File file = new File(filelocation);
            FileInputStream fileinput = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fileinput);
            returnData = prop.getProperty(propertiesData); //browser
        }catch(Exception e)
        {
            System.out.println("Properties");
        }
        return returnData;
    }

    // Url Setup Method
    public static void getUrl() throws Exception {
        try {
            String url = Browser1.fileProperties("url");
            driver.manage().window().maximize();
            driver.get(url);
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }catch(Exception e)
        {
            System.out.println("URL Method");
        }
    }

    // Method to get title of the browser window
    public static String getTitle() throws Exception {
        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    // Driver Close Method
    public static void closeBrowser() {
        try {
            driver.quit();
        }catch(Exception e)
        {
            System.out.println("closing");
        }
    }
}