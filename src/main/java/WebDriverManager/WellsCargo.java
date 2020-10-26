package WebDriverManager;

public class WellsCargo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="CoffeeShop";
		
		String t = "hot Coffee";
		
		String T[]= t.split(" ");
		
		//System.out.println(T.length);
		
		for(int i=0;i<T.length;i++)
		{
			//System.out.println("coming inside loop");
			if(s.contains(T[i]))
			{			
				System.out.println("Matches with "+T[i] +" "+"True");
			}
			else
			{
				System.out.println("Not Matches "+T[i] +" "+"False");
			}
		}
		

	}

}
