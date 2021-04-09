package white.ship.list;

public class List3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedNode head = new LinkedNode(1, new LinkedNode(2, new LinkedNode(2, new LinkedNode(3, new LinkedNode(3, new LinkedNode(4, null))))));
		List3 linkedList = new List3();
		linkedList.removeDuplicationAll(head);
		linkedList.print(head);
	}
	
	public void print(LinkedNode head) {
		LinkedNode node = head;
		while (node != null) {
			System.out.println(node.number);
			node = node.next;
		}
	}
	
	// 연결리스트 중복된 숫자 제거 (1 -> 2 -> 2 -> 3 => 1 -> 2 -> 3)
	public LinkedNode removeDuplication(LinkedNode head) {
		LinkedNode cur = head;
		
		while (cur != null) {
			LinkedNode next = cur.next;
			while (next != null && cur.number == next.number) {
				next = next.next;
			}
			cur.next = next;
			cur = next;
		}

		return head;
	}
	
	// 연결리스트 중복된 숫자 제거 재귀
	public LinkedNode removeDuplicationRecursive(LinkedNode node) {
		if (node == null) {
			return null;
		}
		
		if (node.next != null && node.number == node.next.number) {
			node.next = node.next.next;
			return removeDuplicationRecursive(node);
		} else {
			return removeDuplicationRecursive(node.next);
		}
	}

	// 연결리스트 중복된 숫자 모두 제거 (1 -> 2 -> 2 -> 3 => 1 -> 3)	head 는 중복이 아니라고 가정했음.
	public LinkedNode removeDuplicationAll(LinkedNode head) {
		
		LinkedNode cur = head;
		LinkedNode prev = head;
		
		while (cur != null) {
			LinkedNode next = cur.next;
			int count = 0;
			while (next != null && cur.number == next.number) {
				count++;
				next = next.next;
			}
			
			if (count != 0) {
				prev.next = next;
				cur = prev;
			} else {
				prev = cur;
				cur = cur.next;	
			}
			
		}
		return head;
	}

}
