/*�� ���� ������ ��
���� ����
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
����� ��
a	b	return
3	5	12
3	3	3
5	3	12*/
package level1;

import java.util.Scanner;

public class twoInputSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		twoInputSum tis = new twoInputSum();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(tis.solution(a,b));
		sc.close();
	}
	
	public long solution(int a, int b) {
		int temp = 0;
		if(a > b) {
			temp = a;
			a = b;
			b = temp;			
		}
		
		long answer = 0;
		for(int i = a; i <= b; i++) {
			answer += i;
		}
		return answer;
	}

}
