package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelfCopyNumber2028 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			int size = s.length();
			
			int n = Integer.parseInt(s);
			String powString = String.valueOf(n * n);
			int compare = Integer.parseInt(powString.substring(powString.length() - size, powString.length()));
			
			if (n == compare) {
				sb.append("YES");
			} else {
				sb.append("NO");
			}
			
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}
