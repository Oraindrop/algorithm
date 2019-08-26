package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleThreeSide5073 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		while(!s.equals("0 0 0")) {
			list.clear();
			list = Arrays.stream(s.split(" ")).mapToInt(ss -> Integer.parseInt(ss)).boxed().collect(Collectors.toList());
			sb.append(go(list)).append(System.lineSeparator());
			s = br.readLine();
		}
		
		System.out.print(sb.toString());
	}
	
	static String go(List<Integer> list) {
		int a = list.get(0);
		int b = list.get(1);
		int c = list.get(2);
		
		int max = Math.max(Math.max(a, b), c);
		int sum = a + b + c;
		
		if (sum - max <= max) {
			return "Invalid";
		}
		
		if (a == b && b == c) {
			return "Equilateral";
		}
		
		if (a == b || b == c || a == c) {
			return "Isosceles";
		}
		
		return "Scalene";
		
	}

}
