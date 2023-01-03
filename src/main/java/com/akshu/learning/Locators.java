package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        String name="rahul";


        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // TODO Auto-generated method stub
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("aksh");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("aksh@sa.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']:nth-child(3)")).sendKeys("aksh@gmail.com");
        //driver.findElement(By.cssSelector("input[placeholder='Phone Number']:nth-child(4)")).sendKeys("4567");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("566677");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
        try {
            Thread.sleep(1000);

        }catch (InterruptedException exception){

        }
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
        driver.findElement(By.xpath("//*[text()='log Out']"));
        driver.close();


    }

    public void getpassword(WebDriver driver)

    {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

    }
}
