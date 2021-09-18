package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long a = (n * (n+1)) / 2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = 0;
		while (st.hasMoreTokens()) {
			sum += Long.parseLong(st.nextToken());
		}
		
		System.out.println(a - sum);
	}

}
