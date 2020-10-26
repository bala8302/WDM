package ProductPractice;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DistinctWordList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis;
		DataInputStream dis;
		BufferedReader br =null;
		
		HashSet<String> wordList = new HashSet<String>();
		
		 fis = new FileInputStream("C:\\testfile\\DistinctWords.txt");
		 dis = new DataInputStream(fis);
		 br = new BufferedReader(new InputStreamReader(dis));
		 String line;
		 
		 while((line = br.readLine())!=null)
		 {
			 StringTokenizer st = new StringTokenizer(line," ,.;:\"");
			 while(st.hasMoreTokens())
			 {
				 wordList.add(st.nextToken());
			 }
		 }
		 
		 try{
			 
             if(br != null){
                 br.close();
             }
         }catch(Exception ex){
             System.out.println(ex.getMessage());
         }
		 
		 for(String wL:wordList)
		 {
			 System.out.println(wL);
		 }
	}

}
