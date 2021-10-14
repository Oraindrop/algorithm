package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4892 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		int index = 1;
		while (!input.equals("0")) {
			int n0 = Integer.parseInt(input);
			int n1 = 3 * n0;
			int n2 = n1 % 2 == 0 ? n1 / 2 : (n1 + 1) / 2;
			int n3 = 3 * n2;
			int n4 = n3 / 9;
			sb.append(index).append(".").append(" ").append(n1 % 2 == 0 ? "even " : "odd ").append(n4).append(System.lineSeparator());
			
			index++;
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
