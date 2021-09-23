package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3448 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int length = 0;
			int count = 0;
			String line = br.readLine();
			while (!line.isEmpty()) {
				length += line.length();
				count += count(line);
				line = br.readLine();
			}
			String percent = String.format("%.1f", (double)(length-count) / (double) length * 100.0);
			if (percent.substring(percent.length()-2).equals(".0")) {
				percent = percent.substring(0, percent.length()-2);
			}
			sb.append("Efficiency ratio is ").append(percent).append("%.").append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
			
	}

	static int count(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("#")) {
				count++;
			}
		}
		return count;
	}

}
