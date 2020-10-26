package ProductPractice;

import java.util.HashMap;

public class Parenthesiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp ="(){";
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<exp.length();i++)
		{
			char x = exp.charAt(i);
			
			if(map.containsKey(x))
			{
				map.put(x, map.get(x)+1);
			}
			
			else
			{
				map.put(x, 1);
			}
		}
		
		System.out.println(map.entrySet());

	}

}
