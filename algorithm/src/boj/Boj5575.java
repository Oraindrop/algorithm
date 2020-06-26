package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Boj5575 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			LocalTime start = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			LocalTime end = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			end = end.minusHours(start.getHour());
			end = end.minusMinutes(start.getMinute());
			end = end.minusSeconds(start.getSecond());
			sb.append(end.getHour()).append(" ").append(end.getMinute()).append(" ").append(end.getSecond()).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
