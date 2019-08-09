package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hex1550 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("0", 0);
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		map.put("6", 6);
		map.put("7", 7);
		map.put("8", 8);
		map.put("9", 9);
		map.put("A", 10);
		map.put("B", 11);
		map.put("C", 12);
		map.put("D", 13);
		map.put("E", 14);
		map.put("F", 15);
		
		long answer = 0;
		int mul = 1;
		for (int i = 1; i <= s.length(); i++) {
			answer += map.get(String.valueOf(s.charAt(s.length() - i))) * mul;
			mul *= 16;
		}
		
		System.out.println(answer);
		
	}

}
