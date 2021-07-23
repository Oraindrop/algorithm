package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6131 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 2; i <= 500; i++) {
			int a = i * i;
			for (int j = 1; j < i; j++) {
				if ((j * j) + n == a) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
