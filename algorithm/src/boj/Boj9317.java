package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9317 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		while (!input.equals("0 0 0")) {
			String[] inputArr = input.split(" ");
			double d = Double.parseDouble(inputArr[0]);
			int rh = Integer.parseInt(inputArr[1]);
			int rv = Integer.parseInt(inputArr[2]);
			double w = 16 * d / Math.sqrt(337);
			double h = 9 * w / 16.0;
			sb.append(String.format("Horizontal DPI: %.2f", rh/w)).append(System.lineSeparator());
			sb.append(String.format("Vertical DPI: %.2f", rv/h)).append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
