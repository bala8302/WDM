package WebDriverManager;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {
	
	@Test
	public void tab()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); // get is used to wait the page load where as navigate does not wait to load
		
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cricket");
		
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL +"t");
		
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.CONTROL +"t");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	    // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		/*WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		Actions obj = new Actions(driver);
		
		Action act = obj.moveToElement(ele).sendKeys(Keys.chord(Keys.CONTROL + "t")).build();
		
		act.perform();
		
*/		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		
		 Set<String> ss = driver.getWindowHandles();
		 
		 for(String s:ss)
		 {
			 driver.switchTo().window(s);
		 }
		 
		 
		driver.navigate().to("https://www.toolsqa.com/");
		*/
	}

}
