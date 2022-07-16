import java.util.Scanner;

public class O6 {
    // enter a number and check whether the number is armstrong or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Number:");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Wrong Input");
            System.out.println("Enter valid INPUT ie NUMBER:");
            in.next();
        }
        int n = in.nextInt();
        System.out.println(Armstrong(n));


    }
    static boolean Armstrong(int n)
    {
        int OG = n;
        int sum = 0;
        while (n>0)
        {
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,CountNumberOfDigits(OG));
            n=n/10;
        }
        if(OG==sum)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    static int CountNumberOfDigits(int n)
    {
        String num = Integer.toString(n);
        return num.length();

    }
}
