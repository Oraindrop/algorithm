package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj9366 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr = new int[3];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			if (arr[2] >= (arr[0] + arr[1])) {
				System.out.println(String.format("Case #%s: %s", i, "invalid!"));
			} else if (arr[0] == arr[1] && arr[1] == arr[2]) {
				System.out.println(String.format("Case #%s: %s", i, "equilateral"));
			} else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
				System.out.println(String.format("Case #%s: %s", i, "isosceles"));
			} else {
				System.out.println(String.format("Case #%s: %s", i, "scalene"));
			}
		}
	}

}
