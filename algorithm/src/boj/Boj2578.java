package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj2578 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BingoContents[][] arr = new BingoContents[5][5];
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = new BingoContents(false, Integer.parseInt(st.nextToken()));
			}
		}
		
		List<Integer> callList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				callList.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		System.out.println(go(callList, arr));
	}
	
	static int go(List<Integer> callList, BingoContents[][] arr) {
		for (int i = 0; i < callList.size(); i++) {
			hitCheck(callList.get(i), arr);
			if (bingoCheck(arr)) {
				return i+1;
			}
		}
		return 25;
	}
	
	static void hitCheck(int number, BingoContents[][] arr) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i][j].check(number)) {
					return;
				}
			}
		}
	}
	
	static boolean bingoCheck(BingoContents[][] arr) {
		int count = hCheck(arr) + vCheck(arr) + dCheck(arr);
		if (count >= 3) {
			return true;
		}
		return false;
	}
	
	static int hCheck(BingoContents[][] arr) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			boolean bool = true;
			for (int j = 0; j < 5; j++) {
				bool &= arr[i][j].isHit();
			}
			if (bool) {
				count++;
			}
		}
		return count;
	}
	
	static int vCheck(BingoContents[][] arr) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			boolean bool = true;
			for (int j = 0; j < 5; j++) {
				bool &= arr[j][i].isHit();
			}
			if (bool) {
				count++;
			}
		}
		return count;
	}
	
	static int dCheck(BingoContents[][] arr) {
		int count = 0;
		if (arr[0][0].isHit() && arr[1][1].isHit() && arr[2][2].isHit() && arr[3][3].isHit() && arr[4][4].isHit()) {
			count++;
		}
		if (arr[0][4].isHit() && arr[1][3].isHit() && arr[2][2].isHit() && arr[3][1].isHit() && arr[4][0].isHit()) {
			count++;
		}
		
		return count;
	}

}

class BingoContents {
	
	private boolean hit;
	
	private int value;

	public BingoContents(boolean hit, int value) {
		this.hit = hit;
		this.value = value;
	}
	
	public boolean isHit() {
		return hit;
	}

	public boolean check(int number) {
		if (value == number) {
			this.hit = true;
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "[hit=" + hit + ", value=" + value + "]";
	}
	
}
