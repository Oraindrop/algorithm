package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class PasswordParser17176 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> pList = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			pList.add(Integer.parseInt(st.nextToken()));
		}
		
		List<String> sList = new ArrayList<>(Arrays.asList(br.readLine().split("")));
		List<String> answers = go(pList, sList);
		
		Collections.sort(sList);
		Collections.sort(answers);
		
		boolean b = true;
		for (int i = 0; i < length; i++) {
			if(!answers.get(i).equals(sList.get(i))) {
				b = false;
			}
		}
		
		System.out.println(b ? "y" : "n");

		
	}

	private static List<String> go(List<Integer> pList, List<String> sList) {
		List<String> answers = new ArrayList<>();
		for (int i : pList) {
			String answer = "";
			if (i == 0) {
				answer = " ";
			} else if (i >= 1 && i <= 26) {
				answer = String.valueOf((char)(i + 64));
			} else if (i >= 27 && i <= 52) {
				answer = String.valueOf((char)(i + 70));
			}
			answers.add(answer);
		}
		return answers;

	}

}
