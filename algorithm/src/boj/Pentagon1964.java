package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pentagon1964 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		long first = 5;
		long a = 7;
		long d = 3;
		
		if (t == 1) {
			System.out.println(first);
		} else if (t == 2) {
			System.out.println(first+a);
		} else {
			long answer = first + (((t-1) * ( (2 * a) + ((t-2) * d) )) / 2);
			System.out.println(answer % 45678);
		}
	}

}
