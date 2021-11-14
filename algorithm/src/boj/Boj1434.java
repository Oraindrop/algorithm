package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1434 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
		int sum2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
		
		System.out.println((sum1 - sum2));
	}

}
