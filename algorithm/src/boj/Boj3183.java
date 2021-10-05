package boj;

import java.io.InputStreamReader;
import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;

public class Boj3183 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0 0 0")) {
			String[] arr = input.split(" ");
			try {
				LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
				sb.append("Valid");
			} catch (Exception e) {
				// TODO: handle exception
				sb.append("Invalid");
			} finally {
				input = br.readLine();
				sb.append(System.lineSeparator());
			}
		}
		
		System.out.print(sb.toString());
		
	}


}
