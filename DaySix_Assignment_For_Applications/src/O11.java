import java.util.Scanner;

public class O11 {
    // find out the number of digits in a number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();

        System.out.println("Count is " + Count(n));
        System.out.println("The length is "+Length(n));


    }
    static int Length(int n)
    {
        String num = Integer.toString(n);
        return num.length();
    }
    static int Count(int n)
    {
        int count = 0 ;
        while (n>0)
        {
            int rem = n%10;
            n=n/10;
            count++;
        }
        return count;
    }
}
