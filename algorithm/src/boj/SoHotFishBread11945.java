package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoHotFishBread11945 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			sb.append(reverse(br.readLine())).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}
	
	static String reverse(String s) {
		String reverse = "";
		char[] arr = s.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse += arr[i];
		}
		return reverse;
	}

}
