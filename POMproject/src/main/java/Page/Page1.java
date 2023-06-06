package Page;

import Browser.Browser1;
import org.openqa.selenium.By;


public class Page1 extends Browser1 {
    public static void popup() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='sg-popup-content-wrapper-22798']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='account-user']")).click();

        driver.findElement(By.xpath("//a[@class='af-my-account-admin']")).click();

        driver.findElement(By.xpath("//*[@id='reg_username']")).sendKeys("Myra");

        driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys("razia.aliya@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Alia@#1981");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='register']")).click();
    }
}

