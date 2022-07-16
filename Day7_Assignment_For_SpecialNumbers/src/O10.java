import java.util.Scanner;

public class O10 {
    // Perfect Number
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

        if(product(n) == sum(n))
        {
            System.out.println("Perfect Number "+n);
        }
        else
        {
            System.out.println("Not a Perfect Number "+n);
        }

    }
    static int product(int n)
    {
        int product = 1;
        while (n>0)
        {
            int rem = n%10;
            product = product*rem;
            n=n/10;

        }
        return product;
    }
    static int sum(int n)
    {
        int sum = 0 ;
        while (n>0)
        {
            int rem = n%10;
            sum = sum + rem;
            n=n/10;

        }
        return sum;
    }
}
