package JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionsPrac {
	
	public static HashMap<String,String> map1 = new HashMap<String,String>();
	public static HashMap<String,String> map2 = new HashMap<String,String>();

	public void searchval()
	{

		String s ="this is the function method which calls another method like recursicve";
		int op = s.indexOf("method");
		System.out.println(op);
	}
	
	public static void listcompa()
	{
	  List<String> lis = new ArrayList<String>();
	  
	  lis.add("one");
	  lis.add("two");
	  lis.add("three");
	  
	  List<String> lis1 = new ArrayList<String>();
	  
	  lis1.add("one");
	  lis1.add("two");
	  lis1.add("three");
	  lis1.add("four");
	  
	  boolean res = lis.equals(lis1);
	  System.out.println(res);
	  
	  /*lis.removeAll(lis1);
	  System.out.println(lis);
	  */
	  lis1.retainAll(lis);
	  System.out.println(lis);
	  
	}
	
	
	public static void comparemaps()
	{
		
	 map1.put("Name", "Bala");
	 map1.put("company","wip");
	 map1.put("add", "chennai");
	 
	 map2.put("Name", "sen");
	 map2.put("company","wip");
	 map2.put("add", "chennai");
	 
	// boolean res = comparemapresul(map1,map2,"add");
	// System.out.println("Result"+res);
	 
	 comparemapresulAllvalues(map1,map2);
	 
	}

	public static boolean comparemapresul(HashMap<String,String> mp1,HashMap<String,String> mp2,String key)
	{
		boolean flag=false;
		for(String ky:map2.keySet())
		{
			System.out.println("ky"+ky);
			System.out.println("key"+key);
			if(ky.equalsIgnoreCase(key))
			{
				System.out.println("inside");
				if(mp2.get(ky).equals(mp1.get(ky)))
				{
					System.out.println("dd"+mp2.get(ky) + "===" +mp1.get(ky));
					flag= true;
					break;
				}
			}
			
			else
			{
				flag= false;
			}
		}
		
		return flag;
		
	}
	
	public static void comparemapresulAllvalues(HashMap<String,String> mp1,HashMap<String,String> mp2)
	{
		//boolean flag=false;
		for(String ky:map2.keySet())
		{
			System.out.println("ky"+ky);
			if(map2.get(ky).equalsIgnoreCase(map1.get(ky)))
			{
				System.out.println("For the key "+ky+" values in both map are equal");
			}
			
			else
			{
				System.out.println("For the key "+ky+" values in both map are not equal");
			}
		}
		
		//return flag;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//listcompa();
		comparemaps();
	}

}
 