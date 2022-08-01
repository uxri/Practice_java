package Programmers;

public class Plus_pos_neg {
    public static void main(String[] args){
        int [] absolutes = new int[3];
        boolean [] signs = new boolean[3];
        int answer = 0;
        for (int i=0; i<absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            }
            else {
                answer -= absolutes[i];
            }
        }
        System.out.println(answer);
    }
}

