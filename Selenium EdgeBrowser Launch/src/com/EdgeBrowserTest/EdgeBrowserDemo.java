package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Prarthna Saxena\\functionaltest\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().minimize();
		//driver.manage().window().minimize();
	}

}
