package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1244 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) != 0;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			action(arr, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if (i != 0 && i % 20 == 0) {
				sb.append(System.lineSeparator());
			}
			sb.append(arr[i] ? 1 : 0).append(" ");
		}
		
		System.out.println(sb.toString());
	}
	
	static void action(boolean[] arr, int op, int value) {
		if (op == 1) {
			actionOne(arr, value);
		} else {
			actionTwo(arr, value);
		}
	}
	
	static void actionOne(boolean[] arr, int value) {
		for (int i = value-1; i < arr.length; i += value) {
			arr[i] = !arr[i];
		}
	}
	
	static void actionTwo(boolean[] arr, int value) {
		arr[value-1] = !arr[value-1]; 
		int leftIndex = value-2;
		int rightIndex = value;
		
		while (leftIndex >= 0 && rightIndex < arr.length) {
			if (arr[leftIndex] != arr[rightIndex]) {
				break;
			}
			arr[leftIndex] = !arr[leftIndex];
			arr[rightIndex] = !arr[rightIndex];
			leftIndex--;
			rightIndex++;
		}
		
	}

}
