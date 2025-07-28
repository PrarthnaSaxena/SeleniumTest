package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DemoID {
    WebDriver driver;
    @Test
    public void DemoTestID() throws Exception{
        driver = new ChromeDriver();
        driver.get("https://auth.hollandandbarrett.com/u/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("ashimay27@gmail.com");
        driver.findElement(By.name("password")).sendKeys("27Ashi98@");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
