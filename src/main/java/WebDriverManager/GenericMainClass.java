package WebDriverManager;

public class GenericMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<Integer> m = new GenericClass<Integer>();
		
		m.test(100);
		//m.test(obj);
		
		System.out.println(m.get());
	}

}
