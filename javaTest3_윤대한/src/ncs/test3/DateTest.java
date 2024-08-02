package ncs.test3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		GregorianCalendar gc1 = new GregorianCalendar(1987, 4, 27);
		GregorianCalendar gc2 = new GregorianCalendar(1987, 4, 27);
		System.out.println(gc1.get(Calendar.YEAR));
	}
}
