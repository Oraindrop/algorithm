package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Boj1942 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			String[] input = br.readLine().split(" ");
			String[] first = input[0].split(":");
			String[] second = input[1].split(":");
			LocalTime start = LocalTime.of(Integer.parseInt(first[0]), Integer.parseInt(first[1]), Integer.parseInt(first[2]));
			LocalTime end = LocalTime.of(Integer.parseInt(second[0]), Integer.parseInt(second[1]), Integer.parseInt(second[2]));
			int count = 0;
			while (!start.equals(end)) {
				if ((start.getHour() * 10000 + start.getMinute() * 100 + start.getSecond()) % 3 == 0) {
					count++;
				}
				start = start.plusSeconds(1);
			}
			
			if ((start.getHour() * 10000 + start.getMinute() * 100 + start.getSecond()) % 3 == 0) {
				count++;
			}
			sb.append(count).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
