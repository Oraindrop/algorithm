package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hercules10205 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= t; i++) {
			int answer = Integer.parseInt(br.readLine());
			String s = br.readLine();
			sb.append(String.format("Data Set %s:", i)).append(System.lineSeparator());
			for (char c : s.toCharArray()) {
				answer += c == 'c' ? 1 : -1;
			}
			sb.append(answer).append(System.lineSeparator()).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
