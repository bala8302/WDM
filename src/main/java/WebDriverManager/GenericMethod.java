package WebDriverManager;

public class GenericMethod {
	
	public static <E> void testingMethod(E[] elements)
	{
		for(E ele:elements)
		{
		
			System.out.println(ele);
		}
	}

}
