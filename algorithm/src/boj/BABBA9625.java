package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BABBA9625 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arrA = new long[46];
		long[] arrB = new long[46];
		
		arrA[0] = 0;
		arrA[1] = 1;
		arrB[0] = 1;
		arrB[1] = 1;
		
		for (int i = 2; i < n; i++) {
			arrA[i] = arrA[i-1] + arrA[i-2];
			arrB[i] = arrB[i-1] + arrB[i-2];
		}
		
		System.out.println(arrA[n-1] + " " +arrB[n-1]);
	}	

}
