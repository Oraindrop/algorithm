/*�̻��� ���� �����
���� ����
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
����� ��
s	return
try hello world	TrY HeLlO WoRlD
����� �� ����
try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. ���� TrY HeLlO WoRlD �� �����մϴ�.*/
package level1;

public class CreateStrangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateStrangeString css = new CreateStrangeString();
		System.out.println(css.solution("  try   hello world  "));
	}

	public String solution(String s) {
	    String answer = "";
	    String[] wordArr = s.split(" ");
	    for(int i = 0; i < wordArr.length; i++) {
	    	String newWord = "";
	    	int cnt = 0;
	    	for(int j = 0; j < wordArr[i].length(); j++) {
	    		if(Character.isAlphabetic(wordArr[i].charAt(j))) {
	    			if(cnt % 2 == 0) {
	    				newWord += Character.toUpperCase(wordArr[i].charAt(j));
	    			}
	    			else {
	    				newWord += Character.toLowerCase(wordArr[i].charAt(j));
	    			}
	    			cnt++;
	    		}
	    	}
	    	wordArr[i] = newWord;
	    	if(i != wordArr.length -1) {
	    		answer += wordArr[i] + " ";	
	    	}
	    	else {
	    		answer += wordArr[i];
	    	}
	    }
	    int numberOfLastSpace = s.length() - answer.length();
    	for(int i = 0; i < numberOfLastSpace; i++) {
    		answer += " ";
    	}
	    return answer;
	}
}
