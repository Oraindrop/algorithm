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

public class GirlGroupMasterJoonSeok16165 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		for (int i = 0; i < n; i++) {
			list.clear();
			String key = br.readLine();
			int t = Integer.parseInt(br.readLine());
			for (int j = 0; j < t; j++) {
				String s = br.readLine();
				list.add(s);
				map2.put(s, key);
			}
			sb.setLength(0);
			Collections.sort(list);
			for (String ss : list) {
				sb.append(ss).append(System.lineSeparator());
			}
			map1.put(key, sb.toString());
		}
		sb.setLength(0);
		for (int i = 0; i < m; i++) {
			String find = br.readLine();
			int type = Integer.parseInt(br.readLine());
			if (type == 1) {
				sb.append(map2.get(find)).append(System.lineSeparator());
			} else {
				sb.append(map1.get(find));
			}
		}
		System.out.print(sb.toString());
	}

}
