package boj;

import java.util.Scanner;

public class PlusTwo10823 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}
		
		String[] arr = sb.toString().split(",");
		long answer = 0;
		
		for (String s : arr) {
			answer += Integer.parseInt(s);
		}
		
		System.out.println(answer);
		sc.close();
	}

}
