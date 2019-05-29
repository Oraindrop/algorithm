package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class KLOPKA10540 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xList.add(Integer.parseInt(st.nextToken()));
			yList.add(Integer.parseInt(st.nextToken()));
		}
		
		int x = Collections.max(xList) - Collections.min(xList);
		int y = Collections.max(yList) - Collections.min(yList);
		
		int answer = x > y ? x*x : y*y;
		System.out.println(answer);
	}

}
