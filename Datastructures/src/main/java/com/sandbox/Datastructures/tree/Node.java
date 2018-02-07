package com.sandbox.Datastructures.tree;

public class Node {

	Node left;
	Node right;
	int data;
	
	
	public Node(int data) {
		this.data=data;
	}

	public void insert(int value) {
		if(value<=data) {
			if(left==null) {
				Node node = new Node(value);
				left = node;
			}else {
				left.insert(value);
			}
		}else {
			if(right ==null) {
				Node node = new Node(value);
				right = node;
			}else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
	  if(value==data){
	    return true;
	  }
	   
	  if(value<data){
	    if(left!=null){
	      return left.contains(value);
	    }
	  }else{
	    if(right!=null){
	      return right.contains(value);
	    }
	  }
	  return false;
    }

	public void sortInOrder() {
		if(left!=null) {
			left.sortInOrder();
		}
		System.out.println(data);
		if(right!=null) {
			right.sortInOrder();
		}
		
	}
	
	public void sortPreOrder(){
	  System.out.println(data);
	  if(left!=null){
	    left.sortPreOrder();
	  }
	  if(right!=null){
	    right.sortPreOrder();
	  }
	}
	
	public void sortPostOrder(){
      if(left!=null){
        left.sortPostOrder();
      }
      if(right!=null){
        right.sortPostOrder();
      }
      System.out.println(data);
    }

}
