package JavaCoding;

public class Q7_Substrings {
    public static void main(String[] args) {
        String full = "abb";

        for (int i = 0; i < full.length(); i++) {
            for (int j = i + 1; j <= full.length(); j++)
                System.out.println("Print all substrings : " + full.substring(i, j));
        }
    }
}