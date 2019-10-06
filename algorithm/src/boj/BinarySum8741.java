package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySum8741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append("1");
		}
		
		for (int i = 1; i < k; i++) {
			sb.append("0");
		}
		
		System.out.println(sb.toString());
	}

}
