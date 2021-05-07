package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5698 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("*")) {
			sb.append(isTautogram(input) ? "Y" : "N").append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}
	
	static boolean isTautogram(String input) {
		String[] inputs = input.split(" ");
		String first = inputs[0].substring(0, 1);
		
		for (String s : inputs) {
			if (!s.substring(0, 1).equalsIgnoreCase(first)) {
				return false;
			}
		}
		
		return true;
	}

}
