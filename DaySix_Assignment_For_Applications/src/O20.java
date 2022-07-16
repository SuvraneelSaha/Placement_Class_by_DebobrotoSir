import java.util.Scanner;

public class O20 {
    // Enter n numbers and find the maximum , minimum and average and sum of those numbers using only 1 loop
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        int[] ans = AllOperations(n);
        System.out.println("Max = "+ans[0]);
        System.out.println("Min = "+ans[1]);
        System.out.println("Sum = "+ans[2]);
        System.out.println("Average = "+ans[2]/n);


    }
    static int[] AllOperations(int n)
    {

        Scanner in = new Scanner(System.in);
        int[] ans = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <=n ; i++)
        {
            System.out.println("Please enter the numbers");
            int a = in.nextInt();
            max = Math.max(max,a);
            min = Math.min(min,a);
            sum +=a;

        }
        ans[0] = max;
        ans[1] = min;
        ans[2] = sum;
        return ans;
    }

}
