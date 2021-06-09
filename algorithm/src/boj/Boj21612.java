package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21612 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = (n * 5) - 400;
		System.out.println(answer);
		if (answer == 100) {
			System.out.println(0);
		} else {
			System.out.println(answer > 100 ? "-1" : "1");
		}
	}

}
