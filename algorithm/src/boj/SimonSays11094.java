package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimonSays11094 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (s.length() > 10) {
				String candidate = s.substring(0, 10);
				if (candidate.equals("Simon says")) {
					sb.append(s.substring(10)).append(System.lineSeparator());
				}
			}
		}
		System.out.print(sb.toString());
	}

}
