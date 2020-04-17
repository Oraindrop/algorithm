package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WolfRightWord13022 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		char[] arr = input.toCharArray();
		System.out.println(go(arr) ? 1 : 0);
	}

	static boolean go(char[] arr) {
		
		if (arr.length < 4) {
			return false;
		}
		
		if (arr.length % 4 != 0) {
			return false;
		}
		
		return check(arr);
	}
	
	static boolean check(char[] arr) {
		int wCount = count(arr, 0, 'w');
		int oCount = count(arr, wCount, 'o');
		int lCount = count(arr, wCount+oCount, 'l');
		int fCount = count(arr, wCount+oCount+lCount, 'f');
		
		if (wCount == oCount && wCount == lCount && wCount == fCount) {
			int sum = wCount+oCount+lCount+fCount;
			if (arr.length == sum) {
				return true;
			}
			
			char[] newArr = new char[arr.length - sum];
			for (int i = 0; i < newArr.length; i++) {
				newArr[i] = arr[sum+i];
			}
			
			return check(newArr);
		}
		
		return false;
	}
	
	static int count(char[] arr, int startIndex, char c) {
		int count = 0;
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[i] != c) {
				return count;
			} else {
				count++;
			}
		}
		return count;
	}
}
