package JavaPractice;

public class CallingAbstract extends AbstractPractice {

	@Override
	public void testing() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello impementing abstract method");
		
	}
	
	public static void main(String args[])
	{
		
		CallingAbstract cA = new CallingAbstract();
		cA.testing();
		
	}
	

}
