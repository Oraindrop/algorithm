package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int[] arr = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		
		int sum = 0;
		boolean over = false;
		for (int i = 0; i < inputs.length; i++) {
			int num = Integer.parseInt(inputs[i]);
			sum += num;

			if (num > arr[i]) {
				over = true;
				break;
			}
		}
		
		if (over) {
			System.out.println("hacker");
		} else {
			System.out.println(sum >= 100 ? "draw" : "none");
		}
		
	}

}
