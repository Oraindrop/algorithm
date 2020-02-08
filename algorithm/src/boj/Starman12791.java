package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Starman12791 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		Map<Integer, String> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		map.put(1967, "DavidBowie");
		map.put(1969, "SpaceOddity");
		map.put(1970, "TheManWhoSoldTheWorld");
		map.put(1971, "HunkyDory");
		map.put(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
		map.put(1973, "AladdinSane");
//		map.put(1973, "PinUps");
		map.put(1974, "DiamondDogs");
		map.put(1975, "YoungAmericans");
		map.put(1976, "StationToStation");
		map.put(1977, "Low");
//		map.put(1977, "Heroes");
		map.put(1979, "Lodger");
		map.put(1980, "ScaryMonstersAndSuperCreeps");
		map.put(1983, "LetsDance");
		map.put(1984, "Tonight");
		map.put(1987, "NeverLetMeDown");
		map.put(1993, "BlackTieWhiteNoise");
		map.put(1995, "1.Outside");
		map.put(1997, "Earthling");
		map.put(1999, "Hours");
		map.put(2002, "Heathen");
		map.put(2003, "Reality");
		map.put(2013, "TheNextDay");
		map.put(2016, "BlackStar");
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.clear();
			for (int j = a; j <= b; j++) {
				String value = map.getOrDefault(j, "");
				if (!value.isEmpty()) {
					list.add(j + " " + value);
					if (j == 1973) {
						list.add("1973 PinUps");
					}
					if (j == 1977) {
						list.add("1977 Heroes");
					}
				}
			}
			sb.append(list.size()).append(System.lineSeparator());
			for (String s : list) {
				sb.append(s).append(System.lineSeparator());
			}
		}
		
		System.out.println(sb.toString());
		 
	}

}
