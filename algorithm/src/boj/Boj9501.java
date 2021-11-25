package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9501 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			 st = new StringTokenizer(br.readLine());
			 int n = Integer.parseInt(st.nextToken());
			 int d = Integer.parseInt(st.nextToken());
			 int answer = 0;
			 for (int j = 0; j < n; j++) {
				 String[] arr = br.readLine().split(" ");
				 double distance = Double.parseDouble(arr[0]) * (Double.parseDouble(arr[1]) / Double.parseDouble(arr[2]));
				 if (distance >= d) answer++;
			 }
			 sb.append(answer).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
		
	}

}
