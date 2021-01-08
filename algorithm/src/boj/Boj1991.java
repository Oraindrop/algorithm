package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1991 {

	static MyNode[] tree = new MyNode[26];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] inputs = br.readLine().split(" ");
			char node = inputs[0].charAt(0);
			char left = inputs[1].charAt(0);
			char right = inputs[2].charAt(0);
			
			tree[node - 'A'] = new MyNode(left, right);
		}
		
		preOrder('A');
		System.out.println();
		inOrder('A');
		System.out.println();
		postOrder('A');
		System.out.println();
	}
	
	public static void preOrder(char root) {
		System.out.print(root);
		MyNode node = tree[root - 'A'];
		if (node != null) {
			if (node.getLeft() != '.') {
				preOrder(node.getLeft());	
			}
			
			if (node.getRight() != '.') {
				preOrder(node.getRight());	
			}
		}
	}
	
	public static void inOrder(char root) {
		MyNode node = tree[root - 'A'];
		
		if (node != null) {
			if (node.getLeft() != '.') {
				inOrder(node.getLeft());
			}
			
			System.out.print(root);
			
			if (node.getRight() != '.') {
				inOrder(node.getRight());
			}
		}
	}
	
	public static void postOrder(char root) {
		MyNode node = tree[root - 'A'];
		
		if (node != null) {
			if (node.getLeft() != '.') {
				postOrder(node.getLeft());
			}
			
			if (node.getRight() != '.') {
				postOrder(node.getRight());
			}
			
			System.out.print(root);
		}
	}

}

class MyNode {
	
	private char left;
	
	private char right;

	public MyNode(char left, char right) {
		this.left = left;
		this.right = right;
	}

	public char getLeft() {
		return left;
	}

	public char getRight() {
		return right;
	}
	
}
