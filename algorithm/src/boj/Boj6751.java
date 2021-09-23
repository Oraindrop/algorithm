package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n+1; i <= 12345; i++) {
			if (isDistinctDigits(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	static boolean isDistinctDigits(int n) {
		int[] arr = new int[10];
		while (n > 0) {
			arr[n%10]++;
			n /= 10;
		}
		
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 1) {
				return false;
			}
		}
		
		return true;
	}
}
