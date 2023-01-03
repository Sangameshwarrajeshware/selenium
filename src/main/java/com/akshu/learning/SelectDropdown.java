package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebElement dropdwonWebElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select selectDropdown = new Select(dropdwonWebElement);
        selectDropdown.selectByIndex(2);
        System.out.println(selectDropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        selectDropdown.selectByIndex(1);
        Thread.sleep(2000);
        selectDropdown.selectByIndex(3);
        Thread.sleep(2000);
        selectDropdown.selectByIndex(0);
    }


}



