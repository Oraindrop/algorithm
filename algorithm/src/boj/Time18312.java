package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Time18312 {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		String time = "000000";
		int max = (n * 3600) + (59 * 60) + 60;
		int count = 0;
		for (int i = 0; i < max; i++) {
			if (isContain(split(time), k)) {
				count++;
			}
			time = incTime(time);			
		}
		System.out.println(count);
	}

	static int[] split(String time) {
		return Arrays.stream(time.split(""))
				.mapToInt(Integer::parseInt)
				.toArray();
	}
	
	static boolean isContain(int[] arr, int k) {
		for (int i : arr) {
			if (i == k) return true;
		}
		return false;
	}
	
	static String incTime(String time) {
		sb.setLength(0);
		String[] arr = time.split("");
		int sec = Integer.parseInt(arr[5]) + 1;
		int sec10 = Integer.parseInt(arr[4]);
		if (sec == 10) {
			sec = 0;
			sec10++;
		}
		int min = Integer.parseInt(arr[3]);
		int min10 = Integer.parseInt(arr[2]);
		if (sec10 == 6) {
			sec10 = 0;
			min++;
		}
		if (min == 10) {
			min = 0;
			min10++;
		}
		
		int hour = Integer.parseInt(arr[1]);
		int hour10 = Integer.parseInt(arr[0]);
		if (min10 == 6) {
			min10 = 0;
			hour++;
		}
		if (hour == 10) {
			hour = 0;
			hour10++;
		}
		
		return sb.append(hour10).append(hour).append(min10).append(min).append(sec10).append(sec).toString();
	}
}
