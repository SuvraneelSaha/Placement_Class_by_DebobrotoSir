import java.util.Scanner;

public class O2 {
    // Enter a number and find the sum of the digits :
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[1-9]+"))
        {
            System.out.println("Wrong Input");
            System.out.println("enter Input");
            in.next();
        }
        int n = in.nextInt();
        Sum(n);
    }
    static void Sum(int n)
    {
        int sum = 0 ;
        while (n>0)
        {
            int rem = n%10;
            sum += rem;
            n=n/10;
        }
        System.out.printf("The sum is %d ",sum);
    }
}
// ex - 123 = 3 + 2 + 1 = 6 ans
