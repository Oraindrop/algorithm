package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int none = 1;
		int left = 1;
		int right = 1;
		
		for (int i = 1; i < n; i++) {
			int preNone = none;
			int preLeft = left;
			int preRight = right;
			
			none = (preNone + preLeft + preRight) % 9901;
			left = (preNone + preRight) % 9901;
			right = (preNone + preLeft) % 9901;
		}
		
		System.out.println((none + left + right) % 9901);

	}

}
