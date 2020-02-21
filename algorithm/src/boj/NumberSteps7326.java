package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSteps7326 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[5005][5005];
		
		for (int i = 0; i < 2500; i++) {
			arr[1 + 2*i][1 + 2*i] = 1 + 4*i;
			arr[2 + 2*i][2*i] = 2 + 4*i;
			arr[3 + 2*i][1 + 2*i] = 3 + 4*i;
			arr[2 + 2*i][2 + 2*i] = 4 + 4*i;
		}
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (x == 0 && y == 0) {
				System.out.println("0");
			} else {
				if (arr[x][y] == 0) {
					System.out.println("No Number");
				} else {
					System.out.println(arr[x][y]);
				}
			}
		}
	}

}
