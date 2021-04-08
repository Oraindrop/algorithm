package white.ship.list;

public class List1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedNode head = new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, null)));
		List1 linkedList = new List1();
		linkedList.print(linkedList.reverseRecursion(head));
	}
	
	public void print(LinkedNode head) {
		LinkedNode node = head;
		while (node != null) {
			System.out.println(node.number);
			node = node.next;
		}
	}
	
	public LinkedNode reverse(LinkedNode head) {
		LinkedNode cur = head;
		LinkedNode pre = null;
		LinkedNode next = cur.next;
		
		while (cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		
		return pre;
	}
	
	public LinkedNode reverseRecursion(LinkedNode node) {
		if (node.next == null) {
			return node;
		}
		
		LinkedNode newNode = reverseRecursion(node.next);
		node.next.next = node;
		node.next = null;
		return newNode;
	}

}
