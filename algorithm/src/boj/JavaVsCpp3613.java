package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaVsCpp3613 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(go(br.readLine()));
	}

	static String go (String input) {
		if (input.charAt(0) < 97 || input.charAt(0) > 122) {
			return "Error!";
		}
		
		if (input.charAt(input.length() - 1) == '_') {
			return "Error!";
		}
		
		if (input.contains("__")) {
			return "Error!";
		}
		
		if (input.contains("_")) {
			
			if (isContainUpperCase(input)) {
				return "Error!";
			}
			
			return cppToJava(input);				
		}
		
		if (input.toLowerCase().equals(input)) {
			return input;
		}
		
		return javaToCpp(input);
	}
	
	static boolean isContainUpperCase(String input) {
		for (char c : input.toCharArray()) {
			if (c >= 65 && c <= 90) {
				return true;
			}
		}
		return false;
	}
	
	static String cppToJava(String input) {
		String[] arr = input.split("_");
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			String value = arr[i];
			sb.append((char)((int)value.charAt(0) - 32));
			if (value.length() > 1) {
				sb.append(value.substring(1));
			}
		}
		return sb.toString();
	}
	
	static String javaToCpp(String input) {
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (c >= 65 && c <= 90) {
				sb.append("_").append((char)((int)c + 32));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
