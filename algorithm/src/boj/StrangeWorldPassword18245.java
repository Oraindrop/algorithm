package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrangeWorldPassword18245 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		int index = 2;
		while (!s.equals("Was it a cat I saw?")) {
			int leng = s.length();
			for (int i = 0; i < leng; i += index) {
				sb.append(s.charAt(i));
			}
			sb.append(System.lineSeparator());
			index++;
			s = br.readLine();
		}
		
		System.out.println(sb.toString());
	}

}
