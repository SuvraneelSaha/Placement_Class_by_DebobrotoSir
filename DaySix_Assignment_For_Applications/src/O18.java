import java.util.Scanner;

public class O18 {
    // Enter 8 numbers and find the max out of it
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the N");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        System.out.println("Max = "+MaxUsingArray(n));

        System.out.println("Max Normal = "+Max(n));


    }
    static int MaxUsingArray(int n)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        int max = 0 ;
        System.out.println("Please enter the numbers");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i <arr.length ; i++)
        {

            max = Math.max(max,arr[i]);

        }
        return max;
    }
    static int Max(int n)
    {
        Scanner in = new Scanner(System.in);
        int max = 0;
        System.out.println("Please enter the numbers");
        for (int i = 1; i <=n ; i++)
        {
            int a = in.nextInt();
                max = Math.max(max,a);
        }
        return max;
    }
}
