package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTextandPartialLink {

    WebDriver driver;

    @Test
    public void setUpAndTestLinks() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hollandandbarrett.com/");

        // Count all links on the homepage
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links on homepage: " + allLinks.size());

        // Click on link using partial link text
        driver.findElement(By.partialLinkText("Vitamins")).click();

        // Collect all links after navigating to Vitamins page
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int noLinks = links.size();
        System.out.println("Number of links on Vitamins page: " + noLinks);

        for (int i = 0; i < links.size(); i++) {
            String str = links.get(i).getText();
            System.out.println(str);

            if (str.equals("Vitamins")) {
                driver.findElement(By.linkText("Vitamins")).click();
                driver.findElement(By.xpath("(//a[contains(@type,'button')])[4]")).click();
                break;
            }
        }

        driver.quit();
    }
}
