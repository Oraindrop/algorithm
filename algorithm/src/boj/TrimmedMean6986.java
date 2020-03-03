package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class TrimmedMean6986 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Double> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(Double.parseDouble(br.readLine()));
		}
		
		Collections.sort(list);
		
		double pre = list.get(k);
		double post = list.get(list.size() - 1 - k);
		
		for (int i = 0; i < k; i++) {
			list.remove(list.size() - 1);
		}
		
		for (int i = 0; i < k; i++) {
			list.remove(0);
		}
		
		System.out.println(calcAvg(list));
		
		for (int i = 0; i < k; i++) {
			list.add(pre);
			list.add(post);
		}
		
		System.out.println(calcAvg(list));
		
	}
	
	static String calcAvg(List<Double> list) {
		double sum = 0.0;
		for (Double d : list) {
			sum += d;
		}
		
		return String.format("%.2f", sum / list.size() + 0.00000001);
	}

}
