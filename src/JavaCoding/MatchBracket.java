package JavaCoding;

import java.util.Scanner;

public class MatchBracket {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
        String a = "(2+3(4+5))";

        char[] arr = a.toCharArray();
        int opencount = 0;
        int closecount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                opencount++;
            }
            if (arr[i] == ')') {
                closecount++;
            }
        }
        if (opencount == closecount) {
            System.out.print("valid");
        } else {
            System.out.print("invalid");
        }
    }
}
