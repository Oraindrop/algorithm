/*���� ������������ ��ġ�ϱ�
���� ����
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
����� ��
n	return
118372	873211*/
package level1;

import java.util.Arrays;

public class SortIntegerToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortIntegerToArray sita = new SortIntegerToArray();
		System.out.println(sita.solution(118372));
	}
	
	public long solution(long n) {
	    long answer = 0;
	    String s = Long.toString(n);
	    int[] answerArr = Arrays.asList(s.split("")).stream().mapToInt(i -> Integer.parseInt(i)).toArray();
	    Arrays.sort(answerArr);	    
	    for(int i = answerArr.length-1 ; i >= 0; i--) {
	    	answer *= 10;
	    	answer += answerArr[i];
	    }
	    return answer;
	}

}
