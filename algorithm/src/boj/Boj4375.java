package boj;

import java.util.Scanner;

public class Boj4375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			
			if (n == 1) {
				sb.append("1").append(System.lineSeparator());
				continue;
			}
			
			int count = 1;
			int value = 1;
			while (value % n != 0) {
				value %= n;
				value *= 10;
				value += 1;
				count++;
			}
			sb.append(count).append(System.lineSeparator());
		}
		
		sc.close();
		System.out.print(sb.toString());
	}

}
