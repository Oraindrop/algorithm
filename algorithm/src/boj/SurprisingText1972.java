package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SurprisingText1972 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Set<String> set = new HashSet<>();
		while(!input.equals("*")) {
			int n = input.length();
			System.out.println(go(input, set, n));
			input = br.readLine();
		}
	}

	private static String go(String input, Set<String> set, int n) {
		int count = 0;
		for (int i = 0; i <= n-2; i++) {
			count = 0;
			set.clear();
			for (int j = 0; j < n - i - 1; j++) {
				String value = input.substring(j, j+1) + input.substring(j+i+1, j+i+2);
				set.add(value);
				count++;
			}
			if (count != set.size()) {
				return String.format("%s is NOT surprising.", input);
			}
		}
		
		return String.format("%s is surprising.", input);
	}
	

}
