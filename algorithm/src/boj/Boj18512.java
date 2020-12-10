package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj18512 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int jumpA = Integer.parseInt(st.nextToken());
		int jumpB = Integer.parseInt(st.nextToken());
		int startA = Integer.parseInt(st.nextToken());
		int startB = Integer.parseInt(st.nextToken());
		
		int[] arrA = new int[101];
		int[] arrB = new int[101];
		
		for (int i = 0; i < 101; i++) {
			arrA[i] = startA + (jumpA * i);
			arrB[i] = startB + (jumpB * i);
		}
		
		System.out.println(go(arrA, arrB));
	}
	
	static int go(int[] arrA, int[] arrB) {
		for (int i = 0; i < 101; i++) {
			int a = arrA[i];
			for (int j = 0; j < 101; j++) {
				if (a == arrB[j]) {
					return a;
				}
			}
		}
		
		return -1;
	}

}
