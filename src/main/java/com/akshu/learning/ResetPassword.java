package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetPassword
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
        Thread.sleep(1000);
        //Please use temporary password 'rahulshettyacademy' to Login.
        System.out.println(extractPassword(driver));
        driver.close();

    }

    public static String extractPassword(WebDriver driver){

        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        String passwordWithMsg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        String[] passwordArray = passwordWithMsg.split("'");

        return passwordArray[1];
    }
}
