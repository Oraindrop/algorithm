package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj14716 {

	static int[] moveY = { -1, 1, 0, 0, -1, -1, 1, 1 };
	static int[] moveX = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[m+2][n+2];
		boolean[][] visit = new boolean[m+2][n+2];
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Queue<String> q = new LinkedList<>();
		int count = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr[i][j] == 1 && !visit[i][j]) {
					q.clear();
					q.add(i + "," + j);
					bfs(arr, visit, q);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	static void bfs(int[][] arr, boolean[][] visit, Queue<String> q) {
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				String[] inputs = q.poll().split(",");
				int y = Integer.parseInt(inputs[0]);
				int x = Integer.parseInt(inputs[1]);
				for (int j = 0; j < 8; j++) {
					int newY = y + moveY[j];
					int newX = x + moveX[j];
					if (arr[newY][newX] == 1 && !visit[newY][newX]) {
						visit[newY][newX] = true;
						q.add(newY + "," + newX);
					}
				}
			}

		}
	}

}
