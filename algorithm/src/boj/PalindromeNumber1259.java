package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber1259 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String temp = "";
		int size = 0;
		String[] arr;
		StringBuilder sb = new StringBuilder();
		while(!s.equals("0")) {
			arr = s.split("");
			temp = "";
			size = s.length();
			for (int i = size-1; i >= 0; i--) {
				temp += arr[i];
			}
			sb.append(s.equals(temp) ? "yes" : "no").append(System.lineSeparator());
			s = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
