package MyStack;

import java.util.EmptyStackException;

/**
 * Node
 */
class Node {

    public int data;
    public Node next = null;
    public Node(int data)
    {
        this.data = data;
    }
}

public class MyStack {
    
    private int top = 0;
    private Node head;
    private Node tail;

    public MyStack()
    {
        this.head  = this.tail = null;
    }
    public void push(int val)
    {
        Node newNode = new Node(val);
        if (isEmpty()) {
            tail = head = newNode;
            top++;
            return;
        }
        newNode.next = head;
        head = newNode;
        this.top++;
    }
    
    public int pop()
    {
        if (isEmpty()) throw new EmptyStackException();
        int val = head.data;
        if (head == tail) 
        {
            head.next = null;
            head = tail = null;
            top--;
            return val;
        }
        Node node = head;
        head = head.next;
        node.next = null;
        this.top--;
        return val;
    }

    public int peek()
    {
        if (isEmpty()) throw new EmptyStackException();
        return head.data;
    }

    public boolean isEmpty()
    {
        if (this.top == 0) return true;
        return false;
    }

    public void reverse(MyStack stack)
    {
        if (stack.isEmpty()) return;
        
        int num = stack.pop();
        reverse(stack);
        addToStack(stack, num);
        return;
    }

    void addToStack(MyStack stack, int num)
    {
        if (stack.isEmpty()) {
            stack.push(num);
            return;
        }
        int val = stack.pop();
        addToStack(stack, num);
        stack.push(val);
        return;
    }

    public void sort()
    {
        if (isEmpty()) return;

        int num = pop();
        sort();
        addSorted(num);
        return;
    }

    void addSorted(int num)
    {
        if (isEmpty())
        {
            push(num);
            return;
        }

        int val = peek();
        if (num >= val)
        {
            push(num);
        }
        else
        {
            pop();
            addSorted(num);
            push(val);
        }
    }

    public void addAtLast(MyStack stack, int num)
    {
        if (stack.isEmpty())
        {
            stack.push(num);
            return;
        } 

        int val = stack.pop();
        addAtLast(stack, num);
        stack.push(val);
        return;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node node = head;
        while (node != null) {
            sb.append(node.data).append(" ");
            node = node.next;
        }
        return sb.toString();
    }
}