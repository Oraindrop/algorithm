package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome10988 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder().append(br.readLine());
		
		String s = sb.toString();
		String rs = sb.reverse().toString();
		
		System.out.println(s.equals(rs) ? "1" : "0");
	}

}
