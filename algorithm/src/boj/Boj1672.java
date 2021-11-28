package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1672 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		char[][] arr = new char[4][4];
		
		arr[0] = new char[]{'A', 'C', 'A', 'G'};
		arr[1] = new char[]{'C', 'G', 'T', 'A'};
		arr[2] = new char[]{'A', 'T', 'C', 'G'};
		arr[3] = new char[]{'G', 'A', 'G', 'T'};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();

		if (n == 1) {
			System.out.println(input);
		} else {
			char[] inputs = input.toCharArray();
			char pre = arr[getNumber(inputs[n-1])][getNumber(inputs[n-2])];
			for (int i = n-3; i >= 0; i--) {
				pre = arr[getNumber(pre)][getNumber(inputs[i])];
			}
			System.out.println(pre);
		}
	}
	
	static int getNumber(char c) {
		if (c == 'A') {
			return 0;
		} else if (c == 'G') {
			return 1;
		} else if (c == 'C') {
			return 2;
		} else {
			return 3;
		}
	}

}
