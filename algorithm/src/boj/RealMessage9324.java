package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealMessage9324 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			System.out.println(go(s));
		}
	}
	
	static String go(String s) {
		int[] arr = new int[26];
		
		int check = -1;
		
		for (char c : s.toCharArray()) {
			if (check != -1) {
				if (c != check + 'A') {
					return "FAKE";
				}
				arr[c - 'A'] = -1;
			}
			
			arr[c - 'A']++;
			check = check(arr);
		}
		if (check == -1) return "OK";
		return "FAKE";
	}
	
	static int check(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i] % 3 == 0) 
				return i;
		}
		
		return -1;
	}

}
