package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1535 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int hps[] = new int[n];
		int happys[] = new int[n];
		
		String[] arr = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			hps[i] = Integer.parseInt(arr[i]);
		}
		
		arr = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			happys[i] = Integer.parseInt(arr[i]);
		}
		
		int max = 0;
		for (int i = 1; i < (1 << n); i++) {
			int hp = 100;
			int happy = 0;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					hp -= hps[j];
					happy += happys[j];
				}
				if (hp <= 0) {
					continue;
				}
				max = Math.max(max, happy); 
			}
		}
		System.out.println(max);
		
	}

}
