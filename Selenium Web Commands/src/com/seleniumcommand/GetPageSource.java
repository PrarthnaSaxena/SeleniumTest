package com.seleniumcommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

		public static void main(String[] args) {
	        String[] urls = {
	            "https://www.ebay.com/",
	            "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
	            "https://www.opencart.com/index.php?route=common/home",
	            "https://copilot.microsoft.com/chats/dww22vuDc2di7FNDdUztL",
	            "https://freecrm.com/"
	        };
	        for (String url : urls) {
	            WebDriver driver = new ChromeDriver();
	            driver.get(url);
	            String title = driver.getPageSource();
	            System.out.println(title); // Output only the title
	            driver.quit();
	        }
	    }
	}









