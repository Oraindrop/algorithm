package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2704 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String[] arr = br.readLine().split(":");
			String h = toBinary(arr[0]);
			String m = toBinary(arr[1]);
			String s = toBinary(arr[2]);
			
			for (int j = 0; j < 6; j++) {
				sb.append(h.charAt(j)).append(m.charAt(j)).append(s.charAt(j));
			}
			
			sb.append(" ").append(h).append(m).append(s).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}
	
	
	static String toBinary(String s) {
		String binary = Integer.toBinaryString(Integer.parseInt(s));
		while (binary.length() < 6) {
			binary = "0" + binary;
		}
		return binary;
	}
}
