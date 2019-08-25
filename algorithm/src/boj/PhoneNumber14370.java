package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber14370 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<>(Arrays.asList("ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"));
		Map<String, Integer> map = new HashMap<>();
		int count = 0;
		for (String s : list) {
			map.put(s, count);
			count++;
		}
		
		List<Integer> answers = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= t; i++) {
			answers.clear();
			String s = br.readLine();
			go (s, list, answers, map);
			Collections.sort(answers);
			sb.append(String.format("Case #%d: %s", i, getAnswerString(answers))).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		
	}

	static void go(String s, List<String> list, List<Integer> answers, Map<String, Integer> map) {
		
		while (s.length() != 0) {
			for (String num : list) {
				if (isContain(s, num)) {
					s = delete(s, num);
					answers.add(map.get(num));
					break;
				}
			}
		}
		
	}
	
	static boolean isContain(String s, String num) {
		String copy = s;
		for (String e : num.split("")) {
			if (copy.contains(e)) {
				int index = copy.indexOf(e);
				String newString = copy.substring(0, index) + copy.substring(index + 1, copy.length());
				copy = newString;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	static String delete(String s, String num) {
		
		for (String e : num.split("")) {
			int index = s.indexOf(e);
			String newString = s.substring(0, index) + s.substring(index + 1, s.length());
			s = newString;
		}
		
		return s;
	}
	
	static String getAnswerString(List<Integer> list) {
		String s = "";
		for (Integer i : list) {
			s += i;
		}
		return s;
	}
}
