package ProductPractice;

import java.util.Arrays;

public class SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SortedArrays.sortedarray();
		
		 SortedArrays.unsortedArray();
		
			}
	
	
	public static void sortedarray()
	{
		int a[]= {1,2,3};
		int b[] ={4,5,6};
		
		int c[]= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			c[a.length+j] = b[j];
		}
		
		for(int c1:c)
		{
		System.out.println(c1);
		}


	}
	
	public static void unsortedArray()
	{
		int a[]={4,5,3};
		int b[]={1,6,2};
		
		int c[] = new int [a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
		  c[a.length+j]	=b[j];
		}
		
		System.out.println("Before"+Arrays.toString(c));
		//int tmp = 0;
		for (int i = 0; i < c.length; i++) {
	        for (int j = i + 1; j < c.length; j++) {
	            int tmp = 0;
	            if (c[i] > c[j]) {
	                tmp = c[i];
	                c[i] = c[j];
	                c[j] = tmp;
	            }
	        }
	    }
		
		//Arrays.sort(c);
		
		System.out.println("After"+Arrays.toString(c));
	}

}
