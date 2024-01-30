package HashMap;

import java.util.*;

public class Basics {
    // 1st Non-Repeated char in a String:
    static char nonRepeated (String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch: s.toCharArray())
        {
            if (map.get(ch) == 1) return ch;
        }    
        return 0;
    }

    // 1st Repeated char:
    static char firstRep (String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch: s.toCharArray()) 
        {
            if (map.get(ch) == 2)
                return ch;
        }
        return 0;
    }
    public static void main (String[] args) {
        System.out.println(nonRepeated("a green apple!"));
        System.out.println(firstRep("a green apple!"));
    }

    // Testcases for 200 int elements with a single space , 3 times on seperate lines which will be in increasing order and contain duplicates, some elements should be common
    

}