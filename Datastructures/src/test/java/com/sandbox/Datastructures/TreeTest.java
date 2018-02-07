package com.sandbox.Datastructures;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sandbox.Datastructures.tree.Node;
import com.sandbox.Datastructures.tree.Traverser;

public class TreeTest {
  Node tree;

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
  public void setupTree() {
    tree = new Node("A",
        new Node("B",
            new Node("C"),new Node("D")),
        new Node("E",
            new Node("F"),new Node("G",
                new Node("H"),null))
        );
    //    A
    // B      E
    //C D    F G
    //         H
  }

  @Test
  public void testBFS() {
    Traverser traverser = new Traverser();
    traverser.printBFS(tree);
    assertEquals("A"+EOL+"B"+EOL+"E"+EOL+"C"+EOL+"D"+EOL+"F"+EOL+"G"+EOL+"H"+EOL,consoleText.toString());  
  }
  
  @Test
  public void testDFS() {
    Traverser traverser = new Traverser();
    traverser.printBFS(tree);
    assertEquals("A"+EOL+"B"+EOL+"C"+EOL+"D"+EOL+"E"+EOL+"F"+EOL+"G"+EOL+"H"+EOL,consoleText.toString());  
  }
  
}
