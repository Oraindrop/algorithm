package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String9086 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			sb.append(s.substring(0, 1))
				.append(s.substring(s.length()-1, s.length()))
				.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
