import java.util.Scanner;

public class O4 {
    // Enter a number and find the factor of that number
    //ex - 5! = 5 *4*3*2*1 = 120
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number ");
        while (!in.hasNext("[1-9]+"))
        {
            System.out.println("Wrong input :");
            System.out.println("Please enter new Input");
            in.next();
        }
        int n = in.nextInt();
        Factorial(n);

    }
    static void Factorial(int n)
    {
        int OG = n;
        int product = 1 ;
        while (n>0)
        {
            product = product *n;
            n--;
        }
        System.out.printf("the Factorial of the number %d is %d",OG,product);
    }
}

