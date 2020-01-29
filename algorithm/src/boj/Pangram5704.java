package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram5704 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		boolean[] arr = new boolean[26];
		StringBuilder sb = new StringBuilder();
		while (!input.equals("*")) {
			clear(arr);
			for (char c : input.toCharArray()) {
				int value = (int)c;
				if (value >= 97 && value <= 122) {
					arr[value-97] = true;
				}
			}
			sb.append(isPangram(arr) ? "Y" : "N").append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}
	
	static void clear(boolean[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = false;
		}
	}
	
	static boolean isPangram(boolean[] arr) {
		for (boolean bool : arr) {
			if (!bool) return false;
		}
		return true;
	}

}
