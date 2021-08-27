package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5087 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("#")) {
			String[] arr = input.split(" ");
			int c = 0;
			int d = 0;
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i].equals("A")) {
					c++;
				} else {
					int num = Integer.parseInt(arr[i]);
					if (num % 2 == 1) {
						c++;
					} else {
						d++;
					}
				}
			}
			
			if (c > d) {
				sb.append("Cheryl");
			} else if (d > c) {
				sb.append("Tania");
			} else {
				sb.append("Draw");
			}
			
			sb.append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
