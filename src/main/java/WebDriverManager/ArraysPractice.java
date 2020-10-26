package WebDriverManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ArraysPractice {
	
	@Test
	public void arraylistt()
	{
		String a[] = {"Test","23","Adrrdc"};
		String b[] = {"Test","23","Adrrdc"};
	 
		List<String> lis = new ArrayList<String>();
		lis.addAll(Arrays.asList(a));
		lis.addAll(Arrays.asList(b));
		
		//System.out.println(lis);
		
	    Object[] s = lis.toArray();
	    
	    for(Object ss:s)
	    {
	    	System.out.println(ss);
	    }
		
	    //System.out.println("Value"+Arrays.toString(s));
		
	}

}
