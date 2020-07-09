package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj10448 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[] arr = new int[1000];
		arr[1] = 1;
		for (int i = 2; i < 45; i++) {
			arr[i] = i + arr[i-1];
		}
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 1; i < 45; i++) {
			for (int j = i; j < 45; j++) {
				for (int k = j; k < 45; k++) {
					set.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int value = Integer.parseInt(br.readLine());
			sb.append(set.contains(value) ? 1 : 0).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}
