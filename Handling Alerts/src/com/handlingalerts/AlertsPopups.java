package com.handlingalerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AlertsPopups {
    WebDriver driver;
    @Test
    public void TestPopups() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Prarthna Saxena\\functionaltest\\Handling Alerts\\EdgeBrowser\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        //  Handle Simple Alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        
        //  Validate result text
        String resultString = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println("Result: " + resultString);
        Assert.assertEquals(resultString, "You successfully clicked an alert");
        //  Handle Confirm Alert (Cancel)
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();  // Clicks Cancel
        
        //  Optional: Validate confirm result
        String confirmResult = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println("Confirm Result: " + confirmResult);
        Assert.assertEquals(confirmResult, "You clicked: Cancel");
        
        //  Handle Prompt Alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.sendKeys("Hello Alert");
        promptAlert.accept();
        
        //  Validate prompt result
        String promptResult = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println("Prompt Result: " + promptResult);
        Assert.assertEquals(promptResult, "You entered: Hello Alert");
        driver.quit();
    }
}