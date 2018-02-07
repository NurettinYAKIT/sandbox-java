package com.sandbox.Datastructures.tree;

public class Node {
  
  Node left;
  Node right;
  private String data;
  
  public Node(String data, Node left, Node right) {
    this.data=data;
    this.left = left;
    this.right = right;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Node(String string) {
    this.data=string;
  }

}
