/*���ڿ� ������������ ��ġ�ϱ�
���� ����
���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
s	return
Zbcdefg gfedcbZ
*/
package level1;

import java.util.Arrays;
import java.util.Collections;

public class descSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		descSort ds = new descSort();
		System.out.println(ds.solution("Zbcdefg"));
	}
	
	public String solution(String s) {
	    String answer = "";
	    String[] ansArr = s.split("");
	    Arrays.sort(ansArr, Collections.reverseOrder());
	    for(int i = 0; i< ansArr.length; i++) {
	    	answer += ansArr[i];
	    }
	    return answer;
	}
	

}
