package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PronouncePassWord4659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> vowels = Arrays.asList("a", "e", "o", "i", "u");
		List<String> blackList = new ArrayList<>();
		
		for (int i = 'a'; i <= 'z'; i++) {
			if (i != 'e' && i != 'o') {
				blackList.add(String.format("%s%s", (char)i, (char)i));
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		while (!input.equals("end")) {
			boolean bool = hasVowel(input, vowels) && isRepeatThree(input, vowels) && checkBlackList(input, blackList);
			sb.append(String.format("<%s> is %s", input, bool ? "acceptable." : "not acceptable.")).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.println(sb.toString());
	}
	
	static boolean hasVowel(String input, List<String> vowels) {
		for (String s : vowels) {
			if (input.contains(s)) {
				return true;
			}
		}
		
		return false;
	}
	
	static boolean isRepeatThree(String input, List<String> vowels) {
		String[] arr = input.split("");
		int vCount = 0;
		int cCount = 0;
		for (String s : arr) {
			if (vowels.contains(s)) {
				vCount++;
				cCount = 0;
			} else {
				cCount++;
				vCount = 0;
			}
			
			if (vCount >= 3 || cCount >= 3) {
				return false;
			}
		}
		return true;
	}
	
	static boolean checkBlackList(String input, List<String> blackList) {
		
		for (String s : blackList) {
			if (input.contains(s)) {
				return false;
			}
		}
		
		return true;
		
	}
}
