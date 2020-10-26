package JavaPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {
	
	
	public static void simplDateForm()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = new Date();
		
		String format = sdf.format(d);
	
        System.out.println(format);
	}
	
	public static void StringtoDate() throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
	    Date date = sdf.parse("23/07/2019");
	    System.out.println("Date"+date);
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//simplDateForm();
		 StringtoDate();

	}

}
