package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2511 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] aArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] bArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int aScore = 0;
		int bScore = 0;
		
		String winner = "";
		
		for (int i = 0; i < 10; i++) {
			if (aArr[i] > bArr[i]) {
				aScore += 3;
				winner = "A";
			} else if (bArr[i] > aArr[i]) {
				bScore += 3;
				winner = "B";
			} else {
				aScore += 1;
				bScore += 1;
			}
		}
		
		System.out.println(aScore + " " + bScore);
		
		if (aScore > bScore) {
			System.out.println("A");
		} else if (bScore > aScore) {
			System.out.println("B");
		} else {
			System.out.println(winner.equals("") ? "D" : winner);
		}
	}

}
