package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6502 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		int index = 1;
		while (!input.equals("0")) {
			String[] arr = input.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);
			if (4 * a * a >= b * b + c * c) {
				sb.append("Pizza ").append(index).append(" fits on the table.");
			} else {
				sb.append("Pizza ").append(index).append(" does not fit on the table.");
			}
			sb.append(System.lineSeparator());
			index++;
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
