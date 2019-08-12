package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuteNumber17294 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		go(input);
	}
	
	static void go(String[] input) {
		final String cute = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
		final String unCute = "흥칫뿡!! <(￣ ﹌ ￣)>";
		
		int length = input.length;
		
		if (length <= 2) {
			System.out.println(cute);
			return;
		}
		
		int diff = Integer.parseInt(input[1]) - Integer.parseInt(input[0]);
		
		for (int i = 0; i < length - 1; i++) {
			int pre = Integer.parseInt(input[i]);
			int post = Integer.parseInt(input[i+1]);
			if (post - pre != diff) {
				System.out.println(unCute);
				return;
			}
		}
		
		System.out.println(cute);
	}

}
