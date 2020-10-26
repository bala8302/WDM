package ProductPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	
	public static void main(String args[])
	{
		String arr[] ={ "cat", "dog", "tac", "god", "act"};
		
	   //String arr[] ={ "cat", "dog", "tac"};
       HashMap<String, List<String> > map = new HashMap<>();
       
		
		//loop it
		
		for(int i=0;i<arr.length;i++)
		{
			String word = arr[i];
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			
			String newWord = new String(letters);
			//System.out.println("newword  = "+newWord);
			
			 if(map.containsKey(newWord))
			 {
				// System.out.println("map.getnew"+map.get(newWord));
				 System.out.println("map.get(newWord)"+map.get(newWord));
				 System.out.println("map.get(newWord).add(word)"+map.get(newWord).add(word));
				 map.get(newWord).add(word);
				 
			 }
			 
			 else
			 {	
				 List<String> words = new ArrayList<>();		 
				 words.add(word);
				 System.out.println("dd"+newWord + words);
				 map.put(newWord, words);
			 }
		}
		
		//System.out.println(map.entrySet());
		
		for(String s:map.keySet())
		{
			System.out.println(s);
			List<String> values = map.get(s); 
			if(values.size()>1)
			{
			System.out.println("values"+values);
			}
		}
		
		/*for(String w:words)
		{
			System.out.println(w);
		}*/
		
	}

}
