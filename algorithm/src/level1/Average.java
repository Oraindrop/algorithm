/*��� ���ϱ�
���� ����
������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

���ѻ���
arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
����� ��
arr	return
[1,2,3,4]	2.5
[5,5]	5*/
package level1;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average a = new Average();
		int[] arr = {1,2,3,4};
		System.out.println(a.solution(arr));
	}
	public double solution(int[] arr) {
	    double answer = 0;
	    double sum = 0;
	    for(int element : arr) {
	    	sum += element;
	    }
	    System.out.println(sum);
	    System.out.println(arr.length);
	    answer = sum / arr.length;
	    return answer;
	}

}
