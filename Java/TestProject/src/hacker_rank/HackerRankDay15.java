package hacker_rank;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class HackerRankDay15 {
	public static  Node insert(Node head,int data) {
		// 가장 마지막 노드를 가리킨다.
		if(head == null) {
			return new Node(data);
		}
		// 재귀함수를 통하여 head.next 를 지속적으로 연결 시킨다.
		head.next = insert(head.next, data); 
		return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Node head = null;
	    int N = sc.nextInt();
	
	    while(N-- > 0) {
	        int ele = sc.nextInt();
        	head = insert(head,ele);
	    }
	    display(head);
	    sc.close();
	}

}
