package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeamDivision13866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		int a = Math.abs((list.get(0) + list.get(1)) - (list.get(2) + list.get(3)));
		int b = Math.abs((list.get(0) + list.get(2)) - (list.get(1) + list.get(3)));
		int c = Math.abs((list.get(0) + list.get(3)) - (list.get(1) + list.get(2)));
		
		System.out.println(Math.min(a, Math.min(b, c)));
	}

}
