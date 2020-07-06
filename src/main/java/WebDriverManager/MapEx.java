package WebDriverManager;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Book> mp = new HashMap<Integer,Book>();
		Book b1 = new Book(100,"Tedd");
		mp.put(1, b1);
        
		for(Map.Entry<Integer,Book> en:mp.entrySet())
		{
		  int key = en.getKey();
		  Book b = en.getValue();
		  System.out.println("key"+key);
		  System.out.println("value"+b.bookid+b.bookname);
		}

	}

	
}
