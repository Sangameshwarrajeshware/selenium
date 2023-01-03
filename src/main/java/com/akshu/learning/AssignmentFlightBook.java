package com.akshu.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class AssignmentFlightBook {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //AutoSelectOptions
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));

        for(WebElement option : options)
        {
            if (option.getText().equalsIgnoreCase("India"))
            {

                option.click();
                {
                    System.out.println("India is matched");
                }
            }
        }

        //RadioButton validation

        String calenderStyleAttribute = driver.findElement(By.id("Div1")).getAttribute("style");
        System.out.println(calenderStyleAttribute);
        if(calenderStyleAttribute.contains("opacity: 0.5"))
        {
            System.out.println("Calender is disabled");
        }
        else
        {
            Assert.assertFalse(true);
        }

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        String calenderStyleAttributeAfterClick = driver.findElement(By.id("Div1")).getAttribute("style");

        System.out.println(calenderStyleAttributeAfterClick);
        if(calenderStyleAttributeAfterClick.contains("opacity: 1"))
        {
            System.out.println("Calender is enabled");

        }

        //FlightBookFromTO
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='HBX']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00$mainContent$view_date1")).click();
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();


        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

        //count the number of checkbox

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


        //driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("id=\"divpaxinfo\"")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hrefIncAdt")).click();
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        Thread.sleep(2000);
        driver.findElement(By.id("hrefIncChd")).click();













    }
}

