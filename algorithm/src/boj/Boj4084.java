package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4084 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		while (!input.equals("0 0 0 0")) {
			String[] arr = input.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);
			int d = Integer.parseInt(arr[3]);
			int count = 0;
			
			while (!isEqual(a, b, c, d)) {
				int temp = a;
				a = Math.abs(a-b);
				b = Math.abs(b-c);
				c = Math.abs(c-d);
				d = Math.abs(d-temp);
				count++;
			}
			
			input = br.readLine();
			sb.append(count).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	static boolean isEqual(int a, int b, int c, int d) {
		return a == b && b == c && c == d;
	}

}
