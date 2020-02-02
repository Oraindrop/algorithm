package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram1919 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] cArr1 = br.readLine().toCharArray();
		char[] cArr2 = br.readLine().toCharArray();
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for (int i = 0; i < cArr1.length; i++) {
			arr1[cArr1[i] - 'a']++;
		}
		
		for (int i = 0; i < cArr2.length; i++) {
			arr2[cArr2[i] - 'a']++;
		}
		
		int answer = 0;
		
		for (int i = 0; i < 26; i++) {
			answer += Math.abs(arr1[i] - arr2[i]);
		}
		
		System.out.println(answer);
	}

}
