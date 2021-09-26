package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2975 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0 W 0")) {
			String[] arr = input.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);
			if (arr[1].equals("W")) {
				int answer = a - b;
				if (answer < -200) {
					sb.append("Not allowed");
				} else {
					sb.append(answer);
				}
			} else {
				sb.append(a+b);
			}
			sb.append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

}
