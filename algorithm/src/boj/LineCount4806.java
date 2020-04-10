package boj;

import java.util.Scanner;

public class LineCount4806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while (sc.hasNextLine()) {
			sc.nextLine();
			index++;
		}
		System.out.println(index);
		sc.close();
	}

}
