import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        System.out.println("hello there lets do some coding ");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number :");
        int a1 = in.nextInt();
        System.out.println("Prime "+isPrime(a1));
        System.out.println("Please enter the 2nd number :");
        int a2 = in.nextInt();
        System.out.println("Prime "+isPrime(a2));
        System.out.println("Please enter the 3rd number :");
        int a3 = in.nextInt();
        System.out.println("Prime "+isPrime(a3));



    }
    public static Boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        int c = 2 ;

        while (c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            else
            {
                c++;
            }
        }
//        if(c*c>=n)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
        return true;
    }
}
