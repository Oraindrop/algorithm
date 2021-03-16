package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14696 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			String[] input1 = br.readLine().split(" ");
			String[] input2 = br.readLine().split(" ");
			
			for (int j = 0; j < Integer.parseInt(input1[0]); j++) {
				arr1[Integer.parseInt(input1[j+1])]++;
			}
			
			for (int j = 0; j < Integer.parseInt(input2[0]); j++) {
				arr2[Integer.parseInt(input2[j+1])]++;
			}
			
			sb.append(judge(arr1, arr2)).append(System.lineSeparator());
			
			clear(arr1);
			clear(arr2);
		}
		
		System.out.print(sb.toString());
	}
	
	static void clear(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
	
	static String judge(int[] arr1, int[] arr2) {
		if (arr1[4] > arr2[4])
			return "A";
		
		if (arr1[4] < arr2[4])
			return "B";
		
		if (arr1[3] > arr2[3])
			return "A";
		
		if (arr1[3] < arr2[3])
			return "B";
		
		if (arr1[2] > arr2[2])
			return "A";
		
		if (arr1[2] < arr2[2])
			return "B";
		
		if (arr1[1] > arr2[1])
			return "A";
		
		if (arr1[1] < arr2[1])
			return "B";
		
		return "D";
	}

}
