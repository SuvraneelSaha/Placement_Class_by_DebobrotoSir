import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        // Enter the size of an array and then find the sum of those n numbers.
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0 ;
        System.out.println("Please enter the Elements:");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = in.nextInt();
            sum = sum + arr[i];

        }
        System.out.printf("The sum of %d elements is %d",n,sum);

    }
}
