package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3028 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		
		int answer = 1;
		
		for (int i = 0; i < arr.length; i++) {
			answer = shuffle(arr[i], answer);
		}
		
		System.out.println(answer);
	}
	
	static int shuffle(String op, int answer) {
		if (op.equals("A")) {
			if (answer == 1) {
				return 2;
			}
			
			if (answer == 2) {
				return 1;
			}
		}
		
		if (op.equals("B")) {
			if (answer == 2) {
				return 3;
			}
			
			if (answer == 3) {
				return 2;
			}
		}
		
		if (op.equals("C")) {
			if (answer == 1) {
				return 3;
			}
			
			if (answer == 3) {
				return 1;
			}
		}
		
		return answer;
	}

}
