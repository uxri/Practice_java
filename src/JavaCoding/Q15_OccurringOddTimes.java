package JavaCoding;

public class Q15_OccurringOddTimes {
    public static void main(String[] args){
        Q15_OccurringOddTimes occur = new Q15_OccurringOddTimes();
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println("Number which occurs odd number of times is : "+occur.getOddTimesElement(array));
    }

    int getOddTimesElement(int ar[])
    {
        int i;
        int result = 0;
        for (i = 0; i < ar.length; i++)
        {
            // XOR operation
            result = result ^ ar[i];
        }
        return result;
    }

}
