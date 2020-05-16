package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14495 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(go(n));
	}
	
	static long go(int n) {
		if (n < 4) {
			return 1;
		}
		
		long[] arr = new long[n+1];
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		for (int i = 4; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-3];
		}
		
		return arr[n];
	}

}
