package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] ={"one","two","three"};
		
		String b[] = {"four","Five","Six"};
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.addAll(Arrays.asList(a));
		alist.addAll(Arrays.asList(b));
		
		Object c[]= alist.toArray();
		
		System.out.println(Arrays.toString(c));
	}

}
