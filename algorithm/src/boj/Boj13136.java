package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13136 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long r = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		
		long a = r / n;
		if (r % n != 0) {
			a++;
		}
		
		long b = c / n;
		if (c % n != 0) {
			b++;
		}
		
		System.out.println(a * b);
	}

}
