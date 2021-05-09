package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Boj16462 {
	
	static Set<Character> set = new HashSet<>(Arrays.asList('0', '6', '9'));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += convert(br.readLine());
		}
		
		double answer = sum / (double) n;
		System.out.println((int)(answer + 0.5));
	}
	
	static int convert(String input) {
		char[] arr = input.toCharArray();
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				arr[i] = '9';
			}
			value *= 10;
			value += arr[i] - '0';
		}
		
		return value > 100 ? 100 : value; 
	}

}
