package JavaPractice;

import java.util.Arrays;

public class Arraystraver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,4,0,5,0,9,8};
		
		int len = a.length;
		
		int count=0;
		
		for(int aa:a)
		{
			if(aa!=0){
			 a[count]=aa;
			 count++;
			}
		}
		
		System.out.println("countsize"+count);
		
		while(count<len){
			a[count++]=0;
		}
		
		System.out.println(Arrays.toString(a));
		
		

	}

}
