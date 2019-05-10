package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class KoreanEnglishMath10825 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<MyStudent> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new MyStudent(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(list);

		for (MyStudent s : list) {
			System.out.println(s);
		}
	}
}

class MyStudent implements Comparable<MyStudent>{
	
	private String name;
	
	private int kor;
	
	private int eng;
	
	private int math;

	public MyStudent(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(MyStudent other) {
		// TODO Auto-generated method stub
		if (this.kor > other.kor) return -1;
		if (this.kor < other.kor) return 1;
		if (this.eng > other.eng) return 1;
		if (this.eng < other.eng) return -1;
		if (this.math > other.math) return -1;
		if (this.math < other.math) return 1;
		return name.compareTo(other.name);
	}
	
}