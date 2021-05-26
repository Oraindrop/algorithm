package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4597 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("#")) {
			int[] arr = new int[2];
			char[] inputs = input.toCharArray();
			for (int i = 0; i < inputs.length - 1; i++) {
				arr[inputs[i] - '0']++;
			}
			
			sb.append(input.substring(0, input.length() - 1));
			if (inputs[inputs.length - 1] == 'e') {
				if (arr[1] % 2 == 1) {
					sb.append(1);
				} else {
					sb.append(0);
				}
			} else {
				if (arr[1] % 2 == 1) {
					sb.append(0);
				} else {
					sb.append(1);
				}
			}
			sb.append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
