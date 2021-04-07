package white.ship;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'H', 'e', 'l', 'l', 'o'};
		System.out.println(solution(arr));
	}
	
	private static String solution(char[] message) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = message.length - 1; i >= 0; i--) {
			sb.append(message[i]);
		}
		
		return sb.toString();
	}

}
