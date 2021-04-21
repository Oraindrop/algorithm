package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15624 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[1000001];
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			arr[i] = (arr[i-1] % 1000000007 + arr[i-2] % 1000000007) % 1000000007; 
		}
		
		System.out.println(arr[n]);
	}

}
