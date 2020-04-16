package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSixNine17614 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new HashSet<>(Arrays.asList(3, 6, 9));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i-1];
			int value = i;
			while (value > 0) {
				if (set.contains(value % 10)) {
					arr[i]++;
				}
				value /= 10;
			}
		}
		System.out.println(arr[n]);
	}

}
