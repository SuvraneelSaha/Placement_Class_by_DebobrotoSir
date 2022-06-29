import java.util.Scanner;

public class O3 {
    // Enter a number and find product of the numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number ");
        while (!in.hasNext("[1-9]+"))
        // the + regex operator will match all the tokens and check the validity of it
            // there are other regex operators also but + is the most useful
        {
            System.out.println("Wrong Input -_-");
            System.out.println("Enter a correct Input:");
            in.next();
        }
        int n = in.nextInt();
        Product(n);

    }
    static void Product(int n)
    {
        int OG = n;
        int product =1 ;
        while (n>0)
        {
            int rem = n%10;
            product = product * rem;
            n=n/10;
        }
        System.out.printf("the Product of the Digits of the Number %d is %d",OG,product);
    }
}
