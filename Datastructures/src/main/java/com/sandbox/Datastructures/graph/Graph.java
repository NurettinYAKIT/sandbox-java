package com.sandbox.Datastructures.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
  
  Map<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
  
  private Node getNode(int id) {
    return null;
  }
  
  public void addEdge(int source, int destination) {
    
  }
  
  
  public boolean hasPathDFS(int source, int destination){
    Node s = getNode(source);
    Node d = getNode(destination);

    Set<Integer> visited = new HashSet<Integer>();
    return hasPathDFS(s,d,visited);
  }
  
  public boolean hasPathBFS(int source, int destination){
    Node s = getNode(source);
    Node d = getNode(destination);
    return hasPathBFS(s,d);
  }

  private boolean hasPathDFS(Node source, Node destination, Set<Integer> visited) {
    if(visited.contains(source.getId())){
      return false;
    }
    visited.add(source.getId());
    if(source==destination){
      return true;
    }
    for(Node child : source.adjacent){
      if(hasPathDFS(child, destination,visited)){
        return true;
      }
    }
    return false;
  }
  
  private boolean hasPathBFS(Node source, Node destination) {
    List<Node> nextToVisit = new LinkedList<Node>();
    Set<Integer> visited = new HashSet<Integer>();
    nextToVisit.add(source);
    while(!nextToVisit.isEmpty()){
      Node node = nextToVisit.remove(0);
      if(node==destination){
        return true;
      }
      if(visited.contains(node.getId())){
        continue;
      }
      visited.add(node.getId());
      for(Node child:node.adjacent){
        nextToVisit.add(child);
      }
    }
    
    return false;
  }

}
