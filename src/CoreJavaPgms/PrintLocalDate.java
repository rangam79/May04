package CoreJavaPgms;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;

public class PrintLocalDate {

	public static void main(String[] args) {
		Time time1=new Time(5000);
		LocalDate Date1=LocalDate.now();
		System.out.println(time1);
		//Date date2=new Date();
		
		
		System.out.println(Date1 );
		
		
		Calendar call=Calendar.getInstance();
		System.out.println(call.getTime());

	}

}
