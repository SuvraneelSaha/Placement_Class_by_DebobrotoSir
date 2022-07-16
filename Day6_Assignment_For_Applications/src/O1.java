import java.util.Scanner;

public class O1 {
    // Enter a number to know whether the number is prime or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = in.nextInt();
        if(CheckPrime(n))
        {
            System.out.printf("%d is a Prime number ",n);
        }
        else
        {
            System.out.printf("%d is NOT A Prime number ",n);
        }



    }
    static boolean CheckPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        int c = 2 ;
        while (c*c<n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        if(c*c>n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}