package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14924 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int s = Integer.parseInt(arr[0]);
		int t = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);
		System.out.println((d/(2*s)) * t);
	}

}
