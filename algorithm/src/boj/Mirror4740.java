package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mirror4740 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!s.equals("***")) {
			String[] arr = s.split("");
			int size = arr.length;
			sb.setLength(0);
			for (int i = 0; i < size; i++) {
				sb.append(arr[size-1-i]);
			}
			System.out.println(sb.toString());
			s = br.readLine();
		}
	}

}
