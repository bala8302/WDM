package ProductPractice;

public class Naturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=5;
		int n2=3;
		int res=0;
		
		for(int i=0;i<100;i++)
		{
			
			if(i%n1==0 || i%n2==0)
			{
				res+=i;
				
				System.out.println(i);
				
			}
		}
		
		System.out.println(res);

	}

}
