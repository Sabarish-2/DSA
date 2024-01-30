package queue;

public class MyQueue {

    private Node head;
    // private Node tail;
    
    MyQueue(){
        head = null;
    }

    void add(int num){
        Node newNode = new Node(num);
        if (isEmpty())
        {
            head = newNode;
            return;
        }
        Node node = head;
        while (node.next != null)
            node = node.next;
        node.next = newNode;
    }

    int remove() {
        if (isEmpty()) return -1;
        int val = head.data;
        head = head.next;
        return val;
    }

    int peek() {
        if (isEmpty()) return -1;
        return head.data;
    }

    boolean isEmpty(){
        return head == null;
    }

    public String toString() {
        if(isEmpty()) return " ";
        StringBuilder sb = new StringBuilder();
        Node node = head;
        while(node.next != null)
        {
            sb.append(node.data).append(" -> ");
            node = node.next;
        }
        sb.append(node.data);
        return sb.toString();
    }
}
