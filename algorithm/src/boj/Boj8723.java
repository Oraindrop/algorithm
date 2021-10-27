package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj8723 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		
		if ((list.get(0) + list.get(1)) <= list.get(2)) {
			System.out.println(0);
		} else if (list.get(0) == list.get(1) && list.get(0) == list.get(2) && list.get(1) == list.get(2)) {
			System.out.println(2);
		} else if ( (list.get(2) * list.get(2)) == ((list.get(0) * list.get(0)) + (list.get(1) * list.get(1)))) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
