package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fibonacci10870. {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long[] arr = new long[21];
        arr[0] = 0;
        arr[1] = 1;
		for(int i = 2; i < 21; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
        
        System.out.println(arr[t]);
	}

}
