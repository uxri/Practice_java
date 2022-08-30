package JavaCoding;

public class Q1_ReverseString {
    public static void main(String[] args) {
        String word = "yuree";
        String reverse = "";

        char[] arr = word.toCharArray();
        for (int i=arr.length-1; i>=0; i--){
            reverse += arr[i];
        }
        word.to

        System.out.println(reverse);
    }
}
