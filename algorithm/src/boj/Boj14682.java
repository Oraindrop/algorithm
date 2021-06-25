package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14682 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for (int i = 0; i <= k; i++) {
			sum += n * Math.pow(10, i);
		}
		
		System.out.println(sum);
	}

}
