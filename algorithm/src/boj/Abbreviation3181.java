package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Abbreviation3181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<String> skipList = Arrays.asList("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili");
		sb.append(st.nextToken().substring(0, 1).toUpperCase());
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			if (!isSkip(skipList, s)) {
				sb.append(s.substring(0, 1).toUpperCase());		
			}
		}
		System.out.println(sb.toString());
	}
	
	static boolean isSkip(List<String> list, String s) {
		for (String e : list) {
			if (e.equals(s)) return true; 
		}
		return false;
	}

}
