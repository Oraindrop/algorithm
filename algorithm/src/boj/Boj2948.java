package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Boj2948 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		LocalDate date = LocalDate.of(2009, m, d);
		String day = date.getDayOfWeek().toString();
		System.out.println(day.substring(0, 1) + day.substring(1).toLowerCase());
		
	}

}
