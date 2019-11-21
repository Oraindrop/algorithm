package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoSpaceAPlusB15873 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int size = s.length();
		
		if (size == 4) {
			System.out.println("20");
		} else if (size == 3) {
			System.out.println(Integer.parseInt(s.replaceAll("10", "")) + 10);
		} else {
			System.out.println(Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)));
		}
	}

}
