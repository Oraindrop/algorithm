package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1392 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			for (int j = 0; j < value; j++) {
				list.add(i+1);
			}
		}
		
		
		for (int i = 0; i < q; i++) {
			int value = Integer.parseInt(br.readLine());
			sb.append(list.get(value)).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

}
