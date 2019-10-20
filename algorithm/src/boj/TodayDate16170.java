package boj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TodayDate16170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		TimeZone timeZone = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		df.setTimeZone(timeZone);
		String[] arr = df.format(date).split("-");
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
