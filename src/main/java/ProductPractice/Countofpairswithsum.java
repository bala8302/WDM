package ProductPractice;

public class Countofpairswithsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 1, 5, 7, -1, 5 };
		 
		 int sum =6;
		 
		 int count =0;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1; j<arr.length;j++)
			 {
				System.out.println(arr[i] +","+arr[j]);
				if( arr[i]+ arr[j] == sum)
				count++;
					
			 }
		 }
		 
		 System.out.println(count);

	}

}
