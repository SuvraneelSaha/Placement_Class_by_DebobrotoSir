import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = in.nextInt();

        System.out.printf("The Sum of the digits of %d is %d",n,SumOfTheDigits(n));

    }
    public static int SumOfTheDigits(int n)
    {
        int sum = 0 ;
        while (n!=0)
        {
            int rem = n%10;
            sum = sum + rem;
            n=n/10;
        }
        return sum;
    }
}
