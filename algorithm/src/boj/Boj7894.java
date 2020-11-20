package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj7894 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int input = Integer.parseInt(br.readLine());
			double answer = 0;
			for (int j = 1; j <= input; j++) {
				answer += Math.log10(j);
			}
			sb.append((int)answer + 1).append(System.lineSeparator());
		}
		
		System.out.println(sb.toString());
	}

}
