package JavaCoding;

public class Practice {
    public static void main(String[] args) {
        String a = "(2+3(4*5))";

        char[] arr = a.toCharArray();

        int open = 0;
        int close = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                open++;
            }
            if (arr[i] == ')') {
                close++;
            }
        }

        if (open == close) {
            System.out.println("vaild");
        } else {
            System.out.println("invalid");
        }
    }
}