import java.util.Scanner;
// find out if the number is disarium or not
// A disarium number ex-
// 89 - 8^1 + 9^2 = 89
public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number ");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a Valid Input");
            System.out.println("Enter a number");
            in.next();
        }
        int n = in.nextInt();
        isDisarium(n);

    }
    static void isDisarium(int n)
    {
        int sum = 0 ;
        int OG = n;
        int count = Count(n);
        while (n>0)
        {
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,count);
            n = n/10;
            count -- ;

        }
        if(sum==OG)
        {
            System.out.printf("%d is a Disarium NUmber ",OG);

        }
        else
        {
            System.out.printf("%d is Not A  Disarium NUmber ",OG);
        }

    }
    static int Count(int n)
    {
        String num = Integer.toString(n);
        return num.length();

    }
}
