package com.handlingalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RediffTest {
	
	public void TestPopups()throws Exception
	{
		 WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Prarthna Saxena\\functionaltest\\Handling Alerts\\EdgeBrowser\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		if(text.equals("Please enter a valid username.")){
		System.out.println("correct alert message");
		}
		else {
			System.out.println("in-correct alert message");
			
		}
		alert.accept();
		//alert.dismiss();
	}

}
