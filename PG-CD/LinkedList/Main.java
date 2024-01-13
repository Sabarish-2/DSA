package LinkedList;

class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.showHeadTail();
        System.out.println(list);
        list.reverseRec();
        System.out.println(list);
        list.showHeadTail();
        
        // list.deleteNFromEnd(4);
        
        // System.out.println("10 : " + list.indexof(10));
        
        // list.insert(0, 0);
        // list.insert(10, 1);
        // list.insertStart(20);
        // list.insert(30, 3);
        // list.deleteStart();
        // list.reverse();
        // list.clear();
        // list.deleteEnd();
        // list.deleteEnd();
        // list.deleteAt(2);
        // list.insert(400);
        // System.out.println(list.debug());
        
        // System.out.println("10 : " + list.indexof(10));
        // System.err.println(list.isEmpty());
        // System.err.println(list.sum());
        
    }
}
// list.remove(0);     // Implementing this with hands;