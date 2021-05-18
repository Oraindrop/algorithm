package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Boj20436 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Character> leftSet = new HashSet<>(Arrays.asList('z','x','c','v','a','s','d','f','g','q','w','e','r','t'));
		
		Map<Character, MyPosition> map = new HashMap<>();
		map.put('z', new MyPosition(0, 0));
		map.put('x', new MyPosition(1, 0));
		map.put('c', new MyPosition(2, 0));
		map.put('v', new MyPosition(3, 0));
		map.put('a', new MyPosition(0, 1));
		map.put('s', new MyPosition(1, 1));
		map.put('d', new MyPosition(2, 1));
		map.put('f', new MyPosition(3, 1));
		map.put('g', new MyPosition(4, 1));
		map.put('q', new MyPosition(0, 2));
		map.put('w', new MyPosition(1, 2));
		map.put('e', new MyPosition(2, 2));
		map.put('r', new MyPosition(3, 2));
		map.put('t', new MyPosition(4, 2));
		map.put('b', new MyPosition(0, 0));
		map.put('n', new MyPosition(1, 0));
		map.put('m', new MyPosition(2, 0));
		map.put('h', new MyPosition(1, 1));
		map.put('j', new MyPosition(2, 1));
		map.put('k', new MyPosition(3, 1));
		map.put('l', new MyPosition(4, 1));
		map.put('y', new MyPosition(1, 2));
		map.put('u', new MyPosition(2, 2));
		map.put('i', new MyPosition(3, 2));
		map.put('o', new MyPosition(4, 2));
		map.put('p', new MyPosition(5, 2));
		
		char[] input = br.readLine().toCharArray();
		char left = input[0];
		char right = input[2];
		
		String s = br.readLine();
		char[] arr = s.toCharArray();
		int answer = 0;
		
		for (char c : arr) {
			if (leftSet.contains(c)) {
				answer += map.get(left).diff(map.get(c)) + 1;
				left = c;
			} else {
				answer += map.get(right).diff(map.get(c)) + 1;
				right = c;
			}
		}
		
		System.out.println(answer);
	}
	
	static class MyPosition {
		private int x;
		
		private int y;
		
		public MyPosition(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int diff(MyPosition other) {
			return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
		}
	}

}
