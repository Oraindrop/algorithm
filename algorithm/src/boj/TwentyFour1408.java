package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TwentyFour1408 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cur = br.readLine();
		String start = br.readLine();
		
		LocalTime curTime = LocalTime.parse(cur, DateTimeFormatter.ofPattern("HH:mm:ss"));
		LocalTime startTime = LocalTime.parse(start, DateTimeFormatter.ofPattern("HH:mm:ss"));
		LocalTime leftTime;
		if (curTime.isAfter(startTime)) {
			leftTime = LocalTime.of(23, 59, 59);
			LocalTime lastTime = curTime.minusHours(startTime.getHour()).minusMinutes(startTime.getMinute()).minusSeconds(startTime.getSecond());
			leftTime = leftTime.minusHours(lastTime.getHour()).minusMinutes(lastTime.getMinute()).minusSeconds(lastTime.getSecond()).plusSeconds(1);
		} else {
			leftTime = startTime.minusHours(curTime.getHour()).minusMinutes(curTime.getMinute()).minusSeconds(curTime.getSecond());
		}
		
		System.out.println(leftTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
	}

}
