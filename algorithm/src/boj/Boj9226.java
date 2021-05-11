package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Boj9226 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));;
		while (!input.equals("#")) {
			char[] arr = input.toCharArray();
			int index = 0;
			for (int i = 0; i < arr.length; i++) {
				char c = arr[i];
				if (set.contains(c)) {
					index = i;
					break;
				}
			}
			
			if (index > 0) {
				String post = input.substring(0, index);
				String pre = input.substring(index);
				sb.append(pre).append(post);
			} else {
				sb.append(input);
			}
			
			sb.append("ay").append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
		
	}

}
