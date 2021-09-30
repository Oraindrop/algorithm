package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11367 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String[] arr = br.readLine().split(" ");
			sb.append(arr[0]).append(" ");
			int score = Integer.parseInt(arr[1]);
			if (score <= 59) {
				sb.append("F");
			} else if (score <= 66) {
				sb.append("D");
			} else if (score <= 69) {
				sb.append("D+");
			} else if (score <= 76) {
				sb.append("C");
			} else if (score <= 79) {
				sb.append("C+");
			} else if (score <= 86) {
				sb.append("B");
			} else if (score <= 89) {
				sb.append("B+");
			} else if (score <= 96) {
				sb.append("A");
			} else {
				sb.append("A+");
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
