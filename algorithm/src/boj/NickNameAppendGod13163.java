package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NickNameAppendGod13163 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			sb.append("god");
			while (st.hasMoreTokens()) {
				sb.append(st.nextToken());
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
