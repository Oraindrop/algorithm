package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9850 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 26; i++) {
			sb.setLength(0);
			for (char c : input.toCharArray()) {
				if (c >= 'A' && c <= 'Z') {
					char newChar = (char) (c + i);
					if (newChar > 'Z') {
						newChar -= 'Z';
						newChar += 'A';
						newChar -= 1;
					}
					sb.append(newChar);
				} else {
					sb.append(c);
				}
			}
			
			String candidate = sb.toString();
			if (candidate.contains("LIVE") && candidate.contains("CHIPMUNKS")) {
				System.out.println(candidate);
				break;
			}
		}
	}

}
