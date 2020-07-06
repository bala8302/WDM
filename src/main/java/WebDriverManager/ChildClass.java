package WebDriverManager;

public class ChildClass extends ParentClass {
	
	int id;
	public void tt(int id)
	{ 
		
		this.id=id;
		System.out.println(super.s);
		System.out.println(this.id);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass objj= new ChildClass();
		objj.tt(10);
		

	}

}
