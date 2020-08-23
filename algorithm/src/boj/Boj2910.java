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

public class Boj2910 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		Map<Integer, Integer> counts = new HashMap<>();
		Map<Integer, Integer> seqs = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			int key = Integer.parseInt(st.nextToken());
			if (counts.containsKey(key)) {
				int value = counts.get(key) + 1;
				counts.put(key, value);
			} else {
				counts.put(key, 1);
			}
			
			if (!seqs.containsKey(key)) {
				seqs.put(key, i);
			}
		}
		
		List<ForSort> list = new ArrayList<>();
		
		for (int key : counts.keySet()) {
			list.add(new ForSort(key, counts.get(key), seqs.get(key)));
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (ForSort fs : list) {
			sb.append(fs.print());
		}
		
		System.out.println(sb.toString());
	}

}

class ForSort implements Comparable<ForSort>{
	
	private int key;
	
	private int count;
	
	private int seq;
	
	public ForSort(int key, int count, int seq) {
		this.key = key;
		this.count = count;
		this.seq = seq;
	}

	@Override
	public int compareTo(ForSort o) {
		// TODO Auto-generated method stub
		if (this.count > o.count) {
			return -1;
		} else if (this.count < o.count) {
			return 1;
		} else {
			return this.seq < o.seq ? -1 : 1; 
		}
	}

	public String print() {
		String result = "";
		for (int i = 0; i < this.count; i++) {
			result += key + " ";
		}
		return result;
	}
	
}
