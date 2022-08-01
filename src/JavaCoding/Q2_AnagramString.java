package JavaCoding;

import java.util.Arrays;

public class Q2_AnagramString {
    public static void main(String[] args) {
        String word = "angel";
        String anagram = "angle";

        System.out.println("angle and eagln are anagrams : " + anagramStringSort(word, anagram));
    }

    public static boolean anagramStringSort(String word, String anagram) {
        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);

        return sortedWord.equals(sortedAnagram);
    }

    public static String sortChars(String word){
        char[] wordArr = word.toLowerCase().toCharArray(); //소문자로 변환, char 배열로 변환
        Arrays.sort(wordArr); //오름차순 정렬됨
        return String.valueOf(wordArr);
    }
}
