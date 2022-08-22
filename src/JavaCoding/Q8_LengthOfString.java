package JavaCoding;

public class Q8_LengthOfString {
    public static void main(String[] args) {
        String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLengthOfStringWithCharArray(helloWorld));
    }

    public static int getLengthOfStringWithCharArray(String helloWorld) {
        int length = 0;
        char[] arr = helloWorld.toCharArray();

        for (char c : arr) {
            length++;
        }
        return length;
    }
}
