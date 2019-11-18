package boj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TodayDate10699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TimeZone time;
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        time = TimeZone.getTimeZone("Asia/Seoul");
        df.setTimeZone(time);
        System.out.println(df.format(date));
	}

}
