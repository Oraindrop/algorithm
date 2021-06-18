package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj12925 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append("Case #").append(i+1).append(": ");
			int t = Integer.parseInt(br.readLine());
			double answer = 3 + Math.sqrt(5);
			long result = (long) Math.pow(answer, t);
			String s = String.valueOf(result); 
			if (s.length() < 3) {
				for (int j = 0; j < 3 - s.length(); j++) {
					sb.append("0");
				}
				sb.append(s);
			} else {
				sb.append(s.substring(s.length()-3, s.length()));
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
