package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownToAndFrom
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='HBX']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

        //driver.findElement(By.id("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HBX']"));
        //driver.findElement(By.id("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value= 'BLR'] "));
        //Identifying xpath witout using index
        //we can use by parent child traverse

    }
}
