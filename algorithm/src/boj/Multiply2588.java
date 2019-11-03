package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int answer = a * b;
		int one = b % 10;
		b /= 10;
		int ten = b % 10;
		b /= 10;
		int hun = b;
		
		System.out.println(a * one);
		System.out.println(a * ten);
		System.out.println(a * hun);
		System.out.println(answer);
	}

}
