package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusNumberCount14909 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		
		while (st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			count = n > 0 ? count + 1 : count;
		}
		
		System.out.println(count);
	}

}
