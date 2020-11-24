package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj20207 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[367];
		for (int i = 0; i < t; i++) {
			String[] sArr = br.readLine().split(" ");
			int a = Integer.parseInt(sArr[0]);
			int b = Integer.parseInt(sArr[1]);
			for (int j = a; j <= b; j++) {
				arr[j]++;
			}
		}
		
		int sum = 0;
		for (int i = 1; i < 367; i++) {
			int max = 0;
			int count = 0;
			while (arr[i] != 0) {
				max = Math.max(arr[i], max);
				count++;
				i++;
			}
			sum += max*count;
		}
		System.out.println(sum);
	}

}
