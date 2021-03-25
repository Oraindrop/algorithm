package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17094 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		char[] input = br.readLine().toCharArray();
		int a = 0;
		int b = 0;
		for (char c : input) {
			if (c == '2') {
				a++;
			} else {
				b++;
			}
		}
		
		if (a == b) {
			System.out.println("yee");
		} else if (a > b) {
			System.out.println("2");
		} else {
			System.out.println("e");
		}
	}

}
