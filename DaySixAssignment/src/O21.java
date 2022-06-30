import java.util.Scanner;

public class O21 {
    // wap to find the sum of all prime numbers between M and N  . M and N will be given by the user
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the M");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int m = in.nextInt();

        System.out.println("Please enter the N");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        int sum = 0 ;
        for (int i = Math.min(m,n); i <=Math.max(m,n) ; i++)
        {
                if(Prime(i))
                {
                    sum += i;
                }
        }
        System.out.printf("the sum of the Prime numbers in the range of %d and %d is %d",m,n,sum);


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
}
