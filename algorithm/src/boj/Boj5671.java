package boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj5671 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> rooms = new ArrayList<>();
		
		for (int i = 1; i <= 5000; i++) {
			if (!containDuplicate(i)) {
				rooms.add(i);
			}
		}
		

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = 0;
			for (int value : rooms) {

				if (value > b) {
					break;
				}
				
				if (value >= a) {
					count++;
				}
			}
			
			sb.append(count).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		sc.close();
	}
	
	static boolean containDuplicate(int number) {
		int[] arr = new int[10];
		while (number > 0) {
			arr[number%10]++;
			number /= 10;
		}
		
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 1) {
				return true;
			}
		}
		
		return false;
	}

}
