package WebDriverManager;

import org.testng.annotations.Test;

public class PushZero {

	@Test(enabled=false)
	public void test1() {
		// TODO Auto-generated method stub
		
		int a[] = {1,0,3,0,4,5};
		int count= 0;
		
		int len = a.length;
		
		for(int i=0;i<len;i++){
			
			if(a[i]!=0){
				a[count++]=a[i];
			}
		}	
		
		System.out.println("count"+count);
		System.out.println("length"+len);
		 while (count < len) 
	            a[count++] = 0;
			
		for(int ab:a)
		{
			System.out.println(ab);
		}

	}
	
	@Test(enabled=true)
	public void test2()
	{
		int a[]={1,3,0,4,5,0,6,8};
		
		int b[] = new int[a.length];
		
		int count=0;
		int noofzeros=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]!=0)
			{
				b[count++]=a[i];
			}
			
			else
			{
				noofzeros++;
			}
			
		}
		
		for(int ab:b)
		{
			System.out.println(ab);
		}
		
		System.out.println(noofzeros);
		int k=0;
		
		for(int j=b.length;j>0;j--)
		{
			b[j-1]=0;
			k++;
		   if(k==noofzeros)
		   {
			   break;
		   }
		}
		
		for(int ab:b)
		{
			System.out.println(ab);
		}
	}

}
