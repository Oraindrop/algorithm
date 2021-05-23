package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11383 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st.nextToken();
		String[] arr1 = new String[n];
		String[] arr2 = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = br.readLine();
		}
		
		for (int i = 0; i < n; i++) {
			arr2[i] = br.readLine();
		}
		
		System.out.println(isEqual(arr1, arr2) ? "Eyfa" : "Not Eyfa");
		
	}
	
	static String makeDouble(String s) {
		StringBuilder sb = new StringBuilder();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			sb.append(c).append(c);
		}
		return sb.toString();
	}
	
	static boolean isEqual(String[] arr1, String[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (!makeDouble(arr1[i]).equals(arr2[i])) {
				return false;
			}
		}
		return true;
	}

}
