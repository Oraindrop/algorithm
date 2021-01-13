package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj20528 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		go(br.readLine().split(" "));
	}
	
	static void go(String[] input) {
		char c = input[0].charAt(0);
		for (int i = 1; i < input.length; i++) {
			if (c != input[i].charAt(0)) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}

}
