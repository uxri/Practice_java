package JavaCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Apple is UniqueChar : " + hasAllUniqueChars("Apple"));
        System.out.println("qwerty is UniqueChar : " + hasAllUniqueChars("qwerty"));
    }

    public static Boolean hasAllUniqueChars(String word) {
        HashSet hash = new HashSet();

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!hash.add(c)){
                return false;
            }
        }
        return true;
    }
}