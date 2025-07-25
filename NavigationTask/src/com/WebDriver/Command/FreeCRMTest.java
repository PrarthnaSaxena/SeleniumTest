package com.WebDriver.Command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://freecrm.com");

        System.out.println("Printing page source:");
        System.out.println(driver.getPageSource());

        System.out.println("Printing current URL:");
        System.out.println(driver.getCurrentUrl());

        System.out.println("Printing page title:");
        System.out.println(driver.getTitle());

        driver.navigate().to("https://www.google.com");
        System.out.println("Navigated to Google. Title: " + driver.getTitle());

        driver.navigate().back();
        System.out.println("Navigated back to FreeCRM. Title: " + driver.getTitle());

        driver.navigate().forward();
        System.out.println("Navigated forward to Google again. Title: " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page refreshed.");

        driver.quit();
    }
}
