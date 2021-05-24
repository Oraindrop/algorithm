package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj14623 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b1 = br.readLine();
		String b2 = br.readLine();
		
		String answer = "";
		
		char[] arr = b2.toCharArray();
		int size = arr.length;
		
		for (int i = 0; i < size; i++) {
			char c = arr[size - 1 - i];
			if (c == '1') {
				String temp = b1;
				for (int j = 0; j < i; j++) {
					temp += "0";
				}
				answer = add(answer, temp);
			}
		}
		
		System.out.println(answer);
	}
	
	static String add(String b1, String b2) {
		int carry = 0;
		Stack<Character> b1Stack = new Stack<>();
		Stack<Character> b2Stack = new Stack<>();
		Stack<Integer> answer = new Stack<>();
		for (char c : b1.toCharArray()) {
			b1Stack.push(c);
		}
		
		for (char c : b2.toCharArray()) {
			b2Stack.push(c);
		}
		
		while (!b1Stack.isEmpty() || !b2Stack.isEmpty()) {
			if (b1Stack.isEmpty()) {
				int a = b2Stack.pop() - '0';
				if (a + carry >= 2) {
					answer.push(a + carry - 2);
					carry = 1;
				} else {
					answer.push(a + carry);
					carry = 0;
				}
			} else if (b2Stack.isEmpty()) {
				int a = b1Stack.pop() - '0';
				if (a + carry >= 2) {
					answer.push(a + carry - 2);
					carry = 1;
				} else {
					answer.push(a + carry);
					carry = 0;
				}
			} else {
				int a1 = b1Stack.pop() - '0'; 
				int a2 = b2Stack.pop() - '0';
				if (a1 + a2 + carry >= 2) {
					answer.push(a1 + a2 + carry - 2);
					carry = 1;
				} else {
					answer.push(a1 + a2 + carry);
					carry = 0;
				}
			}
		}
		
		if (carry == 1) {
			answer.push(carry);
		}
		
		String result = "";
		while (!answer.isEmpty()) {
			result += answer.pop();
		}
		
		return result;
	}

}
