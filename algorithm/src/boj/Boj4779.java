package boj;

import java.util.Scanner;

public class Boj4779 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int length = (int) Math.pow(3, n);
			sb.append(go(length)).append(System.lineSeparator());
		}
	
		sc.close();
		System.out.print(sb.toString());
	}
	
	static String go(int length) {
		if (length == 1) {
			return "-";
		}
		
		return go(length/3) + makeBlankString(length/3) + go(length/3);
	}
	
	static String makeBlankString(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}

}
