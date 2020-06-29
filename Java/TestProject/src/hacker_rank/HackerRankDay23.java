package hacker_rank;

import java.util.*;

import java.io.*;

class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}

public class HackerRankDay23 {
	// 순차적으로 표시할 Node List
	static List<Integer> list = new ArrayList<Integer>();
	
	static void levelOrder(Node23 root){
		if(root == null) {
			return;
		}
		list.add(root.data);
      
	  //Queue 형태로 root부터 Child node을 추가한다. 
      List<Node23> tree = new ArrayList<Node23>();
	  tree.add(root);
	  
      while(!tree.isEmpty()) {
    	  // Queue 형태로 저장한 Node 을 하나씩 꺼낸다.
    	  // Left 값이 있으면 표시할 Node List에 추가한다.
    	  if(tree.get(0).left != null) {
    		  list.add(tree.get(0).left.data);
    		  tree.add(tree.get(0).left);
    	  }
    	// Right 값이 있으면 표시할 Node List에 추가한다.
    	  if(tree.get(0).right != null) {
    		  list.add(tree.get(0).right.data);
    		  tree.add(tree.get(0).right);
    	  }
    	  tree.remove(0);
      }
      for(int i = 0 ; i< list.size(); i++) {
    	  System.out.print(list.get(i) + " ");
      }
    }

	public static Node23 insert(Node23 root,int data){
	        if(root==null){
	            return new Node23(data);
	        }
	        else{
	        	Node23 cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
	    public static void main(String args[]){
	            Scanner sc=new Scanner(System.in);
	            int T=sc.nextInt();
	            Node23 root=null;
	            while(T-->0){
	                int data=sc.nextInt();
	                root=insert(root,data);
	            }
	            levelOrder(root);
	        }	

}
