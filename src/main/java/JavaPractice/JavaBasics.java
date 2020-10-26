package JavaPractice;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="12";
		Object obj =s;
		System.out.println(obj);
		int t =12;
		Object obj1 =t;
		System.out.println(obj1);
		
		//
		int d = Integer.parseInt(s);
		//System.out.println("dd"+d);
		
		//
		 
		//String.valueOf(b)
		
	   int xvalue =	Integer.valueOf(s);
	   System.out.println(xvalue);
	   
	   //Integer to double
	   
	   int r =10;
	   Double ddoub = new Double(r);
	   System.out.println("Integer to double"+ddoub);
	   
	   // Double to Integer,float
	   double rg =10.0;
	   
	   int hh =(int)rg;
	   
	   float ff = (float)rg;
	   
	   //Integet to float
	   
	   int gg =10;
	   
	   float fft = (float)gg;
	   
	   
	   
	   
	   

	}

}
