import java.util.Scanner;

public class O1 {
    // Enter 5 elements of an array and find the sum of those.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0 ;
        System.out.println("Please enter 5 numbers");
        for (int i = 0; i <5 ; i++)
        {
                arr[i] = in.nextInt();
                sum = sum + arr[i];

        }
        System.out.printf("The sum of the 5 numbers is %d ",sum);
    }
}
