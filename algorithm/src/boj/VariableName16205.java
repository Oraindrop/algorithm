package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class VariableName16205 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int type = Integer.parseInt(st.nextToken());
		String input = st.nextToken();

		if (type == 1) {
			System.out.println(go(convertCamel(input)));
		} else if (type == 2) {
			System.out.println(go(convertSnake(input)));
		} else if (type == 3) {
			System.out.println(go(convertPascal(input)));
		}
	}

	static List<String> convertCamel(String s) {
		char[] cArr = s.toCharArray();
		int size = cArr.length;
		List<String> answers = new ArrayList<String>();
		String temp = "";
		for (int i = 0; i < size; i++) {
			if (cArr[i] >= 65 && cArr[i] <= 90) {
				char c = (char)((int)cArr[i] + 32);
				answers.add(temp);
				temp = String.valueOf(c);
			} else {
				temp += cArr[i];
			}
		}
		answers.add(temp);
		return answers;
	}
	
	static List<String> convertSnake(String s) {
		String[] sArr = s.split("_");
		return new ArrayList<>(Arrays.asList(sArr));
	}
	
	static List<String> convertPascal(String s) {
		char[] cArr = s.toCharArray();
		int size = cArr.length;
		List<String> answers = new ArrayList<String>();
		String temp = String.valueOf((char)(cArr[0] + 32));
		for (int i = 1; i < size; i++) {
			if (cArr[i] >= 65 && cArr[i] <= 90) {
				char c = (char)(cArr[i] + 32);
				answers.add(temp);
				temp = String.valueOf(c);
			} else {
				temp += cArr[i];
			}
		}
		answers.add(temp);
		return answers;	
	}
	
	static String go(List<String> list) {
		
		StringBuilder sb = new StringBuilder();
		int size = list.size();
		// camel
		String temp = list.get(0);
		for (int i = 1; i < size; i++) {
			String s = list.get(i);
			temp += s.substring(0, 1).toUpperCase() + s.substring(1);
		}
		sb.append(temp).append(System.lineSeparator());
		
		// snake
		temp = list.get(0);
		for (int i = 1; i < size; i++) {
			temp += "_" + list.get(i);
		}
		sb.append(temp).append(System.lineSeparator());
		
		// pascal
		temp = "";
		for (int i = 0; i < size; i++) {
			String s = list.get(i);
			temp += s.substring(0, 1).toUpperCase() + s.substring(1);
		}
		sb.append(temp).append(System.lineSeparator());
		return sb.toString();
	}
	
}
