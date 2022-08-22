package JavaCoding;

import java.util.Arrays;

public class Q2_AnagramString {
    public static void main(String[] args){
        String word = "yuree";
        String anagram = "eeyeur";

        System.out.println(anagramSort(word, anagram));
    }
    public static String sortWord(String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);

        return String.valueOf(wordArr);
    }

    public static Boolean anagramSort(String word, String anagram){
        String sortWord = sortWord(word);
        String sortAnagram = sortWord(anagram);

        return sortAnagram.equals(sortWord);
    }
}
