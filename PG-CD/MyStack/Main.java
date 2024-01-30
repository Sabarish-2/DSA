package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack num = new MyStack();
        
        num.push(3);    
        num.push(4);
        num.push(5);
        // System.out.println(num);
        num.push(1);
        // System.out.println(num);
        num.push(2);
        
        System.out.println(num);
        // System.out.println(num.pop());
        // num.addAtLast(num, 6);
        num.reverse(num);
        System.out.println(num);
        num.sort();
        System.out.println(num);
        // System.out.println(num);
    }
}
