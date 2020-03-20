package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class NameCompatibility17269 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 3);
		map.put("B", 2);
		map.put("C", 1);
		map.put("D", 2);
		map.put("E", 4);
		map.put("F", 3);
		map.put("G", 1);
		map.put("H", 3);
		map.put("I", 1);
		map.put("J", 1);
		map.put("K", 3);
		map.put("L", 1);
		map.put("M", 3);
		map.put("N", 2);
		map.put("O", 1);
		map.put("P", 2);
		map.put("Q", 2);
		map.put("R", 2);
		map.put("S", 1);
		map.put("T", 2);
		map.put("U", 1);
		map.put("V", 1);
		map.put("W", 1);
		map.put("X", 2);
		map.put("Y", 2);
		map.put("Z", 1);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		String text = concat(a, b);
		String[] arr = text.split("");
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(map.get(arr[i]));
		}
		
		while (list.size() > 2) {
			run(list);
		}
		
		System.out.println(list.get(0) * 10 + list.get(1) + "%");
	}
	
	static void run(List<Integer> list) {
		List<Integer> tempList = new ArrayList<>(list);
		list.clear();
		for (int i = 0; i < tempList.size() - 1; i++) {
			list.add(specialSum(tempList.get(i), tempList.get(i+1)));
		}
	}
	
	static String concat(String a, String b) {
		int size = a.length() > b.length() ? b.length() : a.length();
		String answer = "";
		for (int i = 0; i < size; i++) {
			answer += a.substring(i, i+1);
			answer += b.substring(i, i+1);
		}
		if (b.length() > size) {
			answer += b.substring(size);	
		} else if (a.length() > size) {
			answer += a.substring(size);
		}
		return answer;
	}
	
	static int specialSum(int a, int b) {
		return a + b > 9 ? (a + b) - 10 : a + b;
	}

}
