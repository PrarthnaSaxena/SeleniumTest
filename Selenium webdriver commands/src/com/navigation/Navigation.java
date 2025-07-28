package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to("https://login.yahoo.com/");
	        String URL = driver.getCurrentUrl();
	        System.out.println(URL);
	        driver.quit();
		
	}

}
