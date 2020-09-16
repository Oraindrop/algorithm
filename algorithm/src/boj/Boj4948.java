package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4948 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean[] arr = new boolean[246913];
		arr[0] = true;
		arr[1] = true;
		
		int size = (int)Math.sqrt(arr.length) + 1;
		for (int i = 2; i < size; i++) {
			if (!arr[i]) {
				for (int j = i*i; j < arr.length; j += i) {
					arr[j] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0")) {
			int n = Integer.parseInt(input);
			int count = 0;
			for (int i = n+1; i <= 2*n; i++) {
				if (!arr[i]) count++;
			}
			sb.append(count).append(System.lineSeparator());
			input = br.readLine();
		}
		System.out.print(sb.toString());
	}

}
