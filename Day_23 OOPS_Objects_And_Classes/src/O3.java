import java.util.Scanner;

public class O3 {

}

class Bank2
{
    // the variables inside the class and outside of a method is known as
    // instance variables

    int b;
    // why sout hi is not available
    // the compiler doesnt knows when to execute the abve line

    // And Now why Scanner in = new Scanner(System.in) is used and not
    // bug
    // this will be kind of a chap
    // ie it will be available in all the objects of the class
    //

    void balance_enquiry() // this is the most integral part of a Bank
    {
        System.out.println("The Balance is "+b);
    }

    void submit()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount you want to submit :");
        int x = in.nextInt();

        b=b+x;

    }

    void withdraw()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw :");
        int x = in.nextInt();
        if(x<=b)
        {
            b=b-x;

        }
        else
        {
            System.out.println("Insufficient Value");
        }

    }
}
