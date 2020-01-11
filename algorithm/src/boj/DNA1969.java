package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class DNA1969 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(0, "A");
		map1.put(1, "C");
		map1.put(2, "G");
		map1.put(3, "T");
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("A", 0);
		map2.put("C", 1);
		map2.put("G", 2);
		map2.put("T", 3);
		
		// a, t, g, c
		int[] arr = new int[4];
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[map2.get(list.get(j).substring(i, i+1))]++;
			}
			sb.append(map1.get(maxIndex(arr)));
			clear(arr);
		}
		
		String answer = sb.toString();
		int sum = 0;
		for (String s : list) {
			sum += calcHammingDistance(answer, s, m);
		}
		
		System.out.println(answer);
		System.out.println(sum);
	}
	
	static void clear(int[] arr) {
		for (int i = 0; i < 4; i++) {
			arr[i] = 0;
		}
	}
	
	static int maxIndex(int[] arr) {
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < 4; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static int calcHammingDistance(String s1, String s2, int m) {
		int answer = 0;
		for (int i = 0; i < m; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				answer++;
			}
		}
		return answer;
	}

}
