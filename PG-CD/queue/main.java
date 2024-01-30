package queue;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        MyQueue q = new MyQueue();
        q.add(sc.nextInt());
        q.add(sc.nextInt());
        q.add(sc.nextInt());
        q.add(sc.nextInt());
        q.add(sc.nextInt());

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);

        sc.close();
    }
}
