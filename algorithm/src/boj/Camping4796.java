package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camping4796 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		int index = 1;
		
		while (!input.equals("0 0 0")) {
			st = new StringTokenizer(input);
			int l = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			int answer = (int)(v / p) * l;
			answer += v % p > l ? l : v % p; 
			sb.append(String.format("Case %s: %s", index, answer)).append(System.lineSeparator());
			input = br.readLine();
			index++;
		}
		
		System.out.println(sb.toString());
	}

}
