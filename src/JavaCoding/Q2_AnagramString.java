package JavaCoding;

import java.util.Arrays;

public class Q2_AnagramString {
    public static void main(String[] args) {
        String word = "yuree";
        String anagram = "eeyur";

        System.out.println("Word and Anagram is :" + anagramStringSort(word, anagram));
    }

    public static Boolean anagramStringSort(String word, String anagram){
        String sortWord = sortChars(word);
        String sortAnagram = sortChars(anagram);

        return sortWord.equals(sortAnagram);
    }

    public static String sortChars(String word) {
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }
}
