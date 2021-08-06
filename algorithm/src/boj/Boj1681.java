package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1681 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String l = st.nextToken();
		int index = 0;
		int i = 0;
		int answer = 0;
		while (index != n) {
			i++;
			if (!String.valueOf(i).contains(l)) {
				index++;
				answer = i;
			}
		}
		System.out.println(answer);
	}

}
