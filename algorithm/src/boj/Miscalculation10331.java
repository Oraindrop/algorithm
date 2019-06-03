package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Miscalculation10331 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		int answer = Integer.parseInt(br.readLine());
		
		List<Integer> numbers = new ArrayList<>();
		List<String> ops = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) numbers.add(Integer.parseInt(arr[i]));
			else ops.add(arr[i]);
		}
		
		List<Integer> numbers1 = new ArrayList<>(numbers);
		List<String> ops1 = new ArrayList<>(ops);
		
		for (int i = 0; i < ops.size(); i++) {
			String s = ops1.remove(0);
			if (s.equals("+")) {
				int number = numbers1.get(0) + numbers1.get(1);
				numbers1.remove(0);
				numbers1.remove(0);
				numbers1.add(0, number);
			} else {
				int number = numbers1.get(0) * numbers1.get(1);
				numbers1.remove(0);
				numbers1.remove(0);
				numbers1.add(0, number);
			}
		}
		
		int answer1 = numbers1.get(0);
		
		List<Integer> numbers2 = new ArrayList<>(numbers);
		List<String> ops2 = new ArrayList<>(ops);
		
		for (int i = 0; i < ops.size(); i++) {
			int index = ops2.indexOf("*");
			if (index != -1) {
				int number = numbers2.get(index) * numbers2.get(index+1);
				numbers2.remove(index);
				numbers2.remove(index);
				numbers2.add(index, number);
				ops2.remove(index);
			} else {
				break;
			}
		}
		
		int answer2 = 0;
		for (int i : numbers2) {
			answer2 += i;
		}
		
		if (answer1 == answer && answer2 == answer) {
			System.out.println("U");
		} else if (answer1 == answer) {
			System.out.println("L");
		} else if (answer2 == answer) {
			System.out.println("M");
		} else {
			System.out.println("I");
		}
	}

}
