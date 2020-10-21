package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj4963 {
	
	static int[] moveY = { -1, 1, 0, 0, -1, -1, 1, 1 };
	static int[] moveX = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = br.readLine();
		Queue<String> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		while (!input.equals("0 0")) {
			String[] sArr = input.split(" ");
			int w = Integer.parseInt(sArr[0]);
			int h = Integer.parseInt(sArr[1]);
			int[][] arr = new int[h+2][w+2];
			boolean[][] visit = new boolean[h+2][w+2];

			for (int i = 1; i <= h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			q.clear();
			int count = 0;
			
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (arr[i][j] == 1 && !visit[i][j]) {
						q.clear();
						q.add(i + "," + j);
						bfs(arr, visit, q, w, h);
						count++;
					}
				}
			}
			sb.append(count).append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}
	
	static void bfs(int[][] arr, boolean[][] visit, Queue<String> q, int w, int h) {
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				String[] strs = q.poll().split(",");
				int y = Integer.parseInt(strs[0]);
				int x = Integer.parseInt(strs[1]);
				for(int j = 0; j < 8; j++) {
					int newY = y + moveY[j];
					int newX = x + moveX[j];
					if(arr[newY][newX] == 1 && visit[newY][newX] == false) {
						visit[newY][newX] = true;
						q.add(newY + "," + newX);
					}
				}
			}
		}
	}

}
