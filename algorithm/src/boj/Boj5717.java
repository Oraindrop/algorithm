package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5717 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0 0")) {
			String[] arr = input.split(" ");
			sb.append((Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]))).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
