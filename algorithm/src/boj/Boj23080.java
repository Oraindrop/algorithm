package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23080 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i+=number) {
			sb.append(input.charAt(i));
		}
		
		System.out.println(sb.toString());
		
	}

}
