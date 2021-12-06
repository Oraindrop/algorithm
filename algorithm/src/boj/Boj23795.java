package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23795 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		long sum = 0;
		
		while (!input.equals("-1")) {
			sum += Integer.parseInt(input);
			input = br.readLine();
		}
		
		System.out.println(sum);
	}

}
