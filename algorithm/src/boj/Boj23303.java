package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23303 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		if (input.contains("D2") || input.contains("d2")) {
			System.out.println("D2");
		} else {
			System.out.println("unrated");
		}

	}

}
