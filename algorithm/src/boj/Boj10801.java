package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10801 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] aArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] bArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int a = 0;
		int b = 0;
		for (int i = 0; i < 10; i++) {
			if (aArr[i] > bArr[i]) {
				a++;
			} else if (bArr[i] > aArr[i]) {
				b++;
			}
		}
		
		if (a > b) {
			System.out.println("A");
		} else if (b > a) {
			System.out.println("B");
		} else {
			System.out.println("D");
		}
	}

}
