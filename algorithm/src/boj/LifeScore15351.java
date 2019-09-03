package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LifeScore15351 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			int score = 0;
			for (char c : s.toCharArray()) {
				int cInt = (int)c;
				if (cInt >= 65 && cInt <= 90) {
					score += cInt - 64;
				}
			}
			sb.append(score == 100 ? "PERFECT LIFE" : score).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
