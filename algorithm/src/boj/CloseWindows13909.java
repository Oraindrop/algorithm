package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CloseWindows13909 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long index = 2;
		int count = 1;
		long number = 1;
		while (number <= n) {
			number = index * index;
			count++;
			index++;
		}
		
		if (number > n) count--;
		
		System.out.println(count);
	}

}
