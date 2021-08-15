package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3034 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		double c = Math.sqrt(a*a + b*b);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(br.readLine());
			if (c >= number) {
				sb.append("DA");
			} else {
				sb.append("NE");
			}
			sb.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
