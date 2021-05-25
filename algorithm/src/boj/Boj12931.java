package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		while (!isEmpty(arr)) {
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				if (arr[i] % 2 != 0) {
					arr[i]--;
					flag = true;
					answer++;
					break;
				}
			}
			
			if (!flag) {
				for (int i = 0; i < n; i++) {
					arr[i] /= 2;
				}
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	static boolean isEmpty(int[] arr) {
		for (int i : arr) {
			if (i != 0) return false;
		}
		return true;
	}

}
