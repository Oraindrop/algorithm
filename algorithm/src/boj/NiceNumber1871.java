package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NiceNumber1871 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "-");
			String s = st.nextToken();
			int back = Integer.parseInt(st.nextToken());
			
			int front = 0;
			int pow = 2;
			for (char c : s.toCharArray()) {
				int n = (int)c - (int)'A';
				int value = n * (int)Math.pow(26, pow);
				pow--;
				front += value;
			}
			
			if (Math.abs(front - back) <= 100) {
				sb.append("nice").append(System.lineSeparator());
			} else {
				sb.append("not nice").append(System.lineSeparator());
			}
		}
		
		System.out.println(sb.toString());
	}

}
