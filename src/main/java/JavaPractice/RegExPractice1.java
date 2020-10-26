package JavaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*boolean output = Pattern.matches("\\d*", "12333");
		System.out.println("output"+output);

		boolean output1 = Pattern.matches("\\D*", "abc");
		System.out.println("output"+output1);
*/
		
	    Pattern p = Pattern.compile("-?\\d+");
		Matcher m  = p.matcher("There are more than -2 and less than 12 12 numbers here");
		
		while(m.find())
		{
			//System.out.println(m.group());
			System.out.println(m.group(0));
			//System.out.println(m.groupCount());
		}
		
	}

}
