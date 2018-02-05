package com.sandbox.Datastructures.tree;

public class Node {

	Node left;
	Node right;
	int value;
	
	
	public Node(int value) {
		this.value=value;
	}

	public void insert(int data) {
		if(data<=value) {
			if(left==null) {
				Node node = new Node(data);
				left = node;
			}else {
				left.insert(data);
			}
		}else {
			if(right ==null) {
				Node node = new Node(data);
				right = node;
			}else {
				right.insert(data);
			}
		}
	}

	public void sortInOrder() {
		if(left!=null) {
			left.sortInOrder();
		}
		System.out.println(value);
		if(right!=null) {
			right.sortInOrder();
		}
		
	}

}
