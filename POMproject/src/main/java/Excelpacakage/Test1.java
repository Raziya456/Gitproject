package Excelpacakage;

import Page.Page1;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;


import java.io.FileInputStream;

public class Test1 extends Page1 {
    public static String readexcel(int row, int column) throws Exception
    {
        String testData = null;
        String filepath = System.getProperty("user.dir")+"\\src\\main\\resources\\Book1.xlsx";
        FileInputStream file = new FileInputStream(filepath);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet ws = wb.getSheetAt(0);  //Sheet1

        testData = String.valueOf(ws.getRow(row).getCell(column));
        return testData;
    }
    public static void register(){
        driver.findElement(By.xpath("//a[@class='af-my-account-admin']")).click();
    }
    public static void username(){
        driver.findElement(By.xpath("//*[@id='reg_username']")).sendKeys("Myra");
    }
    public static void email(){
        driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys("razia.aliya@gmail.com");
    }
    public static void password(){
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Alia@#1981");
    }
    public static void regbutton()  throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='register']")).click();
    }
}

