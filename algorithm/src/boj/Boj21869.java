package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21869 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n == 1) {
			System.out.println(1);
			System.out.println("1 1");
		} else {
			System.out.println(n + (n-2));
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				sb.append(1).append(" ").append(i).append(System.lineSeparator());
			}
			
			for (int i = 2; i < n; i++) {
				sb.append(n).append(" ").append(i).append(System.lineSeparator());
			}
			System.out.print(sb.toString());
		}
	}

}
