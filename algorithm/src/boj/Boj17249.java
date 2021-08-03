package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17249 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = new String[2];
		arr[0] = input.substring(0, input.indexOf("(^0^)"));
		arr[1] = input.substring(input.indexOf("(^0^)") + 5);
				
		int left = 0;
		int right = 0;
		
		for (char c : arr[0].toCharArray()) {
			if (c == '@') {
				left++;
			}
		}
		
		for (char c : arr[1].toCharArray()) {
			if (c == '@') {
				right++;
			}
		}
		
		System.out.println(left + " " + right);
	}

}
