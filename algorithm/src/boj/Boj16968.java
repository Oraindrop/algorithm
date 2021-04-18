package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj16968 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		map.put('c', 26);
		map.put('d', 10);
		
		int answer = map.get(input[0]);
		
		for (int i = 1; i < input.length; i++) {
			int value = map.get(input[i]);
			if (input[i] == input[i-1]) {
				value--;
			}
			answer *= value;
		}
		
		System.out.println(answer);
	}

}
