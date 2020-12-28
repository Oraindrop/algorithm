package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		int index = 0;
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 65 && input[i] <= 90) {
				while (index % 4 != 0) {
					index++;
					count++;
				}
				index++;
			} else {
				index++;
			}
		}
		System.out.println(count);
	}

}
