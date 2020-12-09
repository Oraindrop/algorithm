package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj5883 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			set.add(arr[i]);
		}
		
		int answer = 1;
		for (int i : set) {
			int pre = -1;
			int count = 1;
			for (int j = 0; j < n; j++) {
				if (arr[j] != i) {
					if (pre == arr[j]) {
						count++;
					} else {
						answer = Math.max(answer, count);
						count = 1;
					}
					pre = arr[j];
				}
			}
			answer = Math.max(answer, count);
		}
		
		System.out.println(answer);
	}

}
