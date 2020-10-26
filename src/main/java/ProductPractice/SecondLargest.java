package ProductPractice;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] ={12,3,5};
		
		/*String s="";
		
		Arrays.sort(a);
		
		for(int bb:a)
		{
		 //System.out.println(bb);
		 s= s +","+bb;
		}
		
		System.out.println(s);
		*/
		
	   //find maximum
		/*Arrays.sort(a);
		int maxnum=0;
		int minnum=0;
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			for(int j=1;j<a.length;j++)
			{
				//System.out.println(a[j]);
				if(a[i]<a[j])
				{
					minnum =a[i];
				}
				if(a[i]>a[j])
				{
				    maxnum =a[i];	
				}
			}
		}
		
		
		System.out.println(maxnum);
*/
		
		//Using Arrays.sort
		
		/*Arrays.sort(a);
		for(int bb:a)
		{
			System.out.println(bb);
		}
		int res = a[a.length-2];
		System.out.println("Res"+res);
		*/
		
		
		// using loop
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for( int j=i+1;j<a.length;j++)
			{
				if(a[i] >a[j])
				{
					temp=a[i];
					a[i] =a[j];
					a[j] = temp;
					
					System.out.println("temp"+temp);
					System.out.println("a[i]"+a[i]);
					System.out.println("a[j]"+a[j]);
				}
				
				
			}
		}
		
		for(int bb:a)
		{
			System.out.println(bb);
		}
		
		int res = a[a.length-2];
		System.out.println("Res"+res);
	}

}
