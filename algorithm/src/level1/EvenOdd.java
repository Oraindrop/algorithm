/*¦���� Ȧ��
���� ����
���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.
����� ��
num	return
3	Odd
4	Even
*/
package level1;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(int num) {
	    String answer = "";
	    if(num % 2 == 0) {
	    	answer = "Even";
	    	return answer;
	    }
	    else {
	    	answer = "Odd";
	    	return answer;	    			
	    }
	}

}
