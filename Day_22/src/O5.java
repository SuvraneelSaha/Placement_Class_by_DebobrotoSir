import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the 1st number");
        int a1 = in.nextInt();
        System.out.println(Prime(a1));

        System.out.println("Enter the 2nd number");
        int a2 = in.nextInt();
        System.out.println(Prime(a2));

        System.out.println("Enter the 3rd number");
        int a3 = in.nextInt();
        System.out.println(Prime(a3));


    }
    // prime can be done via bhalo chele theorem also

    public static boolean Prime(int a)
    {
        if(a<2)
        {
            return false; // as 1 is neither composite nor a prime number
        }

        int c = 2 ;
        while (c*c<a) // a = 17
        {
            if(a%c==0)
            {
                return false;
            }
            c++;
        }
        if(c*c>a)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
