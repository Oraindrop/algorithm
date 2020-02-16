package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counting10102 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String input = br.readLine();
		int[] arr = new int[2];
		
		for (char c : input.toCharArray()) {
			arr[c - 'A']++;
		}
		
		if (arr[0] > arr[1]) {
			System.out.println("A");
		} else if (arr[1] > arr[0]) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
		
	}

}
