package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj5043 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long base = 1;
		
		if (b > 0) {
			base = (long)Math.pow(2, b+1) - 1;
		}
		
		System.out.println(base >= n? "yes" : "no");
	}

}
