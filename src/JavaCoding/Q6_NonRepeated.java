package JavaCoding;

import java.util.Scanner;

public class Q6_NonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println("First non repeated character for String " + word + "is : " + nonRepeatedChars(word));
    }

    public static Character nonRepeatedChars(String word) {
        char[] chararray = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (word.lastIndexOf(chararray[i]) == word.indexOf(chararray[i]))
                return chararray[i];
        }
        return null;
    }
}
