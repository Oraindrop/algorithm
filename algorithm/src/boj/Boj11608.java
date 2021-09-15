package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11608 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] arr = new int[26];
		
		for (char c : input.toCharArray()) {
			arr[c - 'a']++;
		}
		
		int count = countAlpha(arr);
		int answer = 0;
		
		while (count > 2) {
			int min = Integer.MAX_VALUE;
			int minIndex = Integer.MAX_VALUE;
			
			for (int i = 0; i < 26; i++) {
				if (arr[i] != 0 && arr[i] < min) {
					min = arr[i];
					minIndex = i;
				}
			}
			
			arr[minIndex]--;
			answer++;
			count = countAlpha(arr);
		}
		
		System.out.println(answer);
	}
	
	static int countAlpha(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i != 0) count++;
		}
		return count;
	}

}
