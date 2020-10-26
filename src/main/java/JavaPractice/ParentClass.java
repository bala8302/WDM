package JavaPractice;

import org.openqa.selenium.WebDriver;

public class ParentClass {
	
	WebDriver driver;
	
	public ParentClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public ParentClass()
	{
		
	}
	
   static int b =10;
	public void test()
	{
		int a =100;
		System.out.println(a);
	}

}
