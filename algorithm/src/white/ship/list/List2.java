package white.ship.list;

public class List2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedNode head = new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, new LinkedNode(4, null))));
		List2 linkedList = new List2();
		System.out.println(linkedList.fromLastIndex(head, 2).number);
	}
	
	// 마지막에서 n번째 노드 찾기
	public LinkedNode fromLastIndex(LinkedNode head, int n) {
		LinkedNode left = head;
		LinkedNode right = head;
		
		for (int i = 0; i < n; i++) {
			right = right.next;
		}
		
		while (right != null) {
			left = left.next;
			right = right.next;
		}
		
		return left;
	}


}
