import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        // check if all the 3 numbers are prime or not
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number :");
        int a1= in.nextInt();
        System.out.println("Please enter the 2nd number :");
        int a2= in.nextInt();
        System.out.println("Please enter the 3rd number :");
        int a3= in.nextInt();

        if(isPrimeAll(a1,a2,a3))
        {
            System.out.println("All are prime");
        }
        else
        {
            System.out.println("All are not prime");
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
    public static boolean isPrimeAll(int a,int b , int c)
    {
        if(isPrime(a) && isPrime(b) && isPrime(c))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
