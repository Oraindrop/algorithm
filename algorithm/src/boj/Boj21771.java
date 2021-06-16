package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj21771 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		st.nextToken();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < b; i++) {
			sb.append("P");
		}
		String base = sb.toString();
		
		for (String s : arr) {
			if (s.contains(base)) {
				count++;
			}
		}
		
		System.out.println(count == a ? "0" : "1");
	}

}
