package JavaPractice;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8ClockZone {
	
	
	public static void clockex()
	{
		Clock c = Clock.systemDefaultZone();
		System.out.println(c.instant());
		System.out.println(c.getZone());
		//System.out.println(c.);
	}
	
	public static void clockex1()
	{
		Clock c = Clock.systemUTC();
		System.out.println(c.instant());
	}
	
	public static void ZoneDateTimeEx()
	{
		LocalDateTime ldt = LocalDateTime.now();
		ZoneId zd = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zd);
		System.out.println("Zonetime"+zdt);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//clockex();
		//clockex1();
		ZoneDateTimeEx();
	}

}
