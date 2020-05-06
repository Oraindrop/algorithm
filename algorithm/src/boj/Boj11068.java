package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj11068 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(go(n)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static int go(int n) {
		for (int i = 2; i < 65; i++) {
			if (isPalindrome(n, i)) {
				return 1;
			}
		}
		return 0;
	}
	
	static boolean isPalindrome(int n, int b) {
		List<Integer> list = convert(n, b);
		int size = list.size() / 2;
		for (int i = 0; i < size; i++) {
			if (list.get(i) != list.get(list.size() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	static List<Integer> convert(int n, int b) {
		List<Integer> list = new ArrayList<>();
		while (n > 0) {
			int mod = n % b;
			n /= b;
			list.add(mod);
		}
		return list;
	}

}
