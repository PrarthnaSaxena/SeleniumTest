package com.radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Easetrip {

    @Test
    public void TestRadioBtn() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/");

        driver.findElement(By.xpath("//label[normalize-space()='Defence Forces']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//label[normalize-space()='Students']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[normalize-space()='Senior Citizens']")).click();
        Thread.sleep(5000);
        

        int radiobtn = driver.findElements(By.xpath("//span[contains(@class,'fw500')]")).size();
        System.out.println("Number Of Radio Buttons.... " + radiobtn);

        driver.quit();
    }
}
