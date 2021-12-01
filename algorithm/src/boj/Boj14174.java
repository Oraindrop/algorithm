package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14174 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[26];
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] inputs = br.readLine().split(" ");
			char[] inputArr1 = inputs[0].toCharArray();
			char[] inputArr2 = inputs[1].toCharArray();
			int[] arr1 = new int[26];
			int[] arr2 = new int[26];
			for (int j = 0; j < inputArr1.length; j++) {
				arr1[inputArr1[j] - 'a']++;
			}
			
			for (int j = 0; j < inputArr2.length; j++) {
				arr2[inputArr2[j] - 'a']++;
			}
			
			for (int j = 0; j < 26; j++) {
				arr[j] += Math.max(arr1[j], arr2[j]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			sb.append(arr[i]).append(System.lineSeparator());
		}
		
		System.out.println(sb.toString());
	}
}
