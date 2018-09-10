/*JadenCase 문자열 만들기
문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
입출력 예
s	return
3people unFollowed me	3people Unfollowed Me
for the last week	For The Last Week*/
package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JadenCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JadenCase jc = new JadenCase();
		System.out.println(jc.solution("3people  unFollowed me"));
	}
	
	public String solution(String s) {
	    String answer = "";
	    List<Character> list = new ArrayList<>();
	    int cnt = 0;
	    
	    for(int i = 0; i < s.length(); i++) {
	    	list.add(s.charAt(i));
	    }
	    
	    for(int i = 0; i < list.size(); i++) {
	    	if(list.get(i) == ' ') {
	    		cnt = 0;
	    	}
	    	else if(Character.isAlphabetic(list.get(i))) {	    		
	    		if(cnt == 0) {
		    		list.set(i, Character.toUpperCase(list.get(i)));
		    	}
	    		else {
		    		list.set(i, Character.toLowerCase(list.get(i)));
		    	}
		    	cnt++;
	    	}
	    	else {
	    		cnt++;
	    	}
	    }
	    answer = list.stream().map(e->e.toString()).collect(Collectors.joining());
	    return answer;
	}

}
