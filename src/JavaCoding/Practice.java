package JavaCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String word = "angel";
        String anagram = "angle";

        System.out.println("angle and eagln are anagrams : " + isitanagram(word, anagram));
    }

    public static String anagramStringSort(String word) {
        char[] arr = word.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public static boolean isitanagram(String word, String anagram) {
        String sortWord = anagramStringSort(word);
        String sortAnagram = anagramStringSort(anagram);

        return sortAnagram.equals(sortWord);
    }
}

//        괄호개수문제
//        String a = "2*((3+4)/5)6";
//
//        char[] arr = a.toCharArray();
//        int opencount = 0;
//        int closecount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == '(') {
//                opencount++;
//            }
//            if (arr[i] == ')') {
//                closecount++;
//            }
//        }
//        if (opencount == closecount) {
//            System.out.print("valid");
//        }else {
//            System.out.print("invalid");
//        }
//    }