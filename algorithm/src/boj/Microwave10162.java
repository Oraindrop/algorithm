package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave10162 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		go(Integer.parseInt(br.readLine()));
	}
	
	static void go(int t) {
		if (t % 10 != 0) {
			System.out.println(-1);
			return;
		}
		
		int value = t;
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = t / 300;
		value -= a * 300;
		if (value == 0) {
			print(a, b, c);
			return;
		}
		
		b = value / 60;
		value -= b * 60;
		if (value == 0) {
			print(a, b, c);
			return;
		}
		
		c = value / 10;
		value -= c * 10;
		print(a, b, c);
	}
	
	static void print(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}
