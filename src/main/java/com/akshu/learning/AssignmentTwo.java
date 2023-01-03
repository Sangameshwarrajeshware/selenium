package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("aksh");
        driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("aksh@gmail.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("45667");
        Test.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());
        driver.findElement(By.id("exampleCheck1")).click();
        Test.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
        driver.findElement(By.xpath("//input[class='form-check-label']")).getText();
        WebElement dropdownWebElement = driver.findElement(By.id("exampleFormControlSelect1"));
        //Select assignmentTwo = new select(dropdownWebElement);
       // assignmentTwo.selectByIndex(1);




    }
}

