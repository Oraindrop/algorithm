package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3107 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputs = input.split("::");
		String[] answer = new String[8];
		
		if (input.substring(0, 2).equals("::")) {
			String[] arr = input.substring(2).split(":");
			for (int i = 0; i < 8 - arr.length; i++) {
				answer[i] = "0000";
			}
			for (int i = 8 - arr.length; i < 8; i++) {
				answer[i] = paddingZero(arr[i - (8 - arr.length)]);
			}
		} else if (input.substring(input.length() - 2).equals("::")) {
			String[] arr = input.substring(0, input.length() - 2).split(":");
			for (int i = 0; i < arr.length; i++) {
				answer[i] = paddingZero(arr[i]);
			}
			for (int i = arr.length; i < 8; i++) {
				answer[i] = "0000";
			}
		} else if (inputs.length > 1) {
			String[] arr1 = inputs[0].split(":");
			String[] arr2 = inputs[1].split(":");
			for (int i = 0; i < arr1.length; i++) {
				answer[i] = paddingZero(arr1[i]);
			}
		
			for (int i = arr1.length; i < 8 - arr2.length; i++) {
				answer[i] = "0000";
			}
			
			for (int i = 8 - arr2.length; i < 8; i++) {
				answer[i] = paddingZero(arr2[i - (8 - arr2.length)]);
			}
		} else {
			String[] arr = input.split(":");
			for (int i = 0; i < 8; i++) {
				answer[i] = paddingZero(arr[i]);
			}
		}
		
		System.out.println(String.join(":", answer));
	}
	
	static String paddingZero(String s) {
		if (s.length() == 4)
			return s;
		
		String padding = "";
		for (int i = 0; i < 4 - s.length(); i++) {
			padding += "0";
		}
		return padding + s;
	}

}
