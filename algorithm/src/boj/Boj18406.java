package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj18406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String left = input.substring(0, input.length() / 2);
		String right = input.substring(input.length() / 2);
		System.out.println(sumString(left) == sumString(right) ? "LUCKY" : "READY");
	}
	
	static int sumString(String s) {
		String[] arr = s.split("");
		int sum = 0;
		for (String element : arr) {
			sum += Integer.parseInt(element);
		}
		return sum;
	}

}
