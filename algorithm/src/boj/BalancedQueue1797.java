package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BalancedQueue1797 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<MyFan> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			list.add(new MyFan(sex, x));
		}
		
		Collections.sort(list);
		int count = 1;
		int max = 0;
		for (int i = 1; i < n; i++) {
			MyFan pre = list.get(i-1);
			MyFan cur = list.get(i);
			if (cur.isDifferent(pre)) {
				count++;
			} else {
				if (count > 1) {
					if (count % 2 == 0) {
						int d = pre.getDistance(list.get(i - count));
						max = Math.max(max, d);
					}
					else {
						int d1 = pre.getDistance(list.get(i - (count - 1)));
						int d2 = list.get(i-2).getDistance(list.get(i - count));						
						max = Math.max(max, Math.max(d1, d2));
					}
				}	
				count = 1;
			}
		}

		if (count > 1) {
			if (count % 2 == 0) {
				int d = list.get(n-1).getDistance(list.get((n - 1) - (count - 1)));
				max = Math.max(max, d);
			}
			else {
				int d1 = list.get(n-1).getDistance(list.get((n - 1) - (count - 2)));
				int d2 = list.get(n-2).getDistance(list.get((n - 2) - (count - 1)));
				max = Math.max(max, Math.max(d1, d2));
			}
		}
		System.out.println(max);
	}

}

class MyFan implements Comparable<MyFan>{
	
	private int sex;
	
	private int x;

	public int getSex() {
		return sex;
	}

	public int getX() {
		return x;
	}

	public MyFan(int sex, int x) {
		this.sex = sex;
		this.x = x;
	}

	public boolean isDifferent(MyFan other) {
		return this.sex != other.sex;
	}
	
	public int getDistance(MyFan other) {
		return this.x - other.x;
	}
	
	@Override
	public String toString() {
		return "MyFan [sex=" + sex + ", x=" + x + "]";
	}

	@Override
	public int compareTo(MyFan f) {
		// TODO Auto-generated method stub
		if (this.x < f.x) return -1;
		if (this.x > f.x) return 1;
		return 0;
	}
}
