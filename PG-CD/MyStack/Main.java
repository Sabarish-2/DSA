package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack num = new MyStack();
        
        System.out.println(num.isEmpty());
        num.push(5);
        // System.out.println(num.peek());
        num.push(4);
        System.out.println(num);
        num.push(3);    
        System.out.println(num);
        num.push(2);
        System.out.println(num);
        num.push(1);
        
        System.out.println(num.isEmpty());
        System.out.println(num);
        // System.out.println(num.peek());
        System.out.println(num.pop());
        System.out.println(num);
        System.out.println(num.pop());
        // System.out.println(num.peek());
        System.out.println(num);
        System.out.println(num.pop());
        System.out.println(num);
    }
}
