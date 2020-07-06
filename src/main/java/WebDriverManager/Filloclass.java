package WebDriverManager;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Filloclass {
	
	@Test
	public void readData() throws FilloException
	{
		Fillo fillo = new Fillo();
		
		Connection connection=fillo.getConnection("C:\\testfile\\FilloFile.xlsx");
		String strQuery="Select * from Sheet1";
		Recordset recordset=connection.executeQuery(strQuery);
		while(recordset.next()){
			ArrayList<String> dataColl=recordset.getFieldNames();
			System.out.println(dataColl);
			Iterator<String> dataIterator=dataColl.iterator();
			System.out.println(dataColl.size());  
			
			System.out.println("RecordSet"+recordset.getCount());
			
			while(dataIterator.hasNext()){
	            //for (int i=0;i<=dataColl.size()-1;i++){
	            	
	            	String data=dataIterator.next();
	            	System.out.println("DATTAAA"+data);
	            	String dataVal=recordset.getField(data);
	            	System.out.println("DATTAAA"+dataVal);
	            	
	            //}
	            }

			//System.out.println(recordset.getField("Name"));
			}
		recordset.close();
		connection.close();
			
		
	}
	

}
