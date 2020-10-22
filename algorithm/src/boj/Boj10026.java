package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj10026 {
	
	static int[] moveY = { -1, 1, 0, 0 };
	static int[] moveX = { 0, 0, -1, 1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] arr = new char[n+2][n+2];
		boolean[][] visit = new boolean[n+2][n+2];
		for (int i = 1; i <= n; i++) {
			char[] inputs = br.readLine().toCharArray();
			for (int j = 1; j <= n; j++) {
				arr[i][j] = inputs[j-1];
			}
		}
		
		int firstCount = 0;
		Queue<String> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (!visit[i][j]) {
					q.add(i + "," + j);
					bfs(arr, visit, q, arr[i][j]);
					firstCount++;
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr[i][j] == 'G') {
					arr[i][j] = 'R';
				}
			}
		}
		
		q.clear();
		boolean[][] visit2 = new boolean[n+2][n+2];
		int secondCount = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (!visit2[i][j]) {
					q.add(i + "," + j);
					bfs(arr, visit2, q, arr[i][j]);
					secondCount++;
				}
			}
		}
		System.out.println(firstCount + " " + secondCount);
	}
	
	static void bfs(char[][] arr, boolean[][] visit, Queue<String> q, char value) {
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				String[] strs = q.poll().split(",");
				int y = Integer.parseInt(strs[0]);
				int x = Integer.parseInt(strs[1]);
				for(int j = 0; j < 4; j++) {
					int newY = y + moveY[j];
					int newX = x + moveX[j];
					if(arr[newY][newX] == value && !visit[newY][newX]) {
						visit[newY][newX] = true;
						q.add(newY + "," + newX);
					}
				}
			}
		}
	}

}
