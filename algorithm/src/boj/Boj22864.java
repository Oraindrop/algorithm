package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj22864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int answer = 0;
		int limit = 0;
		
		for (int i = 0; i < 24; i++) {
			if (limit + a <= m) {
				answer += b;
				limit += a;
			} else {
				limit -= c;
				if (limit < 0) limit = 0;
			}
		}
		
		System.out.println(answer);
	}

}
