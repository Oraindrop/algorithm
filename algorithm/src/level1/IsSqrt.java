/*���� ������ �Ǻ�
���� ����
������ ���� n�� ����, n�� � ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

���� ����
n�� 1�̻�, 50000000000000 ������ �����Դϴ�.
����� ��
n	return
121	144
3	-1
����� �� ����
����� ��#1
121�� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.

����� ��#2
3�� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.*/
package level1;

public class IsSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsSqrt is = new IsSqrt();
		System.out.println(is.solution(144));
	}
	
	public long solution(long n) {
	    long answer = 0;
	    long x = (long)Math.sqrt(n);
	    if(n == x*x) {
	    	answer = (x+1) * (x+1);
	    }
	    else {
	    	answer = -1;
	    }
	    return answer;
	}

}
