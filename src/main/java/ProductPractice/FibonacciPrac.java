package ProductPractice;

public class FibonacciPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prevno =0;
		int curno =1;
		
		System.out.println(prevno+"\n"+curno);
		for(int i=2;i<10;i++)
		{
		 int futureno = prevno+curno;
		 System.out.println(futureno);
		 prevno=curno;
		 curno=futureno;
		}
		

	}

}
