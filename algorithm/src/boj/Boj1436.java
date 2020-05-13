package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1436 {
	final static String TARGET = "666";

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int count = 0;
		int i = 666;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (count < n) {
			if (String.valueOf(i).contains(TARGET)) {
				count++;
			}
			i++;
		}
		System.out.println(i-1);
	}

}
