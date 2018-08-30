/*���� ���ڴ� �Ⱦ�
���� ����
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. �迭 arr���� ���� �ǰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�.
�������

arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
����� ��
arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]
����� �� ����
����� �� #1,2
������ ���ÿ� �����ϴ�.*/
package level1;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public int[] solution(int []arr) {
		int[] answer = {};
		List<Integer> answerList = new ArrayList<>();
		answerList.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				answerList.add(arr[i]);
			}
		}
		answer = answerList.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}
