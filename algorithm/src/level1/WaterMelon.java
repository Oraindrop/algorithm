/*���ڼ��ڼ��ڼ��ڼ��ڼ�?
���� ����
���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.

���� ����
n�� ���� 10,000������ �ڿ����Դϴ�.
����� ��
n	return
3	���ڼ�
4	���ڼ���*/
package level1;

public class WaterMelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelon wm = new WaterMelon();
		System.out.println(wm.solution(3));
	}
	
	public String solution(int n) {
	    String answer = "";
	    for(int i = 1; i <= n; i++) {
	    	if(i % 2 == 1) {
	    		answer += "��";
	    		continue;
	    	}
	    	answer += "��";
	    }
	    return answer;
	}

}
