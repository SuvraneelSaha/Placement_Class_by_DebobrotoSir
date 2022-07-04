import java.util.Scanner;
// Wap to find out composite number
public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a Valid Input");
            System.out.println("Please enter a Number");
            in.next();
        }
        int n = in.nextInt();
        if(!isPrime(n))
        {
            System.out.printf("%d is a Composite number",n);
        }
        else
        {
            System.out.printf("%d is NOT a Composite Number",n);
        }


    }
    static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;

        }
        int c = 2 ;
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
