package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1284 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		map.put('1', 2);
		map.put('0', 4);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0")) {
			int answer = input.length() + 1;
			char[] arr = input.toCharArray();
			for (char c : arr) {
				answer += map.getOrDefault(c, 3);
			}
			
			sb.append(answer).append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
