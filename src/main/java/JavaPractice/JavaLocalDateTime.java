package JavaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class JavaLocalDateTime {
	
	
	public static void LocalDatetim()
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("ldt"+ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String afterFormat = ldt.format(dtf);
		System.out.println("AfterFormat"+afterFormat);
	}
	
	public static void monthDate()
	{
	  MonthDay mday = MonthDay.now();
	  LocalDate ld = mday.atYear(2020);
	  
	  System.out.println("ld"+ld);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LocalDatetim();
        monthDate();
	}

}
