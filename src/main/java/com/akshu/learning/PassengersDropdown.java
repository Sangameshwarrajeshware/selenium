package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengersDropdown
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       // driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());

        //count the number of checkbox
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        int i=1;
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }


        /*for(int i=1;i<5;i++)
        {
           driver.findElement(By.id("hrefIncAdt")).click();
        }

         */





        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Thread.sleep(2000);
        driver.findElement(By.id("hrefDecAdt")).getText();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();

    }
}
