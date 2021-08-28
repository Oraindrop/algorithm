package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Boj5074 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while (!input.equals("00:00 00:00")) {
			st = new StringTokenizer(input);
			String[] arr1 = st.nextToken().split(":");
			String[] arr2 = st.nextToken().split(":");
			LocalTime min = LocalTime.of(0, Integer.parseInt(arr1[1]));
			min = min.plusMinutes(Integer.parseInt(arr2[1]));
			
			int hour = Integer.parseInt(arr1[0]) + Integer.parseInt(arr2[0]) + min.getHour();
			int day = hour / 24;
			sb.append(String.format("%02d", hour % 24)).append(":").append(String.format("%02d", min.getMinute()));
			if (day > 0) {
				sb.append(" +").append(day);
			}
			sb.append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
