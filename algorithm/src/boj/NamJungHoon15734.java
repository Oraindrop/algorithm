package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NamJungHoon15734 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		int diff = Math.abs(l-r);
		
		if (diff == 0) {
			a = a % 2 == 0 ? a : a -1;
			System.out.println(l+r+a);
		} else if (diff == a) {
			System.out.println(l+r+a);
		} else if (diff < a) {
			int sum = l + r + diff;
			a -= diff;
			a = a % 2 == 0 ? a : a -1;
			System.out.println(sum + a);
		} else {
			int min = Math.min(l, r);
			System.out.println((min+a) * 2);			
		}
	}

}
