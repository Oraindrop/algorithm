package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = 0;
		int sum = 0;
		for (int i = 0; i <  n; i++) {
			int value = Integer.parseInt(st.nextToken());
			sum += value;
			max = Math.max(max, value);
		}
		
		sum += max * (n-2);
		System.out.println(sum);
	}

}
