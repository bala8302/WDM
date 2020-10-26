package JavaPractice;

import org.openqa.selenium.WebDriver;

public class ChildClass extends ParentClass {

	
	public ChildClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass pC = new ParentClass();
		pC.test();
		
		//System.out.println(pC.b);
		
		System.out.println(ParentClass.b);

	}

}
