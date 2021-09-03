package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1340 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String monthDayString = st.nextToken();
		String input = st.nextToken();
		int day = Integer.parseInt(input.substring(0, input.length()-1));
		int year = Integer.parseInt(st.nextToken());
		boolean yearYn = false;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			yearYn = true;
		}
		int monthDay = getMonthDay(monthDayString, yearYn);
		int totalDay = yearYn ? 366 : 365;
		
		String[] inputArr = st.nextToken().split(":");
		int hour = Integer.parseInt(inputArr[0]);
		int min = Integer.parseInt(inputArr[1]);
		
		double answer = ((monthDay * 24 * 60) + ((day-1) * 24 * 60) + (hour * 60) + min) / (double)(totalDay * 24 * 60);
		System.out.println(answer * 100);
		
		
	}
	
	static int getMonthDay(String inputMonth, boolean yearYn) {
		String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] monthByDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < month.length; i++) {
			if (month[i].equals(inputMonth)) {
				int sum = 0;
				for (int j = 0; j < i; j++) {
					sum += monthByDay[j];
					if (yearYn && j == 1) {
						sum++;
					}
				}
				return sum;
			}
		}
		return 0;
	}

}
