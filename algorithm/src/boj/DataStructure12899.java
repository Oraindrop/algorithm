package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class DataStructure12899 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		/*
		 *  삭제 시 Array List 는 구조를 다바꿔야 되어서 너무 오래걸림. 
		 *  삽입 시 시간은 로직으로 줄일거라, 삭제 시간을 줄이고자 링크드리스트 활용
		 */
		List<Integer> list = new LinkedList<>();

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			if (op == 1) {
				// 삽입을 이진 검색을 사용해서 log(n) 으로 줄이고
				insert(list, value);
			} else {
				sb.append(list.remove(value-1)).append(System.lineSeparator());
			}
		}
		
		System.out.print(sb.toString());
	}
	
	static void insert(List<Integer> list, int value) {
		int size = list.size();
		
		if (list.isEmpty()) {
			list.add(value);
			return;
		}
		
		int min = list.get(0);
		int max = list.get(size-1);
		
		// 젤 작을 때
		if (value <= min) {
			list.add(0, value);
			return;
		}
		
		// 젤 클 때
		if (value >= max) {
			list.add(value);
			return;
		}
		
		// 중간 어디쯤일때
        int l = 0;
        int r = size - 1;
        while (l < r) {
            int m = (int) Math.round((l + r) / 2.0);
            if (list.get(m) > value) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (list.get(l) == value) {
            list.add(l, value);
            return;
        }
        
        list.add(l+1, value);
	}
}
