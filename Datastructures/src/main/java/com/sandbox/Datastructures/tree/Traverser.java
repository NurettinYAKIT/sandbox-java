package com.sandbox.Datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traverser {

  public void printBFS(Node tree) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(tree);
    while(!queue.isEmpty()){
      tree = queue.remove();
      System.out.println(tree.getData());
      if(tree.left!=null){
        queue.add(tree.left);
      }
      if(tree.right!=null){
        queue.add(tree.right);
      }
      
    }
  }
  
  public void printDFS(Node tree) {
    Stack<Node> stack = new Stack<>();
    stack.push(tree);
    while(!stack.isEmpty()){
      tree = stack.pop();
      System.out.println(tree.getData());
      if(tree.left!=null){
        stack.add(tree.left);
      }
      if(tree.right!=null){
        stack.add(tree.right);
      }
      
    }
  }
  
  public void traverse(Node tree) {
    if(tree==null){
      return;
    }
    System.out.println(tree.getData());
    traverse(tree.left);
    traverse(tree.right);
  }
}
