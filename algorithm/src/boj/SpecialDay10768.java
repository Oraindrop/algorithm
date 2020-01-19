package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class SpecialDay10768 {

	private final static int YEAR = 2015; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		LocalDate baseDate = LocalDate.of(YEAR, 2, 18);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int month = Integer.parseInt(br.readLine());
		int day = Integer.parseInt(br.readLine());
		LocalDate date = LocalDate.of(YEAR, month, day);
		
		if (date.isBefore(baseDate)) {
			System.out.println("Before");
		} else if (date.isAfter(baseDate)) {
			System.out.println("After");
		} else {
			System.out.println("Special");
		}
	}

}
