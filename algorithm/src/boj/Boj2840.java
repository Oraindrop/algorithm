package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2840 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = "?";
		}
		
		boolean result = true;
		int index = 0;
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			index = (index + a) % n;
			String value = st.nextToken();

			if (!arr[index].equals("?")) {
				result = arr[index].equals(value);
			} else {
				arr[index] = value;
			}
		}
		
		int[] count = new int[26];
		for (int i = 0; i < n; i++) {
			if (!arr[i].equals("?")) {
				count[arr[i].toCharArray()[0] - 'A']++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (count[i] > 1) {
				result = false;
				break;
			}
		}
		

		if (result) {
			StringBuilder sb = new StringBuilder();
			for (int i = index; i >= 0; i--) {
				sb.append(arr[i]);
			}
			
			for (int i = n-1; i > index; i--) {
				sb.append(arr[i]);
			}
			
			System.out.println(sb.toString());
		} else {
			System.out.println("!");
		}
		

	}

}
