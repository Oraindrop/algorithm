package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11605 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] operations = new String[t];
		int[] numbers = new int[t];
		for (int i = 0; i < t; i++) {
			String[] arr = br.readLine().split(" ");
			operations[i] = arr[0];
			numbers[i] = Integer.parseInt(arr[1]);
		}
		
		int[] targets = new int[100];
		for (int i = 1; i < 101; i++) {
			targets[i-1] = i;
		}
		
		int count = 0;
		for (int i = 0; i < t; i++) {
			if (operations[i].equals("ADD")) {
				for (int j = 0; j < 100; j++) {
					targets[j] += numbers[i];
				}
			} else if (operations[i].equals("MULTIPLY")) {
				for (int j = 0; j < 100; j++) {
					targets[j] *= numbers[i];
				}
			} else if (operations[i].equals("SUBTRACT")) {
				for (int j = 0; j < 100; j++) {
					if (targets[j] - numbers[i] < 0) {
						count++;
					} else {
						targets[j] -= numbers[i];
					}
				}

				if (count > 0) {
					break;
				}
			} else if (operations[i].equals("DIVIDE")) {
				for (int j = 0; j < 100; j++) {
					if (targets[j] % numbers[i] != 0) {
						count++;
					} else {
						targets[j] /= numbers[i];
					}	
				}

				if (count > 0) {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
