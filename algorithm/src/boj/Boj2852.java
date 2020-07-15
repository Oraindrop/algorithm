package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2852 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int preScore = 0;
		int curScore = 0;
		int preTime = 0;
		int firstTime = 0;
		int secondTime = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int win = Integer.parseInt(st.nextToken());
			int time = getSeconds(st.nextToken());
			curScore += win == 1 ? 1 : -1;
			if (preScore == 0) {
				preTime = time;
			} else if (preScore > 0 && curScore == 0) {
				firstTime += time - preTime;
			} else if (preScore < 0 && curScore == 0) {
				secondTime += time - preTime;
			}
			preScore = curScore;
		}
		if (curScore > 0) {
			firstTime += getSeconds("48:00") - preTime;
		} else if (curScore < 0) {
			secondTime += getSeconds("48:00") - preTime;
		}
		
		System.out.println(getMMSS(firstTime));
		System.out.println(getMMSS(secondTime));
	}

	static int getSeconds(String time) {
		String[] arr = time.split(":");
		return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
	}
	
	static String getMMSS(int seconds) {
		return String.format("%02d:%02d", seconds / 60, seconds % 60);
	}
}
