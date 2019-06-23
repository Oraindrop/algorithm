package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bee9733 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 휴식(Re), 순찰(Pt), 방청소(Cc), 꽃가루 먹기(Ea), 새끼 돌보기(Tb), 벌집 짓기와 관리(Cm), 외부 활동(Ex)
		String[] arr = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
		
		
		Map<String, Integer> map = new HashMap<>();
		for (String s : arr) {
			map.put(s, 0);	
		}

		int total = 0;
		while (true) {
			try {
				String input = br.readLine();
				StringTokenizer st = new StringTokenizer(input);
				
				String s = st.nextToken();
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);	
				}
				total++;
				
				while(st.hasMoreTokens()) {
					String ss = st.nextToken();
					if (map.containsKey(ss)) {
						map.put(ss, map.get(ss) + 1);	
					}
					total++;
				}
			} catch (Exception e) {
				// TODO: handle exception
				break;
			}
		}

		for (String s : arr) {
			int value = map.get(s);
			System.out.println(s + " " + value + " " + String.format("%.2f", (double)value / (double)total));
		}
		System.out.println("Total " + total + " 1.00");
		
	}

}
