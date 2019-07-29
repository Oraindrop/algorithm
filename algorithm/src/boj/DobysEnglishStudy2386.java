package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DobysEnglishStudy2386 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		while (!input.equals("#")) {
			String base = input.substring(0, 1);
			String target = input.substring(2, input.length()).toLowerCase();
			int answer = 0;
			for (char c : target.toCharArray()) {
				if (base.charAt(0) == c) answer++;
			}
			System.out.println(base + " " + answer);
			
			input = br.readLine();
		}
	}

}
