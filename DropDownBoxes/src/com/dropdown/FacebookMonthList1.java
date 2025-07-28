package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

// Right program using selenium WebDriver count number item in Facebook Drop down list and print

public class FacebookMonthList1 {
    @Test
    public void FaceBookMonth() throws Exception {
    	ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
        
        WebElement month_Dropdown = driver.findElement(By.id("month"));
        Select month_dd = new Select(month_Dropdown);
        List<WebElement> month_list = month_dd.getOptions();
        int total_month = month_list.size();
        System.out.println("Total months count in List : " + total_month);

        for (WebElement ele : month_list) {
            String month_name = ele.getText();
            System.out.println("Months Names are : " + month_name);
        }
        driver.quit();
    }
}
