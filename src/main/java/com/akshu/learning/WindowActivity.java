package com.akshu.learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }
}

