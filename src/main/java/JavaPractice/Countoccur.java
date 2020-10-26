package JavaPractice;

public class Countoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="aaabbcc";
		int len =s.length();
		char c;
		int count=1;
		char prev;
		String output;
		for(int i=1;i<s.length();i++)
		{
			c=s.charAt(i);
			prev = s.charAt(i-1);
			count++;
			if(c==prev)
			{
				output= c +""+count;
				System.out.println("ifloop"+output);
				
			}
			else
			{
				count=0;
				output = prev +""+count++;
				System.out.println("elseloop"+output);
			}
			
		} 
		

	}

}
