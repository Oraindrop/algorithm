package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj20362 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String name = st.nextToken();
		int target = 0;
		String answer = "";
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			String[] inputs = br.readLine().split(" ");
			arr[i] = inputs[1];
			if (inputs[0].equals(name)) {
				target = i;
				answer = inputs[1];
			}
		}
		
		int count = 0;
		for (int i = 0; i < target; i++) {
			if (arr[i].equals(answer)) count++;
		}
		
		System.out.println(count);
	}

}
