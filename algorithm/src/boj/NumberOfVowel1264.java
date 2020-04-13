package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfVowel1264 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		StringBuilder sb = new StringBuilder();
		while (!input.equals("#")) {
			char[] arr = input.toCharArray();
			int count = 0;
			for (char c : arr) {
				if (set.contains(c)) {
					count++;
				}
			}
			sb.append(count).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
