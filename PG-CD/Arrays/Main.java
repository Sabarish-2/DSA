package Arrays;

class Main {

    public static void main(String[] args) {
        MyArr arr = new MyArr(5);
        arr.add(1);
        arr.add(2);
        arr.add(27);
        // arr.remove(3);
        arr.add(6);
        arr.add(28);
        arr.remove(3);
        // arr.remove(-3);
        arr.add(6);
        arr.add(5);
        arr.max();  
        arr.min();

        System.out.println(arr);
        System.out.println(arr.min());
        System.out.println(arr.max());
    }
    
}
