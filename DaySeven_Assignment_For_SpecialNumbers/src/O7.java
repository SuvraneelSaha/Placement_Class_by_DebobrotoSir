import java.util.Scanner;

public class O7 {
    // Emirp number
    // when the number and the reverse of that number both are prime
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a Valid input");
            System.out.println("please enter a number");
            in.next();
        }
        int n = in.nextInt();
        if(isPrime(n) && isPrime(Reverse(n)))
        {
            System.out.printf("Emirp Number " +n);
        }
        else
        {
            System.out.printf("%d is not an Emirp number",n);
        }

    }
    static int Reverse(int n)
    {
        int sum = 0;
        while (n>0)
        {
            int rem = n%10;
            sum = sum*10 + rem;
            n=n/10;
        }
        return sum ;
    }
    static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        int c =2 ;
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
