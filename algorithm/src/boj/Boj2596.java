package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boj2596 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		System.out.println(go(n, input));
	}
	
	static String go(int n, String input) {
		Map<String, String> map = new HashMap<>();
		map.put("000000", "A");
		map.put("001111", "B");
		map.put("010011", "C");
		map.put("011100", "D");
		map.put("100110", "E");
		map.put("101001", "F");
		map.put("110101", "G");
		map.put("111010", "H");

		List<String> list = new ArrayList<>(map.keySet());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < input.length(); i+=6) {
			String value = input.substring(i, i+6);
			String decode = map.get(value);
			if (decode == null) {
				decode = map.get(getIsPossible(list, value));
				if (decode == null) {
					return String.valueOf((i/6) + 1);
				}
			}
			sb.append(decode);
		}
		
		return sb.toString();
	}

	static String getIsPossible(List<String> list, String value) {
		List<Integer> diffs = new ArrayList<>();
		for (String s : list) {
			diffs.add(diff(s, value));
		}
		
		int min = 7;
		int minIndex = 0;
		
		for (int i = 0; i < diffs.size(); i++) {
			int diff = diffs.get(i);
			if (min > diff) {
				min = diff;
				minIndex = i;
			}
		}
		
		if (min != 1) {
			return null;
		} else {
			return list.get(minIndex);
		}
		
	}
	
	static int diff(String first, String second) {
		int answer = 0;
		char[] fArr = first.toCharArray();
		char[] sArr = second.toCharArray();
		
		for (int i = 0; i < first.length(); i++) {
			if (fArr[i] != sArr[i]) {
				answer++;
			}
		}
		
		return answer;
	}
}
