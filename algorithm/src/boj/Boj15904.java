package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15904 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(go(br.readLine()));
	}
	
	static String go(String input) {
		
		char[] arr = {'U', 'C', 'P', 'C'};
		int index = 0;
		int size = input.length();
		
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) == arr[index]) {
				index++;
				if (index == 4) {
					return "I love UCPC";
				}
			}
		}
		
		return "I hate UCPC";
	}

}
