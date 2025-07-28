package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.co.in");
	     String URL = driver.getCurrentUrl();
	     System.out.println(URL);
		 //driver.manage().window().maximize();
	        driver.navigate().to("https://login.yahoo.com/");

	        
	        driver.navigate().back();
	        URL = driver.getCurrentUrl();
	        System.out.println(URL);
	        driver.quit();
	        
	        
		
	}

}
