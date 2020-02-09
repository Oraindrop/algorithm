package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMakerDongJoon2847 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			int post = arr[i];
			int pre = arr[i-1];
			while (pre >= post) {
				pre--;
				count++;
			}
			arr[i-1] = pre;
		}
		
		System.out.println(count);
	}

}
