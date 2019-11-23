package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BeautifulNumber2774 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		char[] arr;
		Set<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			arr = br.readLine().toCharArray();
			set.clear();
			for (char c : arr) {
				set.add(c - '0');
			}
			sb.append(set.size()).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
