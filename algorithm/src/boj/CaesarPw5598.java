package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarPw5598 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			int a = c - 3 < 65 ?  c + 23 : c - 3;
			sb.append((char) a);
		}
		System.out.println(sb.toString());
	}

}
