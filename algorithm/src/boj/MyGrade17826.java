package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyGrade17826 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int target = Integer.parseInt(br.readLine());
		int index = list.indexOf(target);
		String answer = "";
		if (index < 5) {
			answer = "A+";
		} else if (index < 15) {
			answer = "A0";
		} else if (index < 30) {
			answer = "B+";
		} else if (index < 35) {
			answer = "B0";
		} else if (index < 45) {
			answer = "C+";
		} else if (index < 48) {
			answer = "C0";
		} else {
			answer = "F";
		}
		
		System.out.println(answer);
	}

}
