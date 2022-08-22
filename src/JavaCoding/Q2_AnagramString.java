package JavaCoding;

import java.util.Arrays;

public class Q2_AnagramString {
    public static void main(String[] args){
        String word = "yuree";
        String anagram = "eyeur";

        System.out.println(anagramSort(word, anagram));
    }

    public static String sortWord(String word){
        char[] arr = word.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public static Boolean anagramSort(String word, String anagram){
        String sortWord = sortWord(word);
        String sortAnagram = sortWord(anagram);

        return sortWord.equals(sortAnagram);
    }
}
