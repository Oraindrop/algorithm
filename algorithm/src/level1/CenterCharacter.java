/*��� ���� ��������
���� ����
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
����� ��
s	return
abcde	c
qwer	we
*/
package level1;

import java.util.Scanner;

public class CenterCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CenterCharacter cc = new CenterCharacter();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(cc.solution(s));
		sc.close();
	}
	
	public String solution(String s) {
		String answer = "";
		String[] str = {};
		str = s.split("");
		if(s.length() == 1) {
			answer = s;
		}
		else if(s.length() % 2 == 1) {
			//Ȧ��
			int key = 0;
			key = (int)(s.length()/2);
			answer = str[key];
		}
		else {
			int key = 0;
			key = (int)(s.length()/2);
			answer = str[key-1] + str[key];
		}
		
		return answer;
	}
}
