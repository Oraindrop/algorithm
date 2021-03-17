package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		int answer = 0;
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(input[i]);
			if (answer % 3 == value) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
