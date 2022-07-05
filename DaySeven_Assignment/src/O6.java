import java.util.Scanner;

public class O6 {
    // Armstrong number or not
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
        System.out.println(isArmstrong(n));

    }
    static boolean isArmstrong(int n)
    {
        int OG = n;
        int sum=0;
        int count = CountNum(n);
        while (n>0)
        {
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,count);
            n=n/10;

        }
        if(OG == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int CountNum(int n)
    {
        String num = Integer.toString(n);
        return num.length();
    }
}
