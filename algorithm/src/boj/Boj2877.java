package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2877 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		String s = Integer.toBinaryString(input+1);
		s = s.substring(1);
		StringBuilder sb = new StringBuilder();
		
		for (char c : s.toCharArray()) {
			sb.append(c == '0' ? "4" : "7");
		}
		
		System.out.println(sb.toString());
	}

}
