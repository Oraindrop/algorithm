package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sqrt4619 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st;
		while(!s.equals("0 0")) {
			st = new StringTokenizer(s);
			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			System.out.println(go (b, n));
			s = br.readLine();
		}
		
	}
	
	static int go(int b, int n) {
		
		int pre = 0;
		int cur = 1;
		int index = 1;
		
		if (b <= 1) {
			return 1;
		}
		
		while (cur < b) {
			pre = cur;
			cur = intPow(index, n);
			index++;
		}
		
		int preDiff = b - pre;
		int curDiff = cur - b;
		
		if (preDiff <= curDiff) {
			return index-2;
		} else {
			return index-1;
		}
		
	}
	
	static int intPow(int a, int n) {
		int answer = 1;
		for (int i = 0; i < n; i++) {
			answer *= a;
		}
		return answer;
	}

}
