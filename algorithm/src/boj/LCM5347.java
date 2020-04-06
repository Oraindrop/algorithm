package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM5347 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long gcm = b > a? gcm(a, b) : gcm(b, a);
			long answer = (a * b) / gcm;
			sb.append(answer).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static long gcm(long a, long b) {
		if(a == 0) {
			return b;
		}
		return gcm(b % a, a);
	}

}
