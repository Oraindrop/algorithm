package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pikachu14405 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		s = s.replaceAll("pi", "0");
		s = s.replaceAll("ka", "0");
		s = s.replaceAll("chu", "0");
		
		try {
			Integer.parseInt(s);
			System.out.println("YES");
		} catch (Exception e) {
			System.out.println("NO");
		}
	}

}
