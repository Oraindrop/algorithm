package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FourDice2484 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> rewards = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
			rewards.add(go(list));
		}
		
		System.out.println(Collections.max(rewards));
	}
	
	static int go(List<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		
		if (set.size() == 1) {
			return rewardFourMatch(list.get(0));
		}
		
		if (set.size() == 2) {
			int count = 0;
			int base = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == base) {
					count++;
				}
			}

			int sum = sumList(list);
			if (count % 2 == 1) {
				if (count == 1) {
					return rewardThreeMatch((sum - base) / 3);
				} else {
					return rewardThreeMatch(base);
				}
			} else {
				return rewardTwoTwoMatch(sum / 2);
			}
		}
		
		if (set.size() == 3) {
			int sumList = sumList(list);
			int sumSet = sumSet(set);
			return rewardTwoMatch(sumList - sumSet);
		}
		
		return rewardNoMatch(Collections.max(list));
	}

	static int rewardFourMatch(int number) {
		return 50000 + (number * 5000);
	}
	
	static int rewardThreeMatch(int number) {
		return 10000 + (number * 1000);
	}
	
	static int rewardTwoTwoMatch(int number) {
		return 2000 + (number * 500);
	}
	
	static int rewardTwoMatch(int number) {
		return 1000 + (number * 100);
	}
	
	static int rewardNoMatch(int number) {
		return number * 100;
	}
	
	static int sumList(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}
	
	static int sumSet(Set<Integer> set) {
		int sum = 0;
		for (int i : set) {
			sum += i;
		}
		return sum;
	}
}
