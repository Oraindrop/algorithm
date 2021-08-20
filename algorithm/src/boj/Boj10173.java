package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10173 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("EOI")) {
			String candidate = input.toLowerCase();
			sb.append(candidate.contains("nemo") ? "Found" : "Missing").append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
