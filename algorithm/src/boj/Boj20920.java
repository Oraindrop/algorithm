package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj20920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			if (map.containsKey(input)) {
				map.put(input, map.get(input) + 1);
			} else {
				map.put(input, 1);
			}
		}
		
		List<EnglishWord> list = new ArrayList<>();
		
		for (String key : map.keySet()) {
			list.add(new EnglishWord(key, map.get(key)));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for (EnglishWord word : list) {
			if (word.isShorter(m)) {
				break;
			} else {
				sb.append(word.getWord()).append(System.lineSeparator());
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	static class EnglishWord implements Comparable<EnglishWord> {
		
		private String word;
		
		private int count;

		public EnglishWord(String word, int count) {
			this.word = word;
			this.count = count;
		}

		@Override
		public int compareTo(EnglishWord o) {
			// TODO Auto-generated method stub
			if (this.count > o.count) return -1;
			else if (this.count < o.count) return 1;
			else {
				if (this.word.length() > o.word.length()) return -1;
				else if (this.word.length() < o.word.length()) return 1;
				else {
					return this.word.compareTo(o.word);		
				}
			}
		}
		
		public String getWord() {
			return word;
		}

		public boolean isShorter(int length) {
			return this.word.length() < length;
		}
	}

}
