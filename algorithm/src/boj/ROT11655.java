package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT11655 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			int i = (int) c;
			if (i >= 97 && i <= 122) {
				int temp = i + 13;
				i = temp > 122 ? temp - 122 + 96 : temp; 
			} else if (i >= 65 && i <= 90) {
				int temp = i + 13;
				i = temp > 90 ? temp - 90 + 64 : temp;
			}
			sb.append((char)i);
		}
		System.out.println(sb.toString());
		
	}

}
