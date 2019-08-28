package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextNumber4880 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(!s.equals("0 0 0")) {
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (2 * b == a + c) {
				sb.append("AP ").append(c + (c - b)).append(System.lineSeparator());
			} else {
				sb.append("GP ").append(c * (c / b)).append(System.lineSeparator());
			}
			s = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
