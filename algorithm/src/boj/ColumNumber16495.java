package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColumNumber16495 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		long answer = 0;
		
		for (char c : s.toCharArray()) {
			answer *= 26;
			answer += (int)c - 64;
		}
		
		System.out.println(answer);
	}

}
