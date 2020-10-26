package WebDriverManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SuperMarket {
	public static HashMap<String,Integer> mp = new HashMap<>();
	public static ArrayList<String> arrlist = new ArrayList<String>();
	public static String arr1;
	public static ThreadLocal<String> arr2 = new ThreadLocal<>();
	
	public SuperMarket()
	{
		mp.put("book", 5);
		mp.put("cloths",20);
		mp.put("other",3);
		mp.entrySet(); 
	}
	
	
		
	public static void main(String args[])
	{
		Scanner objnew = new Scanner(System.in);
		System.out.println("Enter the numbe of items");
		/*String name = objnew.nextLine();
		System.out.println("name"+name);
		String age = objnew.nextLine();
		System.out.println("age"+age);*/
		
		int noofitems = objnew.nextInt();
		String name;
		Scanner objnew1 = new Scanner(System.in);
		
		for(int i=1;i<=noofitems;i++)
		{
		 name = objnew1.nextLine();
		 arrlist.add(name);
		}
		
		System.out.println("Totalnoofitems"+noofitems);
		System.out.println("ArraySize"+arrlist.size());
	
		
		SuperMarket sm = new SuperMarket();
		for(String s:arrlist)
		{
		priceCalc(s);
		break;
		}
			 
	}
	
	public static void priceCalc(String txt)
	{
		    String category;
		    float originalprice;
		    float discountpercetange;
		    float finalprice;
			System.out.println("txt");
			String spltxtitemname = txt.split("at")[0];
			String spltxtprice = txt.split("at")[1];
			System.out.println("spltxtitemname " +spltxtitemname);
			System.out.println("spltxtprice "    +spltxtprice);	
			originalprice = Float.parseFloat(spltxtprice);
			//System.out.println(mp.get("Dress"));
			
			
			  if(spltxtitemname.contains("book"))
					  {
				  category="book";
					  }
			  else if (spltxtitemname.contains("cloths"))
					  {
				  category="cloths";
					  }
			  else if (spltxtitemname.contains("clearance"))
			  {
				  category="clearance";
			  }
			  else{
				  category = "others";
			  }
				
			System.out.println("After if"+category);
		switch(category)
		{
	     case "book":
	    	 discountpercetange = mp.get(category);
	    	 System.out.println("Discountpricefrommap"+discountpercetange);
	    	 discountpercetange = (originalprice * discountpercetange) /100;
	    	 System.out.println("Discountprice after calculation"+discountpercetange);
	    	 finalprice= originalprice- discountpercetange;
	    	 System.out.println("Final Price"+finalprice);
	    	 break;
		}
		
	}	
	
}
