package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int index = 1;
		StringBuilder sb = new StringBuilder();
		while (!input.equals("# #")) {
			sb.append("Case ").append(index).append(System.lineSeparator());
			String[] arr = input.split(" ");
			int line = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < line; i++) {
				String letter = br.readLine();
				letter = letter.replaceAll(arr[0], "_");
				letter = letter.replaceAll(arr[1], "_");
				letter = letter.replaceAll(arr[0].toUpperCase(), "_");
				letter = letter.replaceAll(arr[1].toUpperCase(), "_");
				sb.append(letter).append(System.lineSeparator());
			}
			
			sb.append(System.lineSeparator());
			index++;
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
		
	}

}
