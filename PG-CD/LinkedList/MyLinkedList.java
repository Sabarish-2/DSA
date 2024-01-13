package LinkedList;

import java.util.EmptyStackException;

/**
 * Node 
 */
class Node {

    public int data;
    public Node next = null;
    
    public Node(int data) {
        this.data = data;
    }

}

public class MyLinkedList {

    private Node head;
    private Node tail;
    
    public MyLinkedList() {
        head = tail = null;
    }

    public Node reverseRec(Node head)
    {
        if (head == null || head.next == null) {
            this.head = head;
            return head;
        }


        Node rest = reverseRec(head.next);
        Node next = head.next;
        next.next = head;
        head.next = null;
        
        return rest;
    }
    public void reverseRec()
    {
        reverseRec(head);
        findTail();
    }

    public void showHeadTail()
    {
        System.out.println("Head: "+ head.data);
        System.out.println("Tail: "+ tail.data);
    }

    public void findTail()
    {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        tail = node;
    }

    public void deleteNFromEnd(int n)
    {
        if (head.next == null) head = head.next;

        Node curr = head, nthNode = head;
        while (n > 0)
        {
            curr = curr.next;
            n--;
        }
        if(curr == null) head = head.next;
        while (curr.next != null)
        {
            curr = curr.next;
            nthNode = nthNode.next;
        }
        nthNode.next = nthNode.next.next;
    }

    public void reverse()
    {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Empty Linked List");

        Node prev = null, curr = head, next = curr.next;
        tail = head;
        while (next != null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        head = curr;
        curr.next = prev;

    }

    public int sum() {
        if (isEmpty()) return 0;
        else if (head.next == null) return head.data;
        Node node = head;
        int sum = 0;
        while (node != null) {
            sum += node.data;
            node = node.next;
        }
        return sum;
    }

    public void clear()
    {
        head = tail = null;
    }

    public boolean isEmpty()
    {
        return (head == null && tail == null);
    }

    public int indexof(int value)
    {
        int index = 0;
        Node node = head;

        while (node != null) {
            if (value == node.data) return index;
            index++;
            node = node.next;
        }

        return -1;
    }

    public void insert(int data) {
        // create a new node and set the data value
        Node node = new Node(data);
        if (isEmpty()) {
            // if there is no node in the list, make the new node the head
            head = tail = node;
        } else {
            // otherwise, add the new node to the end of the linked list
            tail.next = node;
            tail = node;
        }
    }

    public void insert(int data, int index) {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is Empty");
        } 
        if(index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("Index must not be Negative");
        } 

        Node newNode = new Node(data);
        if (index == 0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node node = head;
        while (node.next != null && index > 1) {
            node = node.next;
            index--;
        }
        if (node.next == null)
        {
            tail = newNode;
        } else {
            newNode.next = node.next;
        }
        node.next = newNode;
    }

    public void insertStart(int value)
    {
        insert(value, 0);
    }

    public int size()
    {
        Node node = head;
        int size = 0;
        while (node != null)
        {
            node = node.next;
            size++;
        }
        return size;
    }

    public void deleteAt (int index)
    {
        if (index < 0) throw new IllegalArgumentException("Index cannot be Negative");
        if (isEmpty()) throw new EmptyStackException();
        if(index == 0) 
        {
            deleteStart();
            return;
        }
        Node node = head;
        while(index > 1)
        {
            node = node.next;
            if (node.next == null) throw new IndexOutOfBoundsException();
            index--;
        }
        node.next = node.next.next;
    }

    public void deleteStart()
    {
        if (isEmpty()) return;
        head = head.next;
    }

    public void deleteEnd(){
        if(isEmpty()) return;
        if (head.next == null)
        {
            clear();
            return;
        }
        Node node = head;
        while(node.next != tail)
        {
            node = node.next;
        }
        node.next = null;
        tail = node;
    }

    @Override
    public String toString() {
        if (isEmpty()) return ("---");
        Node node = head;
        StringBuilder sb = new StringBuilder();
        // sb.append("[");
        while (node.next != null) {
            sb.append(node.data).append(" -> ");
            node = node.next;
        }
        if (node.next == null) {
            sb.append(node.data);
        }
        // sb.append("\b\b\n");
        return sb.toString();
    }
    
}