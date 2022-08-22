package JavaCoding;

import java.util.HashSet;

public class Q3_UniqueChar {
    public static void main(String[] args) {

        System.out.println("Apple is UniqueChar : " + hasAllUniqueChars("Apple"));
        System.out.println("qwerty is UniqueChar : " + hasAllUniqueChars("qwerty"));
    }

    public static Boolean hasAllUniqueChars(String word) {
        HashSet set = new HashSet();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!set.add(c))
                return false;
        }
        return true;
    }
}