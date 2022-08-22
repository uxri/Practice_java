package JavaCoding;

public class MatchBracket {
    public static void main(String[] args) {
        String bracket = "(((2+3)-4)*)5)";

        char[] arr = bracket.toCharArray();
        int open =0;
        int close =0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == '('){
                open++;
            }
            if(arr[i] ==')'){
                close++;
            }
        }
        if (open == close){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
