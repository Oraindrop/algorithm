package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Boj3029 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(":");
		String[] arr2 = br.readLine().split(":");
		LocalTime time1 = LocalTime.of(Integer.parseInt(arr1[0]), Integer.parseInt(arr1[1]), Integer.parseInt(arr1[2]));
		LocalTime time2 = LocalTime.of(Integer.parseInt(arr2[0]), Integer.parseInt(arr2[1]), Integer.parseInt(arr2[2]));
		
		if (time2.equals(time1)) {
			System.out.println("24:00:00");
		}
		else {
			if (time2.isBefore(time1)) {
				time2 = time2.plusHours(24);
			}
			time2 = time2.minusHours(time1.getHour());
			time2 = time2.minusMinutes(time1.getMinute());
			time2 = time2.minusSeconds(time1.getSecond());
			System.out.println(time2.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		}

	}

}
