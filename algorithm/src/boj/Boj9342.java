package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Boj9342 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String regEx = "^[A-F]?A+F+C+[A-F]?$";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(Pattern.matches(regEx, br.readLine()) ? "Infected!" : "Good").append(System.lineSeparator()); 
		}
		
		System.out.print(sb.toString());
	}

}
