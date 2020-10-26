package WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivercheck {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("http://demo.guru99.com/test/upload/");
		
		//WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
	
		//uploadElement.sendKeys("C:\\testfile\\csformat.csv");
		
		 StringSelection sel = new StringSelection("C:\\testfile\\csformat.csv");
		
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		
		driver.navigate().to("http://my.monsterindia.com/create_account.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		 
		 driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		 System.out.println("Browse button clicked");
		 
		 Robot robot = new Robot();
		 Thread.sleep(1000);
		 
		 // Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		        // Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		
		//fileUpload("C:\\testfile\\csformat.csv");

	}
	
	
	public static void fileUpload (String path) throws AWTException {
        StringSelection strSelection = new StringSelection(path);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(strSelection, null);
 
        Robot robot = new Robot();
  
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


}
