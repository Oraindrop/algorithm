package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class EvenOrOdd5988 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> odds = Arrays.asList("1", "3", "5", "7", "9");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String last = s.substring(s.length()-1);
			sb.append(odds.contains(last) ? "odd" : "even")
				.append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

}
