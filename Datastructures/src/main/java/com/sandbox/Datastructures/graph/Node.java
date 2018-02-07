package com.sandbox.Datastructures.graph;

import java.util.LinkedList;
import java.util.List;

public class Node {

  private int id;
  List<Node> adjacent = new LinkedList<Node>();
  
  public Node(int id) {
    this.setId(id);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
}
