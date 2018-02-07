package com.sandbox.Datastructures;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sandbox.Datastructures.tree.binary.Node;

public class BinaryTreeTest {

  Node binaryTree;

  private static final String EOL = System.getProperty("line.separator");
  ByteArrayOutputStream consoleText;
  private PrintStream console;

  @Before
  public void setup() {
    // We are creating a new outputstream and swapping it with system so we can catch the changes.
    consoleText = new ByteArrayOutputStream();
    console = System.out;
    System.setOut(new PrintStream(consoleText));
  }

  @After
  public void tearDown() {
    // Setting the original console
    System.setOut(console);
  }


  @Before
  public void setupBinaryTree() {
    binaryTree = new Node(3);
    binaryTree.insert(4);
    binaryTree.insert(2);
    binaryTree.insert(6);
    binaryTree.insert(7);
    binaryTree.insert(1);
    //  3
    // 2  4
    //1     6
    //       7
  }

  @Test
  public void testInOrderSort() {
    binaryTree.sortInOrder();
    assertEquals(1+EOL+2+EOL+3+EOL+4+EOL+6+EOL+7+EOL,consoleText.toString());
  }
  
  @Test
  public void testPreOrderSort() {
    binaryTree.sortPreOrder();
    assertEquals(3+EOL+2+EOL+1+EOL+4+EOL+6+EOL+7+EOL,consoleText.toString());
  }
  
  @Test
  public void testPostOrderSort() {
    binaryTree.sortPostOrder();
    assertEquals(1+EOL+2+EOL+7+EOL+6+EOL+4+EOL+3+EOL,consoleText.toString());
  }

  @Test
  public void testContains() {
    assertEquals(true, binaryTree.contains(3));
    assertEquals(false, binaryTree.contains(9));
    assertEquals(true, binaryTree.contains(2));
  }

}
