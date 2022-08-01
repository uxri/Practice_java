package JavaCoding;

import java.util.HashMap;

public class Q5_Duplicate {
    public static void main(String[] args) {

        String str = "yuree";
        char[] chars = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }

        //Print duplicate characters
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println("Duplicate characters:" + c);
            }
        }
    }
}