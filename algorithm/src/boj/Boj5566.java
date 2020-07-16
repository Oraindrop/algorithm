package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj5566 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		int[] dices = new int[m];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < m; i++) {
			dices[i] = Integer.parseInt(br.readLine());
		}
		
		int cur = 1;
		int index = 0;
		for (int i = 0; i < m; i++) {
			int dice = dices[i];
			int temp = cur + dice;
			if (temp >= n) {
				index = i+1;
				break;
			} else {
				temp += arr[temp];
				if (temp >= n) {
					index = i+1;
					break;
				}
			}
			cur = temp;
		}
		
		System.out.println(index == 0 ? m : index);
	}
}
