package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnowWhiteWithDwarf3040 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		go(arr, sum);
		
		for (int i = 0; i < 9; i++) {
			if (arr[i] != 0) System.out.println(arr[i]);
		}
		
	}

	private static void go(int[] arr, int sum) {
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				if ((sum - arr[i] - arr[j]) == 100) {
					arr[i] = 0;
					arr[j] = 0;
					return;
				}
			}
		}
	}

}
