package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2446 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] arr = new String[(2*n)-1];
		for (int i = 0; i < n; i++) {
			String line = "";
			for (int j = 0; j < i; j++) {
				line += " ";
			}
			for (int j = 0; j < (2 * (n-i)) -1; j++) {
				line += "*";
			}
			arr[i] = line;
		}
		
		int mid = arr.length / 2;
		for (int i = 0; i < mid; i++) {
			arr[mid + 1 + i] = arr[mid - 1 - i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
