package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			double val = Math.floor(Math.sqrt(b-a) + 0.5);
			if (b-a <= Math.pow(val, 2)) {
				sb.append((int) (val * 2 - 1));
			} else {
				sb.append((int) (val * 2));
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
