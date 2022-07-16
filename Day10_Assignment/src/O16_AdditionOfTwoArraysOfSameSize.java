import java.util.Arrays;
import java.util.Scanner;

public class O16_AdditionOfTwoArraysOfSameSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the  Array:");

        int n =in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i < a.length ; i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("1st Array "+ Arrays.toString(a));
        System.out.println("Please enter the elements in the 2nd Array:");
        for (int i = 0; i <b.length ; i++)
        {
            b[i] = in.nextInt();

        }
        System.out.println("2nd Array = "+Arrays.toString(b));
        for (int i = 0; i <n ; i++)
        {
            a[i] = a[i] + b[i];
        }
        System.out.println("The Resultant array is "+Arrays.toString(a));


    }
}
