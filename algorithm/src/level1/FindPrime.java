/*�Ҽ� ã��
���� ����
1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.

�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
(1�� �Ҽ��� �ƴմϴ�.)

���� ����
n�� 2�̻� 1000000������ �ڿ����Դϴ�.
����� ��
n	result
10	4
5	3
����� �� ����
����� �� #1
1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ

����� �� #2
1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ*/
package level1;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPrime fp = new FindPrime();
		System.out.println(fp.solution(10));
	}

	public int solution(int n) {
	    int answer = 0;
	    List<Boolean> primeList = new ArrayList<>();
	    primeList.add(false);
	    primeList.add(false);
	    int nSqrt = (int)Math.sqrt(n);
	    for(int i = 2; i <= n; i++) {
	    	primeList.add(i, true);
	    }
	    for(int i = 2; i <= nSqrt; i++) {
	    	if(!primeList.get(i)) {
	    		continue;
	    	}
    		for(int j = i+i; j <= n; j+=i) {
    			primeList.set(j, false);
    		}
	    }
	    for(int i = 0; i <= n; i++) {
	    	if(primeList.get(i)) {
	    		answer++;
	    	}
	    }
	    return answer;
	}
}
