package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class CountMeIn11319 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Character> list = Arrays.asList('A','E','I','O','U','a','e','i','o','u');
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int cCount = 0;
			int vCount = 0;
			char[] input = br.readLine().toCharArray();
			for (char c : input) {
				if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
					if (list.contains(c)) {
						vCount++;
					} else {
						cCount++;
					}
				}
			}
			sb.append(cCount).append(" ").append(vCount).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}
