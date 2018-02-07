package com.sandbox.Datastructures.hashtable;

import java.util.LinkedList;
import java.util.List;

public class Hashtable<K, V> {

  private static final int NUMBER_OF_BUCKETS = 10;
  private final List<List<Entry<K, V>>> buckets;
  private int currentSize=0;

  public Hashtable() {
    this.buckets = new LinkedList<>();

    for (int i = 0; i < NUMBER_OF_BUCKETS; i++) {
      buckets.add(i, new LinkedList<Entry<K, V>>());
    }
  }

  public void put(K k, V v) {
    int index = k.hashCode() % NUMBER_OF_BUCKETS;
    Entry<K, V> entry = new Entry<>(k,v);
    List<Entry<K,V>> bucket = buckets.get(index);
    
    bucket.remove(entry);
    bucket.add(entry);
    currentSize++;
  }

  public Integer size() {
    return currentSize;
  }

  public boolean contains(String string) {
    for(List<Hashtable<K, V>.Entry<K, V>> list : buckets){
      for(Hashtable<K, V>.Entry<K, V> entry : list){
        if(entry.key.equals(string)){
          return true;
        }
      }
    }
    return false;
  }

  private class Entry<K,V> {
    private final K key;
    private final V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

  }

}
