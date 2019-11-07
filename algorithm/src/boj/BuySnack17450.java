package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BuySnack17450 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] arr = new double[3];
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "S");
		map.put(1, "N");
		map.put(2, "U");
		StringTokenizer st;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken()) * 10;
			int weight = Integer.parseInt(st.nextToken()) * 10;
			price = price >= 5000 ? price - 500 : price;
			arr[i] = (double)weight / price;
		}
		double max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < 3; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println(map.get(maxIndex));
	}

}
