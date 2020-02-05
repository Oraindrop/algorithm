package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromMaker1213 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] arr = new int[26];
		int oddCount = 0;
		int index = -1;
		
		for (char c : input.toCharArray()) {
			arr[c-'A']++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				oddCount++;
				index = i;
			}
		}
		
		String answer = "";
		if (isRight(oddCount, input.length())) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i] / 2; j++) {
					answer += (char)((int)'A' + i);
				}
			}
			if (input.length() % 2 == 1) answer += (char)((int)'A' + index);
			
			for (int i = arr.length - 1; i >= 0; i--) {
				for (int j = 0; j < arr[i] / 2; j++) {
					answer += (char)((int)'A' + i);
				}
			}
			
			System.out.println(answer);
		} else {
			System.out.println("I'm Sorry Hansoo");
		}
	}
	
	private static boolean isRight(int oddCount, int size) {
		return (oddCount == 0 && size % 2 == 0) || (oddCount == 1 && size % 2 == 1);
	}


}
