package com.screenshotdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.libraryscreenshot.Reusability;

public class TestScreenShots1 {

    @Test
    public void Browser() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://auth.hollandandbarrett.com/u/login");
        driver.manage().window().maximize();

        Reusability.capturedScreenshot(driver, "A. Launch Application - TakeScreenShot");

        driver.findElement(By.id("username")).sendKeys("prarthna@gmail.com");
        driver.findElement(By.name("password")).sendKeys("27Ashi98@");
        Thread.sleep(5000); // It's generally not recommended to use Thread.sleep in production code; consider explicit waits
        driver.findElement(By.xpath("//button[@name='action']")).click();

        Reusability.capturedScreenshot(driver, "B. Click Sign In Button - TakeScreenShot");
        driver.quit();
    }
}