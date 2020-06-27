package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Boj2160 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<MyImage> list = new ArrayList<>(); 
		for (int i = 0; i < t; i++) {
			list.add(new MyImage(br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine()));
		}
		int minIndexA = 0;
		int minIndexB = 0;
		int min = 35;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				int diff = list.get(i).diffImage(list.get(j));
				if (min > diff) {
					minIndexA = i;
					minIndexB = j;
					min = diff;
				}
			}
		}
		
		minIndexA++;
		minIndexB++;
		System.out.println(minIndexA + " " + minIndexB);
	}
	

}

class MyImage {
	
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	
	public MyImage(String a, String b, String c, String d, String e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	public int diffImage(MyImage other) {
		int answer = 0;
		answer += this.diffLine(a, other.a);
		answer += this.diffLine(b, other.b);
		answer += this.diffLine(c, other.c);
		answer += this.diffLine(d, other.d);
		answer += this.diffLine(e, other.e);
		return answer;
	}
	
	private int diffLine(String a, String otherA) {
		int answer = 0;
		for (int i = 0; i < a.length(); i++) {
			if (!a.substring(i, i+1).equals(otherA.substring(i, i+1))) 
				answer++;
		}
		return answer;
	}
	
}
