/*���� ����
2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT

�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.

���� ����
2016���� �����Դϴ�.
2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
����� ��
a	b	result
5	24	TUE
*/

package level1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Year2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.println(solution(a, b));
	}
	
	public static String solution(int a, int b) {
		String answer = "";
		int[] dayOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		if(a == 1) {
			answer = day[b%7];
			System.out.println("if" + answer);
		}
		else {
			int sum = 0;
			for(int i = 1; i < a; i++) {
				sum += dayOfMonth[i];
			}
			answer = day[(sum+b)%7];
			System.out.println("else" + answer);
		}
		
		return answer;
	}

}


