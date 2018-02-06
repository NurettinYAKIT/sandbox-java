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
        
        System.out.println("Check 4 : "+node.contains(4));
        System.out.println("Check 9 : "+node.contains(9));
        
        node.sortInOrder();
    }
}
