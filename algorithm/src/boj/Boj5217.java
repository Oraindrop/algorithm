package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj5217 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append("Pairs for ").append(n).append(": ").append(go(n)).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

	static String go(int n) {
		List<String> list = new ArrayList<>();
		
		if (n < 3) {
			return "";
		}
		
		for (int i = 1; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (i + j == n) {
					list.add(i + " " + j);	
				}
			}
		}
		
		return String.join(", ", list);
	}
}
