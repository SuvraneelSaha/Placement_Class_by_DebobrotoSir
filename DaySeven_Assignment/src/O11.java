import java.util.Scanner;

public class O11 {
    // Krishnamurti number
    // ex - 145 = 1! + 4! + 5! = 145 then it is a krishnamurti number
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
        System.out.println(isKrishnamurti(n));


    }
    static boolean isKrishnamurti(int n)
    {
        int og = n;
        int sum = 0 ;
        while (n>0)
        {
            int rem = n%10;
            sum = sum + Factorial(rem);
            n=n/10;

        }
        if(og == sum)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    static int Factorial(int n)
    {
        int product = 1 ;
        while (n>0)
        {
            product = product *n;
            n--;
        }
        return product;
    }
}
