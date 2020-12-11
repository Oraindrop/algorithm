package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1500 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = Long.parseLong(st.nextToken());
		long count = Long.parseLong(st.nextToken());
		
		long div = sum / count;
		long mod = sum % count;
		
		long answer = 1;
		
		for (int i = 0; i < count; i++) {
			if (i < mod) {
				answer *= (div+1);
			} else {
				answer *= div;
			}
		}
		
		System.out.println(answer);
		
	}

}
