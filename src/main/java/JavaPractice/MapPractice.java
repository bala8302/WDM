package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Map<String,String>> supermap = new HashMap<String,Map<String,String>>();
		Map<String,String> mp = new HashMap<String,String>();
		
		mp.put("id","100");
		mp.put("name", "Bala");
		mp.put("class", "hji");
		
		supermap.put("FirstStudent", mp);
		
		Map<String,String> secmap = supermap.get("FirstStudent");
		
		for(Map.Entry m:secmap.entrySet())
		{
			System.out.println(m.getKey() + "," + m.getValue());
		}
	}

}
