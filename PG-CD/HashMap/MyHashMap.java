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
        this.list = new LinkedList[n];
    }

    String getOrDefault(int key, String value)
    {
        String val = get(key);
        if (val == null) return value;
        return val;
    }

    String remove(int key)
    {
        if (get(key) == null) return null;
        int k = hashKey(key);
        Node node = list[k].get(0);
        if (node.key == key)
        {
            return list[k].remove().value;
        }
        while (node.next.key != key)
        {
            node = node.next;
        }
        String val = node.next.value;
        node.next = node.next.next;
        return val;
    }

    int hashKey(int key) {
        return key % size;
    }

    void put(int key, String val) {
        int k = hashKey(key);
        Node newNode = new Node(key, val);
        if (list[k] == null)
        {
            list[k] = new LinkedList<Node>();
            list[k].add(newNode);
            return;
        }
        Node node = list[k].get(0);
        while (node.key != key && node.next != null)
        {
            node = node.next;
        } 
        if (node.key == key) node.value = val;
        else
        {
            node.next = newNode;
        }
    }
    
    String get(int key)
    {
        int k = hashKey(key);
        if (list[k] == null) return null;
        Node node = list[k].get(0);
        while (node.key != key && node.next != null)
            node = node.next;
        if (node.key == key) return node.value;
        return null;
    }
    
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (LinkedList<Node> lList : list) {
            if(lList != null && !lList.isEmpty()) sb.append(listPrint(lList)).append(", ");
        }
        sb.append("\b\b}");
        return sb.toString();
    }

    String listPrint(LinkedList<Node> lList) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        Node node = lList.get(0);
        while (node != null)
        {
            s.append(node.key).append(" : ").append(node.value).append(", ");
            node = node.next;
        }
        s.append("\b\b]");
        return s.toString();
    }
}