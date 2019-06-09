package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resistance1076 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long answer = 0;
		answer += MyR.find(br.readLine()).getValue() * 10;
		answer += MyR.find(br.readLine()).getValue();
		answer *= MyR.find(br.readLine()).getMulti();
		
		System.out.println(answer);
	}
}

enum MyR {
	
	black(0, 1),
	brown(1, 10),
	red(2, 100),
	orange(3, 1000),
	yellow(4, 10000),
	green(5, 100000),
	blue(6, 1000000),
	violet(7, 10000000),
	grey(8, 100000000),
	white(9, 1000000000);
	
	private int value;
	private long multi;
	
	MyR(int value, long multi) {
		this.value = value;
		this.multi = multi;
	}

	public int getValue() {
		return value;
	}

	public long getMulti() {
		return multi;
	}
	
	public static MyR find(String s) {
		for (MyR r : values()) {
			if (r.name().equals(s))
				return r;
		}
		return null;
	}
}
