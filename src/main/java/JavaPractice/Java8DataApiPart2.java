package JavaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

import org.testng.annotations.Test;

public class Java8DataApiPart2 {
	
	//@Test
	public void getDatTime()
	{
	 LocalDate ld = LocalDate.now();
	 
	 LocalDateTime ldt = ld.atTime(6, 15);
	 
	 System.out.println(ldt);
	}

	//@Test
	public void getLocalTime()
	{
		LocalTime lt = LocalTime.now();
		
		System.out.println("LocalTime"+lt);
		
		LocalTime hrs = lt.plusHours(2);
		
		System.out.println("Plushrs"+hrs);	
	}
	
	@Test
	public void Zonedid()
	{
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo"); 
	    
	    LocalDate ld = LocalDate.now(zone1);
	    //LocalDateTime ldt = LocalDateTime.now(ld);
	    
	    LocalDate ld1 = LocalDate.now(zone2);
	    
	  //  System.out.println("Asia/kolkata Date"+ld);
	   // System.out.println("Asia/Tokyo"+ld1);
	    
	    LocalTime lt = LocalTime.now(zone1);
	    
	    LocalTime lt1 = LocalTime.now(zone2);
	    
	    System.out.println("Asia/kolkata time"+lt);
	    System.out.println("Asia/Tokyo time"+lt1);
		
	}
	
	
	

}
