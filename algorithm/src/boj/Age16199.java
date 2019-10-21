package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Age16199 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int year2 = Integer.parseInt(st.nextToken());
		int month2 = Integer.parseInt(st.nextToken());
		int day2 = Integer.parseInt(st.nextToken());
		
		LocalDate date = LocalDate.of(year2, month2, day2);
		
		int yearAge = year2 - year;
		int countAge = yearAge + 1;
		int man = 0;
		if (year2 > year) {
			man = year2 - year;
			year += man;
			LocalDate temp = LocalDate.of(year, month, day);
			if (temp.isAfter(date)) man--;
		}
		
		System.out.println(man);
		System.out.println(countAge);
		System.out.println(yearAge);
	}

}
