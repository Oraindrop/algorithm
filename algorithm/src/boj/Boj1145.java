package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1145 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		int target = 0;
		
		while (count < 3) {
			target++;
			count = 0;
			for (int i = 0; i < 5; i++) {
				if (target % arr[i] == 0) {
					count++;
				}
			}
		}
		
		System.out.println(target);
		
	}

}
