package HashMap;

import java.util.LinkedList;

class Node {
    int key;
    String value;
    Node next;
    Node (int key, String val) {
        this.key = key;
        this.value = val;
    }
}

/**
 * MyHashMap
 */
public class MyHashMap {

    Node head;
    int size;
    LinkedList<Node>[] list;

    MyHashMap (int n) {
        size = n;
        list = new LinkedList<>();
    }

    int hashKey(int key) {
        return key % size;
    }

    void put (int key, String val) {
        int k = hashKey(key);
        if (list[k] == null)
        {
            list[k] = new LinkedList<>();
        }
    }
    
}