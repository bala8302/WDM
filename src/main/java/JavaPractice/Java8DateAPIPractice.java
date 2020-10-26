package JavaPractice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Java8DateAPIPractice {
	
	public static void LocalCls()
	{
		 LocalDate date = LocalDate.now();
		 LocalDate tomo = date.plusDays(1);
		 System.out.println("Tomo"+tomo);
		 
		 LocalDate yest = date.minusDays(1);
		 System.out.println("yester"+yest);
		 
	}
	
	public static void CheckLeapyear()
	{
		LocalDate leapyr = LocalDate.of(1999, 1, 10);
		System.out.println(leapyr.isLeapYear());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LocalCls();
		
		//CheckLeapyear();
		
		compareToo();

	}
	
	public static void compareToo()
	{
		//LocalDate ld = LocalDate.of(2020, 3, 10);
		
		LocalDate ld = LocalDate.now();
		
		LocalDate ld1 = LocalDate.of(2020, 2, 10);
		
	     int n = ld.compareTo(ld1);
	     
	     System.out.println(n);
		
	     // get day of month
	     int getDayofMonth = ld.getDayOfMonth();
	     
	     DayOfWeek dayofwk =  ld.getDayOfWeek();
	     
	     System.out.println("getDayofmonth"+getDayofMonth);
	     
	     System.out.println("dayofwk"+dayofwk);
	     
	     int getDayyear =  ld.getDayOfYear();
	     System.out.println("getDayofYear"+getDayyear);
	     
	      Month getMonth = ld.getMonth();
	     
	      System.out.println("getMonth"+getMonth);
	      
	      int monthValue =  ld.getMonthValue();
	      
	      System.out.println("MonthValue"+monthValue);
	      
	      int yr =  ld.getYear();
	      
	      System.out.println("GetYear"+yr);
	     
	}

}
