package WebDriverManager;

public class GenericClass<T> {
	
	T obj;
	
	void test(T obj)
	{
		this.obj= obj;
	}
	
	T get()
	{
		return obj;
	}
	

}
