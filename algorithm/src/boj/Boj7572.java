package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj7572 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] gan = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};	
		String[] gee = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
		
		System.out.println(gee[(n + 8) % 12] + gan[(n + 6) % 10]);
	}

}
