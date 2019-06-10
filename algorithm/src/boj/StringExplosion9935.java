package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StringExplosion9935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String match = br.readLine();
		int strLength = s.length();
		int matchLength = match.length();
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < strLength; i++) {
			stack.push(s.substring(i, i+1));
			if (stack.size() >= matchLength) {
				sb.setLength(0);
				int stackSize = stack.size();
				for (int j = 0; j < matchLength; j++) {
					sb.append(stack.get(stackSize - matchLength + j));
				}
				if (sb.toString().equals(match)) {
					for (int j = 0; j < matchLength; j++) {
						stack.pop();
					}
				}
			}
		}
		
		if (stack.size() == 0) {
			System.out.println("FRULA");
		} else {
			sb.setLength(0);
			for (int i = 0; i < stack.size(); i++) {
				sb.append(stack.get(i));
			}
			System.out.println(sb.toString());
		}
	}

}
