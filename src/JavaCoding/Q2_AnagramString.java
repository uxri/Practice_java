package JavaCoding;

import java.util.Arrays;

public class Q2_AnagramString {
    public static void main(String[] args){
        String word = "yuree";
        String anagram = "eyur";

        System.out.println("word and anagram is : " + measureWord(word, anagram));
    }
    public static String sortWord(String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }

    public static Boolean measureWord(String word, String anagram){
        String sortWord = sortWord(word);
        String sortArr = sortWord(anagram);

        return sortWord.equals(sortArr);
    }
}
