package JavaCoding;

import java.util.HashSet;

public class Q3_UniqueChar {
    public static void main(String[] args) {

        System.out.println("Apple is UniqueChar : " + hasAllUniqueChars("Apple"));
        System.out.println("qwerty is UniqueChar : " +hasAllUniqueChars("qwerty"));
    }
    public static boolean hasAllUniqueChars(String word) {
        HashSet alphaSet = new HashSet();

        for (int index = 0; index < word.length(); index++) {
            char c = word.charAt(index);
            if (!alphaSet.add(c)) //HashSet에 word 한글자씩 더하는데 안되면(!) 중복글자 있는거니까 false 출력
                return false;
        }
        return true;
    }
}