package com.sandbox.Datastructures;

import com.sandbox.Datastructures.tree.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Node node = new Node(3);
        
        node.insert(4);
        node.insert(2);
        node.insert(6);
        node.insert(7);
        
        node.sortInOrder();
    }
}
