package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Boj16463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 2019; i <= year; i++) {
			for (int j = 1; j <= 12; j++) {
				LocalDate ldt = LocalDate.of(i, j, 13);
				if (ldt.getDayOfWeek().getValue() == 5) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
