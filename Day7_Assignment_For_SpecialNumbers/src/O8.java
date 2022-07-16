import java.util.Scanner;

public class O8 {
    // Palindrome number or not
    // A palindrome number is a number where the reverse of the original number is the number itself
    // ex - 1331 -- reverse is 1331 so it is a palindrome number
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
        if(n==Reverse(n))
        {
            System.out.println("Palindrome Number "+n);
        }
        else
        {
            System.out.println("Not "+n);
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
}
