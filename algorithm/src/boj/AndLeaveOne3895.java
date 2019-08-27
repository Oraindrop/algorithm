package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AndLeaveOne3895 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st;
		while (!s.equals("0 0 0")) {
			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			go(n, k, m);
			
			s = br.readLine();
		}
		
		System.out.print(sb.toString());
	}

	private static void go(int n, int k, int m) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		list.remove(m-1);
		int size = list.size();
		int index = m-1;
		while (size != 1) {
			index = (index + (k-1)) % (size);
			list.remove(index);
			size = list.size();
		}
		
		sb.append(list.get(0)).append(System.lineSeparator());
	}

}
