package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boj9654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(Arrays.asList("SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE"));
		List<String> list2 = new ArrayList<>(Arrays.asList("N2 Bomber", "Heavy Fighter", "Limited", "21"));
		List<String> list3 = new ArrayList<>(Arrays.asList("J-Type 327", "Light Combat", "Unlimited", "1"));
		List<String> list4 = new ArrayList<>(Arrays.asList("NX Cruiser", "Medium Fighter", "Limited", "18"));
		List<String> list5 = new ArrayList<>(Arrays.asList("N1 Starfighter", "Medium Fighter", "Unlimited", "25"));
		List<String> list6 = new ArrayList<>(Arrays.asList("Royal Cruiser", "Light Combat", "Limited", "4"));

		StringBuilder sb = new StringBuilder();
		
		go(list1, sb);
		go(list2, sb);
		go(list3, sb);
		go(list4, sb);
		go(list5, sb);
		go(list6, sb);

		System.out.print(sb.toString());
	}
	
	static void go(List<String> list, StringBuilder sb) {
		String[] str = {"%-15s", "%-15s", "%-11s", "%-10s"};
		for (int i = 0; i < 4; i++) {
			sb.append(String.format(str[i], list.get(i)));
		}
		sb.append(System.lineSeparator());
	}

}
