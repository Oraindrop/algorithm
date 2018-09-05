/*�ִ������� �ּҰ����
���� ����
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

���� ����
�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
����� ��
n	m	return
3	12	[3, 12]
2	5	[1, 10]
����� �� ����
����� �� #1
���� ����� �����ϴ�.

����� �� #2
�ڿ��� 2�� 5�� �ִ������� 1, �ּҰ������ 10�̹Ƿ� [1, 10]�� �����ؾ� �մϴ�.*/
package level1;

public class Euclidean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Euclidean e = new Euclidean();
		System.out.println(e.solution(73,146)[0]);
		System.out.println(e.solution(73,146)[1]);
	}
	
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = (m>n)?euclidean(n,m):euclidean(m,n);
        int max = (n * m) / min;
        answer[0] = min;
        answer[1] = max;
        return answer;
    }
    
    public int euclidean(int n, int m) {
    	// m > n
    	if(n == 0) {
    		return m;
    	}
    	return euclidean(m%n, n);
    	
    }

}
