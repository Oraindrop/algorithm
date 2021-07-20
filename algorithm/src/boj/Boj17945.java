package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj17945 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken()) * 2;
		int c = Integer.parseInt(st.nextToken());
		int pre = (-1) * b / 2;
		int post = ((int) Math.sqrt((b * b) - (4 * c))) / 2;
		
		if ( (pre + post) == (pre - post) ) {
			System.out.println(pre);
		} else {
			List<Integer> answers = new ArrayList<Integer>();
			answers.add(pre + post);
			answers.add(pre - post);
			Collections.sort(answers);
			for (int i = 0; i < answers.size(); i++) {
				System.out.print(answers.get(i) + " ");
			}
			System.out.println();
		}
	}

}
