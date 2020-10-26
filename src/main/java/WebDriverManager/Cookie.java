package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		org.openqa.selenium.Cookie obj = new org.openqa.selenium.Cookie("","","");
		driver.manage().addCookie(obj);
		driver.manage().getCookies();

	}

}
