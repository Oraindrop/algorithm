package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj9517 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int index = k % 8;
		int time = 0;
		List<String> inputList = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			inputList.add(br.readLine());
		}
		
		for (String input : inputList) {
			String[] arr = input.split(" ");
			int value = Integer.parseInt(arr[0]);
			String z = arr[1];
			time += value;
			
			if (time > 210) {
				break;
			}
			
			if (z.equals("T")) {
				index++;
				index %= 8;
			}
		}
		
		if (index == 0) {
			index = 8;
		}
		
		System.out.println(index);
	}

}
