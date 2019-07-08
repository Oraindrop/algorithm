package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSum2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int size = 0;
		if (s.length() <= 2) {
			size = n;
		} else {
			size = s.length() * 9;
		}
		
		int answer = 0;
		for (int i = n - size; i < n; i++) {
			if (i + go(i) == n) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}
	
	static int go(int n) {
		String s = String.valueOf(n);
		int sum = 0;
		for (char c : s.toCharArray()) {
			sum += (int)c - 48;
		}
		return sum;
	}

}
