package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Boj12840 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		LocalTime time = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()));

		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			if (input[0].equals("3")) {
				sb.append(time.format(DateTimeFormatter.ofPattern("H m s"))).append(System.lineSeparator());
			} else if (input[0].equals("1")) {
				time = time.plusSeconds(Integer.parseInt(input[1]));
			} else {
				time = time.minusSeconds(Integer.parseInt(input[1]));
			}
		}
		
		System.out.print(sb.toString());

	}

}
