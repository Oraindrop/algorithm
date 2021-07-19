package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String input = br.readLine();
		if (length <= 25) {
			System.out.println(input);
		} else {
			String sub = input.substring(11, length-11);
			if (!sub.contains(".")) {
				System.out.println(input.substring(0, 11) + "..." + input.substring(length-11));
			} else {
				if (sub.substring(sub.length()-1).equals(".") && sub.indexOf(".") == sub.lastIndexOf(".")) {
					System.out.println(input.substring(0, 11) + "..." + input.substring(length-11));	
				} else {
					System.out.println(input.substring(0, 9) + "......" + input.substring(length-10));
				}
			}
		}
		
		
	}

}
