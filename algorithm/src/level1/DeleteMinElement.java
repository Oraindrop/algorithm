/*���� ���� �� �����ϱ�
���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
����� ��
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]*/
package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMinElement dme = new DeleteMinElement();
		int[] arr = {10};
		dme.solution(arr);
	}
	
	public int[] solution(int[] arr) {
	    int[] answer = {};
	    if(arr.length == 1) {
	    	int[] empty = {-1};
	    	return empty;
	    }
	    
	    List<Integer> list = new ArrayList<>();
	    list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	    int minVal = Collections.min(list);
	    list.remove(list.indexOf(minVal));
	    answer = list.stream().mapToInt(i -> (int)i).toArray();
	    return answer;
	}

}
