package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17210 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		int a = Integer.parseInt(br.readLine());
		
		if (n > 5) {
			System.out.println("Love is open door");
		} else {
			for (int i = 1; i < n; i++) {
				int value = a == 0? 1 : 0;
				System.out.println(value);
				a = value;
			}
		}
	}

}
