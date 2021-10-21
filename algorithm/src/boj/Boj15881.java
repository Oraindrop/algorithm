package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15881 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int index = 0;
		int count = 0;
		while (index < n) {
			char c = input.charAt(index);
			if (c == 'p') {
				if (index + 3 < n && input.substring(index, index + 4).equals("pPAp")) {
					count++;
					index += 4;
					continue;
				}
			}
			
			index++;
		}
		System.out.println(count);
	}

}
