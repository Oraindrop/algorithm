package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2846 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean bool = false;
		int start = 0;
		int answer = 0;
		
		for (int i = 0; i < t-1; i++) {
			if (bool) {
				if (arr[i] < arr[i+1]) {
					continue;
				} else {
					int temp = arr[i] - start;
					bool = false;
					start = 0;
					if (temp > answer) {
						answer = temp;
					}
				}
			} else {
				if (arr[i] < arr[i+1]) {
					start = arr[i];
					bool = true;
				} else {
					continue;
				}
			}
		}
		
		if (bool) {
			int temp = arr[t-1] - start;
			if (temp > answer) {
				answer = temp;
			}
		}
		
		System.out.println(answer);
	}

}
