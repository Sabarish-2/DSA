package HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(3);
        map.put(1, "Hello");
        map.put(21, "Hello");
        map.put(31, "Hello");
        map.put(1, "Bye");
        map.put(3, "World");
        map.put(61, "!");
        map.put(8, "Hello");
        System.out.println(map);
        System.out.println(map.get(21) + " " + map.getOrDefault(31, "World") + map.get(61));
        // System.out.println(map);
        System.out.println(map.get(22));
        System.out.println(map.remove(31) + map.remove(61) + map.remove(1));
        System.out.println(map);
    }
}
