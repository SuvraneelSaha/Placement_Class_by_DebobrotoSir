import java.util.Scanner;

public class O12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = in.nextInt();

        System.out.println("The Reverse is "+Reverse(n));


    }
    public static int Reverse(int n)
    {
        int sum = 0 ; // 123
        while (n!=0)
        {
            int rem = n%10;
            sum = sum * 10 + rem;
            n=n/10;
        }
        return sum;
    }
}
