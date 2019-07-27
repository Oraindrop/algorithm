package level1;

import java.util.ArrayList;
import java.util.List;

public class SkillTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = "BACDE CBADF AECB BDA".split(" ");
		System.out.println(solution("CBD", arr));
	}

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        List<Character> list = new ArrayList<>();
        
        for (char c : skill.toCharArray()) {
        	list.add(c);
        }
        
        for (String s : skill_trees) {
        	String convert = "";
        	
        	for (char c : s.toCharArray()) {
        		if (list.contains(c)) {
        			convert += c;
        		}
        	}
        	
        	boolean possible = true;
        	
        	for (int i = 0; i < convert.length(); i++) {
        		if (convert.charAt(i) != list.get(i)) {
        			possible = false;
        			break;
        		} 
        	}
        	
        	if (possible) answer++;
        }
        
        
        return answer;
    }
	
}
