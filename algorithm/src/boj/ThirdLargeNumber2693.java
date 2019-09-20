package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdLargeNumber2693 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String[] sArr = br.readLine().split(" ");
			for (int j = 0; j < 10; j++) {
				arr[j] = Integer.parseInt(sArr[j]);
			}
			Arrays.sort(arr);
			sb.append(arr[7]).append(System.lineSeparator());
		}
		
		System.out.println(sb.toString());
	}

}
