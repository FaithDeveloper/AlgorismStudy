package hacker_rank;

import java.util.*;
import java.io.*;

class Node22 {
	Node22 left, right;
	int data;

	Node22(int data) {
		this.data = data;
		left = right = null;
	}
}

public class HackerRankDay22 {
	
	public static int maxHeight = 0;

	public static int getHeight(Node22 root) {
		maxHeight = 0;
		if(root == null) {
			return 0;
		}
		getHight(root, maxHeight);
		return maxHeight;
	}
	
	
	public static void getHight(Node22 root, int height) {
		if(root == null) {	
			return;
		}
		if(maxHeight < height) {
			maxHeight = height;
		}
		if(root.left != null || root.right != null ) {
			getHight(root.left, height+1);
			getHight(root.right, height+1);
		}
	}

	public static Node22 insert(Node22 root, int data) {
		if(root == null) {
			return new Node22(data);
		}else {
			Node22 cur;
			if(data < root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			}else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node22 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

}
