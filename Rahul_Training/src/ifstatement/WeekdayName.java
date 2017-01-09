package ifstatement;

import java.util.GregorianCalendar;

public class WeekdayName {

	public static void main(String[] args) {

		GregorianCalendar gc=new GregorianCalendar();
		int day= gc.get(GregorianCalendar.DAY_OF_WEEK);
		
		if(day==1)
			System.out.println("Today is Sunday");
		
		if(day==2)
			System.out.println("Today is Monday");
		if(day==3)
			System.out.println("Today is Tuesday");
		if(day==4)
			System.out.println("Today is Wednesday");
		if(day==5)
			System.out.println("Today is Thursday");
		if(day==6)
			System.out.println("Today is Friday");
		if(day==7)
			System.out.println("Today is Saturday");
		
		
	}

}
