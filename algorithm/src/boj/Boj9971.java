package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9971 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("ENDOFINPUT")) {
			char[] arr = br.readLine().toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if ((int)arr[i] >= (int)'A' && (int)arr[i] <= (int)'Z') {
					int value = (int)arr[i] - 5;
					char c = value < 'A' ? (char) ((int)'Z' - ((int)'A' - value - 1)) : (char)value;
					sb.append(c);	
				} else {
					sb.append(arr[i]);
				}
				
			}
			sb.append(System.lineSeparator());
			br.readLine();
			input = br.readLine();
		}
		System.out.println(sb.toString());
	}
}
