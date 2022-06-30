import java.util.Scanner;

public class O10 {
    // find the sum of the odd positions of a number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        System.out.printf("The sum of the Odd Positions of the Number %d is %d ",n,OddPositionSum(n));

    }
    static int OddPositionSum(int n)
    {
        int sum = 0;
        int count = Length(n);
        while (n>0)
        {
            int rem = n%10;
            if(count%2!=0)
            {
                sum = sum+rem;
            }
            n=n/10;
            count--;
        }
        return sum;
    }

    static int Length(int n)
    {
        String num = Integer.toString(n);
        return num.length();
    }
}
