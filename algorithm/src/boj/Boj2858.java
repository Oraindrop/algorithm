package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2858 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int sum = r+b;
		
		int op = 3;
		while (sum % op != 0 || (op - 2) * ((sum/op) - 2) != b) {
			op++;
		}
		
		int other = sum / op;
		System.out.println(op > other ? op + " " + other : other + " " + op);
	}
}
