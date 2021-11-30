package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10395 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		boolean yn = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] + arr2[i] != 1) {
				yn = false;
				break;
			}
		}
		
		System.out.println(yn ? "Y" : "N");
	}

}
