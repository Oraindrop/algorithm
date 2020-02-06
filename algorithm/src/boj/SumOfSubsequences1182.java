package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class SumOfSubsequences1182 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
        int bitMax = (int) Math.pow(2, n);
        
		List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
		int answer = 0;
		for (int i = 1; i < bitMax; i++) {
			int sum = 0;
			
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					sum += list.get(j);
				}
			}
			
			if (sum == s) answer++;
		}
		
		System.out.println(answer);
		
	}

}
