/*���� ��ȣ
���� ����
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
����� ��*/
package level1;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 32 A 65 Z 90 a 97 z 122
		CaesarCipher cc = new CaesarCipher();
		System.out.println(cc.solution("a B z", 4));
	}
	
	public String solution(String s, int n) {
	    String answer = "";
	    char[] charArr = s.toCharArray();
	    for(int i = 0; i < charArr.length; i++) {
	    	if(charArr[i] >= 65 && charArr[i] <= 90) {
	    		charArr[i] = (char)(charArr[i] + n);
	    		if(charArr[i] > 90) {
	    			charArr[i] = (char)(charArr[i] - 26);
	    		}
	    		continue;
	    	}
	    	if(charArr[i] >= 97 && charArr[i] <= 122) {
	    		charArr[i] = (char)(charArr[i] + n);
	    		if(charArr[i] > 122) {
	    			charArr[i] = (char)(charArr[i] - 26);
	    		}
	    		continue;
	    	}
	    }
	    answer = String.valueOf(charArr);
	    return answer;
	}

}
