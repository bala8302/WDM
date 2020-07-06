package WebDriverManager;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class DragandDrop {
	
	public static WebDriver driver=null;
	public void dragdropele() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		/*driver.navigate().to("http://demoqa.com/text-box");
		
		//getattribute
		
		WebElement ele = driver.findElement(By.id("userName"));
		ele.sendKeys("Heloo");
		
		String text = ele.getText();
		String text1 = ele.getAttribute("value");
		
	    System.out.println("TextValue="+text1);
	    
		*/
		
		driver.navigate().to("https://www.olaz.de/de-de/createprofilepage");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@data-key='firstName']"));
		ele.sendKeys("Trst");
		
		driver.findElement(By.xpath("//input[@data-key='emailAddress']")).sendKeys("Testt");
		driver.findElement(By.xpath("//input[@data-key='newPassword']")).sendKeys("Testtingg");
		driver.findElement(By.xpath("//input[@data-key='newPassword']")).sendKeys("Testtingg");		
		driver.findElement(By.xpath("//input[@data-key='addressStreet1']")).sendKeys("Testtingg");
		driver.findElement(By.xpath("//input[@data-key='addressPostalCode']")).sendKeys("10000");
		WebElement ele12 = driver.findElement(By.xpath("//input[@data-key='addressCity']"));
		
		ele12.sendKeys("Testtingg1222");
		ele12.sendKeys(Keys.TAB,Keys.SPACE);
		//ele12.sendKeys(keysToSend);;
		
		/*WebElement ele1 = driver.findElement(By.xpath("//span[@data-key='globalOpt_optStatus']"));
		ele1.click();
		*/
		
		//driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(Keys.ENTER);
		
		/*WebElement ele = driver.findElement(By.id("phdesktopbody_0_ctl104"));
		ele.click();
		
		Thread.sleep(40000);
         Actions act = new Actions(driver);
        // act.moveToElement(ele).click().build().perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		js.executeScript("arguments[0].click", ele);
		
		Point p = ele.getLocation();
		System.out.println(p.getX()+" "+p.getY());
		act.moveToElement(ele, p.getX(), p.getY()).click().build().perform();
	*/	
	}

}
