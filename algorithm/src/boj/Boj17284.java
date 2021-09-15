package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj17284 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 500);
		map.put(2, 800);
		map.put(3, 1000);
		int answer = 5000;
		while (st.hasMoreTokens()) {
			answer -= map.get(Integer.parseInt(st.nextToken()));
		}
		System.out.println(answer);
	}

}
