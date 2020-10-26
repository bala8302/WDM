package JavaPractice;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "c:\\test\\test1\\test2\\d.txt";
		
		/*int cnt = s.lastIndexOf("\\");
		
		String fileExt = s.substring(cnt+1);
		
		System.out.println(fileExt);*/
		
	   String s1[] = s.split("\\\\");
	   
	   int n = s1.length;
	   
	   System.out.println(n);
	   
	  String s2 = s.split("\\\\")[n-1];
	  
	  System.out.println(s2);
		
	}

}
