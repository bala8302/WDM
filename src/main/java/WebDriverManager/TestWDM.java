package WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestWDM implements Locators {

	public static WebDriver driver=null;
	@Test
	public void testingWDM() {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.cssSelector(""));
		
		driver.findElement(stxt).click();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", "tess");
		//driver.close();
		
		boolean status = testElementDisplayed(By.xpath("//"));
		
		
	}
	
	public static boolean testElementDisplayed(By by)
	{
		try{
		driver.findElement(by).isDisplayed();
		return true;
		}catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	@AfterMethod
	public void testresult(ITestResult result)
	{
		
	 System.out.println("getStatus"+result.getStatus());
	 System.out.println("getTestName"+result.getTestName());
	 System.out.println("Ddd"+result.getName());
	}

}
