package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15312 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] counts = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();
		int[] arr = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			arr[i*2] = counts[a[i] - 'A'];
			arr[i*2 + 1] = counts[b[i] - 'A'];
		}
		
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp = (arr[j] + arr[j+1]) % 10;
				arr[j] = temp;
			}
		}
		
		System.out.println(arr[0] + "" + arr[1]);
		
	}

}
