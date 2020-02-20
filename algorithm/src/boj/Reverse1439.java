package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse1439 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		
		int a = 0;
		int b = 0;
		
		if (arr[0] == '0') {
			a++;
		} else {
			b++;
		}
		
		for (int i = 1; i < arr.length; i++) {
			char pre = arr[i-1];
			char cur = arr[i];
			if (pre != cur) {
				if (cur == '0') {
					a++;
				} else {
					b++;
				}
			}
		}
		
		System.out.println(a > b ? b : a);
		
	}

}
