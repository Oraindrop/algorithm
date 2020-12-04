package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5361 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		double[] prices = new double[5];
		prices[0] = 350.34;
		prices[1] = 230.90;
		prices[2] = 190.55;
		prices[3] = 125.30;
		prices[4] = 180.90;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			double sum = 0;
			for (int j = 0; j < 5; j++) {
				sum += Double.parseDouble(input[j]) * prices[j];
			}
			sb.append("$").append(String.format("%.2f", sum)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
