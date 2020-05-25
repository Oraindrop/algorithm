package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2548 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i : arr) {
			int value = go(arr, i);
			if (min > value) {
				answer = i;
				min = value; 
			} else if (min == value) {
				answer = Math.min(i, answer);
			}
		}
		
		System.out.println(answer);
	}

	static int go(int[] arr, int num) {
		int answer = 0;
		for (int i : arr) {
			if (num > i) {
				answer += num - i;
			} else {
				answer += i - num;
			}
		}
		return answer;
	}
	
}
