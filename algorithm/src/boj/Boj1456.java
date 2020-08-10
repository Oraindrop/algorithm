package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj1456 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[10000001];
		int limit = (int)Math.sqrt(arr.length) + 1;
		for (int i = 2; i < limit; i++) {
			if (!arr[i]) {
				for (int j = i*i; j < arr.length; j += i) {
					arr[j] = true;
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long answer = 0;
		for (long i = 2; i < arr.length; i++) {
			if (i * i > b) {
				break;
			}
			if (!arr[(int)i]) {
				long temp = i * i;
				while (temp <= b) {
					if (temp >= a) {
						answer++;
					}
					
					BigInteger bigTemp = BigInteger.valueOf(temp).multiply(BigInteger.valueOf(i));
					if (bigTemp.compareTo(BigInteger.valueOf(100000000000000l)) > 0) {
						break;
					}
					temp *= i;
				}
			}
		}
		System.out.println(answer);
	}

}
