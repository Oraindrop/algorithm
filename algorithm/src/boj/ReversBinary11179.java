package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversBinary11179 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = Integer.toBinaryString(n);
		int answer = 0;
		char[] arr = s.toCharArray();
		for (int i = arr.length-1; i >= 0; i--) {
			int value = (int) (arr[i] - '0');
			answer += value * Math.pow(2, i);
		}
		System.out.println(answer);
	}

}
