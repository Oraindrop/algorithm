package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeCase2744 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		String answer = "";
		
		for (char c : input) {
			if (c >= 'a' && c <= 'z') {
				answer += (char) ((c - 'a') + 'A');
			} else {
				answer += (char) ((c - 'A') + 'a');
			}
		}
		
		System.out.println(answer);
	}

}
