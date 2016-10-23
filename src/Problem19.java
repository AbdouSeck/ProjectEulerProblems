//https://projecteuler.net/problem=19

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTime dt1 = new DateTime("1901-01-01");

		DateTime dt2 = new DateTime("2000-12-31");

		ArrayList<Date> dates = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt1.toDate());
		while (cal.getTime().before(dt2.toDate())) {
			cal.add(Calendar.DATE, 1);
			dates.add(cal.getTime());
		}

		int count = 0;

		for (Date date : dates) {

			if (new DateTime(date).getDayOfMonth() == 1 && new DateTime(date).getDayOfWeek() == 7) {
				count++;
			}
		}

		System.out.println(
				"The number of Sundays that fell on the first of the month during the twentieth century is " + count);
	}
}
