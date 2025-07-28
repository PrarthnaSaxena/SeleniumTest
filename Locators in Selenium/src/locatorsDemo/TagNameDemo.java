package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
        driver.manage().window().maximize();
        
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        
        for(WebElement ele : allLinks)
        {
        	System.out.println(ele.isDisplayed());
        	System.out.println(ele.isEnabled());
            System.out.println(ele.getAttribute("href"));
            
        }//Click on 4th link
        driver.findElement(By.xpath("//body/div[@id='inner-sbox']/div[@class='gsc-control-cse gsc-control-cse-en']/div[@class='gsc-control-wrapper-cse']/div[@class='gsc-results-wrapper-nooverlay gsc-results-wrapper-visible']/div[@class='gsc-wrapper']/div[@class='gsc-resultsbox-visible']/div[@class='gsc-resultsRoot gsc-tabData gsc-tabdActive']/div[@class='gsc-results gsc-webResult']/div[@class='gsc-expansionArea']/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
        
        
        WebElement ele = allLinks.get(3);
        ele.click();

	}

}
