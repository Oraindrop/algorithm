package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj23348 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] values = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		long max = 0;
		for (int i = 0; i < t; i++) {
			long sum = 0;
			
			for (int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine());	
				sum += Integer.parseInt(st.nextToken()) * values[0];
				sum += Integer.parseInt(st.nextToken()) * values[1];
				sum += Integer.parseInt(st.nextToken()) * values[2];
			}
			
			if (sum > max) max = sum;
		}
		System.out.println(max);
	}

}
