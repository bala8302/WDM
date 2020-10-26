package JavaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.impl.io.SocketOutputBuffer;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr[] = {"flower","flow","float"};
	 	Map<String,Integer> mp = new LinkedHashMap<>();
		int len = arr.length;
		String s;
		int count=0;
		String s1="";
		String firstPrefix= arr[0].substring(0,2);
	//	System.out.println("FirstPrefix"+firstPrefix);
		for(int i=0;i<len;i++)
		{
			s=arr[i];
			  //System.out.println("ss "+s);
				s1= s.substring(0,2);
				//System.out.println(s1);
				if(mp.containsKey(s1))
				{
				mp.put(s1, mp.get(s1)+1);
				}
				else
				{
				 mp.put(s1, ++count);
				}
		}
		
		System.out.println(mp.get(firstPrefix));
		System.out.println(len);
	
		if(mp.get(firstPrefix)== len)
		{
			System.out.println("All are Prefix");
		}
		
		else
		{
			System.out.println("Not Prefix");
		}
	}
	

}
