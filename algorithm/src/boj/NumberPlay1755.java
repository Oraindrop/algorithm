package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberPlay1755 {

	static Map<Integer, String> map = new HashMap<>();
	
	static {
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		List<ReadNumber> list = new ArrayList<>();
		
		for (int i = min; i <= max; i++) {
			int first = i / 10;
			int second = i % 10;
			String s = "";
			if (first == 0) {
				s = map.get(second);
			} else {
				s = map.get(first) + map.get(second);
			}
			list.add(new ReadNumber(i, s));
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).getKey()).append(" ");
			if (i % 10 == 9) sb.append(System.lineSeparator()); 
		}
		System.out.println(sb.toString());
	}
}


class ReadNumber implements Comparable<ReadNumber> {
	private int key;
	private String value;
	
	public ReadNumber(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public int compareTo(ReadNumber o) {
		// TODO Auto-generated method stub
		return this.value.compareTo(o.value);
	}
}
