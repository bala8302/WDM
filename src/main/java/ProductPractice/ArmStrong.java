package ProductPractice;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int temp;
		temp = n;
		int a,c=0;
		
		while(n>0)
		{
			a= n%10;
			System.out.println(a);
			n=n/10;
			System.out.println(n);
			c = c+(a*a*a);
			//System.out.println("cp=" +c);
		}
		
		System.out.println("c"+c);

	}

}
