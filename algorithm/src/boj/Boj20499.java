package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj20499 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("/");
		int k = Integer.parseInt(input[0]);
		int d = Integer.parseInt(input[1]);
		int a = Integer.parseInt(input[2]);
		
		if (d == 0 || k + a < d) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}

}
