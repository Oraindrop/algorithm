package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj16120 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(go(br.readLine()));
	}
	
	static String go(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			String alpha = input.substring(i, i+1);
			if (alpha.equals("P")) {
				count++;
				continue;
			}
			
			if (i == input.length() - 1) {
				return "NP";
			}
			
			if (count < 2 || input.substring(i+1, i+2).equals("A")) {
				return "NP";
			}
			
			count -= 2;
		}
		
		return count == 1 ? "PPAP" : "NP";
	}

}
