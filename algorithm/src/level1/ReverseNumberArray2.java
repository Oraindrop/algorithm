/*�ڿ��� ������ �迭�� �����
���� ����
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
����� ��
n	return
12345	[5,4,3,2,1]*/
package level1;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumberArray2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumberArray2 rna = new ReverseNumberArray2();
		System.out.println(rna.solution(12345)[0]);
		
	}
	
	public int[] solution(long n) {
		int[] answer = {};
		List<String> list = new ArrayList<>();
		String[] answerString = Long.toString(n).split("");
		list = Arrays.asList(answerString);
		Collections.reverse(list);
		answer = list.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
	    return answer;
	}

}
