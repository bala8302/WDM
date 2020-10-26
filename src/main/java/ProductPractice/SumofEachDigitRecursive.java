package ProductPractice;

public class SumofEachDigitRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public int sumofdigit(int n)
	{
		return n==0?0:n%10+sumofdigit(n/10);
	}

}
