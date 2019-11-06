package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseWord9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s = "";
		char[] cArr;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				s = st.nextToken();
				cArr = s.toCharArray();
				for (int j = s.length() - 1; j >= 0; j--) {
					sb.append(cArr[j]);
				}
				sb.append(" ");
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
