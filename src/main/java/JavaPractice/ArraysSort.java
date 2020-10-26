package JavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.testng.annotations.Test;


public class ArraysSort {
	
	@Test
	public void sort()
	{
		LinkedList<String> lis = new LinkedList<>(Arrays.asList("one","three","nine","aa"));
		System.out.println(lis);
		Collections.sort(lis);
		//Arrays.asList()
		System.out.println("Aftersort"+lis);
		
		String s[] = {"xx","yy","zz"};
		
		System.out.println("before sort"+s);
		
		Arrays.sort(s);
		
		System.out.println("after sort"+Arrays.toString(s));
	}
}

