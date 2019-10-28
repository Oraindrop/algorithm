package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TwoHands16675 {

	static Map<String, String> winMap;
	
	static {
		winMap = new HashMap<>();
		winMap.put("R", "P");
		winMap.put("S", "R");
		winMap.put("P", "S");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String ml = st.nextToken();
		String mr = st.nextToken();
		String tl = st.nextToken();
		String tr = st.nextToken();
		
		String answer = "?";
				
		if (ml.equals(mr)) {
			String win = winMap.get(ml);
			if (win.equals(tl) || win.equals(tr))
				answer = "TK";
		}
		
		if (tl.equals(tr)) {
			String win = winMap.get(tl);
			if (win.equals(ml) || win.equals(mr))
				answer = "MS";
		}
		
		System.out.println(answer);
		
	}

}
