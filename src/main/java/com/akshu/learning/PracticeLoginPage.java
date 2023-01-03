package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PracticeLoginPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
// Login

        driver.findElement(By.id("inputUsername")).sendKeys("text");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshety");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        Thread.sleep(2000);
        //ForgotPassword

        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("text");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("233738");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
       System.out.println( driver.findElement(By.cssSelector("p.infoMsg")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("text");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        String textFromWebPage = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
        System.out.println(textFromWebPage);
        Assert.assertEquals(textFromWebPage,"Hello text,");
        String textFromWebPageOne = driver.findElement(By.xpath("//h1[1]")).getText();
        System.out.println(textFromWebPageOne);
        Assert.assertEquals(textFromWebPageOne,"Welcome to Rahul Shetty Academy");
        String textFromWebPageTwo   = driver.findElement(By.xpath("//p[1]")).getText();
        System.out.println(textFromWebPageTwo);
        Assert.assertEquals(textFromWebPageTwo,"You are successfully logged in.");
        driver.close();






    }
}
