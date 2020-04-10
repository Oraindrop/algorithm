package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PhoneBill3226 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 24; i++) {
			if (i >= 7 && i < 19) {
				map.put(i, 10);
			} else {
				map.put(i, 5);
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int price = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String[] arr = st.nextToken().split(":");
			LocalTime time = LocalTime.of(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
			int during = Integer.parseInt(st.nextToken());
			for (int j = 0; j < during; j++) {
				price += map.get(time.plusMinutes(j).getHour());
			}
		}
		
		System.out.println(price);
	}

}
