package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13417 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = "";
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				char input = st.nextToken().charAt(0);
				if (s.length() == 0) {
					s += input;
				} else {
					int index = 0;
					boolean beforeYn = true;
					while (index < s.length()) {
						char c = s.charAt(index);
						if (c > input) {
							beforeYn = true;
							break;
						}
						
						if (c < input) {
							beforeYn = false;
							break;
						}
						index++;
					}
					if (beforeYn) {
						s = input + s;
					} else {
						s = s + input;
					}
				}
			}
			sb.append(s).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}
