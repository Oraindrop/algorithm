package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RugbyClub2083 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while (!s.equals("# 0 0")) {
			st = new StringTokenizer(s);
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			sb.append(name).append(" ");
			if (age > 17 || weight >= 80) {
				sb.append("Senior");
			} else {
				sb.append("Junior");
			}
			sb.append(System.lineSeparator());
			s = br.readLine();
		}
		
		System.out.println(sb.toString());
	}

}
