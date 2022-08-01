package JavaCoding;

public class Q1_ReverseString {
    public static void main(String[] args) {
        String blogName = "YureeBlog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--) {
            //글자수는 9지만 0~8이니까 길이에서 1을 빼줘야 함
            reverse = reverse + blogName.charAt(i);
        }
        System.out.println("Reverse Blog Name : " + reverse);
    }
}
