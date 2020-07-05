package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj9322 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String s1 = br.readLine();
			String s2 = br.readLine();
			String s3 = br.readLine();
			sb.append(go(n, s1, s2, s3)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static String go(int n, String s1, String s2, String s3) {
		Map<Integer, Integer> map = new HashMap<>();
		String[] arr1 = s1.split(" ");
		String[] arr2 = s2.split(" ");
		String[] arr3 = s3.split(" ");
		String[] arr4 = new String[n];
		for (int i = 0; i < n; i++) {
			int value = search(arr1, arr2[i]);
			map.put(i, value);
		}
		
		for (int i = 0; i < n; i++) {
			int value = map.get(i);
			arr4[value] = arr3[i];
		}
		
		return String.join(" ", arr4);
	}
	
	static int search(String[] arr, String s) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(s)) {
				return i;
			}
		}
		return 0;
	}

}
