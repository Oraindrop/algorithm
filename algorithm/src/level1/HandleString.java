/*���ڿ� �ٷ�� �⺻
���� ����
���ڿ� s�� ���̰� 4Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
����� ��
s	return
a234	false
1234	true*/
package level1;

import java.util.Scanner;

public class HandleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HandleString hs = new HandleString();
		System.out.println(hs.solution(s));
		sc.close();
	}
	
	public boolean solution(String s) {
	    boolean answer = true;
	    String pattern = "^[0-9]{4}|[0-9]{6}$";
	    answer = s.matches(pattern);
	    return answer;
	}

}
