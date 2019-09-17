package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DontRepeatNumber7696 {

	static int[] arr = new int[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		int size = 0;
		int i = 0;
		while (size < 1000000) {
			clear();
			i++;
			int candidate = i;
			boolean possible = true;
			while (candidate != 0) {
				int num = candidate % 10;
				if (arr[num] != 0) {
					possible = false;
					break;
				}
				arr[num]++;
				candidate /= 10;
			}
			if (possible) {
				list.add(i);
				size++;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		while (!input.equals("0")) {
			int index = Integer.parseInt(input);
			sb.append(list.get(index-1)).append(System.lineSeparator());
			input = br.readLine();
		}
		
		System.out.print(sb.toString());
	}
	
	static void clear() {
		for (int i = 0; i < 10; i++) {
			arr[i] = 0;
		}
	}
}
