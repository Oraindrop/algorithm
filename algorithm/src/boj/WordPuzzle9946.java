package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordPuzzle9946 {

	static int[] arr1 = new int[26];
	static int[] arr2 = new int[26];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int index = 1;
		StringBuilder sb = new StringBuilder();
		while(!(s1.equals(s2) && s1.equals("END"))) {
			sb.append(String.format("Case %s: ", index));
			if (s1.length() != s2.length()) {
				sb.append("different");
			} else {
				if (isSame(s1, s2)) {
					sb.append("same");
				} else {
					sb.append("different");
				}
			}
			sb.append(System.lineSeparator());
			index++;
			s1 = br.readLine();
			s2 = br.readLine();
		}
		System.out.print(sb.toString());
	}
	
	static boolean isSame(String s1, String s2) {
		clear(arr1);
		clear(arr2);
		
		for (char c : s1.toCharArray()) {
			arr1[c - 97]++;
		}
		
		for (char c : s2.toCharArray()) {
			arr2[c - 97]++;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) 
				return false;
		}
		
		return true;
	}
	
	static void clear(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}

}
