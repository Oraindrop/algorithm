package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodBoyBadBoy4447 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			String target = s.toLowerCase();
			int g = 0;
			int b = 0;
			for (char c : target.toCharArray()) {
				if (c == 'g') g++;
				else if (c == 'b') b++;
			}
			
			sb.append(s).append(" is ");
			if (g > b) {
				sb.append("GOOD");
			} else if (g < b) {
				sb.append("A BADDY");
			} else {
				sb.append("NEUTRAL");
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.println(sb.toString());
	}

}
