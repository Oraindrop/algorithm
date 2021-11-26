package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj23028 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		List<String> inputs = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			inputs.add(br.readLine());
		}
		
		for (int i = 0; i < 8-n; i++) {
			st = new StringTokenizer(inputs.get(i));
			int a1 = Integer.parseInt(st.nextToken());
			int b1 = Integer.parseInt(st.nextToken());
			
			a += a1 * 3;
			b += a1 * 3;
			
			if (a1 < 6) {
				int c = Math.min(b1, 6 - a1);
				b += c * 3;
			}
		}
		
		if (a >= 66 && b >= 130) {
			System.out.println("Nice");
		} else {
			System.out.println("Nae ga wae");
		}
		
	}

}
