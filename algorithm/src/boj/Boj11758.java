package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11758 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] x = new int[3];
		int[] y = new int[3];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		long a = (x[0] * y[1]) + (x[1] * y[2]) + (x[2] * y[0]);
		long b = (y[0] * x[1]) + (y[1] * x[2]) + (y[2] * x[0]);
		
		long answer = a-b;
		
		if (answer > 0) {
			System.out.println("1");
		} else if (answer < 0) {
			System.out.println("-1");
		} else {
			System.out.println(0);
		}
	}

}
