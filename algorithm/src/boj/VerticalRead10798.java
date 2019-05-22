package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerticalRead10798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list1 = new ArrayList<>(Arrays.asList(br.readLine().split("")));
		List<String> list2 = new ArrayList<>(Arrays.asList(br.readLine().split("")));
		List<String> list3 = new ArrayList<>(Arrays.asList(br.readLine().split("")));
		List<String> list4 = new ArrayList<>(Arrays.asList(br.readLine().split("")));
		List<String> list5 = new ArrayList<>(Arrays.asList(br.readLine().split("")));
		
		int max = Math.max(Math.max(Math.max(list1.size(), list2.size()), Math.max(list3.size(), list4.size())),list5.size()); 
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < max; i++) {
			if (list1.size() > i) sb.append(list1.get(i));
			if (list2.size() > i) sb.append(list2.get(i));
			if (list3.size() > i) sb.append(list3.get(i));
			if (list4.size() > i) sb.append(list4.get(i));
			if (list5.size() > i) sb.append(list5.get(i));
		}
		
		System.out.println(sb.toString());
	}

}
