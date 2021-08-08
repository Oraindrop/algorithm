package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2355 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		if (a > b) {
			long temp = a;
			a = b;
			b = temp;
		}
		
		if (a >= 0 && b > 0) {
			System.out.println(plusSum(a, b));
		} else if (a < 0 && b <= 0) {
			System.out.println(minusSum(a, b));
		} else {
			long minus = minusSum(a, 0);
			long plus = plusSum(0, b);
			System.out.println(minus + plus);
		}
	}
	
	static long plusSum(long a, long b) {
		if (a == 0) {
			a = 1;
		}
		
		return ((a + b) * (b - a + 1)) / 2; 
	}
	
	static long minusSum(long a, long b) {
		if (b == 0) {
			b = -1;
		}
		
		long sumA = -1 * b;
		long sumB = -1 * a;
		return -1 * ((sumA + sumB) * (sumB - sumA + 1) / 2);
	}

}
