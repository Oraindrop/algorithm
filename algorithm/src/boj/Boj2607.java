package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2607 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		char[] input = br.readLine().toCharArray();
		int[] arr = new int[26];
		for (int i = 0; i < input.length; i++) {
			arr[input[i] - 'A']++;
		}
		
		int count = 0;
		for (int i = 1; i < t; i++) {
			char[] candidates = br.readLine().toCharArray();
			int[] scores = new int[26];
			for (int j = 0; j < candidates.length; j++) {
				scores[candidates[j] - 'A']++;
			}
			
			if (similar(arr, scores)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static boolean similar(int[] arr1, int[] arr2) {
		int[] diff = new int[26];
		
		for (int i = 0; i < 26; i++) {
			diff[i] = arr1[i] - arr2[i];
		}
		
		if (isSame(diff)) {
			return true;
		}
		
		if (isDiffOne(diff)) {
			return true;
		}
		
		return isDiffTwo(diff);
	}
	
	static boolean isSame(int[] diff) {
		for (int i = 0; i < 26; i++) {
			if (diff[i] != 0)
				return false;
		}
		return true;
	}
	
	static boolean isDiffOne(int[] diff) {
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (Math.abs(diff[i]) > 1) {
				return false;
			}
			
			if (Math.abs(diff[i]) == 1) {
				count++;
			}
		}
		
		return count == 1;
	}
	
	static boolean isDiffTwo(int[] diff) {
		int plusCount = 0;
		int minusCount = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < 26; i++) {
			if (Math.abs(diff[i]) > 1) {
				return false;
			}
			
			if (diff[i] == 1) {
				plusCount++;
			} else if (diff[i] == -1) {
				minusCount++;
			} else {
				zeroCount++;
			}
		}
		
		return zeroCount == 24 && minusCount == 1 && plusCount == 1;
	}

}
