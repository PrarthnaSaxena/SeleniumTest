package com.seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.opencart.com/");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.bing.com/");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.freecrm.com/");
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.half.ebay.com/");
		
		
		
	}

}
