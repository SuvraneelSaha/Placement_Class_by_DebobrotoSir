import java.util.Scanner;

public class O5 {
    // Find the Reverse of a given number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        while (!in.hasNext("[1-9]+"))
        {
            System.out.println("Wrong Input ");
            System.out.println("Enter Number");
            in.next();
        }
        int n = in.nextInt();
        Reverse(n);

    }
    public static void Reverse(int n)
    {
        int OG = n;
        int sum = 0;
        while (n>0)
        {
            int rem = n%10;
            sum = sum * 10 + rem;
            n=n/10;
        }
        System.out.printf("The Reverse of the number %d is %d",OG,sum);
    }
}
// 123 -- >
