import java.util.Scanner;

public class O7 {
    // enter a number to check whether the number is emirp or not
    // ie a number is emirp when both the number and its reverse are prime
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        int rev = Reverse(n);
        if(Prime(n) && Prime(rev))
        {
            System.out.println("EMIRP number");
        }
        else
        {
            System.out.println("NOT");
        }


    }
    static boolean Prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        int c =2 ;
        while (c*c<n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        if(c*c>n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int Reverse(int n)
    {
        int sum=0;
        while (n>0)
        {
            int rem = n%10;
            sum = sum*10 + rem;
            n=n/10;
        }
        return sum;

        // 132
    }

}
