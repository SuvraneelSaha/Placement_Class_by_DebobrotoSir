import java.util.Scanner;

public class O7 {
    // emirp number
    // ex - 31 and 13 are both prime so it is an emirp number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number:");
        int a1 = in.nextInt();

        if(isPrime(a1) && isPrime(Reverse(a1)))
        {
            System.out.println("Emirp Number");

        }
        else
        {
            System.out.println("Not");
        }

    }
    public static Boolean isPrime(int n)
    {
        if (n < 2)
        {
            return false;
        }
        int c = 2;

        while (c * c <= n)
        {
            if (n % c == 0)
            {
                return false;
            }
            else
            {
                c++;
            }
        }
        return true;
    }
    public static int Reverse(int n) // ex - 31
    {
        int sum = 0 ;
        while (n!=0)
        {
            int rem = n%10;
            sum =sum*10 + rem;
            n=n/10;
        }
        return sum;
    }
    public static Boolean Operations(int a,int b)
    {
        if(isPrime(a) && isPrime(b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
