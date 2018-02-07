package com.sandbox.Datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sandbox.Datastructures.hashtable.Hashtable;

public class HashTableTest {

  @Test
  public void addThreeElementAndCheckSize() {
    //given
    Hashtable<String, Integer> map = new Hashtable<String, Integer>();
    
    //when
    map.put("a",1);
    map.put("b",1);
    map.put("c",1);
    
    //then
    assertEquals(new Integer(3), map.size());
  }
  
  @Test
  public void addElementsAndCheckContains() {
    //given
    Hashtable<String, Integer> map = new Hashtable<String, Integer>();
    
    //when
    map.put("a",1);
    map.put("b",1);
    map.put("c",1);
    
    //then
    assertEquals(true, map.contains("a"));
    assertEquals(true, map.contains("b"));
    assertEquals(true, map.contains("c"));
    assertEquals(false, map.contains("d"));
  }
  
}
