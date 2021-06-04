package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16961 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] t = new int[367];
		int[] s = new int[367];
		int[] total = new int[367];
		int max = 0;
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (max < b-a+1) {
				max = b-a+1;
			}
			if (op.equals("T")) {
				for (int j = a; j <= b; j++) {
					t[j]++;
					total[j]++;
				}
			} else {
				for (int j = a; j <= b; j++) {
					s[j]++;
					total[j]++;
				}
			}
		}
		
		int count = 0;
		for (int i = 1; i < 367; i++) {
			if (total[i] != 0) {
				count++;
			}
		}
		
		int maxCount = 0;
		for (int i = 1; i < 367; i++) {
			if (total[i] > maxCount) {
				maxCount = total[i];
			}
		}

		int notFight = 0;
		int notFightMax = 0;
		for (int i = 1; i < 367; i++) {
			if (s[i] != 0 && t[i] != 0) {
				if (s[i] == t[i]) {
					notFight++;
					if (notFightMax < total[i]) {
						notFightMax = total[i];
					}
				}
			}
		}
		
		System.out.println(count);
		System.out.println(maxCount);
		System.out.println(notFight);
		System.out.println(notFightMax);
		System.out.println(max);
	}

}
