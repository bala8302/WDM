package ProductPractice;

public class SumofEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1246;
		int sum=0;
		
		while(n!=0)
		{
		  sum = sum + n%10;
		  System.out.println("summ"+sum);
		  n =n/10;
		}
		
		System.out.println(sum);
		
		//int f=10;

	}
	
	 
	

}
