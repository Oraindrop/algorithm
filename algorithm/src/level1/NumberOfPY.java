/*���ڿ� �� p�� y�� ����
���� ����
�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

������� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
����� ��
s	answer
pPoooyY	true
Pyy	false
����� �� ����
����� �� #1
'p'�� ���� 3��, 'y'�� ���� 3���� �����Ƿ� true�� return �մϴ�.

����� �� #2
'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.*/


/* ���ٽ� ����� ��.       
 s = s.toUpperCase();
 return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
*/


package level1;

public class NumberOfPY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfPY npy = new NumberOfPY();
				
		System.out.println(npy.solution("Pyy"));
	}
	
    boolean solution(String s) {
        boolean answer = true;
    	s = s.toLowerCase();
    	if(numberOfP(s) != numberOfY(s)) {
    		answer = false;
    	}
        return answer;
    }
    
    int numberOfP(String s) {
    	int num = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == 'p') {
    			num++;
    		}
    	}
    	return num;
    }
    
    int numberOfY(String s) {
    	int num = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == 'y') {
    			num++;
    		}
    	}
    	return num;
    }
}
