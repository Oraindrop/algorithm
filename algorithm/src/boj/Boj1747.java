package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj1747 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[1003002];
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i < Math.sqrt(arr.length) + 1; i++) {
			if (arr[i]) {
				for (int j = i*i; j < arr.length; j += i) {
					arr[j] = false;
				}	
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i < arr.length; i++) {
			if (arr[i]) {
				if (isPalindrome(i)) {
					list.add(i);
				}
			}
		}
		int answer = 0;
		for (int num : list) {
			if (num >= n) {
				answer = num;
				break;
			}
		}
		
		System.out.println(answer);
	}
	
	static boolean isPalindrome(int number) {
		String s = String.valueOf(number);
		return s.equals(convertReverse(s));
	}
	
	static String convertReverse(String s) {
		char[] arr = s.toCharArray();
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i];
		}
		return rev;
	}

}
